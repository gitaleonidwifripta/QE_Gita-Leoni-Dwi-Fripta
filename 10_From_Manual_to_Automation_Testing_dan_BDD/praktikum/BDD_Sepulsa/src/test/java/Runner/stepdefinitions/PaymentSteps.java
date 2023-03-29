package Runner.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import Runner.sepulsa.payment;

public class PaymentSteps {
    @Steps
    payment Payment;

    @Given("Considering I have added product then go to history page")
    public void ProductRiwayat(){ Payment.ProductRiwayat();}
    @When("I navigate to the checkout page")
    public void NavigateCheckout(){ Payment.NavigateCheckout();}
    @And("choose a payment method")
    public void Metode(){ Payment.Metode();}

    @Then("I have to look at the payment form as well as enter payment details and click the pay button")
    public void ClickPayButton(){ Payment.ClickPayButton();}
}
