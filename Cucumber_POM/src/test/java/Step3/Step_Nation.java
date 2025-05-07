package Step3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PAGE3.Home;
import PAGE3.Login;
import PAGE3.Nationalities;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_Nation {

	WebDriver driver;
	
	Login Lp;
	Nationalities Np;
	Home Hp;

	@Given("User launch chrome browser")
	public void user_launch_chrome_browser() {
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
	}

	@When("User opens URL {string}")
	public void user_opens_url(String url) {
		Lp = new Login();
		Lp.driver(driver);
		Lp.user_opens_url(url);
	}

	@When("User enters username as {string} and password as {string}")
	public void user_enters_username_as_and_password_as(String Id, String Pass) throws InterruptedException {
		Lp.user_enters_username_as_and_password_as(Id, Pass);
	}

	@Then("browse to NATIONALITY Page")
	public void browse_to_nationality_page() throws InterruptedException {
		Np = new Nationalities();
		Np.driver(driver);
		Np.browse_to_nationality_page();
		
	}

	@When("Add NATIONALITY Records with NNAME as {string}")
	public void add_nationality_records_with_nname_as(String Nation_name) throws InterruptedException {
		Np.add_nationality_records_with_nname_as(Nation_name);
	}

	@When("Click on logout button")
	public void click_on_logout_button() throws InterruptedException {
		Hp = new Home();
		Hp.driver(driver);
		Hp.click_on_logout_button();
	}

	@Then("Close Browser")
	public void close_browser() {
		Hp.close_browser();
	}
}
