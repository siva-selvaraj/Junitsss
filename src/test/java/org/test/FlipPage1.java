package org.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipPage1 extends BaseClass {
	
	public FlipPage1() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[text()='Mobiles']")
	private WebElement mobiles;
	
	@FindBy(xpath="(//img[@alt='redmi 9 power'])[2]")
	private WebElement redmi;
	
	@FindBy(xpath="(//div[@class='_2kHMtA'])[5]")
	private WebElement black;

	public WebElement getBlack() {
		return black;
	}

	public WebElement getMobiles() {
		return mobiles;
	}

	public WebElement getRedmi() {
		return redmi;
	}
	
	

}
