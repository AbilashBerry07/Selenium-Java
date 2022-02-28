package week3.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContract {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		
		
		driver.findElement(By.id("firstNameField")).sendKeys("Abilash");
		driver.findElement(By.id("lastNameField")).sendKeys("Berry");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Abilash");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Berry");
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("AA");
		driver.findElement(By.id("createContactForm_description")).sendKeys("kkk");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("berry.abilash@gmail.com");
		driver.findElement(By.id("createContactForm_generalStateProvinceGeoId")).sendKeys("India");
		driver.findElement(By.name("submitButton")).click();
		
		
		driver.findElement(By.className("subMenuButton")).click();
		driver.findElement(By.id("updateContactForm_description")).clear();
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Follow the instructions as per privacy policy");
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		
		String title="View Contact | opentaps CRM";
		String title1=driver.getTitle();
		if(title.equals(title1)) {
			System.out.println("Title of the page is displayed in the console");
		}else {
			System.out.println("Title of the page is not displayed in the console");
		}
	}

}
