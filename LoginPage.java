package com.flipkart.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginPage 
{
	static 

	{
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
	}

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://www.demo.guru99.com/V4/index.php");
		Thread.sleep(3000);
		String gt = driver.getTitle();
		System.out.println("The title of the Login page is--"+gt);

		driver.findElement(By.name("uid")).sendKeys("mngr306730");
		driver.findElement(By.name("password")).sendKeys("EdUhede");
		driver.findElement(By.name("btnLogin")).click();
		Thread.sleep(3000);
		String gt01 = driver.getTitle();
		System.out.println("Title of manager home page is--"+gt01);

		if(gt01.equals("Guru99 Bank Manager HomePage"))
		{
			System.out.println("Test Case Pass");	
		}
		else
			System.out.println("Test case Failed");
	//	driver.close();
	}

}
