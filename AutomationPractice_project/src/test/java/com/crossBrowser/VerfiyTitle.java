package com.crossBrowser;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class VerfiyTitle {

	WebDriver driver;

	@Test
	@Parameters("browser")
	public void verifypageTitle(String browserName) {

		if (browserName.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\Browsers\\chromedriver.exe");
			driver = new ChromeDriver();

		}

		else if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "src\\test\\resources\\Browsers\\geckodriver.exe");
//			DesiredCapabilities dc = DesiredCapabilities.firefox();
//			// dc.setCapability("marionette", true);
//			dc.setCapability(CapabilityType.VERSION, 66);
			driver = new FirefoxDriver();

		}

		else if (browserName.equalsIgnoreCase("IE")) {

			System.setProperty("webdriver.ie.driver", "src\\test\\resources\\Browsers\\MicrosoftWebDriver.exe");
			driver = new InternetExplorerDriver();

		}

		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		driver.quit();

	}
}
