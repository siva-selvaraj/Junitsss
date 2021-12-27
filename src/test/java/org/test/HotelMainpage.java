package org.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HotelMainpage {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://adactinhotelapp.com/SearchHotel.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		WebElement usrname = driver.findElement(By.id("username"));
		usrname.sendKeys("siva04agi");
		
		WebElement txtpaswrd = driver.findElement(By.id("password"));
		txtpaswrd.sendKeys("siva04");
		
		WebElement btnclk = driver.findElement(By.id("login"));
		btnclk.click();
		
		WebElement location = driver.findElement(By.className("search_combobox"));
        Select s = new Select(location);
        s.selectByIndex(1);
        
        WebElement hotels = driver.findElement(By.id("hotels"));
        Select s1 = new Select(hotels);
        s1.selectByIndex(3);
        
        WebElement roomtype = driver.findElement(By.id("room_type"));
        Select s2 = new Select(roomtype);
        s2.selectByIndex(2);
        
        WebElement noRoom = driver.findElement(By.id("room_nos"));
        Select s3 = new Select(noRoom);
        s3.selectByIndex(2);
        
        WebElement datecheckin = driver.findElement(By.id("datepick_in"));
        datecheckin.sendKeys("04/06/2021");
        
        WebElement datecheckout = driver.findElement(By.id("datepick_out"));
        datecheckout.sendKeys("06/06/2021");
        
        WebElement adultroom = driver.findElement(By.id("adult_room"));
        Select s4 = new Select(adultroom);
        s4.selectByIndex(2);
        
        WebElement childroom = driver.findElement(By.id("child_room"));
        Select s5=new Select(childroom);
        s5.selectByIndex(1);
        
        WebElement subbtn = driver.findElement(By.id("Submit"));
        subbtn.click();
        
        WebElement btn = driver.findElement(By.id("radiobutton_0"));
        btn.click();
        
        WebElement ctnbtn = driver.findElement(By.id("continue"));
        ctnbtn.click();
        
        WebElement firstname = driver.findElement(By.id("first_name"));
        firstname.sendKeys("siva");
        
        WebElement lastname = driver.findElement(By.id("last_name"));
        lastname.sendKeys("selvaraj");
        
        
        WebElement address = driver.findElement(By.id("address"));
        address.sendKeys("137,kilnathur street,Tiruvannamalai");
        
        WebElement card = driver.findElement(By.id("cc_num"));
        card.sendKeys("4578963214587447");
        
        WebElement cardtype = driver.findElement(By.id("cc_type"));
        Select s6 = new Select(cardtype);
        s6.selectByIndex(1);
        
        WebElement month = driver.findElement(By.id("cc_exp_month"));
        Select s7 = new Select(month);
        s7.selectByIndex(4);
        
        WebElement year = driver.findElement(By.id("cc_exp_year"));
        Select s8 = new Select(year);
        s8.selectByIndex(4);
        
        
        WebElement cvv = driver.findElement(By.id("cc_cvv"));
        cvv.sendKeys("478");
        
        WebElement booknow = driver.findElement(By.id("book_now"));
        booknow.click();
        
        WebElement ordno = driver.findElement(By.id("order_no"));
        String t = ordno.getAttribute("value");
        System.out.println(t);
        
        
        driver.quit();
        
      
        
        
        
        
        
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
