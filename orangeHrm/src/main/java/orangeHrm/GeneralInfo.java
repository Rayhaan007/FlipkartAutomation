package orangeHrm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GeneralInfo 
{
@FindBy(id ="organization_name")
public WebElement orgName;

@FindBy(id ="organization_email")
public WebElement orgMail;

@FindBy(xpath ="//input[@id='btnSaveGenInfo']")
public WebElement saveBtn;

@FindBy(id ="organization_name")
private WebElement org;

public GeneralInfo(WebDriver driver) {
	PageFactory.initElements(driver, this);
}


}