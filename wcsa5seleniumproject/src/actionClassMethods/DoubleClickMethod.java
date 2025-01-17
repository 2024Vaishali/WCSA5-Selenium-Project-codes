package actionClassMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DoubleClickMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("driver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Launch the ActiTime
		driver.get("http://vaishali-laptop-0adp0cdp:8080/login.do");
		new WebDriverWait(driver,Duration.ofSeconds(30)).until(ExpectedConditions.titleContains(driver.getTitle()));
		
		//perform login operation
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		//Home page
		new WebDriverWait(driver,Duration.ofSeconds(30)).until(ExpectedConditions.titleContains(driver.getTitle()));
		
		//click on setting module
		driver.findElement(By.xpath("//div[text()='Settings']/ancestor::a")).click();
		
		//click on logo and color
		driver.findElement(By.xpath("//a[text()='Logo & Color Scheme']")).click();
		Thread.sleep(2000);
		
		//click on use custom logo
		driver.findElement(By.name("formCustomInterfaceLogo.logoOption")).click();
		
		//click on button to select the file
		driver.findElement(By.name("formCustomInterfaceLogo.logo")).click();
		
		
	}

}
