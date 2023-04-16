package starter.fakestoreapi.users;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class PutUsersP {
    protected String url = "'https://fakestoreapi.com/";

    @Step("I set PUT endpoints users")
    public String iSetPUTEndpointsUsers(){
        return url + "users/7";
    }

    @Step("I send PUT HTTP request users")
    public void iSendPUTHTTPRequestUsers(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "gitaleoni21@gmail.com");
        requestBody.put("username", "gita");
        requestBody.put("password", "gita786");
        requestBody.put("name", "gita leoni");
        requestBody.put("addres", "bondowoso");
        requestBody.put("phone", "08976255252");


        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).put(iSetPUTEndpointsUsers());
    }
    @Step("I receive valid HTTP response code 200 on the users")
    public void iReceiveValidHTTPResponseCodeOnTheUsers(){

        restAssuredThat(response -> response.statusCode(200));
    }
    @Step("I received valid data for an existing user")
    public void iReceivedValidDataForAnExistingUser(){
        restAssuredThat(response -> response.body("'email'", equalTo("gitaleoni21@gmail.com")));
        restAssuredThat(response -> response.body("'username'", equalTo("gita")));
        restAssuredThat(response -> response.body("'password'", equalTo("gita786")));
        restAssuredThat(response -> response.body("'name'", equalTo("gita leoni")));
        restAssuredThat(response -> response.body("'addres'", equalTo("bondowoso")));
        restAssuredThat(response -> response.body("'phone'", equalTo("08976255252")));
    }
}
