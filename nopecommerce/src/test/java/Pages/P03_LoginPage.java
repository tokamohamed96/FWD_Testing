package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepsofDefinition.Hooks;

public class P03_LoginPage {
    public WebElement emailAddress(){
        WebElement email = Hooks.driver.findElement(By.id("Email"));
        return email;
    }

    public WebElement password(){
        WebElement password = Hooks.driver.findElement(By.id("Password"));
        return password;
    }

    public WebElement loginbutton(){
        WebElement login = Hooks.driver.findElement(By.xpath("//button[text()='Log in']"));
        return login;
    }
}
