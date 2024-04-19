package page;

import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class ThirdCard extends Form {
    public ThirdCard() {
        super(By.xpath("//div[contains(@class, 'personal-details__form')]"), "Third Card");
    }
}
