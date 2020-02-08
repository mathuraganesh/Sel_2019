package day2week2;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvancedXpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/ChromeDriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.findElementByXPath("//form[@id='login']/p/input").sendKeys("DemoSalesManager");   //grandparent to grand child via parent
		driver.findElementByXPath("//input[@id='username']/following::input").sendKeys("crmsfa");  //parent sibiling downwards
		driver.findElementByXPath("//input[@class='decorativeSubmit']").click();
		
		////input[@class='inputLogin']/preceding-sibling::label[1]
		
		driver.findElementByXPath("//a[contains(text(),'CRM/SFA')]").click();
		driver.findElementByXPath("//a[text()='Create Lead']").click();
		
		driver.findElementByXPath("//input[@id='createLeadForm_companyName']").sendKeys("IBM");
		driver.findElementByXPath("//input[@id='createLeadForm_companyName']/following::input[2]").sendKeys("mathura");
		driver.findElementByXPath("//input[@id='createLeadForm_companyName']/following::input[3]").sendKeys("ganesh");
		//driver.findElementByXPath("//input[@name='submitButton']").click();
		

	}

}
