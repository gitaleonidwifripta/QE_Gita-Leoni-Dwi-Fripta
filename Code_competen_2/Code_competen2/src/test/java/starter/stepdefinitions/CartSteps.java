package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.fakestoreapi.cart.DeleteCartP;
import starter.fakestoreapi.cart.GetCartP;
import starter.fakestoreapi.cart.PostCartp;
import starter.fakestoreapi.cart.PutCartP;

public class CartSteps {
    @Steps
    GetCartP getcartp;
    @Steps
    PostCartp postcartp;
    @Steps
    PutCartP putcartp;
    @Steps
    DeleteCartP deletecartp;
    @Given("I set the GET api endpoint")
    public void iSetTheGETApiEndpoint() {
        getcartp.iSetTheGETApiEndpoint();
    }

    @When("I am sending HTTP Api GET request")
    public void iAmSendingHTTPApiGETRequest() {
        getcartp.iAmSendingHTTPApiGETRequest();
    }

    @Then("I received a valid HTTP response code {int} for Get All data Cart")
    public void iReceivedAValidHTTPResponseCodeForGetAllDataCart(int arg0) {
        getcartp.iReceivedAValidHTTPResponseCodeForGetAllDataCart();
    }

    @And("I received valid data for all carts")
    public void iReceivedValidDataForAllCarts() {
        getcartp.iReceivedValidDataForAllCarts();
    }



    @Given("I set the POST endpoint cart")
    public void iSetThePOSTEndpointCart() {
        postcartp.iSetThePOSTEndpointCart();
    }

    @When("I send POST HTTP request cart")
    public void iSendPOSTHTTPRequestCart() {
        postcartp.iSendPOSTHTTPRequestCart();
    }

    @And("I received a valid HTTP response code {int} on the cart")
    public void iReceivedAValidHTTPResponseCodeOnTheCart(int arg0) {
        postcartp.iReceivedAValidHTTPResponseCodeOnTheCart();
    }

    @Then("I received valid data for new cart")
    public void iReceivedValidDataForNewCart() {
        postcartp.iReceivedValidDataForNewCart();
    }

    @Given("I set PUT endpoints cart")
    public void iSetPUTEndpointsCart() {
        putcartp.iSetPUTEndpointsCart();
    }

    @When("I send PUT HTTP request cart")
    public void iSendPUTHTTPRequestCart() {
        putcartp.iSendPUTHTTPRequestCart();
    }

    @And("I receive valid HTTP response code {int} on the cart")
    public void iReceiveValidHTTPResponseCodeOnTheCart(int arg0) {
        putcartp.iReceiveValidHTTPResponseCodeOnTheCart();
    }

    @Then("I received valid data for an existing cart")
    public void iReceivedValidDataForAnExistingCart() {
        putcartp.iReceivedValidDataForAnExistingCart();
    }

    @Given("I set DELETE endpoints cart")
    public void iSetDELETEEndpointsCart() {
        deletecartp.iSetDELETEEndpointsCart();
    }

    @When("I send DELETE HTTP request cart")
    public void iSendDELETEHTTPRequestCart() {
        deletecartp.iSendDELETEHTTPRequestCart();
    }

    @And("I received a valid HTTP response code {int} on a product DELETE cart")
    public void iReceivedAValidHTTPResponseCodeOnAProductDELETECart(int arg0) {
        deletecartp.iReceivedAValidHTTPResponseCodeOnAProductDELETECart();
    }
}
