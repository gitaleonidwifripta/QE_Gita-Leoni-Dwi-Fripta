package Runner.sepulsa;

import net.thucydides.core.annotations.Step;

public class Login {
    @Step("I am on the login page")
    public void LoginPage(){System.out.println("I am on the login page");

    }
    @Step("I enter my valid email and password")
    public void NameAndPasword(){System.out.println("I enter my valid email and password");

    }
    @Step("click on the login button")
    public void ClickButton(){System.out.println("click on the login button");

    }
    @Step("I should be redirected to the home page")
    public void HomeSepulsa(){System.out.println("I should be redirected to the home page");

    }
}
