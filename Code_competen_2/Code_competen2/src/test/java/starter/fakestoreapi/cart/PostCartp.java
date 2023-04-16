package starter.fakestoreapi.cart;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class PostCartp {
    protected String url = "https://fakestoreapi.com/";

    @Step("I set the POST endpoint cart")
    public String iSetThePOSTEndpointCart(){
        return url + "carts";
    }

    @Step("I send POST HTTP request cart")
    public void iSendPOSTHTTPRequestCart(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("userid", 5);
        requestBody.put("date", 2020-02-03);
        requestBody.put("products", "{'productId:5', 'quality:1'}");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(iSetThePOSTEndpointCart());
    }

    @Step("I received a valid HTTP response code 200 on the cart")
    public void iReceivedAValidHTTPResponseCodeOnTheCart(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I received valid data for new cart")
    public void iReceivedValidDataForNewCart(){
        restAssuredThat(response -> response.body("'userid'", equalTo(5)));
        restAssuredThat(response -> response.body("'date'", equalTo(2020-02-03)));
        restAssuredThat(response -> response.body("'products'", equalTo("{'productId:5', 'quality:1'}")));
    }
}
