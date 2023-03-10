package threadqa.ui;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import pages.ElemetsPage;
import pages.MainPage;
import utils.WebDriverManager;

public class TestPage {
    @Test
    public void testRun() {
        new MainPage().pressElementButton();
        new ElemetsPage()
                .textBoxClick()
                .enterUserName("chertollo")
                .enterEmail("loh123@gmail.com")
                .enterCurrentAddress("ul .kukoldina 228")
                .enterPermamentAddress("ul. petuhova 1488");
    }
    @AfterTest
    public void tearDown() {
        WebDriverManager.getWd().quit();
    }
}
