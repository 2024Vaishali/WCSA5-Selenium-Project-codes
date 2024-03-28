package actionClassMethods;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClickMethod {

	public static void main(String[] args) {
		System.setProperty("driver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("file:///C:/Users/hp/Desktop/WCSA5/Selenium%20Required%20Data/SingleSelectDropDown.html");
		WebElement target = driver.findElement(By.id("menu"));
		
		//To perform right click
		Actions act=new Actions(driver);
		
	}

}
