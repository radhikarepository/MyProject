package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class verifications {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		// boolean result=driver.findElement(By.linkText("Gmail")).isDisplayed();
		//boolean result=driver.findElement(By.linkText("Gmail")).isEnabled();
		boolean result = driver.findElement(By.cssSelector(".gb_n")).isEnabled();
		 System.out.println(result);
		Thread.sleep(5000);
		driver.close();
		
		
		// absolute Xpath----/html/body/div[1]/div[1]/div/div/div/div[1]/div/div[1]/a

	}

}
     // relative Xpath[@id="gb"]/div/div[1]/div/div[1]/a