package Runner.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import Runner.sepulsa.Login;

public class LoginSteps {
    @Steps
    Login login;

    @Given("I am on the login page")
    public void OpenProfile(){ login.LoginPage();}
    @When("I enter my valid email and password")
    public void EnterName(){ login.NameAndPasword();}
    @And("click on the login button")
    public void ClickButton(){ login.ClickButton();}
    @Then("I should be redirected to the home page")
    public void Home(){ login.HomeSepulsa();}
}
