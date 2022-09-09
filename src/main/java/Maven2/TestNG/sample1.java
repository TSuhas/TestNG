package Maven2.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class sample1 {

	@Test
	
	public void n1() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\suhas.tupake\\Desktop\\path\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://hrms.adnetglobal.com/");
		System.out.println("Hello");
		driver.close();
		
	}
	@Test
	public void n2() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\suhas.tupake\\Desktop\\path\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://datatables.net/examples/advanced_init/column_render.html");
		Thread.sleep(2000);
		WebElement drop = driver.findElement(By.xpath("//select[@name='example_length']"));
		
		Select s =new Select(drop);
		s.selectByValue("100");
		Thread.sleep(1000);
		s.selectByValue("25");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='3']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Next']")).click();
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("sonya");
		Thread.sleep(2000);
		driver.close();
		
	}
	
	@Test 
	public void n3() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\suhas.tupake\\\\Desktop\\\\path\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/checkbox");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@title='Toggle']")).click();
		driver.findElement(By.xpath("(//button[@title='Toggle'])[3]")).click();
		driver.findElement(By.xpath("(//span[@class='rct-checkbox'])[5]")).click();
		driver.close();
	}
}
