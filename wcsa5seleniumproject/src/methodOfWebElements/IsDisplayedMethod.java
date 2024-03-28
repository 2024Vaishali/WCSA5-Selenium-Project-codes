package methodOfWebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayedMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chorme.driver", "./divers/chromediver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("http://vaishali-laptop-0adp0cdp:8080/login.do");
	    boolean usntextBox=driver.findElement(By.name("username")).isDisplayed();
	    System.out.println(usntextBox);

	}

}
