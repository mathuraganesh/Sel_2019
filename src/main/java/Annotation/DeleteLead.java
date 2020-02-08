package Annotation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import base.AnnotationProjectSpecificMethod;

public class DeleteLead extends AnnotationProjectSpecificMethod {
@Test
	public void RunDeleteLead() throws InterruptedException {
	System.out.println("@Test");
	System.out.println("delete");
		
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
		
		if(sNoRecord.equals("No records to display"))
			System.out.println("DeleteLead-Verified 'No records to display'This message confirms the successful deletion");
		else
			System.out.println("DeleteLead-Verification Failed 'No records to display' Text is not Displayed");
		//driver.close();
	}

}
