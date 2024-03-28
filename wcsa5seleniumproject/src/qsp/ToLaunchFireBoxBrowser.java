package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ToLaunchFireBoxBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		
		WebDriver driver= new FirefoxDriver();
		
		//Maximize the Browser
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.close();

	}

}
