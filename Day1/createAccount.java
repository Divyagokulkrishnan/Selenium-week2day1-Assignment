package Week2.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class createAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Set the path
				WebDriverManager.chromedriver().setup();
				//Launch the Browser
				ChromeDriver driver=new ChromeDriver();
				//load the URL
				driver.get("http://leaftaps.com/opentaps/control/login");
				//Maximized the window
				driver.manage().window().maximize();
				//enter the userName
				driver.findElement(By.id("username")).sendKeys("demosalesManager");
				//enter the password
				driver.findElement(By.id("password")).sendKeys("crmsfa");
				//click on submit button
				driver.findElement(By.className("decorativeSubmit")).click();
				driver.findElement(By.linkText("CRM/SFA")).click();
				driver.findElement(By.linkText("Accounts")).click();
				driver.findElement(By.linkText("Create Account")).click();
				//enter the account name
				driver.findElement(By.id("accountName")).sendKeys("Debit Limited Account");
				//enter the description
				driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
				//enter the local name
				driver.findElement(By.id("groupNameLocal")).sendKeys("Divya");
				//enter the site name
				driver.findElement(By.id("officeSiteName")).sendKeys("Gokul Krishnan");
				//enter the Annual Revenue 
				driver.findElement(By.id("annualRevenue")).sendKeys("10000");
			//find the element
				WebElement tool=driver.findElement(By.name("industryEnumId"));
				//create obj for select class
				Select drop=new Select(tool);
				//select by visible text
				drop.selectByVisibleText("Computer Hardware");
				//find the ownership element
				WebElement ownership=driver.findElement(By.name("ownershipEnumId"));
				// Create the object
				Select objowner=new Select(ownership);
				objowner.selectByVisibleText("S-Corporation");
				//find the Employee
				//WebElement Employee=driver.findElement(By.name(""));
				// Create the object
				//Select object  employee=new Select(Employee);
				//objowner.selectByVisibleText("LEAD_EMPLOYEE");
				
				//find the element
				WebElement tool1=driver.findElement(By.id("marketingCampaignId"));
				//create object  for select class
				Select drop1=new Select(tool1);
				//select by index
				drop1.selectByIndex(6);		
				//find the element
				WebElement tool2=driver.findElement(By.id("generalStateProvinceGeoId"));
				//create object  for select class
				Select drop2=new Select(tool2);
				//select by value
				drop2.selectByValue("TX");	
				//click on account 
				driver.findElement(By.linkText("Create Account")).click();
				
						
				
						
						
						
				
			
				
				
				
	}

}
