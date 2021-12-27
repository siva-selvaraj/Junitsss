package org.test;

import java.util.Set;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.remote.server.handler.GetCurrentUrl;

import io.github.bonigarcia.wdm.WebDriverManager;

public class flipkart extends BaseClass {
	
	@BeforeClass
	public static void beforclass() {
		chromeBrowser();
		urlLaunch("https://www.flipkart.com/");
		
		Assert.assertTrue("verified url",currentUrl().contains("flipkart") );
		impWait(10);
		
		
		System.out.println("before class");

	}
	@Before
	 public void before() throws InterruptedException {
        LoginPage m = new LoginPage();
        
		
		Thread.sleep(3000);
		sendKeys(m.getUsrname(), "agilan04@gmail.com");
		Assert.assertEquals("verified email", getAttribute(m.getUsrname()), "agilan04@gmail.com");
		sendKeys(m.getTxtpass(), "animalbird2604");
		Assert.assertEquals("verified password", getAttribute(m.getTxtpass()), "animalbird2604");
		click(m.getBtn());
		Thread.sleep(2000);
		sendKeys(m.getMobno(), "7904098952");
		click(m.getContue());
		sendKeys(m.getPasswrd(), "Welcome@234");
		click(m.getLogin());
		System.out.println("test");
		System.out.println("before");

	}
	@AfterClass
	public static void afterclass() {
		
		System.out.println("after class");
	}
	@After
	public void after() throws InterruptedException {
		
		FlipPage2 p= new FlipPage2();
		down(p.getSpec());
		Thread.sleep(3000);
        javaClick(p.getSpec());
		Thread.sleep(2000);
		doubleClick(p.getPincode());
		clear(p.getPincode());
		sendKeys(p.getPincode(), "606601");
		click(p.getCheck());
		
		System.out.println("after");

	}
	@Test
	public void test() throws InterruptedException {
		FlipPage1 f = new FlipPage1();
		Thread.sleep(2000);
		click(f.getMobiles());
		down(f.getRedmi());
		Thread.sleep(2000);
		javaClick(f.getRedmi());
		down(f.getBlack());
		Thread.sleep(3000);
		click(f.getBlack());
		
		
		getHandles(1);
		
		
	}
	
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}


