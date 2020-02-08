package day2week2;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dragable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/ChromeDriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/selectable.html");
		
		WebElement Item1 = driver.findElementByXPath("//li[text()='Item 1']");
		WebElement Item3 = driver.findElementByXPath("//li[text()='Item 3']");
		WebElement Item5 = driver.findElementByXPath("//li[text()='Item 5']");
		WebElement Item7 = driver.findElementByXPath("//li[text()='Item 7']");
		
		
		Actions builder=new Actions(driver);
		
		//First option
		/*builder.keyDown(Item1, Keys.CONTROL)
		.keyDown(Item3, Keys.CONTROL)
		.keyDown(Item5, Keys.CONTROL)
		.keyUp(Item7, Keys.CONTROL).perform();
		*/
		//Second option
		builder.keyDown(Keys.CONTROL).click(Item1).click(Item3).click(Item5)
		.click(Item7).keyUp(Keys.CONTROL).perform();
	}

}
