package day4.week2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DeleteLead {
	public ChromeDriver driver;
@Test
	public void RunDeleteLead() throws InterruptedException {
	System.out.println("delete");
	
		
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("http://leaftaps.com/opentaps/control/main");
			//driver.manage().window().maximize();
			driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
			driver.findElementByName("PASSWORD").sendKeys("crmsfa");
			driver.findElementByClassName("decorativeSubmit").click();
			driver.findElementByLinkText("CRM/SFA").click();
			driver.findElementByXPath("//a[text()='Leads']").click();
			driver.findElementByXPath("//a[text()='Find Leads']").click();
			Thread.sleep(2000);
			driver.findElementByXPath("//span[text()='Phone']").click();
			driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys("9962066735");
			driver.findElementByXPath("//button[text()='Find Leads']").click();
			Thread.sleep(2000);
			String sLeadID = driver.findElementByXPath("//table[@class='x-grid3-row-table']//tr/td/div/a[1]").getText();
			driver.findElementByXPath("//table[@class='x-grid3-row-table']//tr/td/div/a[1]").click();
			driver.findElementByXPath("//a[text()='Delete']").click();
			Thread.sleep(2000);
			driver.findElementByXPath("//a[text()='Find Leads']").click();
			Thread.sleep(2000);
			driver.findElementByXPath("//label[text()='Lead ID:']/following::input").sendKeys(sLeadID);
			driver.findElementByXPath("//button[text()='Find Leads']").click();
			Thread.sleep(5000);
			String sNoRecord = driver.findElementByXPath("//div[@class='x-paging-info']").getText();
			if (sNoRecord.equals("No records to display"))
				System.out.println("DeleteLead-Verified 'No records to display'This message confirms the successful deletion");
			else
				System.out.println("DeleteLead-Verification Failed 'No records to display' Text is not Displayed");
			//driver.close();
			try {
				}
		 finally {
			driver.close();
		}
	}

}
