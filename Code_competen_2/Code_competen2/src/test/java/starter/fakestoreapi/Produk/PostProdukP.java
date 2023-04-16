package starter.fakestoreapi.Produk;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class PostProdukP {
    protected String url = "https://fakestoreapi.com/";

    @Step("I set POST endpoints product")
    public String iSetPOSTEndpointsProduct(){
        return url + "products";
    }

    @Step("I send POST HTTP request product")
    public void iSendPOSTHTTPRequestProduct(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("title", "originote");
        requestBody.put("price", 100.000);
        requestBody.put("description", "skincare");
        requestBody.put("image", "https://i.pravatar.cc");
        requestBody.put("category", "skincaree");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(iSetPOSTEndpointsProduct());
    }

    @Step("I receive valid HTTP response code 201 product")
    public void iReceiveValidHTTPResponseCodeProduct(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I receive valid data for new product")
    public void iReceiveValidDataForNewProduct(){
        restAssuredThat(response -> response.body("'title'", equalTo("originote")));
        restAssuredThat(response -> response.body("'price'", equalTo(100.000)));
        restAssuredThat(response -> response.body("'description'", equalTo("skincare")));
        restAssuredThat(response -> response.body("'image'", equalTo("https://i.pravatar.cc")));
        restAssuredThat(response -> response.body("'category'", equalTo("skincaree")));
    }
}
