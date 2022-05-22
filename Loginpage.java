package Week2.Day1.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Loginpage {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.name("USERNAME")).sendKeys("DemoSalesManager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		WebElement cmpyname = driver.findElement(By.id("createLeadForm_companyName"));
		cmpyname.sendKeys("Ithoughts");

		
		  WebElement Fname = driver.findElement(By.id("createLeadForm_firstName"));
		  Fname.sendKeys("Sundar"); 
		  Select local = new Select(driver.findElement(By.id("createLeadForm_dataSourceId")));
		  local.selectByVisibleText("Conference"); 
		  WebElement Flname = driver.findElement(By.name("firstNameLocal"));
		  Flname.sendKeys("SundarAshok");
//		  /createLeadForm_lastNameLocal
		  
		  WebElement lname = driver.findElement(By.id("createLeadForm_lastName"));
		  lname.sendKeys("Ashok");
		  WebElement Sname = driver.findElement(By.id("createLeadForm_personalTitle"));
		  Sname.sendKeys("Karu");
		  
		  WebElement title = driver.findElement(By.id("createLeadForm_generalProfTitle"));
		  title.sendKeys("A"); 
		  WebElement AR =driver.findElement(By.id("createLeadForm_annualRevenue")); 
		  AR.sendKeys("100000");
		  //departmentName WebElement Deptname =
		  WebElement Deptname = driver.findElement(By.id("createLeadForm_departmentName"));
		  Deptname.sendKeys("Testing");
		 //id="createLeadForm_description"
		  
		  WebElement Desc = driver.findElement(By.id("createLeadForm_description"));
		  Desc.sendKeys("CReating Lead forms"); //id="createLeadForm_primaryEmail"
		  
		  WebElement email = driver.findElement(By.id("createLeadForm_primaryEmail"));
		  email.sendKeys("sundarashok1994@gmail.com");
		 
		  //name="generalStateProvinceGeoId"
		  
		  Select State = new
		  Select(driver.findElement(By.name("generalStateProvinceGeoId")));
		  State.selectByVisibleText("Arkansas");
		  
		  driver.findElement(By.name("submitButton")).click();
		  
		  
		  //Edit Form
		  driver.findElement(By.linkText("Edit")).click();
		  driver.findElement(By.name("description")).clear();
		  driver.findElement(By.name("description")).sendKeys("Form has been filled");
		  
		  //name="submitButton"
		  driver.findElement(By.name("submitButton")).click();
		  
				  
		  
		  
		

	}

}
