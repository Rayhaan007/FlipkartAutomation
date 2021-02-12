package orangeHrm;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.orangehrm.generic.BaseClass;
import com.orangehrm.generic.FileLib;
import com.orangehrm.generic.WebdriverCommonLib;

@Listeners(com.orangehrm.generic.ListenerImplementation.class)
public class OrganizationPageTest extends BaseClass{
	@Test
	public void openPage() throws EncryptedDocumentException, IOException, InvalidFormatException  {

		HomePage h = new HomePage(driver);
		GeneralInfo gi=new GeneralInfo(driver);
		WebdriverCommonLib wd=new WebdriverCommonLib();
		wd.mouseHover(driver,h.admin);
		wd.mouseHover(driver,h.Organization);

		h.generalinfoTab.click();
		int i=driver.findElement(By.xpath("//li[@class='required line']")).getLocation().getY();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,"+i+")");
		FileLib fl = new FileLib();
		String orgName = fl.getExcelValue("Sheet1", 1, 0);
		String orgEmail = fl.getExcelValue("Sheet1", 1, 1);
		gi.saveBtn.click();		
		gi.orgName.clear();
		gi.orgName.sendKeys(orgName);
		gi.orgMail.clear();
		gi.orgMail.sendKeys(orgEmail);
		gi.saveBtn.click();
		
		String ActualOrganization=gi.orgName.getAttribute("value");
		Assert.assertEquals(ActualOrganization,orgName);
}

}

