package methodOfWebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledMethod {

	public static void main(String[] args) {
		System.setProperty("webdrvier.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get(null);
		driver.findElement(By.name("username")).sendKeys(pune);
		driver.findElement(By.name("password")).sendKeys(1234);
		driver.findElement(By.xpath("//button[contains(@class,' _acap ')]"));

	}

}
