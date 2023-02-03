package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {

	public static void main(String[] args) {
		
		//step 1 open browser
		//System.setProperty("webdriver.gecko.driver","geckodriver.exe");
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		
		//step 2 type url
		//ChromeDriver();
		//FirefoxDriver driver = new FirefoxDriver();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.roicians.com/contact-us/");
		driver.findElement(By.id("text-77525447616")).sendKeys("Radhika");
		driver.findElement(By.id("text-95374915097")).sendKeys("padala");
		driver.findElement(By.id("text-27022866830")).sendKeys("radhikap@gmail.com");
		driver.findElement(By.id("field-tIgxvmTMez6ibt1")).sendKeys("6472311543");
		driver.findElement(By.id("field-kJfKGbPLNi5yFI7")).sendKeys("This is to know about courses");
		//driver.findElements(By.id("button-18782068913"));
		//driver.findElement(By.id("text-95374915097")).sendKeys("padala");
		//driver.findElement(By.id("field-U7H2lPxWxSPqWeq")).sendKeys("C:\\Users\\sudha\\Downloads\\sunset.pixil");
		
		//driver.findElement(null)
		
		}

}
