package Runner.sepulsa;

import net.thucydides.core.annotations.Step;

public class payment {
    @Step("Considering I have added product then go to history page")
    public void ProductRiwayat(){System.out.println("Considering I have added product then go to history page");

    }
    @Step("I navigate to the checkout page")
    public void NavigateCheckout(){System.out.println("I navigate to the checkout page");

    }
    @Step("choose a payment method")
    public void Metode(){System.out.println("choose a payment method");

    }
    @Step("I have to look at the payment form as well as enter payment details and click the pay button")
    public void ClickPayButton(){System.out.println("I have to look at the payment form as well as enter payment details and click the pay button");

    }
}
