package Week2.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LanuchBrower {
	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
ChromeDriver driver = new ChromeDriver();
driver.get("http://leaftaps.com/opentaps/control/login");
driver.manage().window().maximize();
driver.findElement(By.id("username")).sendKeys("demosalesManager");
driver.findElement(By.id("password")).sendKeys("crmsfa");
driver.findElement(By.className("decorativeSubmit")).click();
driver.findElement(By.linkText("CRM/SFA")).click();
driver.findElement(By.linkText("Leads")).click();
driver.findElement(By.linkText("Create Lead")).click();
driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TeastLeaf");
driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Divya");
driver.findElement(By.id("createLeadForm_lastName")).sendKeys("K");
//find the element 
WebElement tool=driver.findElement(By.id("createLeadForm_dataSourceId"));
//create obj for select class
Select drop=new Select(tool);
//select by visible text
drop.selectByVisibleText("Employee");
//find the element 
WebElement marketing=driver.findElement(By.id("createLeadForm_marketingCampaignId"));
//create obj for select class
Select objmarketing=new Select(marketing);
//select by value
objmarketing.selectByValue("9001");
//find the element 
WebElement ownership=driver.findElement(By.id("createLeadForm_ownershipEnumId"));
//create obj for select class
Select objownership=new Select(ownership);
//select by index
objownership.selectByIndex(5);
WebElement country=driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
Select objcountry=new Select(country);
objcountry.selectByVisibleText("India");
driver.findElement(By.name("submitButton")).click();

String Title=driver.getTitle();
System.out.println("TeastLeaf");

}
}