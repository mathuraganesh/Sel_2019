package DataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.DataProviderProjectSpecificMethod;

public class EditLead extends DataProviderProjectSpecificMethod {
@Test(dataProvider ="EditLeadData")
	public void RunEditLead(String fName,String cName) throws InterruptedException {
	System.out.println("@Test");
	System.out.println("edit");
	
		
		driver.findElementByXPath("//a[text()='Leads']").click();
		driver.findElementByXPath("//a[text()='Find Leads']").click();
		Thread.sleep(2000);
		driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys(fName);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(5000);
		driver.findElementByXPath("(//a[@class='linktext'])[4]").click();
		if(driver.getTitle().contains("View Lead"))
			System.out.println("EditLead-Title Contains View Lead");
		else
			System.out.println("EditLead-Title Does Not Contains View Lead");
		
		driver.findElementByXPath("//a[text()='Edit']").click();
		
		Thread.sleep(2000);
		driver.findElementById("updateLeadForm_companyName").clear();
		driver.findElementById("updateLeadForm_companyName").sendKeys(cName);
		
		driver.findElementByClassName("smallSubmit").click();
		Thread.sleep(2000);
		
		String sCompanyname = driver.findElementById("viewLead_companyName_sp").getText();
		
		if(sCompanyname.contains(cName))
			System.out.println("EditLead-Company Name:"+sCompanyname+" Changed Sucessfully");
		else
			System.out.println("EditLead-Company Name Does not Changed");
		
		//driver.close();

	}
@DataProvider
public String[][] EditLeadData(){
	  
	  String[][] data=new String[2][2];
	  
	  data[0][0]="Mathura";
	  data[0][1]="HCL";
	  
	  data[1][0]="Divya";
	  data[1][1]="Citi Bank";
	  
	  return data;
	  
	  
}


}
