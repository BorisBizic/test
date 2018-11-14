import conf.AppConfig;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Worklog {

    private AppConfig config;

    private Worklog() {
        this.config = new AppConfig();
    }

    @BeforeClass

    public void setup(){
        RestAssured.baseURI = config.getBaseURL();
    }


    @Test
    public static void getStatistics(){

    given().auth().oauth2(Login.Token()).
            get(Api.liveStatistics).then().statusCode(200).log().ifError();



    }

}
