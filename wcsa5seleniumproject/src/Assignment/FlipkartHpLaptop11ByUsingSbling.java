package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartHpLaptop11ByUsingSbling {

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webDriver.chorme.driver", "./divers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("https://www.flipkart.com/");
			
			driver.findElement(By.xpath("//button[text()='✕']")).click();
			
			driver.findElement(By.xpath("//input[@name='q']")).sendKeys("HP Laptop");
			
			driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
			
			driver.findElement(By.xpath(""))

	}

}
