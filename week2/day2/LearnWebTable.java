package week2.day2;


	import java.util.List;

import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class LearnWebTable {
		public static void main(String[] args) 
		{
			WebDriverManager.edgedriver().setup();
			EdgeDriver cd = new EdgeDriver();
			cd.get("https://erail.in/");
			cd.manage().window().maximize();   
		WebElement findElementFrom = cd.findElement(By.id("txtStationFrom"));	
		findElementFrom.clear();		
		findElementFrom.sendKeys("MS", Keys.TAB);
		
		WebElement findElementTo = cd.findElement(By.id("txtStationTo"));	
		findElementTo.clear();		
		findElementTo.sendKeys("PDY",Keys.TAB);
				
		WebElement findElementGetTains = cd.findElement(By.id("buttonFromTo"));	
		findElementGetTains.click();
		WebElement findElementDateSort = cd.findElement(By.id("chkSelectDateOnly"));	
		boolean selected = findElementDateSort.isSelected();
		
		if(selected == true) 
			{
				findElementDateSort.click();System.out.println("sorting removed");
			}
List<WebElement> findElementsHeading = cd.findElements(By.xpath("(//table)[2]/tbody/tr/td"));

for (int a =1 ; a < 9;a++) 
	{
	String text1=cd.findElement(By.xpath("(//table)[2]/tbody/tr/td["+a+"]")).getText();
		System.out.print(text1 + "  ");
		if(text1.equals("Train Name")) 
		{
			System.out.print("\t\t");
		}
	}
System.out.println();
		
List<WebElement> elementRows = cd.findElements(By.xpath("(//table)[3]/tbody/tr"));
		
		List<WebElement> elementCols = cd.findElements(By.xpath("(//table)[3]/tbody/tr[1]/td"));
		
		for(int i = 1; i <= elementRows.size() ; i++) {
			
			for(int j = 1; j <= 9; j++) {
				String text = cd.findElement(By.xpath("(//table)[3]/tbody/tr["+i+"]/td["+j+"]")).getText();
				System.out.print(text + "     ");
			}
			System.out.println();
		}
}}