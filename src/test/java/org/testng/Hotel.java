package org.testng;

import org.openqa.selenium.WebElement;
import org.test.BaseClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Hotel extends BaseClass {

	@BeforeClass
	private void beforeclass() {
		getDriver();
		loadurl("http://adactinhotelapp.com/index.php");
		maximize();
		
	}
		
	@Parameters({"username","password"})
	@Test
	private void login(String user , String pass) {
		WebElement locatorbyid = locatorbyid("username");
		sendkey(locatorbyid, user);
		WebElement locatorbyid2 = locatorbyid("password");
		sendkey(locatorbyid2, pass);
		WebElement locatorbyid3 = locatorbyid("login");
		btnclick(locatorbyid3);
		}
}
	
//	@Parameters({})
//	@Test
//	private void searchHotel(String loc , String hotel ,String roomtype , String nos) throws AWTException {
//		WebElement locatorbyid = locatorbyid("location");
//		sendkey(locatorbyid,loc );
//		WebElement locatorbyid2 = locatorbyid("hotels");
//		sendkey(locatorbyid2, hotel);
//		WebElement locatorbyid3 = locatorbyid("room_type");
//		sendkey(locatorbyid3, roomtype);
//		WebElement locatorbyid4 = locatorbyid("room_nos");
//		sendkey(locatorbyid4, nos);
//		enterTab();
//		enterTab();
//		enterTab();
////		WebElement locatorbyid5 = locatorbyid("datepick_in");
////		btnclick(locatorbyid5);
////		WebElement locatorbyid6 = locatorbyid("datepick_out");
////		btnclick(locatorbyid6);
//		
//		
//		
//	}
//		
//	}

	
		

	
	
	
	
	
	
		
		
	

	

