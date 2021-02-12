package com.flipkart.genenric;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BaseClass {
		
		static {
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
			System.setProperty("webdriver.ie.driver","./drivers/IEDriverServer.exe");
			
		}
		public static WebDriver driver;
		
		public static void openBrowser(String Browser)
		{
			if(Browser.equals("chrome"))
			{
				driver=new ChromeDriver();
				
			}
			else if (Browser.equals("firefox"))
			{
				driver= new FirefoxDriver();
				
			}
			else if(Browser.equals("ie") )
			{
				driver=new InternetExplorerDriver();
			}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		}
		public static void openTheApplication() {
			driver.get("https://www.flipkart.com/");
		}
		public static void closeBrowser()
		{
			driver.close();
		}
		
		

	}