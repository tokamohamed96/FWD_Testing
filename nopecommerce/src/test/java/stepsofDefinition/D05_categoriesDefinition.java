package stepsofDefinition;

import Pages.P01_homePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class D05_categoriesDefinition {
    P01_homePage homePage = new P01_homePage();
    String subCategoryName;
    @When("user hover computers")
    public void hoverAction(){
        Actions action = new Actions(Hooks.driver);
        action.moveToElement(homePage.hoverCategories_cmputer()).perform();
        subCategoryName = homePage.hoverSubCategory_desktop().getText();
        System.out.println(subCategoryName);
    }

    @And("select subcategory")
    public void selectingSubategory(){
        homePage.hoverSubCategory_desktop().click();

    }
    @Then("user navigates to subcategory page")
    public void assert_navigating_to_subcategorypage(){
        Assert.assertEquals(homePage.pageTitle().getText(), subCategoryName);
    }
}
