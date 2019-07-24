package com.Automation.Pages;

import org.openqa.selenium.By;

import com.Automatiom.Library.BasePage;

public class C_CheckOut_page extends BasePage {

	public void checkout() {

		try {

			myRepository.scrollByOffsetVertical("700");
			myRepository.clickButton(By.cssSelector(
					"#center_column > p.cart_navigation.clearfix > a.button.btn.btn-default.standard-checkout.button-medium > span"));
			myRepository.scrollByOffsetVertical("500");
			myRepository.enterTextField(By.id("email_create"), "bs.sd@gmail.com");
			myRepository.clickButton(By.cssSelector("#SubmitCreate > span"));

		} catch (Exception e) {
			e.printStackTrace();

		}

	}

}
