package methodsOfWebDriver;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwithchToMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedirver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("");
		driver.switchTo().activeElement().sendKeys("Selenium",Keys.ENTER);
		
		// To perform back operation
		Thread.sleep(2000);
		driver.navigate().back();
		
		Thread.sleep(2000);
		driver.switchTo().activeElement().sendKeys("java",Keys.ENTER);
	}

}
