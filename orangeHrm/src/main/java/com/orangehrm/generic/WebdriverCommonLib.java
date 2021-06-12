package com.orangehrm.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebdriverCommonLib {
	public void mouseHover(WebDriver driver, WebElement element) {
		Actions a=new Actions(driver);
		a.moveToElement(element).perform();
	}
	public void rightClick(WebDriver driver, WebElement element) {
		Actions a=new Actions(driver);
		a.contextClick(element).perform();
	}
	public void implicitWait(WebDriver driver) {
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
}
	public void customWait(WebElement element) {
		int i=0;
		while(i<1000) {
			try {
				element.isDisplayed();
				break;
			}
			catch (Exception e) {
				i++;
				e.printStackTrace();
			}
		}
	}
	public void explicitWait(WebDriver driver,WebElement element) {
		WebDriverWait wait= new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	public void selectUsingIndex(WebElement element, int i) {
		Select s=new Select(element);
		s.selectByIndex(i);
	}
	public void selecByVisibilityIndex(WebElement element, String text) {
		Select s=new Select(element);
		s.selectByVisibleText(text);
	}
	
}