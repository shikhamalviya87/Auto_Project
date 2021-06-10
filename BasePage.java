package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.*;
import java.util.List;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

import static Hooks.Hooks.initdriver;

public class BasePage {
public static WebDriver driver;
static Properties prop =new Properties();
    public BasePage() throws IOException {
        FileInputStream fs= new FileInputStream(System.getProperty("user.dir")+File.separator+"PropertieFiles"+File.separator+"Config.properties");
        prop.load(fs);
    }



    public void initializeBrowser(){
        String url=prop.getProperty("URL");
        driver.get(url);
    }

    public Properties loadconfig(String sPath) {
        Properties prop=new Properties();
        try {
            FileInputStream fs = new FileInputStream(sPath);
            prop.load(fs);
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        return prop;
    }

    public String getElementText(String sXpath){
        return driver.findElement(By.xpath(sXpath)).getText();
    }

    public List<String> getdropdownValuesList(String namepath){
        Select drp =new Select(driver.findElement(By.name(namepath)));

        List lstdrpdownvalues=drp.getOptions();
        return lstdrpdownvalues;
    }
}
