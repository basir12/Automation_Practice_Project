package com.Automation.Test;

import org.testng.annotations.Test;

import com.Automatiom.Library.BasePage;
import com.Automation.Pages.A_Automation_HomePage;
import com.Automation.Pages.B_Product_Page;
import com.Automation.Pages.C_CheckOut_page;
import com.Automation.Pages.D_SginIn_Page;

public class Automation_Test extends BasePage {

	A_Automation_HomePage homePage = new A_Automation_HomePage();
	B_Product_Page prodect = new B_Product_Page();
	C_CheckOut_page checkout = new C_CheckOut_page();
	D_SginIn_Page sginin = new D_SginIn_Page();
	
	@Test
	public void method_call() {
		homePage.home_Page();
		prodect.puchasing_prodect();
		checkout.checkout();
		sginin.singIn();

	}

	
	
	
}
