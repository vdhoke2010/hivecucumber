package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest {
	
	WebDriver driver;
	String expectedResults ="Hive Home";
	WebElement actualResults;
			
	@Given("I want to write a step with precondition")
	public void i_want_to_write_a_step_with_precondition() {
		System.setProperty("webdriver.chrome.driver","src//test//resources//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.hivehome.com/");
		//WebElement element;
		Actions action = new Actions (driver);
		actualResults=driver.findElement(By.xpath(".//img[@alt='Hive Home']"));
		System.out.println(actualResults);
	//Assert.assertEquals(expectedResults, actualResults);
	}
	

	/*
	 * @Given("some other precondition") public void some_other_precondition() { //
	 * Write code here that turns the phrase above into concrete actions throw new
	 * cucumber.api.PendingException(); }
	 * 
	 * @When("I complete action") public void i_complete_action() { // Write code
	 * here that turns the phrase above into concrete actions throw new
	 * cucumber.api.PendingException(); }
	 * 
	 * @When("some other action") public void some_other_action() { // Write code
	 * here that turns the phrase above into concrete actions throw new
	 * cucumber.api.PendingException(); }
	 * 
	 * @When("yet another action") public void yet_another_action() { // Write code
	 * here that turns the phrase above into concrete actions throw new
	 * cucumber.api.PendingException(); }
	 * 
	 * @Then("I validate the outcomes") public void i_validate_the_outcomes() { //
	 * Write code here that turns the phrase above into concrete actions throw new
	 * cucumber.api.PendingException(); }
	 * 
	 * @Then("check more outcomes") public void check_more_outcomes() { // Write
	 * code here that turns the phrase above into concrete actions throw new
	 * cucumber.api.PendingException(); }
	 */
}
