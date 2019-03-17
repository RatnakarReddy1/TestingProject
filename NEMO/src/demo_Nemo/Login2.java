package demo_Nemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Login2 {
	public static WebDriver driver;
    static By UserPath = By.id("okta-signin-username");
	static By PassPath = By.id("okta-signin-password");
	static By LoginPath = By.id("okta-signin-submit");
	static By SearchPath = By.xpath("//input[@class='jss68 jss53 jss73 jss74']");
	public void LoginInto(String user, String pass) throws Exception{
		Thread.sleep(5000);
		driver.findElement(UserPath).sendKeys(user);
		driver.findElement(PassPath).sendKeys(pass);
		driver.findElement(LoginPath).click();
		Thread.sleep(5000);
		System.out.println("Successfully login completed");
		}
	public void SearchPatient(String patient) throws Exception{
		String title2 = driver.getTitle();
		System.out.println("Page 2 Title=="+title2);
		Thread.sleep(5000);
		driver.findElement(SearchPath).sendKeys(patient);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/header/div/div[1]/div[2]/div/ul/div")).click();
		String title3 = driver.getTitle();
		System.out.println("Page 3 Title=="+title3);	
		
	}
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium drivers\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://app-dev.nemorx.com/");
		Thread.sleep(5000);
		Login2 obj = new Login2();
		obj.LoginInto("radhakrishnak@pronixinc.com","Harini59*");
		obj.SearchPatient("test okta");
		
	}

}
