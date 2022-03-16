package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRMLibrary {
	public static WebDriver driver;
	
	@Given("^i open browser with url \"([^\"]*)\"$")
	public void i_open_browser_with_url(String url) throws Throwable {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);
		
	}
	   
	

	@Then("^i should see login page$")
	public void i_should_see_login_page() throws Throwable {
		if (driver.findElement(By.id("btnLogin")).isDisplayed()) {

			System.out.println("System Displayed Login Page");
		}
	   
	}

	@When("^i enter username as \"([^\"]*)\"$")
	public void i_enter_username_as(String uname) throws Throwable {
		driver.findElement(By.id("txtUsername")).sendKeys(uname);
	    
	}

	@When("^i enter password as \"([^\"]*)\"$")
	public void i_enter_password_as(String pwd) throws Throwable {
		driver.findElement(By.id("txtPassword")).sendKeys(pwd);
	    
	}

	@When("^i click login$")
	public void i_click_login() throws Throwable {
		driver.findElement(By.id("btnLogin")).click();
	}
	
	   

	@Then("^i should see admin module$")
	public void i_should_see_admin_module() throws Throwable {
		if (driver.findElement(By.partialLinkText("Admin")).isDisplayed()) {
			System.out.println("Admin Login is Successful");
		} else {
			System.out.println("Admin Login unsuccessful");
		}
	    
	}

	@When("^i click on Logout$")
	public void i_click_on_Logout() throws Throwable {
		driver.findElement(By.partialLinkText("Welcome")).click();
		driver.findElement(By.partialLinkText("Logout")).click();
	   
	}

	@When("^i close browser$")
	public void i_close_browser() throws Throwable {
		driver.close();
	   
	}



}
