package com.orangehrm.generic;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import orangeHrm.HomePage;
import orangeHrm.LoginPage;

public class BaseClass 
{
	static {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	}
	public static WebDriver driver;
	@BeforeClass
	public void openBrowserr()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	@BeforeMethod
	public void login() throws IOException
	{
		FileLib f=new FileLib();
		String url=f.getPropertyValue("url");
		String un = f.getPropertyValue("username");
		String pw=f.getPropertyValue("password");

		driver.get(url);
		LoginPage lp=new LoginPage(driver);
		lp.setLogin(un, pw);
	}
	@AfterMethod
	public void logout() throws InterruptedException {
		HomePage hp=new HomePage(driver);
		hp.setLogout();
	}
	@AfterClass
	public void closeBrowser() {
		driver.close();
	}
}