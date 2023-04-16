package starter.fakestoreapi.cart;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class DeleteCartP {
    protected String url = "https://fakestoreapi.com/";
    @Step("I set DELETE endpoints cart")
    public String iSetDELETEEndpointsCart(){
        return url + "carts/6";
    }

    @Step("I send DELETE HTTP request cart")
    public void iSendDELETEHTTPRequestCart(){
        SerenityRest.given().delete(iSetDELETEEndpointsCart());
    }
    @Step("I received a valid HTTP response code 200 on a product DELETE cart")
    public void iReceivedAValidHTTPResponseCodeOnAProductDELETECart(){
        restAssuredThat(response -> response.statusCode(200));
    }
}
