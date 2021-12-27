package org.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.PageFactoryFinder;

public class LoginPage extends BaseClass{
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement usrname;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement txtpass;
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement btn;
	
	@FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement mobno;
	
	@FindBy(xpath="//span[text()='CONTINUE']")
	private WebElement contue;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement passwrd;
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement login;

	public WebElement getPasswrd() {
		return passwrd;
	}

	public WebElement getLogin() {
		return login;
	}

	public WebElement getMobno() {
		return mobno;
	}

	public WebElement getContue() {
		return contue;
	}

	public WebElement getUsrname() {
		return usrname;
	}

	public WebElement getTxtpass() {
		return txtpass;
	}

	public WebElement getBtn() {
		return btn;
	}
    
    
    
	
	
	
	
	

}
