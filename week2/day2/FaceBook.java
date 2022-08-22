package week2.day2;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver cd = new ChromeDriver();
		cd.get("https://en-gb.facebook.com/");
		cd.manage().window().maximize(); 
		cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement findElementCreateAccount = cd.findElement(By.partialLinkText("Create New Account"));	
		findElementCreateAccount.click();
	    Thread.sleep(3000);	WebElement findElementFirstName = cd.findElement(By.xpath("//input[@name=\"firstname\"]"));
		findElementFirstName.sendKeys("Subash");
		
		WebElement findElementLastName = cd.findElement(By.xpath("//input[@name=\"lastname\"]"));
		findElementLastName.sendKeys("Raja");
		
		cd.findElement(By.name("reg_email__")).sendKeys("9080461989");
		
		cd.findElement(By.id("password_step_input")).sendKeys("Ka3naka!f");
		
		WebElement findElementDay = cd.findElement(By.name("birthday_day"));
		Select seld=new Select(findElementDay);
		seld.selectByIndex(11);
		
		WebElement findElementMonth = cd.findElement(By.name("birthday_month"));
		Select selm=new Select(findElementMonth);
		selm.selectByValue("5"); 
		
		WebElement findElementYear = cd.findElement(By.name("birthday_year"));
		Select sely=new Select(findElementYear);
		sely.selectByValue("1997");Thread.sleep(3000);
		WebElement findElementRadio = cd.findElement(By.xpath("(//input[@name=\"sex\"])[2]"));
		findElementRadio.click();
		
		cd.findElement(By.name("websubmit")).click();Thread.sleep(5000);
		cd.close();	
		
	}
		}
