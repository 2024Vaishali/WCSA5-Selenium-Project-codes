package actionClassMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskOfGoldenCoin {

	public static void main(String[] args) {
		System.setProperty("driver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.bluestone.com/");// launch theblue stone web application
		driver.findElement(By.id("denyBtn")).click();//handle the popup
		
		driver.findElement(By.xpath("//a[@title='Coins'] ")).click();
		driver.findElement(By.xpath("//span[@title='Bureau of Indian Standards- HALLMARKING']")).click();
		
	}

}
