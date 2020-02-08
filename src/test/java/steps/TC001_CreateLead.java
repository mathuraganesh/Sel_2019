package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TC001_CreateLead {
	public static ChromeDriver driver;
	public String sGetFirstName,sFirstname,sDuplicatename;
			
//'''''''''''''''''''''''''''Launch the Application'''''''''''''''''''''''''''''''''''''''''''''''''	
	@Given("Launch the Browser")
	public void launch_the_Browser() {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		driver=new ChromeDriver();
	}

	@Given("Load the URL")
	public void load_the_URL() {
		driver.get("http://leaftaps.com/opentaps/control/main");
	}

	@Given("Maximise the Browser")
	public void maximise_the_Browser() {
		driver.manage().window().maximize();
	}

	@Given("Set the Timeouts")
	public void set_the_Timeouts() {
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Given("Enter Username as Demosalesmanager")
	public void enter_Username_as_Demosalesmanager() {
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
	}

	@Given("Enter Password as crmsfa")
	public void enter_Password_as_crmsfa() {
		driver.findElementByName("PASSWORD").sendKeys("crmsfa");
			}

	@When("Click on the Login Button")
	public void click_on_the_Login_Button() {
		driver.findElementByClassName("decorativeSubmit").click();
			
	}

	@Given("Click CRMSFA Link")
	public void click_CRMSFA_Link() throws InterruptedException {
		driver.findElementByLinkText("CRM/SFA").click();
		Thread.sleep(3000);
	}
	
	@Given("Click on the Leads Tab")
	public void click_on_the_Leads_Tab() throws InterruptedException {
		driver.findElementByXPath("//a[text()='Leads']").click();
		Thread.sleep(3000);
	}

//'''''''''''''''''''''''''''''''Create Lead'''''''''''''''''''''''''''''''''''''''''
	

	@Given("Click on the Create Lead Menu")
	public void click_on_the_Create_Lead_Menu() {
		driver.findElementByLinkText("Create Lead").click();
	}

	@Given("Enter the Company Name as (.*)")
	public void enter_the_Company_Name(String Compname) {
		driver.findElementById("createLeadForm_companyName").sendKeys(Compname);
		
	}

	@Given("Enter the First Name as (.*)")
	public void enter_the_First_Name(String Firstname) {
		driver.findElementById("createLeadForm_firstName").sendKeys(Firstname);
		sGetFirstName = driver.findElementById("createLeadForm_firstName").getAttribute("value");
		
	}

	@Given("Enter the Last Name as (.*)")
	public void enter_the_Last_Name(String Lastname) {
		driver.findElementById("createLeadForm_lastName").sendKeys(Lastname);
	}
	
	@Given("Select the Source as (.*)")
	public void enter_the_Source(String sSource) {
		WebElement eleSource=driver.findElementById("createLeadForm_dataSourceId");
		Select source=new Select(eleSource);
		source.selectByValue(sSource);
	}
	
	@Given("Enter the EmailID as (.*)")
	public void enter_the_EmailID(String sEmailID) {
		driver.findElementById("createLeadForm_primaryEmail").sendKeys(sEmailID);
	}
	
	@Given("Enter the PhoneNO as (.*)")
	public void enter_the_PhoneNO(String sPhoneNO) {
		driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys(sPhoneNO);
	}

	@When("Click on the Create Lead Button")
	public void click_on_the_Create_Lead_Button() {
		driver.findElementByClassName("smallSubmit").click();
	}

	@Then("Verify Lead Creation is success")
	public void verify_Lead_Creation_is_success() throws InterruptedException {
		Thread.sleep(3000);
		//String title = driver.getTitle();
		String sFirstName = driver.findElementById("viewLead_firstName_sp").getText();
		if(sGetFirstName.equals(sFirstName))
			System.out.println("First Name-"+sFirstName+" Contains in 'View Lead'");
		else
			System.out.println("First Name-"+sFirstName+" Doesn't Contains in 'View Lead'");
	}
	
	@Then("Close the Browser")
	public void CloseBrowser() {
		//System.out.println("CloseBrowser");
		driver.close();
	}

}
