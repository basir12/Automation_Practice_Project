package com.Automation.Pages;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Automatiom.Library.BasePage;

public class B_Product_Page extends BasePage {
	
	
//	Inheritance , incopslaction, pohlymorfisim, abstraction 
	

	public void puchasing_prodect() {
		
		try {
			
			ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
		    driver.switchTo().window(tabs2.get(1));
		    driver.switchTo().window(tabs2.get(0));
		    driver.close();
		    driver.switchTo().window(tabs2.get(0));
		    
			driver.get("http://automationpractice.com/index.php");
			String getTitle = driver.getTitle();
			System.out.println("this is page Title:\t" + getTitle);
			assertEquals(getTitle, "My Store");
			
			myRepository.scrollByOffsetVertical("500");
			myRepository.clickButton(By.cssSelector("#homefeatured li:nth-of-type(4) [title='View'] span"));
			myRepository.scrollByOffsetVertical("500");
			myRepository.fluentWait(By.partialLinkText("wishlist_button"));
			myRepository.clickButton(By.cssSelector("#thumb_10"));
			myRepository.clickButton(By.cssSelector("#product > div.fancybox-overlay.fancybox-overlay-fixed > div > div > div.fancybox-outer > a.fancybox-nav.fancybox-next"));
			myRepository.clickButton(By.cssSelector("#product > div.fancybox-overlay.fancybox-overlay-fixed > div > div > div.fancybox-outer > a.fancybox-nav.fancybox-next"));
			myRepository.clickButton(By.cssSelector("#product > div.fancybox-overlay.fancybox-overlay-fixed > div > div > div.fancybox-outer > a.fancybox-nav.fancybox-next"));
			myRepository.clickButton(By.cssSelector(".fancybox-close"));
			myRepository.enterTextField(By.id("quantity_wanted"), "3");
			myRepository.selectDropDownVisibleText(By.id("group_1"), "M");
			Thread.sleep(2*1000);
			myRepository.clickButton(By.cssSelector("[name='Beige']"));
			myRepository.clickButton(By.cssSelector("#color_to_pick_list li:nth-of-type(2) .color_pick"));
			myRepository.clickButton(By.id("add_to_cart"));   
			WebElement conformaiton = driver.findElement(By.cssSelector("[class='layer_cart_product col-xs-12 col-md-6'] h2"));
			
			String getText= conformaiton.getText();
			System.out.println("Product successfully added to your shopping cart"+getText);
			myRepository.clickButton(By.cssSelector("#layer_cart > div.clearfix > div.layer_cart_cart.col-xs-12.col-md-6 > div.button-container > a > span"));
			
			
			
		}catch (Exception e) {
			e.printStackTrace();
			
			
		}
		
		
	}

}
