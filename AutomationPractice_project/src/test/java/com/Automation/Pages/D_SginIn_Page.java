package com.Automation.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.Automatiom.Library.BasePage;

public class D_SginIn_Page extends BasePage {

	public void singIn() {

		try {

			myRepository.clickButton(By.id("id_gender1"));
			myRepository.enterTextField(By.id("customer_firstname"), "basir");
			myRepository.enterTextField(By.id("customer_lastname"), "obaidi");
			myRepository.enterTextField(By.id("passwd"), "123456");
			myRepository.selectDropDownbyIndex(By.id("days"), 6);
			Thread.sleep(2 * 1000);
			myRepository.selectDropDownVisibleText(By.id("months"), "April ");
			Thread.sleep(2 * 1000);
			
			
			myRepository.enterTextFieldwithRaw(By.id("years"));
			myRepository.clickButton(By.id("optin"));
			myRepository.enterTextField(By.id("firstname"), "basir");
			myRepository.enterTextField(By.id("lastname"), "lastname");
			myRepository.enterTextField(By.id("company"), "company");
			myRepository.enterTextField(By.id("address1"), "address1");
			myRepository.enterTextField(By.id("address2"), "address2");
			myRepository.enterTextField(By.id("city"), "city");
			myRepository.selectDropDownVisibleText(By.id("id_state"), "Alabama");
			myRepository.enterTextField(By.id("postcode"), "45673");
			myRepository.enterTextField(By.id("other"),
					"It is only for practice, please don't hack my information. Thank you");
			myRepository.enterTextField(By.id("phone"), "34456792");
			myRepository.enterTextField(By.id("phone_mobile"), "456343");
			myRepository.enterTextField(By.id("alias"), "alias");
			myRepository.clickButton(By.cssSelector("button[name='submitAccount']"));
			myRepository.clickButton(By.cssSelector("button[name='processAddress']"));
			myRepository.clickButton(By.id("cgv"));
			myRepository.scrollByOffsetVertical("500");
			myRepository.clickButton(By.cssSelector("button[name='processCarrier']"));
			myRepository.clickButton(By.partialLinkText("Pay by bank wire"));
			myRepository.clickButton(By.cssSelector("#cart_navigation > button > span"));
			myRepository.clickButton(By.partialLinkText("Back to orders"));
			
	       
	        
			

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
