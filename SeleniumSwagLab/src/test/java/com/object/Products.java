package com.object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Products {

	WebDriver driver;

	public Products(WebDriver d) {
		driver = d;
		PageFactory.initElements(d, this);
	}

	@FindBy(name = ("add-to-cart-sauce-labs-backpack"))
	private WebElement addTocart;

	public void addToCart() {
		addTocart.click();
	}

}
