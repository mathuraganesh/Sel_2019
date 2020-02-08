package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TC002_EditLead {
	
	
	public static ChromeDriver driver;
	public String sGetCompanyName;
	
	@Given("Launch the Browser1")
	public void launch_the_Browser() {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		driver=new ChromeDriver();
	}

	@Given("Load the URL1")
	public void load_the_URL() {
		driver.get("http://leaftaps.com/opentaps/control/main");
	}

	@Given("Maximise the Browser1")
	public void maximise_the_Browser() {
		driver.manage().window().maximize();
	}

	@Given("Set the Timeouts1")
	public void set_the_Timeouts() {
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Given("Enter Username as Demosalesmanager1")
	public void enter_Username_as_Demosalesmanager() {
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
	}

	@Given("Enter Password as crmsfa1")
	public void enter_Password_as_crmsfa() {
		driver.findElementByName("PASSWORD").sendKeys("crmsfa");
			}

	@When("Click on the Login Button1")
	public void click_on_the_Login_Button() {
		driver.findElementByClassName("decorativeSubmit").click();
			
	}

	@Given("Click CRMSFA Link1")
	public void click_CRMSFA_Link() throws InterruptedException {
		driver.findElementByLinkText("CRM/SFA").click();
		Thread.sleep(3000);
	}
	
	@Given("Click on the Leads Tab1")
	public void click_on_the_Leads_Tab() throws InterruptedException {
		driver.findElementByXPath("//a[text()='Leads']").click();
		Thread.sleep(3000);
	}

//''''''''''''''''''''''''''''''Edit Lead'''''''''''''''''''''''''''''''''''''''''''''''''''
		
		
		@Given("Click on the Find Lead Menu")
		public void click_on_the_Find_Lead_Menu() throws InterruptedException {
			
			driver.findElementByXPath("//a[text()='Find Leads']").click();
			Thread.sleep(2000);
		}

		@Given("Enter the First Name To Be Edit as (.*)")
		public void enter_Edit_First_Name(String fName) {
			driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys(fName);
		}
		
		@Given("Click on the Find Lead Button")
		public void click_on_the_Find_Lead_Button() throws InterruptedException {
			driver.findElementByXPath("//button[text()='Find Leads']").click();
			Thread.sleep(5000);
		}

		@Given("Click on the LeadID Link")
		public void click_on_the_LeadID_Link() {
			driver.findElementByXPath("(//a[@class='linktext'])[4]").click();
		}
		
		@Given("Click the Edit Button")
		public void click_the_Edit_Button() {
			driver.findElementByXPath("//a[text()='Edit']").click();
		}

		@Given("Enter Company Name To Be Update as (.*)")
		public void enter_Update_Company_Name_as(String cName) {
			driver.findElementById("updateLeadForm_companyName").clear();
			driver.findElementById("updateLeadForm_companyName").sendKeys(cName);
			sGetCompanyName = driver.findElementById("updateLeadForm_companyName").getAttribute("value");
			
			
		}

		@Given("Click on the Update Button")
		public void click_on_the_Update_Button() throws InterruptedException {
			driver.findElementByClassName("smallSubmit").click();
			Thread.sleep(2000);
		}

		@Given("Verify the Company Name")
		public void verify_the_Company_Name() {
			String sCompanyname = driver.findElementById("viewLead_companyName_sp").getText();
			
			if(sCompanyname.contains(sGetCompanyName))
				System.out.println("EditLead-Company Name:"+sCompanyname+" Changed Sucessfully");
			else
				System.out.println("EditLead-Company Name Does not Changed");

		}
		
		@Then("Close the Browser1")
		public void CloseBrowser() {
			//System.out.println("CloseBrowser");
			driver.close();
		}


}
