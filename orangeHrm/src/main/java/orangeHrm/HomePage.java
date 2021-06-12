package orangeHrm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	@FindBy(xpath="//div[@id='mainMenu']/descendant::li[1]")
	public WebElement admin;

	@FindBy(id = "menu_admin_Organization")
	public WebElement Organization;

	@FindBy(css = "a[id=menu_admin_viewOrganizationGeneralInformation]")
	public WebElement generalinfoTab;

	@FindBy(id = "welcome")
	private WebElement userIcon;

	@FindBy(linkText = "Logout")
	private WebElement logoutlink;

	public HomePage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}


	public void setLogout() throws InterruptedException {
		userIcon.click();
		Thread.sleep(1000);
		logoutlink.click();
	}
}
