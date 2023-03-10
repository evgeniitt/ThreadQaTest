package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElemetsPage extends AbstractBasePage{
    @FindBy (xpath = "//*[@class='menu-list']//*[text()='Text Box']")
    WebElement textBox;
    @FindBy (id = "userName")
    WebElement nameBox;
    @FindBy(id = "userEmail")
    WebElement emailBox;
    @FindBy(id = "currentAddress")
    WebElement addressBox;
    @FindBy(id = "permanentAddress")
    WebElement permanentAddressBox;

    public ElemetsPage textBoxClick(){
        textBox.click();
        return new ElemetsPage();
    }
    public ElemetsPage enterUserName(String name){
        nameBox.sendKeys(name);
        return new ElemetsPage();
    }
    public ElemetsPage enterEmail(String mail){
        emailBox.sendKeys(mail);
        return new ElemetsPage();
    }
    public ElemetsPage enterCurrentAddress(String currentadr){
        addressBox.sendKeys(currentadr);
        return new ElemetsPage();
    }
    public ElemetsPage enterPermamentAddress(String permadr){
        permanentAddressBox.sendKeys(permadr);
        return new ElemetsPage();
    }

}
