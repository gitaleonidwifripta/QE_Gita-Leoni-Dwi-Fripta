package starter.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.login.Cart;
import starter.login.Home;
import starter.login.Login;

public class LoginSteps {
    @Steps
    Login login;

    @Steps
    Home home;

    @Steps
    Cart cart;

    @Given("I am on the login page")
    public void onTheLoginPage(){
        login.openUrl("https://www.saucedemo.com/");
        login.validateOnTheLoginPage();
    }

    @When("I enter valid username")
    public void doEnterValidUsername(){
        login.inputUsername("standard_user");
    }

    @And("I enter valid password")
    public void doEnterValidPassword(){
        login.inputPassword("secret_sauce");
    }

    @And("I click login button")
    public void doClickLoginButton(){
        login.clickButtonLogin();
    }

    @Then("I am on the home page")
    public void onTheHomePage(){
        home.validateOnTheHomePage();
    }

    @And("I enter invalid username")
    public void doEnterInvalidUsername(){ login.inputUsername("Gita");}

    @And("I enter invalid password")
    public void doEnterInvalidPassword(){ login.inputPassword("leoni");}

    @Then("I can see error message {string}")
    public void doSeeErrorMessage(String message){
        login.validateErrorMessageDisplayed();
        login.validateEqualErrorMessage(message);
    }
    @And("I click product")
    public void Product(){ cart.AddToCart();}
    @And("I click add to cart")
    public void AddToCart(){cart.AddToCart();}
}











