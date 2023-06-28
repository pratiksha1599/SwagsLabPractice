package com.test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.object.LoginSwagLab;
import com.object.Products;
import com.object.ShoppingCart;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTestmethod {

	WebDriver driver;

	@Test(priority = 1)
	public void loginTest1() {
		// ChromeOptions obj = new ChromeOptions();
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
	}

	@Test(priority = 2)
	public void logintest2() {
		LoginSwagLab lg = new LoginSwagLab(driver);
		lg.userLogin();

	}

	@Test(priority = 3)
	public void addtocartItem() {
		Products p = new Products(driver);
		p.addToCart();
	}

	@Test(priority = 4)
	public void cartItems() {
		ShoppingCart s = new ShoppingCart(driver);
		s.cartItems();
		s.checkout();
		s.EnterUserInfo();
	}

}
