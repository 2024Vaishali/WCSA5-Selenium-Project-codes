package actionClassMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("driver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		WebElement src1 = driver.findElement(By.xpath("//a[text()=' SALES ']"));
		WebElement target1 = driver.findElement(By.xpath("//ol[@id='loan']//descendant::li"));
		
		WebElement src2 = driver.findElement(By.xpath("//a[text()=' 5000']"));
		WebElement target2 = driver.findElement(By.xpath("//ol[@id='amt8']/descendant::li"));
		
		WebElement src3 = driver.findElement(By.xpath("//a [text()=' BANK ']") );
		WebElement target3 = driver.findElement(By.xpath("//ol [@id='bank']/descendant::li"));
		
		WebElement src4 = driver.findElement(By.xpath("//a[text()=' 5000 ']"));
		WebElement target4 = driver.findElement(By.xpath("//ol[@id='amt7']/descendant::li"));
		
		Actions act=new Actions(driver);
		
		act.dragAndDrop(src1, target1);
		Thread.sleep(2000);
		
		act.dragAndDrop(src2, target2);
		Thread.sleep(2000);
		
		act.dragAndDrop(src3, target3);
		Thread.sleep(2000);
		
		act.dragAndDrop(src4, target4);
		Thread.sleep(2000);
		

	}

}
