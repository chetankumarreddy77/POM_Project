package PAGES2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Home {
	
	WebDriver driver;
	
	public void driver(WebDriver driver01) {
		this.driver = driver01;
	}
	
	public void user_click_the_profile() throws InterruptedException {
		//driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[3]/ul/li/span")).click();
	    //Thread.sleep(2000);
	}
	
	public void click_on_logout() {
		//WELCOME
		//LOGOUT
	}
	
	public void user_close_the_browser() {
		driver.quit();
	}
}
