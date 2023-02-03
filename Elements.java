package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Elements {

	public static void main(String[] args) {
		// This class is to select a dropdown value 
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.roicians.com/career/");
		Select obj = new Select(driver.findElement(By.id("field-jHhehcNamzHL47m")));
		//obj.selectByVisibleText("Automation Testing Trainer");
		//obj.selectByValue("Automation Testing Trainer");
		obj.selectByIndex(3);
	}

}
