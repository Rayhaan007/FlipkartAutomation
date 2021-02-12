package com.flipkart.scripts;

import com.flipkart.genenric.BaseClass;
import com.flipkart.pages.LandingPage;

public class sectionTabTest extends BaseClass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		openBrowser("chrome");
		openTheApplication();
		LandingPage lp = new LandingPage(driver);

	}

}
