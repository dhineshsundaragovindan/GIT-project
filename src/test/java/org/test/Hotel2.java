package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Hotel2 {
	
	WebDriver driver;
	@BeforeClass
	private void launch() {
System.setProperty("sebdriver.chrome.driver", "C:\\Users\\DINESH\\eclipse-workspace\\MavenSample\\driver\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("http://adactinhotelapp.com/index.php");

	}

	@Parameters({"username","password"})
	@Test
	private void alogin(String s ) {
		WebElement txtusername = driver.findElement(By.id("username"));
		txtusername.sendKeys(s);
	}
		
	private void bpassword(String s1) {
			WebElement txtpass = driver.findElement(By.id("password"));
			txtpass.sendKeys(s1);
	}

	private void cbtnclick() {
		WebElement btnclick = driver.findElement(By.id("login"));
		btnclick.click();
		
		}
	@Parameters({"location","Hotels","Room Type","No of Rooms","check in date","check out date","adults per room","childrens per room"})
	@Test
	private void dloc(String a , String b , String c , String d , String e , String f , String g , String h) {
		
		WebElement aloc = driver.findElement(By.id("location"));
		aloc.sendKeys(a);
		
		WebElement bhot = driver.findElement(By.id("hotels"));
		bhot.sendKeys(b);
		
		WebElement croom = driver.findElement(By.id("room_type"));
		croom.sendKeys(c);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
	
		
		

	
}
