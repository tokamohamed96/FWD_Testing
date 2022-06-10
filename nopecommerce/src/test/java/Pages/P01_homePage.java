package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepsofDefinition.Hooks;

import java.util.List;

public class P01_homePage {
    public WebElement slider(String slider_number){
        WebElement slider =  Hooks.driver.findElement(By.xpath("(//a[@href='http://demo.nopcommerce.com/'])["+slider_number+"]"));
        return slider;
    }

    public WebElement wishlistbutton(){
        WebElement wishlist = Hooks.driver.findElement(By.xpath("(//button[@title='Add to wishlist'])[3]"));
        return wishlist;
    }

    public WebElement messageContainer(){
        WebElement container = Hooks.driver.findElement(By.xpath("//div[@class='bar-notification success']"));
        return container;
    }
    public WebElement messageContent(){
        WebElement message = Hooks.driver.findElement(By.xpath("//p[@class='content']"));
        return message;
    }

    public WebElement wishlistProduct(){
        WebElement products = Hooks.driver.findElement(By.xpath("//span[@class='wishlist-qty']"));
        return products;
    }

    public WebElement register_button(){
        WebElement register = Hooks.driver.findElement(By.xpath("//a[text()='Register']"));
        return register;
    }

    public WebElement login_button(){
        WebElement login = Hooks.driver.findElement(By.cssSelector("a[class='ico-login']"));
        return login;
    }

    public WebElement currency(){
        WebElement euro = Hooks.driver.findElement(By.name("customerCurrency"));
        return  euro;
    }

    public WebElement search(){
        WebElement search = Hooks.driver.findElement(By.id("small-searchterms"));
        return search;
    }

    public WebElement searchButton(){
        WebElement searchButton = Hooks.driver.findElement(By.xpath("//button[text()='Search']"));
        return searchButton;
    }

    public List<WebElement> items(){
        List<WebElement> items = Hooks.driver.findElements(By.cssSelector("div[class='product-item']"));
        return items;
    }

    public WebElement hoverCategories_cmputer(){
        WebElement hoverElement = Hooks.driver.findElement(By.cssSelector("ul[class=\"top-menu notmobile\"] a[href=\"/computers\"]"));
        return hoverElement;
    }

    public  WebElement hoverSubCategory_desktop(){
        WebElement desktops = Hooks.driver.findElement(By.cssSelector("ul[class=\"top-menu notmobile\"] a[href=\"/desktops\"]"));
        return desktops;
    }

    public WebElement pageTitle(){
        WebElement title = Hooks.driver.findElement(By.cssSelector("div[class=\"page-title\"]"));
        return title;
    }

    public WebElement facebook(){
        WebElement facebook = Hooks.driver.findElement(By.xpath("//a[text()='Facebook']"));
        return facebook;
    }

    public WebElement twitter(){
        WebElement twitter = Hooks.driver.findElement(By.xpath("//a[text()='Twitter']"));
        return twitter;
    }

    public WebElement rss(){
        WebElement rss = Hooks.driver.findElement(By.xpath("//a[text()='RSS']"));
        return rss;
    }

    public WebElement youtube(){
        WebElement youtube = Hooks.driver.findElement(By.xpath("//a[text()='YouTube']"));
        return youtube;
    }
}
