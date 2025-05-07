package PAGE3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Home {

WebDriver driver;
	
	public void driver(WebDriver driver) {
		this.driver = driver;
	}
	
	public void click_on_logout_button() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[3]/ul/li/span")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[3]/ul/li/ul/li[4]/a")).click();
	    Thread.sleep(2000);
		//WELCOME
		//LOGOUT
	}
	
	public void close_browser() {
		driver.quit();
	}
}
