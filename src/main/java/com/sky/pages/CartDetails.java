package com.sky.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CartDetails {
    private WebDriver driver;
    private WebDriverWait wait;

public CartDetails(WebDriver driver){
    this.driver=driver;
    wait=new WebDriverWait(driver, Duration.ofSeconds(10));
}

public void i_should_see_the_cart_details(){
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("shopping_cart_container")));
    System.out.println("I can see the cart Details: "+driver.findElement(By.id("shopping_cart_container")).getText());
}

public void i_click_on_Cart_Details(){
    driver.findElement(By.xpath("//a[@href='./cart.html']")).click();
}
}
