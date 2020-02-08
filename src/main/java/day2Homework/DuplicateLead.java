package day2Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElementByName("PASSWORD").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByXPath("//a[text()='Leads']").click();
		driver.findElementByXPath("//a[text()='Find Leads']").click();
		Thread.sleep(2000);
		
		driver.findElementByXPath("//span[text()='Email']").click();
		driver.findElementByXPath("//input[@name='emailAddress']").sendKeys("mathura@gmail.com");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(2000);
		
		String sFirstname = driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a").getText();
		driver.findElementByXPath("//table[@class='x-grid3-row-table']//tr/td/div/a[1]").click();
		
		driver.findElementByXPath("//a[text()='Duplicate Lead']").click();
		
		if(driver.getTitle().contains("Duplicate Lead"))
			System.out.println("Verified the Title as 'Duplicate Lead'");
		else
			System.out.println("Verification Failed the Title is not 'Duplicate Lead'");
		
		driver.findElementByClassName("smallSubmit").click();
		Thread.sleep(5000);
		
		String sDuplicatename = driver.findElementById("viewLead_firstName_sp").getText();
		
		if(sDuplicatename.equals(sFirstname))
			System.out.println("Confirmed the 'Duplicated Lead Name' is same as Captured Name:"+sDuplicatename);
		else
			System.out.println("Verification Failed 'Duplicated Lead Name' is not same as Captured Name:"+sDuplicatename);
		
		driver.close();
		
	}

}
