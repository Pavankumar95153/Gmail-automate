package com.gmail;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Gmail_lanuch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\tpavankumar\\eclipse-workspace\\Gmail\\driver\\Gecko\\geckodriver.exe");
	
	WebDriver driver = new FirefoxDriver();
	driver.get("https://accounts.google.com/signin");

	//driver.findElement(By.xpath("//a[contains(text(),'Gmail')]")).click();
	//driver.findElement(By.xpath("//ul[@class='h-c-header__cta-list header__nav--ltr']//a[contains(@class,'h-c-header__nav-li-link')][contains(text(),'Sign in')]")).click();;
	driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("pavankumartvs123@gmail.com");
	WebDriverWait wait=new WebDriverWait(driver, 20);
	
	driver.findElement(By.xpath("//div[@id='identifierNext']//div[@class='ZFr60d CeoRYc']")).click();
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("9515316562");
	driver.findElement(By.xpath("//div[@id='passwordNext']//div[@class='ZFr60d CeoRYc']")).click();
	driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji T-I-KE L3 T-I-JW T-I-JO']")).click();
	driver.findElement(By.xpath("//textarea[@id=':ow']")).sendKeys("educationpavan184@gmail.com");
	driver.findElement(By.xpath("//input[@id=':oe']")).sendKeys("Greetings from selenium");
	driver.findElement(By.xpath("//div[@id=':pj']")).sendKeys("Hello world selenium");
	driver.findElement(By.xpath("//div[@id=':o4']")).click();
	}

}
