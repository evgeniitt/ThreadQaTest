package threadqa.ui;

import listeners.MyListeners;
import org.testng.ISuiteListener;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.MainPage;
import pages.WidgetPage;
import utils.WebDriverManager;

public class TestPage implements ISuiteListener {

    @Test

    public void testRun() {
        new MainPage().pressWidgetsButtonn();
        new WidgetPage().goToSliderMenu().slide();
//        new ElemetsPage()
//                .textBoxClick()
//                .enterUserName("chertollo")
//                .enterEmail("loh123@gmail.com")
//                .enterCurrentAddress("ul .kukoldina 228")
//                .enterPermamentAddress("ul. petuhova 1488");
    }
    @AfterTest
    public void tearDown() {
        WebDriverManager.getWd().quit();
    }
}
