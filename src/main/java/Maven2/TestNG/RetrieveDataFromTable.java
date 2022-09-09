package Maven2.TestNG;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class RetrieveDataFromTable {

public static void main(String[] args) throws InterruptedException, MalformedURLException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\suhas.tupake\\Desktop\\path\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		//driver.manage().window().maximize();
		// go to website
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		// click on column
		driver.findElement(By.xpath("//tr/th[1]")).click();
		// to get list
		List<WebElement> elementsList = driver.findElements(By.xpath("//tr/td[1]"));
		// to get original list
	List<String> originalList = elementsList.stream().map(s->s.getText()).collect(Collectors.toList());
	
	// to sort original list
	List<String> sortedList = originalList.stream().sorted().collect(Collectors.toList());
	
	// to compare the lists
	Assert.assertTrue(originalList.equals(sortedList));
	
	//scan the column and get text -> Beans -> print the price of Beans
	List<String> price = elementsList.stream().filter(s->s.getText()
			.contains("Beans")).map(s->getPriceVeggie(s)).collect(Collectors.toList());
		price.forEach(a->System.out.println(a));
}

private static String getPriceVeggie(WebElement s) {
	// TODO Auto-generated method stub
	String pricevalue = s.findElement(By.xpath("following-sibling::td[1]")).getText();
	return pricevalue;
	
    }
}







