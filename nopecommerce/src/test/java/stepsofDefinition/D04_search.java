package stepsofDefinition;

import Pages.P01_homePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class D04_search {
    P01_homePage homePage = new P01_homePage();

    @When("^user enter \"(.*)\" in search field$")
    public void search(String product){
        homePage.search().sendKeys(product);
        homePage.searchButton().click();
    }

    @And("navigates to search page")
    public void assert_URL() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/search"));
    }

    @Then("Related Products Displayed")
    public void assert_items_size(){
        int itemsSize = homePage.items().size();
        Assert.assertTrue(itemsSize > 0);
    }
}
