package page;

import aquality.selenium.elements.interfaces.ILink;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class HomePage extends Form {
    private final ILink hereLink = getElementFactory().getLink(By.linkText("HERE"), "Here link");

    public HomePage() {
        super(By.xpath("//div[contains(@class, 'logo__icon')]"), "Home page");
    }

    public void clickOnHereLink() {
        hereLink.click();
    }
}
