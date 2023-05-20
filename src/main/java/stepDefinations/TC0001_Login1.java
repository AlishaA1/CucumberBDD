package stepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC0001_Login1 {
	WebDriver driver;
	@Given("user is on home page")
	public void user_is_on_home_page() {
		System.out.println("Launch browser and enter");
		driver= new ChromeDriver();
		driver.get("\"https://www.yahoo.com/\"");
		driver.manage().window().maximize();
	}
	@When("user clicks on sign in")
	public void user_clicks_on_sign_in() {
		System.out.println("Click on Signin link");
		driver.findElement(By.linkText("Sign in")).click();
	}
	@Then("Verify title in next page as Yahoo")
	public void verify_title_in_next_page_as_yahoo() {
		System.out.println("Verify Title");
		
	}
	@When("user enters user name and passdword clicks on submit button")
	public void user_enters_user_name_and_passdword_clicks_on_submit_button() {
		System.out.println("Enter user name and password");
	}
	@Then("Verify user and display message Login successful")
	public void verify_user_and_display_message_login_successful() {
		System.out.println("Login Successful");
	}
	@Then("Logout")
	public void logout() {
		System.out.println("Logout");
	}


}
