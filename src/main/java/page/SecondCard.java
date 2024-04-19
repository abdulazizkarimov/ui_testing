package page;

import aquality.selenium.elements.ElementType;
import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.ICheckBox;
import aquality.selenium.elements.interfaces.ILink;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondCard extends Form {
    private final ILink uploadLink = getElementFactory().getLink(By.xpath("//a[contains(@class, 'avatar-and-interests__upload-button')]"), "Upload Link");
    private final IButton nextBtn = getElementFactory().getButton(By.xpath("//button[contains(@class, 'button--stroked')]"), "Next Button");

    public SecondCard() {
        super(By.xpath("//div[contains(@class, 'avatar-and-interests__avatar-box')]"), "Second Card");
    }

    public void choose3randInterests() {
        List<ICheckBox> interests = getElementFactory().findElements(By.xpath("//span[contains(@class, 'checkbox small')]"), ElementType.CHECKBOX);
        int n = interests.size();
        interests.get(n - 1).click();

        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n - 1; i++) {
            arr.add(i);
        }

        Collections.shuffle(arr);

        interests.get(arr.get(0)).click();
        interests.get(arr.get(1)).click();
        interests.get(arr.get(2)).click();
    }

    public void clickOnUploadLink() {
        uploadLink.click();
    }

    public void clickOnNextBtn() {
        nextBtn.click();
    }
}
