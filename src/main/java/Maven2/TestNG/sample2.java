package Maven2.TestNG;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class sample2 {

	@Test
	public void m1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\suhas.tupake\\Desktop\\path\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/sortable");
		Thread.sleep(2000);
		WebElement src = driver.findElement(By.xpath("(//div[text()='Three'])[1]"));
		WebElement dst = driver.findElement(By.xpath("(//div[text()='One'])[1]"));
		Actions act = new Actions(driver);
		act.clickAndHold(src).moveToElement(dst).build().perform();
		
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='demo-tab-grid']")).click();
		WebElement src1 = driver.findElement(By.xpath("//div[normalize-space()='Nine']"));
		WebElement dst1 = driver.findElement(By.xpath("//div[@class='create-grid']//div[@class='list-group-item list-group-item-action'][normalize-space()='Five']"));
		Actions acct = new Actions(driver);
		acct.clickAndHold(src1).moveToElement(dst1).build().perform();
		
		Thread.sleep(2000);
		driver.close();
	}
	
	@Test
	public void m2() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\suhas.tupake\\Desktop\\path\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://phppot.com/demo/country-state-city-example-cascading-jquery-dependent-dropdown/");
		Thread.sleep(2000);
		List<WebElement> count = driver.findElements(By.xpath("//select[@id='country-list']"));
		int size= count.size();
		System.out.println(size);
		WebElement country = driver.findElement(By.xpath("//select[@id='country-list']"));
		Select s= new Select(country);
		s.selectByValue("4");
		Thread.sleep(3000);
		
		
		
		
		WebElement state = driver.findElement(By.xpath("//select[@id='state-list']"));
		Select s1= new Select(state);
		s1.selectByValue("8");
		Thread.sleep(1000);
		WebElement city = driver.findElement(By.xpath("//select[@id='city-list']"));
		Select s2= new Select(city);
		s2.selectByValue("1");
		Thread.sleep(1000);
		driver.close();
		
	}
	@Test
	public void m3() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\suhas.tupake\\Desktop\\path\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/resizable");
		Thread.sleep(2000);
		WebElement resize1 = driver.findElement(By.xpath("//div[@id='resizableBoxWithRestriction']//span[@class='react-resizable-handle react-resizable-handle-se']"));
		WebElement resize2 = driver.findElement(By.xpath("//div[@id='resizable']//span[@class='react-resizable-handle react-resizable-handle-se']"));
		
		Actions act = new Actions(driver);
		act.moveToElement(resize1).dragAndDropBy(resize1, 100, 300).build().perform();
		Thread.sleep(2000);
		
		act.moveToElement(resize2).dragAndDropBy(resize2, 50, 30).build().perform();
		Thread.sleep(1000);
		driver.close();
		
	}
}
