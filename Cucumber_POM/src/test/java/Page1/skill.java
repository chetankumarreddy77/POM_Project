package Page1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class skill {
	
	WebDriver driver;
	
	public void driver(WebDriver driver01) {
		this.driver = driver01;
	}
	
	public void navigate_to_skills_page() throws InterruptedException {
		  driver.findElement(By.xpath("(//span[contains(@class,'oxd-text oxd-text--span oxd-main-menu-item--name')])[1]")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//span[contains(text(),'Quali')]")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//a[contains(text(),'Skills')]")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("(//button[@type=\"button\"])[4]")).click();
		  Thread.sleep(2000);
	}
	
	public void add_skills_records_with_sname_as_and_sdescr_as(String Skillname, String SkillDes) throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input")).sendKeys(Skillname);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//textarea[starts-with(@placeholder,'Type description here')]")).sendKeys(SkillDes);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()=' Save ']")).click();
		Thread.sleep(2000);
	}

}
