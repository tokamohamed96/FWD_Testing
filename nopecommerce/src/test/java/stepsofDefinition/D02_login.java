package stepsofDefinition;

import Pages.P01_homePage;
import Pages.P03_LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.lang.annotation.Target;

public class D02_login {
    P01_homePage homePage = new P01_homePage();
    P03_LoginPage login = new P03_LoginPage();

    @When("user click on login button")
    public void loginButton(){
    homePage.login_button().click();
    }

    //testing498702880@gmail.com
   @Then("user enter valid data")
    public void login(){

        login.emailAddress().sendKeys("tokaezz96+1@gmail.com");
        login.password().sendKeys("147852369Tok@");
   }
   @And("user click on login")
    public void loginAction(){
        login.loginbutton().click();
   }

   @Then("user navigates to account")
    public void account() throws InterruptedException {
       //Thread.sleep(2000);
       Assert.assertEquals(Hooks.driver.getCurrentUrl(), "https://demo.nopcommerce.com/");
   }
}
