package ui;

import com.codeborne.selenide.Configuration;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;

import static com.codeborne.selenide.Selenide.open;

public abstract class BaseUiTest {


    @BeforeClass
    public void setUpBrowser() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");       // Браузерди сразу maximize кылат через options

        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);

        Configuration.browserCapabilities = desiredCapabilities;
        Configuration.baseUrl = "https://demoqa.com/";
    }

    @BeforeClass
    public void setUp() {
        open("https://demoqa.com/");
    }



}
