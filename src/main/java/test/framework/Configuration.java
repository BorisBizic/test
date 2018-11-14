package test.framework;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;

public class Configuration {

    @BeforeSuite(alwaysRun = true)
    public void configuration() {
        RestAssured.baseURI="http://dev.api.hrm.htec.co.rs";
        RestAssured.basePath="/api/v2/People/profile/345";
    }

    public RequestSpecification getRequestSpecification(){
        return RestAssured.given().contentType(ContentType.JSON);
    }

    public Response getResponse(RequestSpecification requestSpecification, String endpoint, int status){
        Response response = requestSpecification.get(endpoint);
        Assert.assertEquals(response.getStatusCode(),status);
        response.then().log().all();
        return response;
    }
}
