package page;

import aquality.selenium.elements.ElementType;
import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.ICheckBox;
import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.elements.interfaces.ITextBox;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;
import util.RandomUtil;
import java.util.List;

public class FirstCard extends Form {
    private final ITextBox usernameTbox = getElementFactory().getTextBox(By.xpath("//input[contains(@placeholder, 'Your email')]"), "Username TextBox");
    private final ITextBox domainTbox = getElementFactory().getTextBox(By.xpath("//input[contains(@placeholder, 'Domain')]"), "Domain TextBox");
    private final ITextBox passwordTbox = getElementFactory().getTextBox(By.xpath("//input[contains(@placeholder, 'Choose Password')]"), "Password TextBox");
    private final ICheckBox termsChbox = getElementFactory().getCheckBox(By.xpath("//span[contains(@class, 'icon-check')]"), "Terms CheckBox");
    private final IButton nextBtn = getElementFactory().getButton(By.xpath("//a[contains(@class, 'button--secondary')]"), "Next Button");
    private final ILabel ddLabel = getElementFactory().getLabel(By.xpath("//div[contains(@class, 'dropdown__field')]"), "Dropdown Label");

    public FirstCard() {
        super(By.xpath("//div[contains(@class, 'login-form__field-row')]"), "First Card");
    }

    public void inputRandomMail(String mail) {
        usernameTbox.clearAndType(mail);
    }

    public void inputRandomDomain(String domain) {
        domainTbox.clearAndType(domain);
        ddLabel.click();
        select();
    }

    public void inputRandomValidPassword(String pass) {
        passwordTbox.clearAndType(pass);
    }

    public void acceptTermsAndConditions() {
        termsChbox.click();
    }

    public void clickOnNextBtn() {
        nextBtn.click();
    }

    private void select() {
        List<ILabel> myList = getElementFactory().findElements(By.cssSelector(".dropdown__list>div"), ElementType.LABEL);
        myList.get(RandomUtil.getRandomInt(myList.size() - 1) + 1).click();
    }
}