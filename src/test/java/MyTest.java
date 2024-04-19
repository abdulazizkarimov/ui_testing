import aquality.selenium.core.utilities.ISettingsFile;
import aquality.selenium.core.utilities.JsonSettingsFile;
import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.*;
import util.BrowserUtil;
import util.RandomUtil;
import util.UploadUtil;

public class MyTest extends BaseTest {
    private final ISettingsFile env = new JsonSettingsFile("config.json");

	@Test
    public void testCase1() {
        BrowserUtil.goTo(env.getValue("/host_url").toString());

        HomePage homePage = new HomePage();
        Assert.assertTrue(homePage.state().isDisplayed(), "Home Page is not open");

        homePage.clickOnHereLink();
        FirstCard firstCard = new FirstCard();
        Assert.assertTrue(firstCard.state().isDisplayed(), "First Card is not open");

        firstCard.inputRandomValidPassword(RandomUtil.getValidPassword());
        firstCard.inputRandomMail(RandomUtil.getRandomMail());
        firstCard.inputRandomDomain(RandomUtil.getRandomDomain());
        firstCard.acceptTermsAndConditions();
        firstCard.clickOnNextBtn();

        SecondCard secondCard = new SecondCard();
        Assert.assertTrue(secondCard.state().isDisplayed(), "Second Card is not open");

        secondCard.choose3randInterests();
        secondCard.clickOnUploadLink();
        UploadUtil.uploadImage(env.getValue("/image").toString());
        secondCard.clickOnNextBtn();

        ThirdCard thirdCard = new ThirdCard();
        Assert.assertTrue(thirdCard.state().isDisplayed(), "Third Card is not open");
    }

    @Test
    public void testCase2() {
        BrowserUtil.goTo(env.getValue("/host_url").toString());

        HomePage homePage = new HomePage();
        Assert.assertTrue(homePage.state().isDisplayed(), "Home Page is not open");

        homePage.clickOnHereLink();
        HelpForm helpForm = new HelpForm();
        helpForm.clickOnHideBtn();
        Assert.assertFalse(helpForm.state().isDisplayed(), "Help Form is not hidden");
    }

    @Test
    public void testCase3() {
        BrowserUtil.goTo(env.getValue("/host_url").toString());

        HomePage homePage = new HomePage();
        Assert.assertTrue(homePage.state().isDisplayed(), "Home Page is not open");

        homePage.clickOnHereLink();
        CookieForm cookieForm = new CookieForm();
        cookieForm.acceptCookies();
        Assert.assertFalse(cookieForm.state().isDisplayed(), "Cookies Form is not closed");
    }

	@Test
    public void testCase4() {
        BrowserUtil.goTo(env.getValue("/host_url").toString());

        HomePage homePage = new HomePage();

        homePage.clickOnHereLink();
        SecondPage secondPage = new SecondPage();
        Assert.assertEquals(secondPage.getTimerText(), "00:00:00", "Timer does not start from 00:00:00");
    }
}
