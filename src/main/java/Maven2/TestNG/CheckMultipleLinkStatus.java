package Maven2.TestNG;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class CheckMultipleLinkStatus {

	
public static void main(String[] args) throws InterruptedException, MalformedURLException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\suhas.tupake\\Desktop\\path\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
	// by xpath	
	List<WebElement> links = driver.findElements(By.xpath("//li[@class='gf-li']//a"));             
		// by css selector
	//List<WebElement> links = driver.findElements(By.cssSelector("li[class='gf-li'] a")); 
	SoftAssert a = new SoftAssert();                                                                 
	
	
		for(WebElement link :links)
		{
			String url = link.getAttribute("href");
			
			HttpURLConnection conn = (HttpURLConnection)new URL(url).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			int respcode= conn.getResponseCode();
			System.out.println(respcode);
			a.assertTrue(respcode<400, "The link with text "+link.getText()+" is broken with code"+respcode);
			/*if(respect>400) {
				
				System.out.println("The link with text"+link.getText()+" is broken with code"+respect);
				Assert.assertTrue(false);*/
			
			}
			a.assertAll();
		}
		
		
		
		
		
		
		
	}

