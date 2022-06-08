package stepsofDefinition;

import Pages.P01_homePage;
import Pages.P02_RegistratinPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.util.Random;


public class D01_RegistrationDefinition {
    Random random = new Random();
    int x = random.nextInt(10000);
    P01_homePage homePage = new P01_homePage();
    P02_RegistratinPage registratinPage = new P02_RegistratinPage();

    @When("user click on register button")
    public void clicking_register_button(){
        homePage.register_button().click();
    }

    @And("user navigates to registration page")
    public void assert_user_naviates_to_registration(){
        Assert.assertTrue(registratinPage.register_page());
        
    }
    @Then("user fill personal data")
    public void apply_data() throws InterruptedException {

  registratinPage.gender().click();
  registratinPage.first_name().sendKeys("Toka");
  registratinPage.last_name().sendKeys("Mohamed");
  registratinPage.day().click();
  registratinPage.month().click();
  registratinPage.year().click();
  registratinPage.email().sendKeys("testing"+x+"@gmail.com");
  registratinPage.company().sendKeys("Front End Testing");
  registratinPage.password().sendKeys("147852369Tok@");
  registratinPage.confirm().sendKeys("147852369Tok@");



    }

  @And("register")
  public void registr(){
      registratinPage.register().click();
  }

    @Then("user is registered successfully")
    public void assert_user_registered() throws InterruptedException {
        Hooks.wait.until(ExpectedConditions.visibilityOf(registratinPage.registerMessage()));
        Assert.assertTrue(registratinPage.registerMessage().isDisplayed());
        Assert.assertEquals(registratinPage.registerMessage().getText(), "Your registration completed");
        Assert.assertEquals(registratinPage.registerMessage().getCssValue("color"),"rgba(76, 177, 124, 1)");

    }
}
