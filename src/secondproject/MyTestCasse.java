package secondproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MyTestCasse {
	WebDriver driver = new ChromeDriver();
	
	
	@BeforeTest
	public void mySetup() {
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
	}
	
	@Test(priority = 1)
	public void zyscondTest() {
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		
	}
	
	@Test(priority = 2)
	public void AddtocartItem() {
  
	 driver.findElement(By.className("btn")).click();
	 
	 for(int i = 0; i<6;i++)
  }
		
	
}

