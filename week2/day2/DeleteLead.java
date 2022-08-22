package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead
{
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
		Thread.sleep(3000);
		cd.findElement(By.xpath("(//span/span)[2]")).click();
		
		cd.findElement(By.xpath("//input[@name=\"phoneCountryCode\"]")).clear();
		
		cd.findElement(By.xpath("//input[@name=\"phoneCountryCode\"]")).sendKeys("+91");
		
		cd.findElement(By.xpath("//input[@name=\"phoneAreaCode\"]")).sendKeys("960");
		
		cd.findElement(By.xpath("//input[@name=\"phoneNumber\"]")).sendKeys("9600230122");
		
		cd.findElement(By.xpath("(//td/em/button[@class=\"x-btn-text\"])[7]")).click();
		Thread.sleep(3000);
		WebElement findElementFirstLead = cd.findElement(By.xpath("(//table[@class=\"x-grid3-row-table\"]/tbody/tr/td/div/a)[1]"));
		String leadnumber = findElementFirstLead.getText();
		System.out.println("first lead number : "+ leadnumber);
		findElementFirstLead.click();
		
		cd.findElement(By.xpath("//a[@class=\"subMenuButtonDangerous\"]")).click();
		
		WebElement findElementFindLead = cd.findElement(By.linkText("Find Leads"));
		findElementFindLead.click();
		
		cd.findElement(By.xpath("(//div[@class=\"x-form-element\"]/input[@class=\" x-form-text x-form-field\"])[12]")).sendKeys(leadnumber);		
	
		WebElement findElementLeadFindLeads= cd.findElement(By.xpath("(//button[@class=\"x-btn-text\"])[7]"));
		findElementLeadFindLeads.click();Thread.sleep(5000);
		
	String norecords = cd.findElement(By.xpath("//div[@class=\"x-paging-info\"]")).getText();
	if(norecords.equals("No records to display"))
	{
		System.out.println("records deleted successfully \n ignore the below warnings");
		cd.close();
	}
	else
	{
		System.out.println("something wrong");
	}
	
	
	
	}
	
	
	
}
/*	
17	Verify message "No records to display" in the Lead List. This message confirms the successful deletion
18	Close the browser (Do not log out)
*/