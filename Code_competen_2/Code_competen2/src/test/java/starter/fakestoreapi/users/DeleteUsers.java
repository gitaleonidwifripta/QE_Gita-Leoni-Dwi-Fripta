package starter.fakestoreapi.users;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class DeleteUsers {
    protected String url = "https://fakestoreapi.com/";
    @Step("I set DELETE endpoints")
    public String iSetDELETEEndpointsUsers(){
        return url + "users/6";
    }

    @Step("I send DELETE HTTP request")
    public void iSendDELETEHTTPRequestUsers(){
        SerenityRest.given().delete(iSetDELETEEndpointsUsers());
    }
    @Step("I received a valid HTTP response code 200 on a product DELETE")
    public void iReceivedAValidHTTPResponseCodeOnAProductDELETEUsers(){
        restAssuredThat(response -> response.statusCode(200));
    }
}
