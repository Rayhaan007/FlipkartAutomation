package com.flipkart.scripts;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.pom.classes.ActiHomePage;
import com.pom.classes.ActiTimeLoginPage;
import com.pom.generic.BaseClass;

public class LoginPageValidity extends BaseClass {

	public static void main(String[] args) 
	{
OpenBrowser("chrome");
openTheApplication();

ActiTimeLoginPage alp = new ActiTimeLoginPage(driver) ;
alp.login();

ActiHomePage ahp=new ActiHomePage(driver);
WebDriverWait wait=new WebDriverWait(driver, 20);
wait.until(ExpectedConditions.titleContains("actiTIME - Enter Time-Track"));
ahp.verifyHomePage(driver,"actiTIME - Enter Time-Track");
ahp.cliclonLogout();
closeTheBrowser();
	}

}
