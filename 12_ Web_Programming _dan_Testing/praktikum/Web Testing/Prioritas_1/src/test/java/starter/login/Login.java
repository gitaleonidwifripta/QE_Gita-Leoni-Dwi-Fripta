package starter.login;

import net.serenitybdd.screenplay.actions.OpenUrl;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import net.thucydides.core.pages.PageObject;

public class Login extends PageObject{
    private By usernameField(){
        return By.id("user-name");
    }

    private By passwordField(){
        return By.id("password");
    }

    private By loginButton(){
        return By.id("login-button");
    }

    private By errorMessage(){ return By.className("error-button");}
    private By Product(){return By.id("add-to-cart-sauce-labs-backpack");}

    @Step
    public static OpenUrl url(String targetUrl){
        return new OpenUrl(targetUrl);
    }

    @Step
    public void validateOnTheLoginPage(){
        $(loginButton()).isDisplayed();
    }

    @Step
    public void inputUsername(String username){
        $(usernameField()).type(username);
    }

    @Step
    public void inputPassword(String password){
        $(passwordField()).type(password);
    }

    @Step
    public void clickButtonLogin(){
        $(loginButton()).click();
    }

    @Step
    public boolean validateErrorMessageDisplayed(){
        return $(errorMessage()).isDisplayed();
    }
    @Step
    public boolean validateEqualErrorMessage(String message){
        return $(errorMessage()).getText().equalsIgnoreCase(message);
    }
    @Step
    public void Clikproduct(){$(Product()).click();}

    @Step
    public void AddToCart(){$(Product()).click();}
}
