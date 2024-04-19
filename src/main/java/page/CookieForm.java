package page;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class CookieForm extends Form {
    private final IButton acceptCookieBtn = getElementFactory().getButton(By.xpath("//button[contains(@class, 'button--transparent')]"), "Accept Cookies Button");

    public CookieForm() {
        super(By.xpath("//div[contains(@class, 'cookies')]"), "Cookie Form");
    }

    public void acceptCookies() {
        acceptCookieBtn.click();
    }
}
