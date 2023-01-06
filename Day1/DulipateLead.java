package Week2.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DulipateLead {

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
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TeastLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Divya");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("K");
		//Enter the fristName Field(local)
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Durga");
		//Enter the LastName Field(local)
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Krishnan");
		//Enter department field 
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Software Engineering");
		//Enter the description field 
		driver.findElement(By.id("createLeadForm_description")).sendKeys("I am Happy to learn Selenium web driver");
		//Enter the email id 
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("divya4111995@gmail.com");
		//Click on Create button
		driver.findElement(By.name("submitButton")).click();
		//get the title
		String title =driver.getTitle();
		System.out.println("testleaf");
		//click on duplicate lead
		driver.findElement(By.linkText("Duplicate Lead")).click();
		WebElement code =driver.findElement(By.id("createLeadForm_companyName"));
				code.clear();
				code.sendKeys("Zoho");
		WebElement name=driver.findElement(By.id("createLeadForm_firstName"));
		name.clear();
		name.sendKeys("Divya Gokulkrishnan");
		driver.findElement(By.name("submitButton")).click();
		//resulting of page
		String title1 =driver.getTitle();
		System.out.println("testleaf");
		

		
			

	}

}
