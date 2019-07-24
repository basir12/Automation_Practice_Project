package com.Automation.Pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.Automatiom.Library.BasePage;

public class A_Automation_HomePage extends BasePage {

	public void home_Page() {

		try {

			driver.get("http://automationpractice.com/index.php");
			String getTitle = driver.getTitle();
			System.out.println("this is page Title:\t" + getTitle);
			assertEquals(getTitle, "My Store");

			Thread.sleep(2 * 1000);
			myRepository.clickButton(By.partialLinkText("Women"));
			myRepository.clickButton(By.id("layered_id_attribute_group_1"));
			myRepository.scrollByOffsetVertical("150");
			myRepository.clickButton(By.id("layered_id_attribute_group_13"));
			myRepository.selectDropDownVisibleText(By.id("selectProductSort"), "Price: Lowest first");
			myRepository.clickButton(By.id("layered_id_feature_5"));
			myRepository.clickButton(By.id("layered_quantity_1"));

			Thread.sleep(3 * 1000);

			Actions action = new Actions(driver);
			WebElement drag = driver.findElement(By.cssSelector("#layered_price_slider > div"));
			WebElement drop = driver.findElement(By.id("layered_price_slider"));
			action.clickAndHold(drag).dragAndDropBy(drop, 0, 2).build().perform();
			driver.navigate().back();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private WebElement findElementnew(By className, By id) {
		// TODO Auto-generated method stub
		return null;
	}

}
