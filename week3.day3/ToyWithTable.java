package week3.day3;

import java.util.List;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ToyWithTable {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/table.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		List<WebElement> columnCount = driver.findElements(By.tagName("th"));
		System.out.println("column count" + columnCount.size());

		List<WebElement> rowCount = driver.findElements(By.tagName("tr"));
		int rc=rowCount.size();
		System.out.println("row count" + rc);

		String text = driver
				.findElement(By.xpath("//td[text()='Learn to interact with Elements']//following-sibling::td[1]"))
				.getText();
		System.out.println(text);
		
		for (int i = 2; i <=rc; i++) {
			String text1 = driver.findElement(By.xpath("//table[@id='table_id']//tr["+ i +"]//td[2]")).getText();
			
			
			
		}
		

	}

}
