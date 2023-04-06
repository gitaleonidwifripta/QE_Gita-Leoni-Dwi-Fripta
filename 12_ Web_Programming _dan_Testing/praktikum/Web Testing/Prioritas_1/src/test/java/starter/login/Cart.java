package starter.login;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class Cart extends PageObject {
    private By product(){
        return By.id("add-to-cart-sauce-labs-backpack");
    }
    public void AddToCart() {
        $(product()).isDisplayed();
    }


}
