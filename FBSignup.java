package Week2.Day1.Selenium;

import java.awt.List;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FBSignup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//https://en-gb.facebook.com/
		//div[@class='_6ltg']/a
		//input[@name="firstname"]
		//input[@name="lastname"]
		//input[@name="reg_email__"]
		
		//div[@class='uiStickyPlaceholderInput uiStickyPlaceholderEmptyInput']/input[@type='password']
		//span/select[@title='Day']
		//span/select[@title='Day']/following-sibling::select[@title='Month']
		//span/select[@title='Day']/following-sibling::select[@title='Year']
		//checkbox
		//span[@data-name='gender_wrapper']//input[@value='1']
		//span[@data-name='gender_wrapper']//input[@value='2']
		//span[@data-name='gender_wrapper']//input[@value='-1']
		//submit
		//div[@class='_1lch']/button[@type='submit']
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.findElement(By.xpath("//div[@class='_6ltg']/a")).click();
		driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("Sundar");
		driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("Ashok");
		driver.findElement(By.xpath("//input[@name=\"reg_email__\"]")).sendKeys("9943294670");
		driver.findElement(By.xpath("//div[@class='uiStickyPlaceholderInput uiStickyPlaceholderEmptyInput']/input[@type='password']")).sendKeys("Radnus@1994");
		Select s1=new Select(driver.findElement(By.xpath("//span/select[@title='Day']")));
		s1.selectByVisibleText("15");
		Select s2=new Select(driver.findElement(By.xpath("//span/select[@title='Day']/following-sibling::select[@title='Month']")));
		s2.selectByVisibleText("Mar");
		Select s3=new Select(driver.findElement(By.xpath("//span/select[@title='Day']/following-sibling::select[@title='Year']")));
		s3.selectByVisibleText("1994");
		
		WebElement maleRadioBtn = driver.findElement (By.xpath("//span[@data-name='gender_wrapper']//input[@value='1']"));
		maleRadioBtn.click();
		WebElement fmaleRadioBtn = driver.findElement (By.xpath("//span[@data-name='gender_wrapper']//input[@value='1']"));
		WebElement customRadioBtn = driver.findElement (By.xpath("//span[@data-name='gender_wrapper']//input[@value='1']"));
		WebElement signup = driver.findElement (By.xpath("//div[@class='_1lch']/button[@type='submit']"));
		signup.click();
		System.out.println(driver.getTitle());
	

		


		
			
			
		}
		
		
		

	}


