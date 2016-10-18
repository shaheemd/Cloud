/**
 * 
 */
package com.icscloud.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.icscloud.data.siteData;

/**
 * @author shaheemd
 * 
 * 
 */
public class loginPage {
	
	WebDriver driver;
	
	//page activity
	By tbUsername = By.id("username");
	By tbPassword = By.xpath("//input[@id='password']");
	By btnLogin = By.name("login");
	
	//Constructor - initialise this webdriver
	public loginPage(WebDriver driver){
		this.driver = driver;
	}
	
	//Method to login
	public void logIntoPage(){
		typeUserName();
		typePassword();
		ClickOnLoginButton();
	}
	
	//Methods to use inserting username
	public void typeUserName(){
		
		driver.findElement(tbUsername).sendKeys(siteData.username);
	}
	
	
	//Methods to inserting password
	public void typePassword(){
		
		driver.findElement(tbPassword).sendKeys(siteData.password);
		
	}
	
	
	//Methods to use clicking the login button
	public void ClickOnLoginButton(){
		
		driver.findElement(btnLogin).click();
		
	}
	

}
