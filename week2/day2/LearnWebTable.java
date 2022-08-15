package week2.day2;


	import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class LearnWebTable {
		public static void main(String[] args) 
		{
			WebDriverManager.chromedriver().setup();
			ChromeDriver cd = new ChromeDriver();
			cd.get("https://erail.in/");
			cd.manage().window().maximize();   
						
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}//https://erail.in/