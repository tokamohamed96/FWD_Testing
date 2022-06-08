package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepsofDefinition.Hooks;

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
}
