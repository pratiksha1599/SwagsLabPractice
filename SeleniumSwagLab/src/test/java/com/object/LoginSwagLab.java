package com.object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginSwagLab {
	WebDriver driver;

	public LoginSwagLab(WebDriver d) {
		driver = d;
		PageFactory.initElements(d, this);
	}

	@FindBy(id = ("user-name"))
	private WebElement userName;

	@FindBy(name = ("password"))
	private WebElement passWord;

	@FindBy(name = ("login-button"))
	private WebElement loginbtn;

	public void userLogin() {
		userName.sendKeys("standard_user");
		passWord.sendKeys("secret_sauce");
		loginbtn.click();
	}
}
