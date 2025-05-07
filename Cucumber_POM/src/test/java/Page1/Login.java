package Page1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
	
	WebDriver driver;
	
	public void driver(WebDriver driver01) {
		this.driver = driver01;
	}
	
	public void user_enters_username_as_and_password_as(String id, String pass) throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys(id);
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys(pass);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(@type,'submit')]")).click();
		Thread.sleep(2000);
	}
	
	public void user_opens_url(String url) {
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	

}
