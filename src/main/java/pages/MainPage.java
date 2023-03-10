package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends AbstractBasePage{
    @FindBy (xpath = "//*[@class='card mt-4 top-card'][1]")
    WebElement elementButton;
    @FindBy (xpath = "//*[@class='card mt-4 top-card'][2]")
    WebElement formsButton;
    @FindBy (xpath = "//*[@class='card mt-4 top-card'][3]")
    WebElement alertsFrameWindowsButton;
    @FindBy (xpath = "//*[@class='card mt-4 top-card'][4]")
    WebElement widgetsButton;
    @FindBy (xpath = "//*[@class='card mt-4 top-card'][5]")
    WebElement interactionsButton;
    @FindBy (xpath = "//*[@class='card mt-4 top-card'][6]")
    WebElement gameStoreApplicationButton;

    public void pressElementButton() {
    elementButton.click();
    }
    public void pressFormsButton() {
        formsButton.click();
    }
    public void pressAlertsFrameWindowsButton() {
        alertsFrameWindowsButton.click();
    }
    public void pressWidgetsButtonn() {
        widgetsButton.click();
    }
    public void pressInteractionsButton() {
        interactionsButton.click();
    }
    public void pressGameStoreApplicationButton() {
        gameStoreApplicationButton.click();
    }
}
