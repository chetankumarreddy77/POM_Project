package PAGE3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Nationalities {
	
WebDriver driver;
	
	public void driver(WebDriver driver) {
		this.driver = driver;
	}
	
	public void browse_to_nationality_page() throws InterruptedException {
		driver.findElement(By.xpath("//span[text()='Admin']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//a[text()='Nationalities']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@type=\"button\"])[4]")).click();
		Thread.sleep(2000);
		
	}
	
	public void add_nationality_records_with_nname_as(String Nation_name) throws InterruptedException {
		driver.findElement(By.xpath("(//input[contains(@class,'oxd-input--active')])[2]")).sendKeys(Nation_name);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]")).click();
		Thread.sleep(5000);
	}

}
