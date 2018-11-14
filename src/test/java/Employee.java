import conf.AppConfig;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Employee {

    private AppConfig config;

    private Employee() {
        this.config = new AppConfig();
    }

    String token = "ew0KICAiYWxnIjogIkhTMjU2IiwNCiAgInR5cCI6ICJKV1QiDQp9.ew0KICAic3ViIjogIjM0NyIsDQogICJVc2VySWQiOiAiMzQ1IiwNCiAgImVtYWlsIjogImJvcmlzLmJpemljQGh0ZWNncm91cC5jb20iLA0KICAicm9sZSI6ICJIUiIsDQogICJSb2xlSWQiOiAiNCIsDQogICJ0b2tlbl91c2FnZSI6ICJhY2Nlc3NfdG9rZW4iLA0KICAianRpIjogImJhYjYyMGVjLTk3ZjctNDdlMS05YzQ2LTVmOTJhOGNiN2MyMiIsDQogICJzY29wZSI6IFsNCiAgICAicHJvZmlsZSIsDQogICAgIm9mZmxpbmVfYWNjZXNzIg0KICBdLA0KICAiYXVkIjogImh0dHA6Ly9kZXYuYXBpLmhybS5odGVjLmNvLnJzOjgwIiwNCiAgIm5iZiI6IDE1NDAzNzc3MTIsDQogICJleHAiOiAxNTQzOTc3NzEyLA0KICAiaWF0IjogMTU0MDM3NzcxMiwNCiAgImlzcyI6ICJodHRwOi8vZGV2LmFwaS5ocm0uaHRlYy5jby5ycy8iDQp9.4FrY263n8Bpo6NEImqyWlwtCPgU2sB2QLX9sGwp8Tq4";

    @Test
    public void LogIn() {
        Response resp = given()
                .param("grant_type", config.getGrantType())
                .param("key", config.getKey())
                .param("email", config.getUsername())
                .param("provider", config.getProvider())
                .when()
                .post(config.getBaseURL())
                .then()
                .extract()
                .response();

        String token = resp.jsonPath().getString("access_token");

        System.out.println(resp.asString());


        System.out.println(token);
    }

    @Test
    public void validateEmployee() {
        given().auth().oauth2(token).get("http://dev.api.hrm.htec.co.rs/api/v2/People/profile/345").then().statusCode(200).log().all();
    }

    @Test
    public void apiTest() {

    }
}
