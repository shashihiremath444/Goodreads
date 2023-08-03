package GoodReadProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GoodRead {
	public static void main(String[] args) throws Throwable {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.goodreads.com/");
		driver.findElement(By.xpath("//a[text()='Sign up with email']")).click();
		driver.findElement(By.className("a-link-emphasis")).click();
		// enter the email ID and password
		driver.findElement(By.id("ap_email")).sendKeys("shashihiremath444@gmail.com");
		driver.findElement(By.id("ap_password")).sendKeys("***********");
		driver.findElement(By.id("signInSubmit")).click();
		
/* the below three lines script are written for the after using the same email id and password IMPORTANT MESSAGE alert will appearing */
		//driver.findElement(By.name("password")).sendKeys("Shashi@good4");
		//for enter the characters of shown in screen within 8 second
		//Thread.sleep(8000);
		//driver.findElement(By.id("signInSubmit")).click();
		
		// to search book of "once more with feelings"
		driver.findElement(By.xpath("//input[contains(@class,'searchBox')]")).sendKeys("once more with feelings");
		driver.findElement(By.xpath("//button[contains(@class,'searchBox__icon')]")).submit();
		driver.findElement(By.xpath("//button[@class='wtrToRead']")).submit();
		
		
		Thread.sleep(2000);// for load the web page
		driver.findElement(By.xpath("//a[text()='My Books']")).click();
		driver.findElement(By.xpath("//img[@alt='Remove from my books']")).click();
		
		//to handle the pop-up(accept)
		driver.switchTo().alert().accept();
		//to click on profile
		driver.findElement(By.xpath("//span[@class='headerPersonalNav__icon']")).click();
		//logout 
		driver.findElement(By.xpath("//a[text()='Sign out']")).click();
		driver.quit();

	}
}
