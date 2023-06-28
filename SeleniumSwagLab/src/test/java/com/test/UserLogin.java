package com.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.object.LoginSwagLab;

public class UserLogin {

	WebDriver driver;

	@Test(priority=2)
	public void userLogin1() {
		LoginSwagLab lg = new LoginSwagLab(driver);
		lg.userLogin();
	}
}
