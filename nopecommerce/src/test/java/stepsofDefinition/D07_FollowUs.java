package stepsofDefinition;

import Pages.P01_homePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.ArrayList;

public class D07_FollowUs {
    P01_homePage homePage = new P01_homePage();
    ArrayList<String> tabs ;

    @When("user clicks facebook tab")
    public void navigating_to_facebook() throws InterruptedException {
        homePage.facebook().click();
        Thread.sleep(2000);
    }

    @When("user clicks twitter tab")
    public void navigating_to_twitter() throws InterruptedException {
        homePage.twitter().click();
        Thread.sleep(2000);
    }

    @When("user clicks rss tab")
    public void navigating_to_rss() throws InterruptedException {
        homePage.rss().click();
        Thread.sleep(2000);
    }

    @When("user clicks youtube tab")
    public void navigating_to_youtube() throws InterruptedException {
        homePage.youtube().click();
        Thread.sleep(2000);
    }
    @And("^select \"(.*)\" tab$")
    public void navigating_to_Tabs(String link) throws InterruptedException {
        tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(tabs.get(1));
        System.out.println(Hooks.driver.getCurrentUrl());
        switch (link) {
            case "facebook":
            Assert.assertTrue(Hooks.driver.getCurrentUrl().contains("https://www.facebook.com/nopCommerce"));
            break;
            case "twitter":
                Assert.assertTrue(Hooks.driver.getCurrentUrl().contains("https://twitter.com/nopCommerce"));
                break;

            case "rss":
                Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/new-online-store-is-open");
                break;

            case "youtube":
                Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://www.youtube.com/user/nopCommerce");
                break;

        }
        Hooks.driver.close();
        Hooks.driver.switchTo().window(tabs.get(0));
        System.out.println(Hooks.driver.getCurrentUrl());
    }

}
