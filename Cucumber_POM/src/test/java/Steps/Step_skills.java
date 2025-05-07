package Steps;

//import java.time.Duration;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Page1.Home;
import Page1.Login;
import Page1.skill;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_skills {
	
	WebDriver driver;
	
	Login LP;
	skill SP;
	Home  HP;
	
	@Given("User launch chrome browser")
	public void user_launch_chrome_browser() {
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
	}
	@When("User opens URL {string}")
	public void user_opens_url(String url) {
		LP = new Login();
		LP.driver(driver);
		LP.user_opens_url(url);
	}
	
	@When("User enters username as {string} and password as {string}")
	public void user_enters_username_as_and_password_as(String id, String pass) throws InterruptedException {
		LP.user_enters_username_as_and_password_as(id, pass);
	}
	@Then("Navigate to SKILLS Page")
	public void navigate_to_skills_page() throws InterruptedException {
		 SP = new skill();
		 SP.driver(driver);
		 SP.navigate_to_skills_page();
	}
	@When("Add SKILLS Records with SNAME as {string} AND SDESCR as {string}")
	public void add_skills_records_with_sname_as_and_sdescr_as(String Skillname, String SkillDes) throws InterruptedException {
		SP.add_skills_records_with_sname_as_and_sdescr_as(Skillname, SkillDes);
	}
	@When("Click on logout button")
	public void click_on_logout_button() throws InterruptedException {
	    HP = new Home();
	    HP.driver(driver);
	    HP.click_on_logout_button();
	}
	@Then("Close Browser")
	public void close_browser() {
	    HP.close_browser();
	}

}
