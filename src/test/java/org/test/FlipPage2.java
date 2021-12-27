package org.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipPage2 extends BaseClass {
	public FlipPage2() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='64 GB']")
	private WebElement spec;
	
	@FindBy(xpath="//input[@id='pincodeInputId']")
	private WebElement pincode;
	
	@FindBy(xpath="//span[@class='_2P_LDn']")
	private WebElement check;
	
	//@FindBy(xpath="//button[text()='BUY NOW']")
	//private WebElement notify;

	//public WebElement getNotify() {
	//	return notify;
	//}

	public WebElement getCheck() {
		return check;
	}

	public WebElement getSpec() {
		return spec;
	}

	public WebElement getPincode() {
		return pincode;
	}

}
