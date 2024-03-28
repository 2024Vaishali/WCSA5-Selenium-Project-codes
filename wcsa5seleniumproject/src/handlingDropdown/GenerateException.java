package handlingDropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GenerateException {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdirver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("file:///C:/Users/hp/Desktop/html%20file/list%20creation%20using%20html%20tags.html");
		
		//identify dropdown of webpage
		WebElement dropDownElement = driver.findElement(By.id("menu"));
		
		//Handle the dropdown by creating obj of Select...
		Select sel = new Select(dropDownElement);
		
		//Select the option from dropdown....
		  //use selection methods
		Thread.sleep(2000);
		sel.selectByIndex(2);//from single select dropdown
		
		Thread.sleep(2000);
		//Try to deselect given option from dropdown 
		sel.deselectByIndex(2);

	}

}
