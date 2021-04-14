package org.test;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BaseClass {
	
	WebDriver d;
	Select s1;
	
	public WebDriver getDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DINESH\\eclipse-workspace\\MavenSample\\driver\\chromedriver.exe");
		 d = new ChromeDriver();
		 return d;
		}
	public void loadurl(String url) {
		d.get(url);
	}
	public void pagetitle(String title) {
		System.out.println(d.getTitle());
	}
	public void maximize() {
		d.manage().window().maximize();
	}
	public WebElement locatorbyid(String idvalue) {
		WebElement id = d.findElement(By.id(idvalue));
		return id;
	}
	public WebElement locatorbyname(String nameval) {
		WebElement name = d.findElement(By.name(nameval));
		return name;
	}
	public WebElement locatorbyclass(String classval) {
		WebElement clas = d.findElement(By.className(classval));
		return clas;
	}
	public WebElement locatortag(String tagname) {
		WebElement tagnam = d.findElement(By.tagName(tagname));
		return tagnam;
	}
	public WebElement locatorxpath(String val) {
		WebElement xpath = d.findElement(By.xpath(val));
		return xpath;
	}
	public void sendkey(WebElement e , String s) {
			e.sendKeys(s);
	}
	public void btnclick(WebElement e ) {
			e.click();
	}
	
	public void enterTab() throws AWTException {
		Robot robot = new Robot();
		
	robot.keyPress(KeyEvent.VK_TAB);
	robot.keyRelease(KeyEvent.VK_TAB);
		
				
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

