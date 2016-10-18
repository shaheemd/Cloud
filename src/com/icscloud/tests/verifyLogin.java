/**
 * 
 */
package com.icscloud.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.icscloud.data.siteData;
import com.icscloud.pages.loginPage;


/**
 * @author shaheemd
 *
 */
public class verifyLogin {
		
	@Test
	public void verifyLoginTitle(){
		
		String siteLoginTitle;
		
		//open the site
		WebDriver d = new FirefoxDriver();
		d.manage().window().maximize();      //maximise the window
		d.get(siteData.siteURL);
		
		//retrieve site title
		siteLoginTitle = d.getTitle();

		/*System.out.println("site  - " + siteLoginTitle);
		System.out.println("check - " + siteData.siteLoginTitle);*/
		
		//Validate the title
		Assert.assertEquals(siteData.siteLoginTitle,siteLoginTitle, "Title is incorrect");
		
		d.quit();
	}
	
	@Test
	public void testValidLogin(){
		
	 	String dashBoardTitle;
		//Create an object of the loginPage class - constructor is used
	    // The methods are used to access the elements on the page

		//open the site
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();      //maximise the window
		driver.get(siteData.siteURL);
		
		//login
		loginPage login = new loginPage(driver);
		login.logIntoPage();   // all data is retrieved from the siteData class
		
		dashBoardTitle = driver.getTitle();
		
		//Validate the Dashboard 
		Assert.assertEquals(siteData.siteDashBoard, dashBoardTitle , "Invenco Cloud Services");
		
		driver.quit();
		
	}
	
}
