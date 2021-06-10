package Hooks;
import com.aventstack.extentreports.utils.FileUtil;
import com.cucumber.listener.Reporter;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import Pages.*;
public class Hooks {
        public static  WebDriver driver;




    @Before
     public static WebDriver initdriver() {
            System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"//Drivers//geckodriver.exe");

            driver= new FirefoxDriver();
            return driver;
        }





    @After
    public void closeBrowser(){
        driver.quit();
        }
}
