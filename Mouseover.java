package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.roicians.com");
		//actions used to Mouse movement.
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.cssSelector("#menu-item-65 > a:nth-child(1)"))).build().perform();
		driver.findElement(By.partialLinkText("SOFTWARE TES")).click();
	}
}
