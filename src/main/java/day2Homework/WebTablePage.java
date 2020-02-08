package day2Homework;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTablePage {

	public static void main(String[] args) {
		//Interact with Checkboxes

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/table.html");
		
		WebElement eleTable = driver.findElementByXPath("//table[@id='table_id']");
		int iHeader=0;
		List<WebElement> eleHeader = eleTable.findElements(By.tagName("th"));
		for (int i = 0; i < eleHeader.size(); i++) {
			//System.out.println(eleHeader.get(i).getText());
			if(eleHeader.get(i).getText().equals("Progress")){
					
			}
		}
		int ColumnCount = eleHeader.size();
		//Get the count of number of columns
		//System.out.println("Number of Column Count:"+ColumnCount);
		
		List<WebElement> eleRow = eleTable.findElements(By.tagName("tr"));
		int RowsCount=eleRow.size();
		//Get the count of number of rows
		//System.out.println("Number of Row Count:"+RowsCount);
		
		//Get the progress value of 'Learn to interact with Elements'
        //Check the vital task for the least completed progress.
        for(int iRow=0;iRow<RowsCount;iRow++) {
        	List<WebElement> eleColumn = eleRow.get(iRow).findElements(By.tagName("td"));
        	for (int iColumn = 0; iColumn <eleColumn.size(); iColumn++) {
        		String sInteract = eleColumn.get(iColumn).getText();
        		if(sInteract.equals("Learn to interact with Elements")) {
					//System.out.println(iColumn);
        			
				}
        			break;
        			
			}
        }
	}

}
