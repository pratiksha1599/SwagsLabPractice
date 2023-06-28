package com.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.object.ShoppingCart;

public class CartItems {

	WebDriver driver;

	
	@Test(priority=4)
	public void cartItem() {
		ShoppingCart s = new ShoppingCart(driver);
		s.cartItems();
		s.checkout();
		s.EnterUserInfo();
	}

}
