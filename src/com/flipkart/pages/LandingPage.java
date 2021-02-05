package com.flipkart.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	
	@FindBy(xpath="//input[@type='text']")
	private WebElement searchField;
	
	@FindBy(xpath="//a[contains(@href,'viewcart')]")
	private WebElement viewCart;
	
	@FindBy(xpath="//div[@class='_1kidPb']/span")
	private WebElement sectionTab;
	
	public LandingPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void getSearchField(String search) {
		 searchField.sendKeys(search);;
	}

	public void getViewCart() {
		
		viewCart.click();
	}

	public void getSectionTab() {
		System.out.println(sectionTab);
	}
}
