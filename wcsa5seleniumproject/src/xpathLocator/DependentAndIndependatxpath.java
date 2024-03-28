package xpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DependentAndIndependatxpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webDriver.chorme.driver", "./divers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("HP Laptop");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//div[text()='Core i5']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[text()='Brand']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[text()='HP']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[text()='Operating System']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[text()='Windows 10']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[contains(text(),'HP Omen Core i5 7th Gen')]/../..//div[text()='₹87,490']")).click();
		Thread.sleep(2000);
		
		driver.close();
        
	}

}
