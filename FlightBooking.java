package Pages;

import cucumber.api.DataTable;
import org.openqa.selenium.By;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.IOException;
import java.util.List;


public class FlightBooking extends BasePage {
BasePage basePage;

    public FlightBooking() throws IOException {
        basePage.loadconfig(System.getProperty("user.dir")+ File.separator+"PropertiesFiles"+File.separator+"FlightBooking.properties");

    }

    public void fnverifyWelcomePage(String msgEXP){
        String msg= basePage.getElementText(prop.getProperty("XPATH_PAGELABEL"));
        if(msg.equals(msgEXP)){
            Assert.assertTrue("Message "+msgEXP+ "is displayed successfully",true);
        }else
        {
            Assert.assertTrue("Message "+msgEXP+ "is not displayed successfully",false);
        }

}

public void fnverifydropdownoptions(DataTable dtable){
    List<String> lstdrpvalues=null;
        List<WebElement> lstdrp = driver.findElements(By.xpath(prop.getProperty("XPATH_DROPDOWN_LIST")));
    for(WebElement e: lstdrp){
        lstdrpvalues.add(e.getText());
    }
    List<List<String>> dtablevalue= dtable.raw();
    List<String> drpdwnvalues = dtablevalue.get(0);
    for(String s:drpdwnvalues){
        if(lstdrpvalues.contains(s)){
            Assert.assertTrue("Drop down name"+s+"is present",true);

        }else{
            Assert.assertTrue("Drop down name"+s+"is not present",false);

        }
    }
}

public void fnverifybtnPresent(String btn){
        WebElement element= driver.findElement(By.xpath(prop.getProperty("XPATH_BTNNAME_START")+btn+prop.getProperty("XPATH_BTNNAME_END")));
        if(element.isDisplayed()){
            Assert.assertTrue("Find Flights button is present",true);
        }else{
            Assert.assertTrue("Find Flights button is not present",false);
        }
}
}
