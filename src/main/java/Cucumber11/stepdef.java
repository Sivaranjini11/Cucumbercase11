package Cucumber11;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepdef {
	WebDriver driver;
	@Given("I enter {string} as username")
	public void i_enter_as_username(String string) {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\training_C2A.05.08\\Desktop\\Selium 3.0\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		  driver.manage().window().maximize();
		  driver.findElement(By.linkText("SignIn")).click();
		  driver.findElement(By.name("userName")).sendKeys("Admin");
	}

	@Given("I enter {string} as password")
	public void i_enter_as_password(String string) {
		driver.findElement(By.cssSelector("input#password")).sendKeys("password456");
	}

	@When("I click on login Button")
	public void i_click_on_login_Button() {
		driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]")).click();
		driver.findElement(By.xpath("/html/body/main/div/div/div/div[1]/button/h4")).click();
		Actions b= new Actions(driver);
		 driver.findElement(By.xpath("//*[@id=\"categorydropid\"]")).click();
		 b.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.SHIFT).perform();
		 driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[2]/div")).click();
		  b.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	  
		 
		
		    driver.findElement(By.cssSelector("#prodid")).sendKeys("HP");
		    driver.findElement(By.cssSelector("#priceid")).sendKeys("5000");
		    driver.findElement(By.cssSelector("#quantityid")).sendKeys("10");
		    driver.findElement(By.cssSelector("#brandid")).sendKeys("ABD1");
		    driver.findElement(By.cssSelector("#description")).sendKeys("BEST one");
		    driver.findElement(By.cssSelector("body > main > div > div > div > form > fieldset > div:nth-child(13) > div > input.btn.btn-lg.btn-success.col-xs-4.col-md-offset-0")).click();
		    WebDriverWait wait= new WebDriverWait(driver,100);
		    wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("SignOut")));
		    driver.findElement(By.linkText("SignOut")).click();
		    
		    wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("SignIn")));
		   
		    driver.findElement(By.linkText("SignIn")).click();
			driver.findElement(By.name("userName")).sendKeys("Lalitha");
			driver.findElement(By.name("password")).sendKeys("password123");

			  driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]")).click();
			  driver.findElement(By.name("products")).sendKeys("Headphone");
			  driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
			  driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();
			  driver.findElement(By.cssSelector("#header > div.header-middle > div > div > div.col-sm-8 > div > a:nth-child(2)")).click();
			  driver.findElement(By.cssSelector("#cart > tfoot > tr:nth-child(2) > td:nth-child(5) > a")).click();
			  driver.findElement(By.cssSelector("body > b > div > div > div.col-lg-6.col-md-6.col-sm-6.col-xs-12.col-md-push-6.col-sm-push-6 > div > div.panel-body > div:nth-child(4) > div > form:nth-child(2) > input")).click();
		
				 
			  wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#btn")));
			  driver.findElement(By.cssSelector("#btn")).click();
			  
		      driver.findElement(By.cssSelector("#horizontalTab > div.resp-tabs-container > div > div > div > div > form > input[type=text]:nth-child(2)")).sendKeys("Priyasivaj");
		      driver.findElement(By.cssSelector("#horizontalTab > div.resp-tabs-container > div > div > div > div > form > input[type=password]:nth-child(4)")).sendKeys("nithusiva");
		      driver.findElement(By.cssSelector("input[type='submit']")).click();	
		      driver.close();
		      	
	}



	


	
	
	
	
	@Given("I enter {string} as credential for username")
	public void i_enter_as_credential_for_username(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Given("I enter {string} as passwordcredential")
	public void i_enter_as_passwordcredential(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@When("I click on SignIn Button")
	public void i_click_on_SignIn_Button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("Home page is successfully displayed.")
	public void home_page_is_successfully_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@When("I enter headphone in search field and click on add to cart")
	public void i_enter_headphone_in_search_field_and_click_on_add_to_cart() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("I  click on checkout")
	public void i_click_on_checkout() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("I enter username and password for transaction")
	public void i_enter_username_and_password_for_transaction() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("I fill all the description of the product")
	public void i_fill_all_the_description_of_the_product() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("the product is  added in the cart.")
	public void the_product_is_added_in_the_cart() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@When("I enter Admin credentials admin page is displayed.")
	public void i_enter_Admin_credentials_admin_page_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("I  click on Add Product")
	public void i_click_on_Add_Product() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("I enter category name as {string}")
	public void i_enter_category_name_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("I entersubcategory name as {string}")
	public void i_entersubcategory_name_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("I enter product name as {string}")
	public void i_enter_product_name_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("I enter price as {string}")
	public void i_enter_price_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("I enter quantity as {string}")
	public void i_enter_quantity_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("I enter brand name as {string}")
	public void i_enter_brand_name_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("I enter description name as {string}")
	public void i_enter_description_name_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@When("I click on add product")
	public void i_click_on_add_product() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("added by Admin successfully.")
	public void added_by_Admin_successfully() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}


}



