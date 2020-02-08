package Annotation;




import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import base.AnnotationProjectSpecificMethod;

public class CreateLead extends AnnotationProjectSpecificMethod{
@Test  //Cook and Deliver
	public void RunCreateLead() throws InterruptedException {
	System.out.println("@Test");
	System.out.println("create");
		
		driver.findElementByLinkText("Create Lead").click();
		
		driver.findElementById("createLeadForm_companyName").sendKeys("IBM");
		driver.findElementById("createLeadForm_firstName").sendKeys("Mathura");
		driver.findElementById("createLeadForm_lastName").sendKeys("Ganesh");
		
		WebElement eleSource=driver.findElementById("createLeadForm_dataSourceId");
		Select source=new Select(eleSource);
		source.selectByValue("LEAD_EMPLOYEE");
		
		WebElement eleCurrency=driver.findElementById("createLeadForm_currencyUomId");
		Select currency=new Select(eleCurrency);
		currency.selectByVisibleText("AUD - Australian Dollar");
		
		WebElement eleIndustry=driver.findElementById("createLeadForm_industryEnumId");
		Select Industry=new Select(eleIndustry);
		List<WebElement> allOptions=Industry.getOptions();
		int size=allOptions.size();
		Industry.selectByIndex(size-1);
		
		driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("9962066735");
		driver.findElementById("createLeadForm_primaryEmail").sendKeys("mathura@gmail.com");
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
