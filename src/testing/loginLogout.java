package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class loginLogout {
	WebDriver driver = new ChromeDriver();
	@BeforeTest
	public void clearcache(){
		driver.manage().deleteAllCookies();
	}
	@Parameters({"url"})
	@Test
	public void login(String applurl) {
		WebDriver driver = new ChromeDriver();
		driver.get(applurl);
		System.out.println(driver.getTitle());
		driver.findElement(By.id("inputUsername")).sendKeys("harini");
		driver.findElement(By.name("inputPassword")).sendKeys("Harini@09");
		driver.findElement(By.className("signInBtn")).click();
	}
	
	
}
