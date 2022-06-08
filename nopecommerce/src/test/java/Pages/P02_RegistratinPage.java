package Pages;

import io.cucumber.messages.types.Hook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepsofDefinition.Hooks;

public class P02_RegistratinPage {
    public boolean register_page(){
        return Hooks.driver.getCurrentUrl().equals("https://demo.nopcommerce.com/register?returnUrl=%2F");

    }
    public WebElement gender(){
        WebElement gender = Hooks.driver.findElement(By.xpath("//label[text()='Female']"));
        return  gender;
    }

    public WebElement first_name(){
        WebElement first = Hooks.driver.findElement(By.id("FirstName"));
        return first;
    }
    public WebElement last_name(){
        WebElement last = Hooks.driver.findElement(By.id("LastName"));
        return last;
    }

    public WebElement day(){
        WebElement day = Hooks.driver.findElement(By.cssSelector("option[value='14']"));
        return day;
    }

    public WebElement month(){
        WebElement month = Hooks.driver.findElement(By.xpath("//option[text()='October']"));
        return month;
    }

    public WebElement year(){
        WebElement year = Hooks.driver.findElement(By.cssSelector("option[value='1996']"));
        return year;
    }

    public WebElement email(){
        WebElement email = Hooks.driver.findElement(By.id("Email"));
        return email;
    }

    public WebElement company(){
        WebElement company = Hooks.driver.findElement(By.id("Company"));
        return company;
    }

    public WebElement password(){
        WebElement password = Hooks.driver.findElement(By.id("Password"));
        return password;
    }

    public WebElement confirm(){
        WebElement confirm = Hooks.driver.findElement(By.id("ConfirmPassword"));
        return confirm;
    }

    public WebElement register(){
        WebElement registerButton = Hooks.driver.findElement(By.id("register-button"));
        return registerButton;
    }

    public WebElement registerMessage(){
        WebElement registrationMessage = Hooks.driver.findElement(By.cssSelector("div[class='result']"));
        return  registrationMessage;
    }
}
