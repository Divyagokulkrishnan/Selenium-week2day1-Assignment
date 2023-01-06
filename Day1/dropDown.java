package Week2.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Set the path
		//Set the path
		WebDriverManager.chromedriver().setup();
		//Launch the Browser
		ChromeDriver driver=new ChromeDriver();
		//load the URL
		driver.get("http://leafground.com/select.xhtml");
		//Maximized the window
		driver.manage().window().maximize();
		//find the element
		WebElement tool=driver.findElement(By.className("ui-selectonemenu"));
		//create obj for select class
		Select drop=new Select(tool);
		//select by index
		drop.selectByIndex(1);
		
		
		       //find the element
				WebElement tool1=driver.findElement(By.id("j_idt87:country_label"));
				//create obj for select class
				Select drop1=new Select(tool1);
				//select by value
				drop.selectByValue("India");
				
				//find the element
				WebElement tool2=driver.findElement(By.linkText("Select City"));
				//create obj for select class
				Select drop2=new Select(tool2);
				//select by Visible text
				drop2.selectByVisibleText("Chennai");
				
				//find the element
				WebElement tool3=driver.findElement(By.id("Select City"));
				//create obj for select class
				Select drop3=new Select(tool3);
				//select by Visible text
				drop2.selectByVisibleText("Selenium WebDriver");
				
			       //find the element
							WebElement tool4=driver.findElement(By.linkText("Select Language"));
							//create obj for select class
							Select drop4=new Select(tool4);
							//select by index
							drop.selectByIndex(1);
							
				
				
				
				
		
				
		
		

		
	}

}
