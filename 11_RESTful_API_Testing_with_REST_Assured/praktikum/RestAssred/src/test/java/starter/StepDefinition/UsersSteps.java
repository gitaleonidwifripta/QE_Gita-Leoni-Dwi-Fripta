package starter.StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.DeleteIDPositif;
import starter.user.GetIDPositif;
import starter.user.PostIDPositif;
import starter.user.PutIDPositif;

public class UsersSteps {
    @Steps
    GetIDPositif get;

    @Steps
    PostIDPositif post;
    @Steps
    PutIDPositif put;
    @Steps
    DeleteIDPositif delete;
    @Given("I set the GET endpoints")
    public void setGetEndpoints(){
        get.setGetEndpoints();

    }
    @When("I send GET HTTP request")
    public void getHTTPrequest(){
        get.getHTTPrequest();

    }
    @And("I receive valid HTTP response code 200")
    public void valiData(){
        get.valiData();

    }
    @Then("I receive valid data for detail user")
    public void HTTPresponse200(){
        get.HTTPresponse200();

    }

    @Given("I set POST endpoint")
    public void setPostApiEndpoint(){
        post.setPostApiEndpoint();

    }
    @When("I send POST HTTP request")
    public void sendPostHTTPRequest(){
        post.sendPostHttpRequest();

    }

    @Then("I receive valid HTTP response code 201")
    public void receiveValidHttp201(){
        post.receiveHttpResponseCode201();

    }

    @And("I receive valid data for new user")
    public void validateDataNewUser(){
        post.validateDatanewUser();

    }
    @Given("I set PUT endpoints")
    public void setPutEndpoint(){
        put.setPutEndpoint();

    }

    @When("I send PUT HTTP request")
    public void sendPutHttpRequest(){
        put.sendPutHttpRequest();

    }


    @And("I receive valid data for existing user")
    public void validateDataForExistingUser(){
        put.ValidateDataForExistingUser();

    }
    @Then("I received the correct HTTP response code which was 200")
    public void Response200(){
        put.Response200();

    }
    @Given("I set DELETE endpoint")
    public void setDeleteEndpoint(){
        delete.setDeleteEndpoint();


    }
    @When("I sent the correct HTTP DELETE request")
    public void sendDeleteHttpRequest(){
        delete.sendDeleteHttpRequest();

    }

    @Then("I received the correct HTTP response code 200")
    public void validHttpresponseCode200(){
        delete.validHttpresponseCode200();

    }
    @And("I can delete data by id")
    public void Deletevalid() {
        delete.Deletevalid();
    }



}
