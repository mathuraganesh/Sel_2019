package excel;




import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import base.ExcelProjectSpecificMethod;
import utils.ReadExcel;

public class CreateLead extends ExcelProjectSpecificMethod{
	

@BeforeTest
  public void getFileName() {
	System.out.println("@BeforeTest");
	excelFileName="TC001_CreateLead";
	  }
@Test(dataProvider="fetchdata")
	public void RunCreateLead(String sComName,String sFName,String sLName,String sSource,String sEmailID,String sPhoneNO) throws InterruptedException {
	System.out.println("@Test");
	System.out.println("create");
	System.out.println(excelFileName);
	
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





}