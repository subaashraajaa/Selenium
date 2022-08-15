package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead 
{
	public static void main(String[] args) 
	{
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
		
		WebElement findElementFirstNameLocal = cd.findElement(By.name("firstNameLocal"));
		findElementFirstNameLocal.sendKeys("CEO Of India");
		
		WebElement findElementDepartment = cd.findElement(By.id("createLeadForm_departmentName"));
		findElementDepartment.sendKeys("CEO Of India");
			
		WebElement findElementDescription = cd.findElement(By.name("description"));
		findElementDescription.sendKeys(" Porkanda Singam Yarkandu Anjum");
		
		WebElement findElementEmail = cd.findElement(By.name("primaryEmail"));
		findElementEmail.sendKeys("subaashraajaa@gmail.com");
		
		WebElement findElementState = cd.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select fes = new Select (findElementState);
		fes.selectByVisibleText("New York"); 
		
		WebElement findElementCreate = cd.findElement(By.className("smallSubmit"));
		findElementCreate.click();
		
		String title = cd.getTitle();
		System.out.println("Title :"+ title);
			
		WebElement findElementDuplicate = cd.findElement(By.linkText("Duplicate Lead"));
		findElementDuplicate.click();	
		
		WebElement findElementCompanyErase = cd.findElement(By.id("createLeadForm_companyName"));
		findElementCompanyErase.clear();
		findElementCompanyErase.sendKeys("MAANG");
		
		WebElement findElementFirstNameErase = cd.findElement(By.id("createLeadForm_firstName"));
		findElementFirstNameErase.clear();
		findElementFirstNameErase.sendKeys("Subaash");
		
		WebElement findElementLastNameErase = cd.findElement(By.id("createLeadForm_lastName"));
		findElementLastNameErase.clear();
		findElementLastNameErase.sendKeys("Raajaa");
		
		WebElement findElementCreateAgain = cd.findElement(By.className("smallSubmit"));
		findElementCreateAgain.click();
		System.out.println("Details changed successfully");
		
		String url = cd.getCurrentUrl();
		System.out.println("Url :"+ url);
		
		String pagesource = cd.getPageSource();
		System.out.println("Page Source :"+ pagesource);
}

}
