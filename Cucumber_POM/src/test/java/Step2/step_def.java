package Step2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PAGES2.Home;
import PAGES2.Job;
import PAGES2.Login;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class step_def {
	
	WebDriver driver;
	
	Login Lp;
	Job   Jp;
	Home  HP;
	
	
	@Given("User launch the chrome browser")
	public void user_launch_the_chrome_browser() {
		driver = new ChromeDriver();
		  driver.manage().window().maximize();
	}
	@Then("User Enter the URL as {string}")
	public void user_enter_the_url_as(String url) {
		Lp = new Login();
		Lp.driver(driver);
		Lp.user_enter_the_url_as(url);
		
	}
	@When("user enter Login id as {string} and Login password as {string}")
	public void user_enter_login_id_as_and_login_password_as(String Username, String Password) throws InterruptedException {
		Lp.user_enter_login_id_as_and_login_password_as(Username, Password);
	}
	@When("user Click the admin")
	public void user_click_the_admin() throws InterruptedException {
		driver.findElement(By.xpath("//span[text()='Admin']")).click();
	    Thread.sleep(2000);
	}
	@Then("user Enter the Jobs")
	public void user_enter_the_jobs() throws InterruptedException {
		Jp = new Job();
		Jp.driver(driver);
		Jp.user_enter_the_jobs();
	}
	@Then("user choose the Job tittle")
	public void user_choose_the_job_tittle() throws InterruptedException {
		Jp.user_choose_the_job_tittle();
	}
	@Then("click the Add data")
	public void click_the_add_data() throws InterruptedException {
		Jp.click_the_add_data();
	}
	@When("user enter the Job tittle as {string} and Job Description {string} and Job note {string}")
	public void user_enter_the_job_tittle_as_and_job_description_and_job_note(String JobTitle, String Job_Des, String Job_Note) throws InterruptedException {
		Jp.user_enter_the_job_tittle_as_and_job_description_and_job_note(JobTitle, Job_Des, Job_Note);
	}
	@When("user enter the save data successfully")
	public void user_enter_the_save_data_successfully() throws InterruptedException {
		Jp.user_enter_the_save_data_successfully();
	}
	@When("user click the Profile")
	public void user_click_the_profile() throws InterruptedException {
	    HP = new Home();
	    HP.driver(driver);
	    HP.user_click_the_profile();
	}
	@Then("click on logout")
	public void click_on_logout() throws InterruptedException {
		HP.click_on_logout();
	}
	@Then("user close the browser")
	public void user_close_the_browser() {
		driver.quit();
	}

}
