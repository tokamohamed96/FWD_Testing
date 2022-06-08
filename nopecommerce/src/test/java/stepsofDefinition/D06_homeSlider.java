package stepsofDefinition;

import Pages.P01_homePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

public class D06_homeSlider {
    P01_homePage home = new P01_homePage();

    @When("user clicks on slider")
    public void clickingSlider(){
        home.slider("1").click();
    }

    @Then("clicked slider navigates to relative product")
    public void productDisplayed() throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertEquals(Hooks.driver.getCurrentUrl(), "https://demo.nopcommerce.com/nokia-lumia-1020");

    }

    @When("user clicks on second slider")
    public void clickingSecondSlider(){
        home.slider("2").click();
    }

    @Then("clicked second slider navigates to relative product")
    public void secondProductDisplayed() throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertEquals(Hooks.driver.getCurrentUrl(), "https://demo.nopcommerce.com/iphone-6");

    }
}
