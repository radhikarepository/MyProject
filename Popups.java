package day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Popups {

	public static void main(String[] args) throws InterruptedException {
		
		//step 1 open browser
				//System.setProperty("webdriver.gecko.driver","geckodriver.exe");
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.findElement(By.id("alertButton")).click();
		Thread.sleep(5000);
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
	 driver.findElement(By.id("timerAlertButton")).click();
	  WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(50));
	  wait.until(ExpectedConditions.alertIsPresent());
		Alert alert1 = driver.switchTo().alert();
		alert1.accept();
		
		driver.findElement(By.id("confirmButton")).click();
		Thread.sleep(5000);
		Alert alert11 = driver.switchTo().alert();
		alert11.dismiss();
		
	/*ver.findElement(By.id("promtButton")).click();		
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("message");
		c
		alert.accept();*/
		//driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		//driver.get("https://the-internet.herokuapp.com/basic_auth");
		Thread.sleep(5000);
		//driver.close();
		//driver.quit();
		
		
		
	
	}

}
