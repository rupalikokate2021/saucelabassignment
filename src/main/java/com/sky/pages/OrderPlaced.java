package com.sky.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrderPlaced {
     private WebDriver driver;
    private WebDriverWait wait;
    
    public OrderPlaced(WebDriver driver){
        this.driver=driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void i_click_on_Checkout(){
        driver.findElement(By.className("btn_action")).click();
    }

    public void i_enter_valid_firstname_and_lastname_and_zippostalcode(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("first-name"))).sendKeys("Rupali");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("last-name"))).sendKeys("Kokate");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("postal-code"))).sendKeys("SS16 5fw");
    }
    public void i_click_on_continue() {
        driver.findElement(By.className("btn_primary")).click();

    }
    public void i_click_on_finish() {
        driver.findElement(By.className("btn_action")).click();
        driver.quit();
    }
}

