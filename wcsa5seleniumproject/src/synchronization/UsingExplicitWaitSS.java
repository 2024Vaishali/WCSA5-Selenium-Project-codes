package synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingExplicitWaitSS {
	public static void Main() {
		System.setProperty("webdriver.chrome.drive","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get(null);
        driver.findElement(By.xpath("").g
	}

}
