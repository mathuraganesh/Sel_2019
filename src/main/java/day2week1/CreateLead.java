package day2week1;




import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElementByName("PASSWORD").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		
		driver.findElementByLinkText("CRM/SFA").click();
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
		System.out.println("Title of the Page:"+title);
		driver.close();
		

	}

}
