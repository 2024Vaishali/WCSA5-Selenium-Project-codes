package xpathLocator;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByUsingIndex {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webDriver.chrome.driver", "./drivers/chromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/webhp?tab=ow");
		Thread.sleep(2000);
		
		driver.switchTo().activeElement().sendKeys("bikes");
		List<WebElement> bikes = driver.findElements(By.xpath("//div[@class='wM6W7d']"));
		
		//for(int i=0;i<bikes.size();i++) {
			//String bikesOption=bikes.get(i).getText();
			//System.out.println(bikesOption);
			//Thread.sleep(2000);
		//}
		for(WebElement we:bikes) {
			String bikesOption=we.getText();
			System.out.println(bikesOption);
			Thread.sleep(2000);
			
			driver.close();
		}
	}

}
