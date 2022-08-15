package week2.day1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
ChromeDriver cd = new ChromeDriver();
cd.get("http://leaftaps.com/opentaps");
cd.manage().window().maximize();
WebElement findElementUser = cd.findElement(By.className("inputLogin"));
findElementUser.sendKeys("DemoSalesmanager");
WebElement findElementPassword = cd.findElement(By.name("PASSWORD"));
findElementPassword.sendKeys("crmsfa");
WebElement findElementLogin = cd.findElement(By.className("decorativeSubmit"));
findElementLogin.click();
WebElement findElementWelcomeText = cd.findElement(By.tagName("h2"));
String text = findElementWelcomeText.getText();
System.out.println(text);

if ( text.contains("Welcome"))
	{
	System.out.println("Login success");
	}
	else 
	{
	System.out.println("Login failed");
	}

WebElement findElementcrmsfa = cd.findElement(By.linkText("CRM/SFA"));
findElementcrmsfa.click();

WebElement findElementLeads = cd.findElement(By.linkText("Leads"));
findElementLeads.click();

WebElement findElementCreateLeads = cd.findElement(By.linkText("Create Lead"));
findElementCreateLeads.click();

WebElement findElementCompany = cd.findElement(By.id("createLeadForm_companyName"));
findElementCompany.sendKeys("TCS");

WebElement findElementFirstName = cd.findElement(By.id("createLeadForm_firstName"));
findElementFirstName.sendKeys("Subash");

WebElement findElementLastName = cd.findElement(By.id("createLeadForm_lastName"));
findElementLastName.sendKeys("Raja");

WebElement findElementSource = cd.findElement(By.name("dataSourceId"));
findElementSource.sendKeys("Cold Call");

WebElement findElementIndustry = cd.findElement(By.name("industryEnumId"));
Select fei = new Select (findElementIndustry);
fei.selectByIndex(3);

WebElement findElementOnwer = cd.findElement(By.id("createLeadForm_ownershipEnumId"));
Select feo = new Select (findElementOnwer);
feo.selectByVisibleText("Sole Proprietorship");

WebElement findElementMarketingCampaign = cd.findElement(By.name("marketingCampaignId"));
Select femc = new Select (findElementMarketingCampaign);
femc.selectByValue("CATRQ_AUTOMOBILE");

WebElement findElementCreate = cd.findElement(By.className("smallSubmit"));
findElementCreate.click();


	}
}
