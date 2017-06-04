package TestCase;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import org.testng.annotations.BeforeMethod;

import java.io.IOException;

import org.apache.bcel.classfile.Utility;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.GetScreenOrientation;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;

import helping.*;
import StudioRel.pageobjects.Sample01;

public class Create_Opertunity {
	
	ExtentReports report;
	ExtentTest logger; 
	WebDriver driver;
	private WebElement Webelement;

	
  @Test
  public void Testcase01() throws InterruptedException, IOException {
	  
	  Sample01.login_email(driver).sendKeys(Constant.username);
	  logger.log(LogStatus.PASS, "Username Entered");
	  logger.log(LogStatus.INFO, "Entered username is :-" +Constant.username);
	  
	  
	  Sample01.password(driver).sendKeys(Constant.password);
	  logger.log(LogStatus.INFO, "Entered password is :- " +Constant.password);
	  logger.log(LogStatus.PASS, "Password entered");
	  
	  Thread.sleep(3000);
	  
	  Sample01.login_submitbtn(driver).click();
	  
	  System.out.println("Logged in");
	  
	  String Screenshotpath = GetScreenShot.capture(driver, "Logged in");
	  logger.log(LogStatus.PASS, "Snapshot below :"+logger.addScreenCapture(Screenshotpath));
	 
      
	  Thread.sleep(7000);
	  Sample01.menu(driver).click();
	  logger.log(LogStatus.PASS, "Clicked on menu buton");
	  
	  Thread.sleep(3000);
	  
	  Sample01.oppertuniy(driver).click();
	  
	  logger.log(LogStatus.INFO, "Clicked on oppertuniy link ");
	  
	  String path = GetScreenShot.capture(driver, "Logged in");
	  logger.log(LogStatus.PASS, "Snapshot below :"+logger.addScreenCapture(path));
	  
	  
	  Thread.sleep(11000);
	  
	  Sample01.add_oppertunity(driver).click();
	  
	  logger.log(LogStatus.INFO, "Clicked on add oppertuniy icon");
      
	  Thread.sleep(3000);
	  Sample01.pd_fname(driver).sendKeys("SAM");
	  logger.log(LogStatus.INFO, "Username is SAM");
	  Sample01.pd_surname(driver).sendKeys("David");
	  logger.log(LogStatus.INFO, "Surname is David");
	  int email= genrator.emailgen();
	  
	  String mail = "Sam"+email+"@mailinator.com";
	  
	  Sample01.pd_email(driver).sendKeys(mail);
	  
	  logger.log(LogStatus.INFO, "Entered email is :-  " +mail);
	  Sample01.pd_mobile(driver).sendKeys("78945612355");
	  Sample01.pd_hometel(driver).sendKeys("12345678945");
	  
	  Thread.sleep(3000);
	  

	  
	  Thread.sleep(5000);
      
      Sample01.calendar(driver).click();
      Sample01.selectmonth(driver).click();
      Sample01.selectDate(driver).click();
    
      Sample01.location_text(driver).sendKeys("test location");
      
      Sample01.hrsfield(driver).sendKeys("2");
      
      Sample01.phfield(driver).click();
      Sample01.VDfield(driver).click();
      Sample01.mainfield(driver).click();
      
      Sample01.notes(driver).sendKeys("This is testing purpose notes please ignore it..");
  
      
      
      Thread.sleep(3000);
      
      String path1 = GetScreenShot.capture(driver, "Logged in");
	  logger.log(LogStatus.PASS, "Snapshot below :"+logger.addScreenCapture(path1));
      
      
      Sample01.submitbutn(driver).click();
      
      System.out.println("Clicked in submit button");
      
      Thread.sleep(2000);
      
      Alert alert = driver.switchTo().alert();
      alert.accept();
      
      Thread.sleep(3000);
      
      Sample01.refresh(driver).click();
      
      
      Thread.sleep(3000);
      
      
      if(Sample01.verifyoperentry(driver).getText().contains(mail)){
    	  
    	 
    	  logger.log(LogStatus.PASS, "Added entry is displaying in the list, please check the below screenshot");
    	  System.out.println("Verified The Entry");  
    	
    	  
      }else{
    	  
    	  logger.log(LogStatus.FAIL, "Added entry is not displaying in the list, please check the below screenshot");
    	  
    	  logger.log(LogStatus.FAIL, "Title verification");
    	  
    	  System.out.println("Entry Not Verified");
    	  
    	  
      }
      
      
        Sample01.clickonrecord(driver).click();
        
        if(Sample01.refresh(driver).isDisplayed()&&Sample01.add_oppertunity(driver).isDisplayed()&&Sample01.ac(driver).isDisplayed()){
        	
        	logger.log(LogStatus.PASS, "Element Visible");
        	
        	String path2 = GetScreenShot.capture(driver, "Logged in");
      	  logger.log(LogStatus.PASS, "Snapshot below :"+logger.addScreenCapture(path2));
      	  
      	  System.out.println("Clicked on record");
        	
        }else{
        	
            logger.log(LogStatus.FAIL, "Element is not displayed");	
            System.out.println("Clicked failed on record");
        }
        
       
        
        Thread.sleep(5000);
        
        Sample01.selectcheckbox(driver).click();
        
        Thread.sleep(2000);
        
        Sample01.letaerow(driver).click();
        
        Thread.sleep(3000);
        
        if(Sample01.assignoppertunity(driver).isDisplayed()&&Sample01.prospectnew(driver).isDisplayed()&&Sample01.pipeline(driver).isDisplayed()){
        	
        	logger.log(LogStatus.PASS, "Element Visible");
        	
        }else{
        	
        	logger.log(LogStatus.FAIL, "Elelment is not visible");
        	
        }
        
        driver.findElement(By.xpath("//header/div[4]")).click();
        
        String path2 = GetScreenShot.capture(driver, "Logged in");
  	    logger.log(LogStatus.PASS, "Snapshot below :"+logger.addScreenCapture(path2));
        
        Thread.sleep(3000);
        
        driver.findElement(By.xpath("//header/div[4]/div/div/div[3]/a")).click();
        
        logger.log(LogStatus.PASS, "Successfully Logged out");
        
	  
  }
  @BeforeMethod
  public void beforeMethod() throws InterruptedException {
	  
	  report=new ExtentReports("Reports\\TestReport.html");

	  logger=report.startTest("VerifyBlogTitle");
	  
	  logger.log(LogStatus.INFO, "Browser Started");
	  
	  
	  
	  ChromeOptions options = new ChromeOptions();
	 options.setBinary("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe"); 
	  System.setProperty("webdriver.chrome.driver", "F:\\Automation Tools\\Functional Tool\\Drivers\\Chrome Driver\\chromedriver.exe");
	  driver = new ChromeDriver(options);
	//  driver = new ChromeDriver();
	  
	  driver.manage().window().maximize();
	  driver.get(Constant.url);
	  
	  System.out.println("Browser Launched");

	  
	  Thread.sleep(5000);	  
	  
  }

  @AfterMethod
  public void afterMethod() {
	  

	  report.endTest(logger);
	  report.flush();
	  report.close();
	  System.out.println("Its End Of TestCase");
	  driver.get("G:\\Practice_Sets\\StudioRel\\Reports\\TestReport.html");

  }

}
