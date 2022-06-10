package stepsofDefinition;

import Pages.P01_homePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class D06_homeSlider {
    P01_homePage home = new P01_homePage();

    @When("user clicks on slider")
    public void clickingSlider(){
        home.slider("1").click();
    }

    @Then("clicked slider navigates to relative product")
    public void productDisplayed() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(Hooks.driver,10);
        boolean check =  wait.until(ExpectedConditions.urlContains("https://demo.nopcommerce.com/nokia-lumia-1020"));
        Assert.assertTrue(check);
    }

    @When("user clicks on second slider")
    public void clickingSecondSlider(){
        home.slider("2").click();
    }

    @Then("clicked second slider navigates to relative product")
    public void secondProductDisplayed() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(Hooks.driver,10);
        boolean check =  wait.until(ExpectedConditions.urlContains("https://demo.nopcommerce.com/iphone-6"));
        Assert.assertTrue(check);

    }
}
