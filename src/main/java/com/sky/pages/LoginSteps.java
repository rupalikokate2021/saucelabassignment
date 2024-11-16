package com.sky.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class LoginSteps {
    private WebDriver driver;
    private WebDriverWait wait;
    
    public LoginSteps(WebDriver driver){
        this.driver=driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void i_am_on_the_Login_Page(){
        driver.get("https://www.saucedemo.com/v1/index.html");
    }

    public void i_enter_Valid_username_and_password(String username, String password ){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user-name"))).sendKeys(username);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password"))).sendKeys(password);
    }

    public void i_enter_valid_username_and_password() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user-name"))).sendKeys("standard_user");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password"))).sendKeys("secret_sauce");
    }

    public void i_enter_invalid_username_and_password(String username, String password){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user-name"))).sendKeys(username);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password"))).sendKeys(password);
    }

    public void i_click_on_the_Login_button(){
        driver.findElement(By.id("login-button")).click();
    }

    public void i_should_see_the_landing_page(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("inventory_container")));
        System.out.println("Login successful: " + driver.findElement(By.id("inventory_container")).getText());
        //driver.quit();
    }

    public void i_should_see_an_error_message(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("error-button")));
        System.out.println("Error message displayed: " + driver.findElement(By.className("error-button")).getText());
       driver.quit();
    }
}
