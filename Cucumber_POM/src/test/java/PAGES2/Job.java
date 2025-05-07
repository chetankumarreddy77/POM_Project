package PAGES2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Job {
	
	WebDriver driver;
	
	public void driver(WebDriver driver01) {
		this.driver = driver01;
	}
	
	public void user_enter_the_jobs() throws InterruptedException {
		driver.findElement(By.xpath("(//span[@class='oxd-topbar-body-nav-tab-item'])[2]")).click();
		Thread.sleep(2000);
	}
	
	public void user_choose_the_job_tittle() throws InterruptedException {
		driver.findElement(By.xpath("//a[contains(text(),'Titles')]")).click();
		Thread.sleep(2000);
	}
	
	public void click_the_add_data() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()=' Add ']")).click();
		Thread.sleep(2000);
	}
	
	public void user_enter_the_job_tittle_as_and_job_description_and_job_note(String JobTitle, String Job_Des,
			String Job_Note) throws InterruptedException {
		 	driver.findElement(By.xpath("(//input[contains(@class,'oxd-input--active')])[2]")).sendKeys(JobTitle);
		 	Thread.sleep(3000);
		 	driver.findElement(By.xpath("(//textarea[contains(@class,'oxd-textarea--resize-vertical')])[1]")).sendKeys(Job_Des);
		 	Thread.sleep(3000);
		 	driver.findElement(By.xpath("(//textarea[contains(@class,'oxd-textarea--resize-vertical')])[2]")).sendKeys(Job_Note);
		 	Thread.sleep(3000);
	}
	
	public void user_enter_the_save_data_successfully() throws InterruptedException {
		 driver.findElement(By.xpath("//button[text()=' Save ']")).click();
		 Thread.sleep(3000);
	}


	

}
