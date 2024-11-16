package com.sky.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class ProductDetails {
    private WebDriver driver;
    private WebDriverWait wait;

    public ProductDetails(WebDriver driver){
        this.driver=driver;
        wait= new WebDriverWait(driver, Duration.ofSeconds(10));
    }
   
    public void  i_click_on_First_item(){
        driver.findElement(By.className("inventory_item_img")).click();
        System.out.println("Hi I am in product details");
      //driver.quit();
    }

    public void i_add_item_to_Cart(){
       // wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Sauce Labs Bike Light"))).click();
       driver.findElement(By.className("btn_primary")).click();
        System.out.println("Price of product added to cart is : " +driver.findElement(By.className("inventory_details_price")).getText());
        //driver.quit();
    }

    public void i_add_another_item_to_cart(){
       driver.findElement(By.className("inventory_details_back_button")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Sauce Labs Bolt T-Shirt"))).click();
        driver.findElement(By.className("btn_primary")).click();
        // driver.findElement(By.linkText(item)).click();
        // driver.findElement(By.linkText("Sauce Labs Bike Light")).click();
        //driver.quit();
    }

    public void i_click_on_sort_product_by_price(String priceSortOrder){
        driver.findElement(By.className("product_sort_container")).click();
        // Locate the dropdown element
        WebElement dropdownElement = driver.findElement(By.className("product_sort_container"));
        // Create a Select object
        Select dropdown = new Select(dropdownElement);
        // Select option by index (0-based)
        dropdown.selectByVisibleText(priceSortOrder);

        driver.quit();
        
    }

}
