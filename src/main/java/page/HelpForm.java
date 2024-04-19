package page;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class HelpForm extends Form {
    private final IButton hideBtn = getElementFactory().getButton(By.xpath("//button[contains(@class, 'help-form__send-to-bottom-button')]"), "Hide Button");

    public HelpForm() {
        super(By.xpath("//div[@class='help-form']"), "Help Form");
    }

    public void clickOnHideBtn() {
        hideBtn.click();
    }
}
