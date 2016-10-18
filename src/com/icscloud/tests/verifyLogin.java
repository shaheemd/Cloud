
package com.icscloud.tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.icscloud.data.siteData;
import com.icscloud.pages.loginPage;


/**
 * @author shaheemd
 *
 */
public class verifyLogin {
		
/*	@Test
	public void verifyLoginTitle(){
		
		String siteLoginTitle;
		
		//open the site
		WebDriver d = new FirefoxDriver();
		d.manage().window().maximize();      //maximise the window
		d.get(siteData.siteURL);
		
		//retrieve site title
		siteLoginTitle = d.getTitle();

		System.out.println("site  - " + siteLoginTitle);
		System.out.println("check - " + siteData.siteLoginTitle);
		
		//Validate the title
		Assert.assertEquals(siteData.siteLoginTitle,siteLoginTitle, "Title is incorrect");
		
		d.quit();
	}*/
	
/*	@Test
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
		
	}*/
	
	@Test
	public void testValidLogin() throws InterruptedException{
		
	 	//String dashBoardTitle;
		//Create an object of the loginPage class - constructor is used
	    // The methods are used to access the elements on the page

		//open the site
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();      //maximise the window
		driver.get(siteData.siteURL);
		
		//login
		loginPage login = new loginPage(driver);
		login.logIntoPage();   // all data is retrieved from the siteData class;
		driver.findElement(By.id("user-settings-dropdown"));
		//driver.findElement(By.cssSelector("a[data-ng-click='logout()']")).click();
		
		
		////ul[@class='dropdown-menu']//li/a
		
		List<WebElement> dd_menu = driver.findElements(By.xpath("//ul[@class='dropdown-menu']//li/a"));  //import list and webelement separately
		
		for(int i=0; i < dd_menu.size(); i++){
			
			WebElement element = dd_menu.get(i);
			
			String inner = element.getAttribute("innerHTML");
			
			if(inner.contentEquals("Log out")){
				System.out.println("dropdown values " + inner);
				element.click();
				break;
			}
			
			//System.out.println("dropdown values " + inner);
			
		}
		
/*		try {
		
			Thread.sleep(10000);
			Select dd = new Select(driver.findElement(By.id("user-settings-dropdown")));
			dd.selectByVisibleText("Log out");
			
		}catch(Exception e)
		{
			System.out.println(e);
		}*/
		
		//driver.quit();
		
	}
	
}
