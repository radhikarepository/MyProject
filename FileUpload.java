package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();		
		driver.get("https://www.roicians.com/career/");
		driver.findElement(By.id("field-U7H2lPxWxSPqWeq")).sendKeys("C:\\Users\\sudha\\Downloads\\sunset.pixil");		
	}
}
