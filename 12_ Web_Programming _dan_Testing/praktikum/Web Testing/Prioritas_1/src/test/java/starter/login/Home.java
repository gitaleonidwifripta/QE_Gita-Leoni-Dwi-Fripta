package starter.login;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class Home extends PageObject {
    private By productsTitle(){
        return By.className("title");
    }
    @Step
    public void validateOnTheHomePage(){
        $(productsTitle()).isDisplayed();
    }
}
