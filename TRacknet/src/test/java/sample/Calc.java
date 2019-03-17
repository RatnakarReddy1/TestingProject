package sample;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;

public class Calc {

	public static void main(String[] args) throws MalformedURLException, Exception {
		// TODO Auto-generated method stub
		DesktopOptions option = new DesktopOptions();
		option.setApplicationPath("C:\\Windows\\System32\\calc.exe");
		WiniumDriver driver = new WiniumDriver(new URL("http://localhost:9999"),option);
		
		Thread.sleep(5000);
		
		driver.findElement(By.name("One")).click();
		driver.findElement(By.name("Plus")).click();
		driver.findElement(By.name("One")).click();
		driver.findElement(By.id("equalButton")).click();
		String value = driver.findElement(By.id("CalculatorResults")).getAttribute("Name");
		System.out.println(value);
		
		
	}

}
