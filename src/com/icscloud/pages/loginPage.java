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
	String site = "";
	
	//page activity
	By tbUsername = By.id("username");
	By tbPassword = By.xpath("//input[@id='password']");
	By btnLogin = By.name("login");
	
	By demo_tbUsername = By.id("user_login");
	By demo_tbPassword = By.xpath(".//*[@id='user_pass']");
	By demo_btnLogin = By.name("wp-submit");
	
	
	
	
	//Constructor - initialise this webdriver
	public loginPage(WebDriver driver, String site){
		this.driver = driver;
		this.site = site;
	}
	
	//Method to login
	public void logIntoPage(){
		typeUserName();
		typePassword();
		ClickOnLoginButton();
	}
	
	//Methods to use inserting username
	public void typeUserName(){
		
		if(site == "invenco"){
			driver.findElement(tbUsername).sendKeys(siteData.username);
		}
		
		else if (site == "demo"){
			driver.findElement(demo_tbUsername).sendKeys(siteData.demo_username);
		}
	}
	
	
	//Methods to inserting password
	public void typePassword(){
		
		if(site == "invenco"){
			driver.findElement(tbPassword).sendKeys(siteData.password);
		}
		
		else if (site == "demo"){
			driver.findElement(demo_tbPassword).sendKeys(siteData.demo_password);
		}
		
	}
	
	
	//Methods to use clicking the login button
	public void ClickOnLoginButton(){
		
		if(site == "invenco"){
			driver.findElement(btnLogin).click();
		}
		else if (site == "demo"){
			driver.findElement(demo_btnLogin).click();
		}
		
		
		
	}
	

}
