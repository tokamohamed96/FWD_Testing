package stepsofDefinition;

import Pages.P01_homePage;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Select;

public class D03_currencyDefinition {
    P01_homePage homePage = new P01_homePage();

    @When("user select currency dropdown")
    public void selectDropdown(){
        Select select = new Select(homePage.currency());
        select.selectByValue("https://demo.nopcommerce.com/changecurrency/6?returnUrl=%2F");

    }
}
