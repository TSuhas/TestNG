package Maven2.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class sample3 {

	
	@Test
	public void p1() throws InterruptedException {
		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\suhas.tupake\\Desktop\\path\\chromedriver.exe");
					
					WebDriver driver= new ChromeDriver();
					driver.manage().window().maximize();
					driver.get("https://www.amazon.in/");
					Thread.sleep(2000);

					driver.findElement(By.xpath("//input[@type='text']")).sendKeys("mobiles");
					Thread.sleep(2000);
					driver.findElement(By.xpath("//div[@aria-label='mobiles under 30000']")).click();
					driver.findElement(By.xpath("//div[@class='s-widget-container s-spacing-small s-widget-container-height-small celwidget slot=MAIN template=SEARCH_RESULTS widgetId=search-results_1']//u[contains(text(),'+2 colors/patterns')]")).click();
					Thread.sleep(7000);
					 driver.findElement(By.xpath("//button[@id='a-autoid-21-announce']")).click();
		driver.close();
		
	}
	@Test
	public void p2() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\suhas.tupake\\Desktop\\path\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("9876543210");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("9876543210");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'✕')]")).click();
		Thread.sleep(2000);
		
		WebElement fashion = driver.findElement(By.xpath("//div[contains(text(),'Fashion')]"));
		Actions act = new Actions(driver);
		act.moveToElement(fashion).perform();
		Thread.sleep(1000);
		WebElement men = driver.findElement(By.xpath("//a[normalize-space()='Men Footwear']"));
		Actions act1 = new Actions(driver);
		act1.moveToElement(men).perform();
		Thread.sleep(1000);
		WebElement shoe = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/a[1]/div[2]/div[1]"));
		Actions act2 = new Actions(driver);
		act2.moveToElement(shoe).click().perform();
		Thread.sleep(1000);
		driver.close();
	}
	@Test
	public void p3() throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\suhas.tupake\\Desktop\\path\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/radio-button");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[normalize-space()='Radio Button']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[normalize-space()='Impressive']")).click();
		Thread.sleep(1000);
		WebElement radio = driver.findElement(By.xpath("//label[normalize-space()='Yes']"));
		Actions act= new Actions(driver);
		act.click(radio).perform();
		Thread.sleep(1000);
		
		if(radio.isEnabled()) {
			System.out.println("button is selected");
		}
		else {
			System.out.println("Button is not selctable");
		}
		
		Thread.sleep(1000);
		driver.close();
	}
}
