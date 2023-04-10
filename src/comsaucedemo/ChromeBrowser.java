package comsaucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {
    public static void main(String[] args) {
        String baseUrl = "https://www.saucedemo.com/";

        // Set up chrome browser

        WebDriver driver = new ChromeDriver();
        driver.get(baseUrl);

        // Print the title of the page
        String title = driver.getTitle();
        System.out.println(title);

        //Print the current URL
        driver.getCurrentUrl();
        System.out.println("Current URL :" + driver.getCurrentUrl());

        //Print the page source
        System.out.println("Page source : " + driver.getPageSource());

        // Enter username in username field

        WebElement usernameField =  driver.findElement(By.id("user-name"));
        usernameField.sendKeys("Anisha30");

        // Enter password to password field

        driver.findElement(By.id("password")).sendKeys("march03");

        // Close the browser
        driver.close();






    }
}
