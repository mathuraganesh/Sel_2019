package base;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import utils.ReadExcel;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class ExcelProjectSpecificMethod {
		public ChromeDriver driver;
		public String excelFileName;
	@Parameters({"url","UName","Pwd"})
	@BeforeMethod
	  public void fLogin(String url,String UserName,String password) {
		//System.out.println("@Parameters");
		System.out.println("@BeforeMethod");
		  System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			driver=new ChromeDriver();
			driver.get(url);
			driver.manage().window().maximize();
			
			driver.findElement(By.id("username")).sendKeys(UserName);
			driver.findElementByName("PASSWORD").sendKeys(password);
			driver.findElementByClassName("decorativeSubmit").click();
			
			driver.findElementByLinkText("CRM/SFA").click();
	  }
	  
	@AfterMethod
	  public void fBrowserClose() {
		System.out.println("@AfterMethod");
		  driver.close();
	  }


	  @BeforeClass
	  public void beforeClass() {
		  System.out.println("@BeforeClass");
	  }

	  @AfterClass
	  public void afterClass() {
		  System.out.println("@AfterClass");
	  }

	  

	  @AfterTest
	  public void afterTest() {
		  System.out.println("@AfterTest");
	  }

	  @BeforeSuite
	  public void beforeSuite() {
		  System.out.println("@BeforeSuite");
	  }

	  @AfterSuite
	  public void afterSuite() {
		  System.out.println("@AfterSuite");
	  }

@DataProvider(name="fetchdata")
	  public String[][] SendData() throws IOException {
	  	  System.out.println("@DataProvider");
	  	  /*String[][] data=new String[2][6];
	  	  
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
	  	  data[1][5]="9566188394";  */
	  	
	  	ReadExcel excel=new ReadExcel();
	  	String[][] data=excel.readExcel(excelFileName);
	  	  
	  	  	  
	  	  return data;
	  	  
	  	  }




}
