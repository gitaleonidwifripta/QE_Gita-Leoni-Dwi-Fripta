package Runner.sepulsa;

import net.thucydides.core.annotations.Step;

public class product {
    @Step("I am logged in")
    public void Login(){System.out.println("I am logged in");

    }
    @Step("I navigate to the products page")
    public void Navigate(){System.out.println("I navigate to the products page");

    }
    @Step("select a product")
    public void SelectProduct(){System.out.println("select a product");

    }
    @Step("I should see the product details")
    public void ProductSepulsa(){System.out.println("I should see the product details");

    }
}
