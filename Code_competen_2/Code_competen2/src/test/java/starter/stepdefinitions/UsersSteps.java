package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.fakestoreapi.users.DeleteUsers;
import starter.fakestoreapi.users.GetAllUsersP;
import starter.fakestoreapi.users.PostUsersP;
import starter.fakestoreapi.users.PutUsersP;

public class UsersSteps {

    @Steps
    GetAllUsersP getallusersp;

    @Steps
    PostUsersP postuserp;

    @Steps
    PutUsersP putuserp;

    @Steps
    DeleteUsers deleteusers;
    @Given("I set the GET api endpoint for the user")
    public void iSetTheGETApiEndpointForTheUser() {
        getallusersp.iSetTheGETApiEndpointForTheUser();
    }

    @When("I am sending HTTP Api GET requests for users")
    public void iAmSendingHTTPApiGETRequestsForUsers() {
        getallusersp.iAmSendingHTTPApiGETRequestsForUsers();
    }

    @Then("I received a valid HTTP response code {int} for Get All data users")
    public void iReceivedAValidHTTPResponseCodeForGetAllDataUsers(int arg0) {
        getallusersp.iReceivedAValidHTTPResponseCodeForGetAllDataUsers();
    }

    @And("I received valid data for user details")
    public void iReceivedValidDataForAllUsers() {
        getallusersp.iReceivedValidDataForAllUsers();
    }


    @Given("I set the POST endpoint users")
    public void iSetThePOSTEndpointUsers() {
        postuserp.iSetThePOSTEndpointUsers();
    }

    @When("I send POST HTTP request users")
    public void iSendPOSTHTTPRequestUsers() {
        postuserp.iSendPOSTHTTPRequestUsers();
    }

    @And("I received a valid HTTP response code {int} on the users")
    public void iReceivedAValidHTTPResponseCodeOnTheUser(int arg0) {
        postuserp.iReceivedAValidHTTPResponseCodeOnTheUser();
    }

    @Then("I received valid data for new user")
    public void iReceivedValidDataForNewUser() {
        postuserp.iReceivedValidDataForNewUser();
    }



    @Given("I set PUT endpoints users")
    public void iSetPUTEndpointsUsers() {
        putuserp.iSetPUTEndpointsUsers();
    }

    @When("I send PUT HTTP request users")
    public void iSendPUTHTTPRequestUsers() {
        putuserp.iSendPUTHTTPRequestUsers();
    }

    @And("I receive valid HTTP response code {int} on the users")
    public void iReceiveValidHTTPResponseCodeOnTheUsers(int arg0) {
        putuserp.iReceiveValidHTTPResponseCodeOnTheUsers();
    }

    @Then("I received valid data for an existing user")
    public void iReceivedValidDataForAnExistingUser() {
        putuserp.iReceivedValidDataForAnExistingUser();
    }


    @Given("I set DELETE endpoints users")
    public void iSetDELETEEndpointsUsers() {
        deleteusers.iSetDELETEEndpointsUsers();
    }

    @When("I send DELETE HTTP request users")
    public void iSendDELETEHTTPRequestUsers() {
        deleteusers.iSendDELETEHTTPRequestUsers();
    }

    @Then("I received a valid HTTP response code {int} on a product DELETE users")
    public void iReceivedAValidHTTPResponseCodeOnAProductDELETEUsers(int arg0) {
        deleteusers.iReceivedAValidHTTPResponseCodeOnAProductDELETEUsers();
    }

}
