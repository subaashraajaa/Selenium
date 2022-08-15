package week2.day1;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeDriverService;
import org.openqa.selenium.By;
import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenEdge {
public static void main(String[] args) {

	WebDriverManager.edgedriver().setup();
	EdgeDriver ed = new EdgeDriver();
	
	ed.get("http://leaftaps.com/opentaps");
	
}




}
