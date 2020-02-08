package day2Homework;

import java.util.List;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkPage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Link.html");
		
		//Play with HyperLinks
		//Go to Home Page
		driver.findElementByLinkText("Go to Home Page").click();
		System.out.println(driver.getCurrentUrl());
		driver.navigate().back();
		
		//Find where am supposed to go without clicking me?
		String attribute = driver.findElementByLinkText("Find where am supposed to go without clicking me?").getAttribute("href");
		System.out.println("Verified the Link supposed to go without clicking:"+attribute);
		//Output: http://leafground.com/pages/Button.html
		
		//Verify am I broken?
		driver.findElementByLinkText("Verify am I broken?").click();
		if(driver.getTitle().contains("HTTP Status 404 – Not Found"))
			System.out.println("Verified the Link is Broken");
		else
			System.out.println("Verified the Link is Not Broken");
		driver.navigate().back();
		
		//Go to Home Page (Interact with same link name)
		driver.findElementByXPath("(//a[text()='Go to Home Page'])[2]").click();
		System.out.println("Go the HomePage:"+driver.getTitle());
		driver.findElementByLinkText("HyperLink").click();
		System.out.println("Interact with same link name:"+driver.getTitle());
		
		//How many links are available in this page?
		List<WebElement> byTagName = driver.findElementsByTagName("a");
		System.out.println("links are available in this page:"+byTagName.size()); 
		//Output-links are available in this page:6
		for (WebElement LinkName : byTagName) {
			System.out.println(LinkName.getText());
			
			//Output
			/*
			Go to Home Page
			Find where am supposed to go without clicking me?
			Verify am I broken?
			Go to Home Page
			How many links are available in this page?
			*/
		}
	}
	
}
