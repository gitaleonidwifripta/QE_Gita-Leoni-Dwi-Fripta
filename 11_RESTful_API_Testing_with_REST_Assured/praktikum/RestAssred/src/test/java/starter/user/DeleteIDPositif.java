package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class DeleteIDPositif {
    protected static String url = "https://jsonplaceholder.typicode.com/posts/1";
    @Step("I set DELETE endpoint")
    public String setDeleteEndpoint(){
        return url + "post/1";
    }
    @Step("I sent the correct HTTP DELETE request")
    public void sendDeleteHttpRequest(){
        SerenityRest.given().delete(setDeleteEndpoint());
    }
    @Step("I received the correct HTTP response code 200")
    public void validHttpresponseCode200(){
        restAssuredThat(response -> response.statusCode(200));
    }
    @Step("I receive valid data for detail user")
    public void Deletevalid() {
        restAssuredThat(response -> response.statusCode(200));
    }

}
