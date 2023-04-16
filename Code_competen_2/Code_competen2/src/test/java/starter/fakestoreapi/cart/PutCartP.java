package starter.fakestoreapi.cart;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class PutCartP {
    protected String url = "'https://fakestoreapi.com/";

    @Step("I set PUT endpoints cart")
    public String iSetPUTEndpointsCart(){
        return url + "carts/7";
    }

    @Step("I send PUT HTTP request cart")
    public void iSendPUTHTTPRequestCart(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("userid", 10);
        requestBody.put("date", 2020-02-04);
        requestBody.put("products", "{'productId:1', 'quality:3'}");


        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).put(iSetPUTEndpointsCart());
    }
    @Step("I receive valid HTTP response code 200 on the cart")
    public void iReceiveValidHTTPResponseCodeOnTheCart(){

        restAssuredThat(response -> response.statusCode(200));
    }
    @Step("I received valid data for an existing cart")
    public void iReceivedValidDataForAnExistingCart(){
        restAssuredThat(response -> response.body("'userid'", equalTo(10)));
        restAssuredThat(response -> response.body("'date'", equalTo(2020-02-04)));
        restAssuredThat(response -> response.body("'products'", equalTo("{'productId:1', 'quality:3'}")));
    }
}
