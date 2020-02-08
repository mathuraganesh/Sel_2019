package DataProvider;




import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.DataProviderProjectSpecificMethod;

public class CreateLead extends DataProviderProjectSpecificMethod{

@Test(dataProvider="CreateLeadSendData")
	public void RunCreateLead(String sComName,String sFName,String sLName,String sSource,String sEmailID,String sPhoneNO) throws InterruptedException {
	System.out.println("@Test");
	System.out.println("create");
		
		driver.findElementByLinkText("Create Lead").click();
		
		driver.findElementById("createLeadForm_companyName").sendKeys(sComName);
		driver.findElementById("createLeadForm_firstName").sendKeys(sFName);
		driver.findElementById("createLeadForm_lastName").sendKeys(sLName);
		
		WebElement eleSource=driver.findElementById("createLeadForm_dataSourceId");
		Select source=new Select(eleSource);
		source.selectByValue(sSource);
		
		WebElement eleCurrency=driver.findElementById("createLeadForm_currencyUomId");
		Select currency=new Select(eleCurrency);
		currency.selectByVisibleText("AUD - Australian Dollar");
		
		WebElement eleIndustry=driver.findElementById("createLeadForm_industryEnumId");
		Select Industry=new Select(eleIndustry);
		List<WebElement> allOptions=Industry.getOptions();
		int size=allOptions.size();
		Industry.selectByIndex(size-1);
		
		driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys(sPhoneNO);
		driver.findElementById("createLeadForm_primaryEmail").sendKeys(sEmailID);
		for(WebElement eachoptions:allOptions) {
			String text = eachoptions.getText();
			//System.out.println(text);
		}
		driver.findElementByClassName("smallSubmit").click();
		Thread.sleep(3000);
		String title = driver.getTitle();
		System.out.println("CreateLead-Title of the Page:"+title);
		
		

	}


@DataProvider
public String[][] CreateLeadSendData() {
	  //System.out.println("@DataProvider");
	  String[][] data=new String[2][6];
	  
	  data[0][0]="IBM";
	  data[0][1]="Matura";
	  data[0][2]="Ganesh";
	  data[0][3]="LEAD_EMPLOYEE";
	  data[0][4]="mathura@gmail.com";
	  data[0][5]="9962066735";
	  
	  data[1][0]="CGI";
	  data[1][1]="Divya";
	  data[1][2]="Lakshmi";
	  data[1][3]="LEAD_EMPLOYEE";
	  data[1][4]="divya@gmail.com";
	  data[1][5]="9566188394";
	  
	  	  
	  return data;
	  
	  }

}