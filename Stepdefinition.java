package Steps;
import Pages.BasePage;
import Pages.FlightBooking;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Stepdefinition {
	BasePage basePage;
	FlightBooking flightBooking;
    @Given("^user logged into site$")
    public void login(){
        System.out.println("logged in");
        basePage.initializeBrowser();
    }



    @Then("^the \"([^\"]*)\" page should be displayed$")
        public void verify_page_displayed(String smsg){
            flightBooking.fnverifyWelcomePage(smsg);
        }

    @Then("^the user should be able to see the below drop downs:$")
    public void verify_dropdowns(DataTable dtable){
        flightBooking.fnverifydropdownoptions(dtable);
    }

    @Then("^the \"([^\"]*)\" button should be displayed and enabled$")
    public void fnverifybtn(String btnName){
        flightBooking.fnverifybtnPresent(btnName);
    }
}
