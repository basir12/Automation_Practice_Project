package com.Automation.Pages;

import java.awt.List;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.Automatiom.Library.BasePage;

public class Ifram_ArrayList extends BasePage {

	public void ifram(int fram) {
		
		
		
		
		Actions action = new Actions(driver);
		
		action.moveToElement(driver.findElement(By.xpath("//button[@class='f_a a4_f' ][@id='global-search-dropdown-toggle']"))).build().perform();
		action.contextClick().build().perform();
				
		
		
		Select drop = new Select(driver.findElement(By.id("asl")));
		
		
		WebElement sendkey = driver.findElement(By.id(""));
		sendkey.sendKeys(Keys.SHIFT,"baseer");
		sendkey.sendKeys(Keys.ENTER);
		

		ArrayList<String> window = new ArrayList<String>(driver.getWindowHandles());

		driver.switchTo().window(window.get(3));

	}

}
