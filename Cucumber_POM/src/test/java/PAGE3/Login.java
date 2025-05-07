package PAGE3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {

	WebDriver driver;
	
	public void driver(WebDriver driver) {
		this.driver = driver;
	}
	
	public void user_enters_username_as_and_password_as(String Id, String Pass) throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys(Id);
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys(Pass);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(@type,'submit')]")).click();
		Thread.sleep(2000);
	}
	
	public void user_opens_url(String url) {
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}


}
