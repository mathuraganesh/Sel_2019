package day4.week2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class EditLead {
@Test
	public void RunEditLead() throws InterruptedException {
	System.out.println("edit");
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		//driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElementByName("PASSWORD").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByXPath("//a[text()='Leads']").click();
		driver.findElementByXPath("//a[text()='Find Leads']").click();
		Thread.sleep(2000);
		driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("Mathura");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(5000);
		driver.findElementByXPath("(//a[@class='linktext'])[4]").click();
		if(driver.getTitle().contains("View Lead"))
			System.out.println("EditLead-Title Contains View Lead");
		else
			System.out.println("Title Does Not Contains View Lead");
		
		driver.findElementByXPath("//a[text()='Edit']").click();
		
		Thread.sleep(2000);
		driver.findElementById("updateLeadForm_companyName").clear();
		driver.findElementById("updateLeadForm_companyName").sendKeys("Capgemini");
		
		driver.findElementByClassName("smallSubmit").click();
		Thread.sleep(2000);
		
		String sCompanyname = driver.findElementById("viewLead_companyName_sp").getText();
		
		if(sCompanyname.contains("Capgemini"))
			System.out.println("EditLead-Company Name"+sCompanyname+" Changed Sucessfully");
		else
			System.out.println("Company Name Does not Changed");
		
		driver.close();

	}

}
