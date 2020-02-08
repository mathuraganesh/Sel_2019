package projectday;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

/*
 1. Launch URL: https://www.amazon.in/
2. Type "oneplus 7 pro mobiles" in Search Box and Enter
3. Print the price of the first resulting mobile
4. Click on the Mobile (First resulting) image
5. Switch to the new window
6. Print the number of customer ratings
7. Click 'Add to Cart'
8. Confirm "Added to Cart" text message appeared
9. Click to Proceed to Buy
10. Confirm the title is "Amazon Sign In"
11. Click Continue (without entering mobile number / email)
12. Verify the error message: Enter your email or mobile phone number
13. Close both browsers
 */
public class MediumTestCase {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElementById("twotabsearchtextbox").sendKeys("oneplus 7 pro mobiles");
		driver.findElementByXPath("(//input[@class='nav-input'])[1]").click();
		Thread.sleep(3000);
		//String sPrice = driver.findElementByXPath("//*[@id=\"search\"]/div[1]/div[2]/div/span[4]/div[1]/div[1]/div/span/div/div/div[2]/div[2]/div/div[2]/div[1]/div/div[1]/div/div/a/span[1]/span[2]/span[2]").getText();
		String sPrice = driver.findElementByXPath("(//span[@class='a-price-whole'])[1]").getText();
		System.out.println("Price of the first resulting mobile-"+sPrice);
		//driver.findElementByXPath("//*[@id=\"search\"]/div[1]/div[2]/div/span[4]/div[1]/div[1]/div/span/div/div/div[2]/div[1]/div/div/span/a/div/img").click();
		driver.findElementByXPath("(//img[@class='s-image'])[1]").click();
		Thread.sleep(3000);
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> allWindows=new ArrayList<>();
		allWindows.addAll(windowHandles);
		driver.switchTo().window(allWindows.get(1));
		String sCustomerRating = driver.findElementByXPath("//span[@id='acrCustomerReviewText']").getText();
		System.out.println("Number of customer ratings-"+sCustomerRating);
		driver.findElementById("add-to-cart-button").click();
		Thread.sleep(3000);
		String sAddedcart = driver.findElementByXPath("//div[@id='huc-v2-order-row-confirm-text']/h1").getText();
		if(sAddedcart.equals("Added to Cart"))
			System.out.println("Confirm 'Added to Cart' text message appeared");
		else
			System.out.println("Confirm 'Added to Cart' text message not appeared");
		
		
		driver.findElementById("hlb-ptc-btn-native").click();
		Thread.sleep(3000);
		
		if(driver.getTitle().equals("Amazon Sign In"))
			System.out.println("Confirm the title is 'Amazon Sign In'");
		else
			System.out.println("Confirm the title is not 'Amazon Sign In'");
		
		driver.findElementById("ap_email").clear();
		driver.findElementById("continue").click();
		
		String sErrorMessage = driver.findElementByXPath("(//div[@class='a-alert-content'])[2]").getText();
		if(sErrorMessage.equals("Enter your email or mobile phone number"))
			System.out.println("Verified the error message: Enter your email or mobile phone number");
		else
			System.out.println("Verification Failed the error message: Enter your email or mobile phone number");
		
		driver.quit();
		
		
		

	}

}
