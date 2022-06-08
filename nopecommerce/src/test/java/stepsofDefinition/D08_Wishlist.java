package stepsofDefinition;

import Pages.P01_homePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class D08_Wishlist {
    P01_homePage home = new P01_homePage();
    String products_before;
   @Given("user check number of products")
   public void assert_product_wishlist_before(){
       products_before = home.wishlistProduct().getText();
       System.out.println(products_before);
   }
    @When("user click on which list button")
    public void add_to_wishlist_button(){

        home.wishlistbutton().click();

    }

    @Then("validation message displayed that product added")
    public void assert_container_visibility(){
        Assert.assertEquals(home.messageContainer().getCssValue("background-color"), "rgba(75, 176, 122, 1)");
        Assert.assertTrue(home.messageContainer().isDisplayed());
    }

    @And("assert success message")
    public void assert_message(){
        Assert.assertTrue(home.messageContent().getText().contains("The product has been added to your "));
        Assert.assertTrue(home.messageContent().isDisplayed());
    }
    @And("wishlist products increased")
    public void assert_wishist_products_increased(){
        String products_after = home.wishlistProduct().getText();
        System.out.println(products_after);


    }
}
