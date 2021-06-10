package runner;


//import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;
import com.cucumber.listener.Reporter;



@RunWith(Cucumber.class)
@CucumberOptions(
            features = "src/test/resources/"
            ,glue= {"Steps"}
            ,format = {"html:target/cucumber-pretty-html-report/"}
            ,monochrome = true

            )

    public class TestRunner {


    }

