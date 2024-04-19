package page;

import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class SecondPage extends Form {
    private final ILabel timer = getElementFactory().getLabel(By.xpath("//div[contains(@class, 'timer')]"), "Timer");

    public SecondPage() {
        super(By.xpath("//div[contains(@class, 'logo__icon')]"), "Second Page");
    }

    public String getTimerText() {
        return timer.getText();
    }
}
