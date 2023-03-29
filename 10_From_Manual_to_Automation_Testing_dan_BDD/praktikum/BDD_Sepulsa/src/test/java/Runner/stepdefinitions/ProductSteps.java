package Runner.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import Runner.sepulsa.product;

public class ProductSteps {
    @Steps
    product Product;

    @Given("I am logged in")
    public void Login(){ Product.Login();}
    @When("I navigate to the products page")
    public void Navigate(){ Product.Navigate();}
    @And("select a product")
    public void SelectProduct(){ Product.SelectProduct();}
    @Then("I should see the product details")
    public void Product(){ Product.ProductSepulsa();}
}
