package com.Automatiom.Library;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BasePage {
	
	public static WebDriver driver;
	public static seleniumRepository myRepository;


	@BeforeClass
	public void beforeAllClassesStare() {
    
	 myRepository= new seleniumRepository(driver);

	}

	@AfterClass
	public void afterAllTestCompleted() {

	}

	@BeforeMethod
	@Parameters("browser")
	public void beforeEachTestStart(String browser) {
//		driver = myRepository.startChromeBrowser();
		
		driver = myRepository.crossBrowserTesting(browser);
		

	}

	@AfterMethod
	public void afterEachTestEnd() {

		try {
			myRepository.screenShot();
			Thread.sleep(3 * 1000);
			driver.close();
			driver.quit();

		} catch (Exception e) {
			e.printStackTrace();

		}

	}

}
