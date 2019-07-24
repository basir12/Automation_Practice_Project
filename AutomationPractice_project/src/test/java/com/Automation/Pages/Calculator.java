package com.Automation.Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

	
	
	
	
	public class Calculator {

	    public WebDriver driver;

	    @BeforeMethod

	    public void beforTest() {

	        System.setProperty("webdriver.chrome.driver","src\\test\\resources\\Browsers\\chromedriver.exe");
	        driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	        driver.manage().window().maximize();

	    }

	    @Test
	    public void actuleTest() {

	        try {
	            driver.get("https://www.mortgagecalculator.net/");
	            String browserTitle = driver.getTitle();
	            System.out.println("This is the webside Title" + browserTitle);

	                        

	            WebElement menuElement = driver.findElement(By.cssSelector("#navList > li:nth-child(2) > span"));
	            WebElement subMenuElement = driver.findElement(By.cssSelector("#navList > li:nth-child(2) > ul > li:nth-child(4) > a"));

	            Actions builder = new Actions(driver);
	            builder.moveToElement(menuElement).perform();
	            
	            Thread.sleep(3 * 1000);
	            
	            subMenuElement.click();

	            Thread.sleep(5 * 1000);
	        } catch (InterruptedException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }

	    }

	    @AfterMethod
	    public void aftertest() {

	        try {

	            Thread.sleep(5 * 1000);
	            driver.close();
	            driver.quit();

	        } catch (InterruptedException e) {

	            e.printStackTrace();
	        }

	    }

	}


