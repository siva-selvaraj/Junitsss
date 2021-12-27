package org.test;

import java.sql.Date;
import java.util.concurrent.TimeUnit;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook1 {

	static WebDriver driver;
	@BeforeClass
	public static void beforeclass() {
	
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("befor class");
	}
	
	@AfterClass
	public static void afterclass() {
		//driver.quit();
		System.out.println("after class");
		
	}
	
	@Before
	public void before() {
		Date d = new Date(0);
		System.out.println("Test starts...."+d);
		System.out.println("before");
		
		
	}
	
	@After
	public void after() {
		Date d = new Date(0);
		System.out.println("test ends..."+d);
		System.out.println("after");
		
	}
	
	
	@Test
	public void test1() {
		WebElement txtuser = driver.findElement(By.id("email"));
		txtuser.sendKeys("agil04@gmail.com");
		
		WebElement txtpass = driver.findElement(By.id("pass"));
		txtpass.sendKeys("4578963");
		
		WebElement loginbtn = driver.findElement(By.name("login"));
		loginbtn.click();
		System.out.println("test1");
		
	}

}
