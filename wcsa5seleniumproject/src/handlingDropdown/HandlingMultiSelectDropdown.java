package handlingDropdown;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultiSelectDropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers.chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/hp/Desktop/html%20file/list%20creation%20using%20html%20tags.html");
		 
		
		

	}

}
