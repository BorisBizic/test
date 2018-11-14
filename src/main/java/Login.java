import conf.AppConfig;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class Login {


    public static AppConfig getAppConfig() {
        return new AppConfig();
    }

    public static String Token() {
        Response resp = given().headers("Content-Type", "application/x-www-form-urlencoded", "Accept", ContentType.JSON)
                .param("grant_type", getAppConfig().getGrantType())
                .param("key", getAppConfig().getKey())
                .param("email", getAppConfig().getUsername())
                .param("provider", getAppConfig().getProvider())
                .when()
                .post(getAppConfig().getBaseURL() + "/token")
                .then()
                .extract()
                .response();

        System.out.println(resp.asString());

        return resp.jsonPath().getString("access_token");

    }




}
