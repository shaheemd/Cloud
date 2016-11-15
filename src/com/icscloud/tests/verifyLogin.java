
package com.icscloud.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.icscloud.data.siteData;
import com.icscloud.pages.loginPage;


/**
 * @author shaheemd
 *
 */
public class verifyLogin {
	
	@Test //DemoSite
	public void testDemoValidLogin() throws InterruptedException{		

		//open the site
		WebDriver demo_driver = new FirefoxDriver();
		demo_driver.manage().window().maximize();      //maximise the window
		demo_driver.get(siteData.demositeURL);
		String site = "demo";
		
		//login
		loginPage login = new loginPage(demo_driver, site);
		login.logIntoPage();   // all data is retrieved from the siteData class;
			
		WebElement menu = demo_driver.findElement(By.xpath(".//*[@id='wp-admin-bar-my-account']/a"));
			
		WebElement submenu = demo_driver.findElement(By.xpath(".//*[@id='wp-admin-bar-logout']/a"));
				
		Actions action = new Actions(demo_driver);

		action.moveToElement(menu).perform();
				
		Thread.sleep(5000);
						
		SoftAssert logout = new SoftAssert();
		logout.assertTrue(submenu.isDisplayed(), "failed");
		
		demo_driver.close();
		
	}
	

}
