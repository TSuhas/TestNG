package Maven2.TestNG;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakePartialScreenshot {

public static void main(String[] args) throws InterruptedException, MalformedURLException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\suhas.tupake\\Desktop\\path\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		//driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		WebElement name = driver.findElement(By.xpath("//input[@class='form-control ng-pristine ng-invalid ng-touched']"));
		name.sendKeys("Automation");
		
		// to take parial screenshot
		File src = name.getScreenshotAs(OutputType.FILE);
		 File dst = new File("C:\\Users\\suhas.tupake\\Desktop\\path\\scrrenshot.png");
		 FileHandler.copy(src, dst);
     }

}
