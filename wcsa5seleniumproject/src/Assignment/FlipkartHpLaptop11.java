package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartHpLaptop11 {

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webDriver.chorme.driver", "./divers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("https://www.flipkart.com/");
			
			driver.findElement(By.xpath("//button[text()='✕']")).click();
			
			driver.findElement(By.xpath("//input[@name='q']")).sendKeys("HP Laptop");
			
			driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
			
			driver.findElement(By.xpath("//div[text()='Core i7']")).click();
			
			driver.findElement(By.xpath("//div[text()='Brand']")).click();
			driver.findElement(By.xpath("//div[text()='HP']")).click();
			
			driver.findElement(By.xpath("//div[text()='Operating System']")).click();
			driver.findElement(By.xpath("//div[text()='Windows 11']")).click();
			
			driver.findElement(By.xpath("//div[text()='Customer Ratings']"));
			driver.findElement(By.xpath("//div[text()='4★ & above']"));
			
			driver.findElement(By.xpath("//div[contains(text(),'HP Omen Core i5 7th Gen')]/../..//div[text()='₹87,490']")).click();
			
			
			driver.close();
	        
		}

}
