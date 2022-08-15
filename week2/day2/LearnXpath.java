package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
ChromeDriver cd = new ChromeDriver();
cd.get("http://leaftaps.com/opentaps");
cd.manage().window().maximize();
WebElement findElementUser = cd.findElement(By.xpath("//input[@name='USERNAME']"));
findElementUser.sendKeys("DemoSalesmanager");
WebElement findElementPassword = cd.findElement(By.xpath("//input[@id='password']"));
findElementPassword.sendKeys("crmsfa");
WebElement findElementLogin = cd.findElement(By.xpath("//input[@class='decorativeSubmit']"));
findElementLogin.click();
/*WebElement findElementWelcomeText = cd.findElement(By.tagName("h2"));
String text = findElementWelcomeText.getText();
System.out.println(text);*/
}}