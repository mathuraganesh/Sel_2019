package projectday;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SimpleTestCase {
	/*Launch URL: https://acme-test.uipath.com/account/login
	 * 2) Enter UserName (kumar.testleaf@gmail.com) and TAB
	   3) Enter Password (leaf@12)
       4) Click Login
       5) Mouse Over on Vendors
       6) Click Search Vendor
       7) Enter Vendor Name (Blue Lagoon)
       8) Click Search
       9) Find the Country Name based on the Vendor
       10) Click Log Out
       11) Close browser
	 * 
	 */
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://acme-test.uipath.com/account/login");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElementById("email").sendKeys("kumar.testleaf@gmail.com",Keys.TAB);
		driver.findElementById("password").sendKeys("leaf@12");
		driver.findElementById("buttonLogin").click();
		
		WebElement eleVendor = driver.findElementByXPath("(//button[@class='btn btn-default btn-lg'])[4]");
		//WebElement eleSearchVendor = driver.findElementByLinkText("Search for Vendor");
		
		Actions builder=new Actions(driver);
		builder.moveToElement(eleVendor).pause(100).click(driver.findElementByXPath("//a[text()='Search for Vendor']")).perform();
		
		driver.findElementById("vendorName").sendKeys("Blue Lagoon");
		
		driver.findElementById("buttonSearch").click();
		Thread.sleep(3000);
		String sCountryName = driver.findElementByXPath("//table[@class='table']//tr/td[5]").getText();
		System.out.println(sCountryName+"-Country Name based on the Vendor-Blue Lagoon");
		
		/*driver.findElementById("buttonShowAll").click();
		Thread.sleep(3000);
		//WebElement eleTable = driver.findElementByClassName("table");
		List<WebElement> eleRows =driver.findElements(By.xpath("//table[@class='table']//tr/td[1]"));
		for (int i = 0; i < eleRows.size(); i++) {
			String sVendor = eleRows.get(i).getText();
			System.out.println(sVendor);
			Thread.sleep(3000);
			if(sVendor.equals("Blue Lagoon")){
				String sCountryName = driver.findElementByXPath("//table[@class='table']//tr["+(i+2)+"]/td[5]").getText();
				//String sCountryName = driver.findElementByXPath("//table[@class='table']//tr/td[5]").getText();
				System.out.println(sCountryName+"-Country Name based on the Vendor-"+sVendor);
				break;
			
			}*/
		
		driver.findElementByLinkText("Log Out").click();
		driver.close();
			
		}
		
		

	}

