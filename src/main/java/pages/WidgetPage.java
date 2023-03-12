package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class WidgetPage extends AbstractBasePage{
    @FindBy (xpath = "//input[@class='range-slider range-slider--primary']")
    WebElement slider;

    @FindBy(xpath = "//div[@class='element-group'][4]//*[@id='item-3']")
    WebElement sliderMenu;

    public WidgetPage goToSliderMenu(){
        sliderMenu.click();
        return new WidgetPage();
    }

    public WidgetPage slide() {
        for (int i = 1; i <= 25 ; i++) {
            slider.sendKeys(Keys.ARROW_RIGHT);
        }
        return new WidgetPage();
    }
}
