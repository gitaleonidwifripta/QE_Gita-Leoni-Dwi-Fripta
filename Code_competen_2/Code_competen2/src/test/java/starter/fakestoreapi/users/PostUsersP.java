package starter.fakestoreapi.users;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class PostUsersP {
    protected String url = "https://fakestoreapi.com/";

    @Step("I set the POST endpoint users")
    public String iSetThePOSTEndpointUsers(){
        return url + "users";
    }

    @Step("I send POST HTTP request users")
    public void iSendPOSTHTTPRequestUsers(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("id", 11);
        requestBody.put("email", "gitaleoni21@gmail.com");
        requestBody.put("username", "gita");
        requestBody.put("password", "gita786");
        requestBody.put("name", "gita leoni");
        requestBody.put("addres", "bondowoso");
        requestBody.put("phone", "08976255252");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(iSetThePOSTEndpointUsers());
    }

    @Step("I received a valid HTTP response code 200 on the users")
    public void iReceivedAValidHTTPResponseCodeOnTheUser(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I received valid data for new user")
    public void iReceivedValidDataForNewUser(){
        restAssuredThat(response -> response.body("'id'", equalTo(11)));
        restAssuredThat(response -> response.body("'email'", equalTo("gitaleoni21@gmail.com")));
        restAssuredThat(response -> response.body("'username'", equalTo("gita")));
        restAssuredThat(response -> response.body("'password'", equalTo("gita786")));
        restAssuredThat(response -> response.body("'name'", equalTo("gita leoni")));
        restAssuredThat(response -> response.body("'addres'", equalTo("bondowoso")));
        restAssuredThat(response -> response.body("'phone'", equalTo("08976255252")));
    }
}
