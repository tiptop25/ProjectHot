package com.eviltester.webdriver;

import junit.framework.TestCase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;


public class MyTestLowestPriceTest {
 @Test
 public void startWebDriwer(){
        WebDriver driver = new FirefoxDriver();
        driver.get("http://hotline.ua");
     driver.findElement(By.xpath("//*[@id='lv-1-3699']/a/b")).click();
     driver.findElement(By.xpath("//*[@id='lv-1-3715']/a/b")).click();
     driver.findElement(By.xpath("//*[@id='lv-1-3715']/div/div/div/div/div/div/a[1]")).click();

     driver.close();
     driver.quit();

    }

}