package demo_Nemo;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_{
	
	static By UserPath = By.id("okta-signin-username");
	static By PassPath = By.id("okta-signin-password");
	static By LoginPath = By.id("okta-signin-submit");
	static By SearchPath = By.xpath("//input[@class='jss68 jss53 jss73 jss74']");
	
	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://app-dev.nemorx.com/");
		System.out.println("Browser Opened Succesfully");
		String title = driver.getTitle();
		System.out.println("Page Title=="+title);
		String User = "radhakrishnak@pronixinc.com";
		String pass = "Harini59*";
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(UserPath).sendKeys(User);
		driver.findElement(PassPath).sendKeys(pass);
		driver.findElement(LoginPath).click();
		Thread.sleep(5000);
		System.out.println("Successfully login completed");
		String title2 = driver.getTitle();
		System.out.println("Page 2 Title=="+title2);
		String patient = "test okta";
		Thread.sleep(5000);
		driver.findElement(SearchPath).sendKeys(patient);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/header/div/div[1]/div[2]/div/ul/div")).click();
		String title3 = driver.getTitle();
		System.out.println("Page 3 Title=="+title3);
		
		
		
	}

}
