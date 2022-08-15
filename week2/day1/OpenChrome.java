package week2.day1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenChrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
ChromeDriver cd = new ChromeDriver();
cd.get("http://leaftaps.com/opentaps");
cd.manage().window().maximize();
WebElement findElementUser = cd.findElement(By.className("inputLogin"));;
findElementUser.sendKeys("DemoSalesmanager");
WebElement findElementPassword = cd.findElement(By.name("PASSWORD"));
findElementPassword.sendKeys("crmsfa");
WebElement findElementLogin = cd.findElement(By.className("decorativeSubmit"));
findElementLogin.click();
WebElement findElementWelcomeText = cd.findElement(By.tagName("h2"));
String text = findElementWelcomeText.getText();
System.out.println(text);




	}

}
