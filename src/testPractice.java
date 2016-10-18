import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.icscloud.data.siteData;
import com.icscloud.pages.loginPage;

public class testPractice {

	public static void main(String[] args) {
		
		//open the webpage
		WebDriver driver = new FirefoxDriver();
		driver.get(siteData.siteURL);
		
		//login
		loginPage login = new loginPage(driver);
		login.logIntoPage();  

		System.out.println(driver.getTitle());
		
		//driver.quit();
	}

}
