package com.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.object.Products;

public class AddToCartItem {

	WebDriver driver;
    
	@Test(priority=3)
	public void AddToCart() {
		Products p = new Products(driver);
		p.addToCart();
	}

}
