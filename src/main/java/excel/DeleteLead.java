package excel;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import base.ExcelProjectSpecificMethod;

public class DeleteLead extends ExcelProjectSpecificMethod {
	
@BeforeTest
public void getFileName() {
	System.out.println("@BeforeTest");
	excelFileName="TC004_DeleteLead";
	}

@Test(dataProvider ="fetchdata")
	public void RunDeleteLead(String sPhoneNo) throws InterruptedException {
	System.out.println("@Test");
	System.out.println("delete");
	System.out.println(excelFileName);
		
		driver.findElementByXPath("//a[text()='Leads']").click();
		driver.findElementByXPath("//a[text()='Find Leads']").click();
		Thread.sleep(2000);
		
		driver.findElementByXPath("//span[text()='Phone']").click();
		driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys(sPhoneNo);
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
@DataProvider
public String[][] DeleteLeadData(){
	String[][] data=new String[2][1];
	
	data[0][0]="9962066735";
	
	data[1][0]="9566188394";
	
	return data;
}

}
