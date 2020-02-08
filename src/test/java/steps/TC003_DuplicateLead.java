package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TC003_DuplicateLead {
	
	
	public static ChromeDriver driver;
	public String sDuplicatename,sFirstname;
	
	@Given("Launch the Browser2")
	public void launch_the_Browser() {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		driver=new ChromeDriver();
	}

	@Given("Load the URL2")
	public void load_the_URL() {
		driver.get("http://leaftaps.com/opentaps/control/main");
	}

	@Given("Maximise the Browser2")
	public void maximise_the_Browser() {
		driver.manage().window().maximize();
	}

	@Given("Set the Timeouts2")
	public void set_the_Timeouts() {
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Given("Enter Username as Demosalesmanager2")
	public void enter_Username_as_Demosalesmanager() {
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
	}

	@Given("Enter Password as crmsfa2")
	public void enter_Password_as_crmsfa() {
		driver.findElementByName("PASSWORD").sendKeys("crmsfa");
			}

	@When("Click on the Login Button2")
	public void click_on_the_Login_Button() {
		driver.findElementByClassName("decorativeSubmit").click();
			
	}

	@Given("Click CRMSFA Link2")
	public void click_CRMSFA_Link() throws InterruptedException {
		driver.findElementByLinkText("CRM/SFA").click();
		Thread.sleep(3000);
	}
	
	@Given("Click on the Leads Tab2")
	public void click_on_the_Leads_Tab() throws InterruptedException {
		driver.findElementByXPath("//a[text()='Leads']").click();
		Thread.sleep(3000);
	}
	
	@Given("Click on the Find Lead Menu2")
	public void click_on_the_Find_Lead_Menu() throws InterruptedException {
		
		driver.findElementByXPath("//a[text()='Find Leads']").click();
		Thread.sleep(2000);
	}

	//''''''''''''''''''''''''''''''''''Duplicate Lead''''''''''''''''''''''''''''''''''''''''''''''''
		
		@Given("Click on the Find Lead Button2")
		public void click_on_the_Find_Lead_Button() throws InterruptedException {
			driver.findElementByXPath("//button[text()='Find Leads']").click();
			Thread.sleep(5000);
		}
	
		@Given("Click on the LeadID Link2")
		public void click_on_the_LeadID_Link() {
			driver.findElementByXPath("(//a[@class='linktext'])[4]").click();
		}
		
		@Given("Click on the Email Tab")
		public void Click_on_the_Email_Tab() {
			driver.findElementByXPath("//span[text()='Email']").click();
		}
		
		@Given("Enter the EmailID To Be Duplicate as (.*)")
		public void enter_the_EmailID_To_Be_Duplicate_as(String sEmailId) {
			driver.findElementByXPath("//input[@name='emailAddress']").sendKeys(sEmailId);
		}
		
		@When("Click on the Create Lead Button2")
		public void click_on_the_Create_Lead_Button() {
			driver.findElementByClassName("smallSubmit").click();
		}

		@Given("Get the FirstName")
		public void get_the_FirstName() {
			sFirstname = driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a").getText();
		}

		@Given("Click the Duplicate Button")
		public void click_the_Duplicate_Button() {
			driver.findElementByXPath("//a[text()='Duplicate Lead']").click();
		}

		@Given("Get the DuplicateName")
		public void get_the_DuplicateName() {
			sDuplicatename = driver.findElementById("viewLead_firstName_sp").getText();
		}

		@Then("Verify the DuplicateLead")
		public void verify_the_DuplicateLead() {
			if(sDuplicatename.equals(sFirstname))
				System.out.println("DuplicateLead-Confirmed the 'Duplicated Lead Name' is same as Captured Name:"+sDuplicatename);
			else
				System.out.println("DuplicateLead-Verification Failed 'Duplicated Lead Name' is not same as Captured Name:"+sDuplicatename);
			
		}

		@Then("Close the Browser2")
		public void CloseBrowser() {
			//System.out.println("CloseBrowser");
			driver.close();
		}


}
