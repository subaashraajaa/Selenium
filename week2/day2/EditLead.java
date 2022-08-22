package week2.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {
	public static void main(String[] args) throws InterruptedException 
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
		
		WebElement findElementFindLeads = cd.findElement(By.linkText("Find Leads"));
		findElementFindLeads.click();
		
	WebElement findElementLeadFirstName = cd.findElement(By.xpath("(//input[@name=\"firstName\"])[3]"));
	findElementLeadFirstName.sendKeys("su");
		
		WebElement findElementLeadFindLeads= cd.findElement(By.xpath("(//button[@class=\"x-btn-text\"])[7]"));
		findElementLeadFindLeads.click();Thread.sleep(5000);
		
		WebElement findElementFirstLead=cd.findElement(By.xpath("(//div[@class=\"x-grid3-cell-inner x-grid3-col-partyId\"])[1]/a"));
		System.out.println(findElementFirstLead.getText()+" is the first lead id found");
		findElementFirstLead.click();
		String title = cd.getTitle();
		System.out.println("Page title : "+ title);
		
		if(title.contains("View"))
		{
			System.out.println("Title verified");
		}
		else
		{
			System.out.println("You are in a wrong page");
		}
		
		cd.findElement(By.xpath("(//div[@class=\"frameSectionExtra\"]/a)[3]")).click();
		
		cd.findElement(By.id("updateLeadForm_companyName")).clear();
		cd.findElement(By.id("updateLeadForm_companyName")).sendKeys("AACHI");
		cd.findElement(By.xpath("(//input[@name=\"submitButton\"])[1]")).click();
		WebElement findElementCompany = cd.findElement(By.id("viewLead_companyName_sp"));
		if(findElementCompany.getText().contains("AACHI"))
		{
			System.out.println("Company name verified");
		}
		else
		{
			System.out.println("company name not updated properly, plz check");
		}
		cd.close();
}}

