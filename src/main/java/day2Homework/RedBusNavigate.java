package day2Homework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

/*
 1) Launch chrome and load URL: https://www.redbus.in/
2) Enter From (Chennai) and Tab
3) Enter To (Trichy) and Tab
4) Click on current date 
5) Click on Return Date
6) Click on current date
7) Click Search Buses
8) Click After 6 PM checkbox 
9) Click Bus Type (AC) Checkbox 
10) Print number of buses found 

 */
public class RedBusNavigate {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromeDriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.findElementByXPath("//input[@id='src']").sendKeys("Chennai");
		Thread.sleep(1000);
		driver.findElementByXPath("//input[@id='src']").sendKeys(Keys.TAB);
		driver.findElementByXPath("//input[@id='dest']").sendKeys("Trichy");
		Thread.sleep(1000);
		driver.findElementByXPath("//input[@id='dest']").sendKeys(Keys.TAB);
		Thread.sleep(1000);
		//WebElement wOnwardsDate = driver.findElementByXPath("(//table[@class='rb-monthTable first last']//tr[3]/td[3])[1]");
		//Actions builder=new Actions(driver);
		//builder.click(wOnwardsDate).perform();
		driver.findElementByXPath("//*[@id='rb-calendar_onward_cal']/table/tbody/tr[3]/td[3]").click();
		driver.findElementByXPath("//*[@id=\"search\"]/div/div[4]/div/label").click();
		driver.findElementByXPath("//div[@id='rb-calendar_return_cal']//tbody/tr[3]/td[5]").click();
		driver.findElementByXPath("//button[text()='Search Buses']").click();
		
		Thread.sleep(5000);
		driver.findElementByXPath("(//label[@for='dtAfter 6 pm'])[1]").click();
		driver.findElementByXPath("(//label[@for='bt_AC'])[1]").click();
		
		List<WebElement> wBusName = driver.findElementsByXPath("//div[@class='clearfix bus-item-details']//div[1]/div[1]/div[1]");
			
			for (WebElement sBusName : wBusName) {
				String text = sBusName.getText();
				System.out.println(text);
				
			}
			
		}

	}


