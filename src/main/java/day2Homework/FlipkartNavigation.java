package day2Homework;

import java.util.List;

import org.openqa.selenium.WebElement;

/*
 1. Open the Browser
2. Load the URL: https://www.flipkart.com/
3. Hover the cursor on Electronics
4. Click on Mi
5. Verify title contains Mi Mobile
6. Print all the phone names
7. Close the Browser
 */

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartNavigation {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromeDriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		//driver.manage().window().maximize();
		driver.findElementByXPath("//button[text()='✕']").click();
		
		WebElement eleMouseOver=driver.findElementByXPath("//span[text()='Electronics']");
		WebElement eleLinkText = driver.findElementByXPath("//*[@id=\"container\"]/div/div[2]/div/ul/li[1]/ul/li/ul/li[1]/ul/li[2]/a");
		Actions builder=new Actions(driver);
		builder.moveToElement(eleMouseOver).pause(300).click(eleLinkText).perform();
		Thread.sleep(3000);
		if(driver.getTitle().contains("Mi Mobile")) 
		System.out.println("The Title of the page contains Mi Mobile");
		else 
		System.out.println("The Title of the page does not contains Mi Mobile");	
		List<WebElement> eleMobileName = driver.findElementsByXPath("//*[@id=\"container\"]/div/div[3]/div[2]/div[1]/div[2]/div/div/div/div/a/div[2]/div[1]/div[1]");
		for (WebElement elePhoneName : eleMobileName) {
			System.out.println(elePhoneName.getText());
		}

}
}