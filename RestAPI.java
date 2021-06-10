package Pages;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;

public class RestAPI {

    public void getAPIResponse(){
        RequestSpecification req = RestAssured.given();
        Response response= req.get("https://api.spacexdata.com/v4/launches/latest");
        int responsecode=response.getStatusCode();

        System.out.println(responsecode);
        System.out.println(response.getBody().print());
        Assert.assertEquals(responsecode,200);
         }
}
