package com.object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCart {

	// //a[@class="shopping_cart_link"]

	WebDriver driver;

	public ShoppingCart(WebDriver d) {
		driver = d;
		PageFactory.initElements(d, this);

	}

	@FindBy(xpath = ("//a[@class=\"shopping_cart_link\"]"))
	WebElement shoppingcart;

	@FindBy(id = ("checkout"))
	WebElement checkout;

	@FindBy(name = ("firstName"))
	WebElement firstname;

	@FindBy(name = ("lastName"))
	WebElement lastname;

	@FindBy(id = ("postal-code"))
	WebElement postalCode;

	@FindBy(name = ("continue"))
	WebElement continuebtn;

	@FindBy(name = ("finish"))
	WebElement finish;

	public void cartItems() {
		shoppingcart.click();
	}

	public void checkout() {
		checkout.click();
	}

	public void EnterUserInfo() {
		firstname.sendKeys("Pratiksha");
		lastname.sendKeys("Patil");
		postalCode.sendKeys("456456");
		continuebtn.click();
		finish.click();
	}
}
