package DataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.DataProviderProjectSpecificMethod;

public class DuplicateLead extends DataProviderProjectSpecificMethod {
@Test(dataProvider ="DuplicateLeadData")	
	public void RunDuplicateLead(String sEmailId) throws InterruptedException {
	System.out.println("@Test");
	System.out.println("dup");
	
		
		driver.findElementByXPath("//a[text()='Leads']").click();
		driver.findElementByXPath("//a[text()='Find Leads']").click();
		Thread.sleep(2000);
		
		driver.findElementByXPath("//span[text()='Email']").click();
		driver.findElementByXPath("//input[@name='emailAddress']").sendKeys(sEmailId);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(2000);
		
		String sFirstname = driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a").getText();
		driver.findElementByXPath("//table[@class='x-grid3-row-table']//tr/td/div/a[1]").click();
		
		driver.findElementByXPath("//a[text()='Duplicate Lead']").click();
		
		if(driver.getTitle().contains("Duplicate Lead"))
			System.out.println("DuplicateLead-Verified the Title as 'Duplicate Lead'");
		else
			System.out.println("DuplicateLead-Verification Failed the Title is not 'Duplicate Lead'");
		
		driver.findElementByClassName("smallSubmit").click();
		Thread.sleep(5000);
		
		String sDuplicatename = driver.findElementById("viewLead_firstName_sp").getText();
		
		if(sDuplicatename.equals(sFirstname))
			System.out.println("DuplicateLead-Confirmed the 'Duplicated Lead Name' is same as Captured Name:"+sDuplicatename);
		else
			System.out.println("DuplicateLead-Verification Failed 'Duplicated Lead Name' is not same as Captured Name:"+sDuplicatename);
		
		//driver.close();
		
	}
@DataProvider
public String[][] DuplicateLeadData(){
	String[][] data=new String[2][1];
	
	data[0][0]="mathura@gmail.com";
	
	data[1][0]="divya@gmail.com";
	
	return data;
}

}
