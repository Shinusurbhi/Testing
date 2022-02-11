package stepDefinitions;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.devtools.page.Page;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;


public class demoblazeStepDefinitions {

	public WebDriver driver;

	String UsernamePassword = getAlphaNumericString(10); //keeping both username and password same


	@Given("^Signup for the demoblaze website with your credentials$")
	public void signup_for_the_demoblaze_website_with_your_credentials() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Aditya D. Suratkar\\Downloads\\demoblazeversion1\\demoblazeversion1\\browser\\chromedriver.exe");
		driver= new ChromeDriver();	
		driver.get("https://demoblaze.com/");
		Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("signin2")));		
		WebElement signUp = driver.findElement(By.id("signin2"));
		signUp.click();
		Thread.sleep(3000);
		driver.findElement(By.id("sign-username")).sendKeys(UsernamePassword);
		driver.findElement(By.id("sign-password")).sendKeys(UsernamePassword);		
		WebElement signUpConfirmButton = driver.findElement(By.cssSelector("#signInModal > div > div > div.modal-footer > button.btn.btn-primary"));		
		signUpConfirmButton.click();	
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		alert.accept();	    
	}
	public static String getAlphaNumericString(int n)
	{

		String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
				+ "0123456789"
				+ "abcdefghijklmnopqrstuvxyz";

		StringBuilder sb = new StringBuilder(n);

		for (int i = 0; i < n; i++) {

			int index
			= (int)(AlphaNumericString.length()
					* Math.random());

			sb.append(AlphaNumericString
					.charAt(index));
		}

		return sb.toString();
	}

	@Given("^Signin with the same credentials$")
	public void signin_with_the_same_credentials() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("login2")));
		WebElement login = driver.findElement(By.id("login2"));
		login.click();	
		Thread.sleep(3000);
		driver.findElement(By.id("loginusername")).sendKeys(UsernamePassword);
		driver.findElement(By.id("loginpassword")).sendKeys(UsernamePassword);		
		WebElement logInConfirmButton = driver.findElement(By.cssSelector("#logInModal > div > div > div.modal-footer > button.btn.btn-primary"));
		logInConfirmButton.click();
		Thread.sleep(3000);
	}

	@Then("^Click on a product of your choice for e\\.g \"([^\"]*)\"$")
	public void click_on_a_product_of_your_choice_for_e_g(String product) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#itemc")));		
		WebElement laptopMenuButton = driver.findElement(By.cssSelector("#itemc"));
		laptopMenuButton.click();
		driver.findElement(By.xpath("//a[text()='"+product+"']")).click();	
		Thread.sleep(3000);

	}

	@Then("^Product page should get open with the product image$")
	public void product_page_should_get_open_with_the_product_image()  {
		WebElement ImageFile = driver.findElement(By.cssSelector("#imgp > div > img"));		       
		Boolean ImagePresent = (Boolean) ((JavascriptExecutor)driver).executeScript("return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0", ImageFile);
		if (!ImagePresent)
		{
			System.out.println("Image not displayed.");
		}
		else
		{
			System.out.println("Image displayed.");
		}
	}

	@Then("^Click on the add to cart button$")
	public void click_on_the_add_to_cart_button() {
		WebElement addToCart = driver.findElement(By.cssSelector("#tbodyid > div.row > div > a"));
		addToCart.click();
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		alert.accept();
		driver.quit();
	}


}
