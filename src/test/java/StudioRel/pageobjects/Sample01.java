package StudioRel.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentReports;

public class Sample01 {
	
	
	public static WebElement element;
	
	
	
	public static WebElement login_email(WebDriver driver){
		
	 
		element = driver.findElement(By.xpath("//input[@id='username']"));

		return element;
		
	}
	
	public static WebElement password(WebDriver driver){
		
		element = driver.findElement(By.xpath("//input[@id='password']"));
		return element;
	}
	
	public static WebElement login_submitbtn(WebDriver driver){
		
		element = driver.findElement(By.xpath("//form[@id='login_form']/button"));
		return element;
	}
	
	
	public static WebElement menu(WebDriver driver){
		
		element = driver.findElement(By.xpath("//header/img[@id='toggle-menu-db']"));
		return element;
	}
	
	public static WebElement oppertuniy(WebDriver driver){
		
		element = driver.findElement(By.xpath("//header/div[@id='menu-db']/div[2]/div[23]/h3"));
		return element;
	}
	
	public static WebElement add_oppertunity(WebDriver driver){
		
		element = driver.findElement(By.xpath("//div[@id='OpportunitiesApplication']/div[1]/div/div[1]/button[1]"));
		return element;
	}
	
	public static WebElement pd_fname(WebDriver driver){
		
		element = driver.findElement(By.xpath("//input[@id='fname']"));
		return element;
	}

	public static WebElement pd_surname(WebDriver driver){
		
		element = driver.findElement(By.xpath("//input[@id='sname']"));
		return element;
	}
	
public static WebElement pd_email(WebDriver driver){
		
		element = driver.findElement(By.xpath("//input[@id='email']"));
		return element;
	}
	
public static WebElement pd_mobile(WebDriver driver){
	
	element = driver.findElement(By.xpath("//input[@id='mobile']"));
	return element;
}

public static WebElement pd_hometel(WebDriver driver){
	
	element = driver.findElement(By.xpath("//input[@id='htel']"));
	return element;
}

public static WebElement sele_method(WebDriver driver){
	
	WebDriverWait wait = new WebDriverWait(driver, 15);

	
	
	element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//form[starts-with(@id,'form__')]/div/div[1]/fieldset[2]/p[1]/select[@name='lead_method_id']")));
	
	return element;
}

public static WebElement sele_methodoption(WebDriver driver){
	
	WebDriverWait wait = new WebDriverWait(driver, 15);

   element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//form[starts-with(@id,'form__')]/div/div[1]/fieldset[2]/p[1]/select/option[2]")));
	
	//element = driver.findElement(By.xpath("//form[starts-with(@id,'form__')]/div/div[1]/fieldset[2]/p[1]/select/option[2]"));
	return element;
}

public static WebElement sle_eventtype(WebDriver driver){
	
	element = driver.findElement(By.xpath("//select[@name='opportunity_event_type_id']"));
	return element;
}

public static WebElement sele_eventtypeselection(WebDriver driver){
	
	element = driver.findElement(By.xpath("//select[@name='opportunity_event_type_id']/option[4]"));
	return element;
	
}

public static WebElement calendar(WebDriver driver){
	
	element = driver.findElement(By.xpath("//button[@class='ui-datepicker-trigger']"));
	return element;
}

public static WebElement selectmonth(WebDriver driver){
	
	element = driver.findElement(By.xpath("//div[@id='ui-datepicker-div']/div/div/select[1]/option[2]"));
	return element;
}

public static WebElement selectDate(WebDriver driver){
	
	element = driver.findElement(By.xpath("//div[@id='ui-datepicker-div']/table/tbody/tr[4]/td[4]"));
	return element;
}

public static WebElement derscription(WebDriver driver){
	
	element = driver.findElement(By.xpath("//div[@class='right-side-leads']/div[1]/table/tbody/tr/td[2]/select[@name='event_description[]']"));
	return element;
}

public static WebElement selectdecription(WebDriver driver){
	
	element = driver.findElement(By.xpath("//div[@class='right-side-leads']/div[1]/table/tbody/tr/td[2]/select[@name='event_description[]']/option[2]"));
	return element;
}

public static WebElement location_text(WebDriver driver){
	
	element = driver.findElement(By.xpath("//div[@class='right-side-leads']/div[1]/table/tbody/tr/td[3]/div/input"));
	return element;
}

public static WebElement starttime(WebDriver driver){
	
	element = driver.findElement(By.xpath("//div[@class='right-side-leads']/div[1]/table/tbody/tr/td[4]/select[@name='event_start_time[]']"));
	return element;
}

public static WebElement selectstarttime(WebDriver driver){
	
	element = driver.findElement(By.xpath("//div[@class='right-side-leads']/div[1]/table/tbody/tr/td[4]/select[@name='event_start_time[]']/option[4]"));
	return element;
}

public static WebElement finishtime(WebDriver driver){
	
	element = driver.findElement(By.xpath("//div[@class='right-side-leads']/div[1]/table/tbody/tr/td[5]/select[@name='event_finish_time[]']"));
	return element;
}

public static WebElement selectfinishtime(WebDriver driver){
	
	element = driver.findElement(By.xpath("//div[@class='right-side-leads']/div[1]/table/tbody/tr/td[5]/select[@name='event_finish_time[]']/option[4]"));
	return element;
}

public static WebElement hrsfield(WebDriver driver){
	
	element = driver.findElement(By.xpath("//div[@class='right-side-leads']/div[1]/table/tbody/tr/td[6]/input"));
	return element;
}

public static WebElement phfield(WebDriver driver){
	
	element = driver.findElement(By.xpath("//div[@class='right-side-leads']/div[1]/table/tbody/tr/td[7]/input"));
	return element;
}
	
public static WebElement VDfield(WebDriver driver){
	
	element = driver.findElement(By.xpath("//div[@class='right-side-leads']/div[1]/table/tbody/tr/td[8]/input"));
	return element;
}

public static WebElement mainfield(WebDriver driver){
	
	element = driver.findElement(By.xpath("//div[@class='right-side-leads']/div[1]/table/tbody/tr/td[9]/input"));
	return element;
}

public static WebElement notes(WebDriver driver){
	
	element = driver.findElement(By.xpath("//div[@class='right-side-leads']/div[2]/div[1]/fieldset/p/textarea"));
	return element;
}

public static WebElement prospect(WebDriver driver){
	
	element = driver.findElement(By.xpath("//div[@class='right-side-leads']/div[2]/div[2]/fieldset/p[1]/select[@name='opportunity_prospect_id']"));
	return element;
	
}

public static WebElement selectprospect(WebDriver driver){
	
	element = driver.findElement(By.xpath("//div[@class='right-side-leads']/div[2]/div[2]/fieldset/p[1]/select[@name='opportunity_prospect_id']/option[2]"));
    return element;	
}

public static WebElement assignto(WebDriver driver){
	
	element = driver.findElement(By.xpath("//div[@class='right-side-leads']/div[2]/div[2]/fieldset/p[2]/select[@name='assigned_to_id']"));
	return element;
}

public static WebElement selectassignto(WebDriver driver){
	
	element = driver.findElement(By.xpath("//div[@class='right-side-leads']/div[2]/div[2]/fieldset/p[2]/select[@name='assigned_to_id']/option[2]"));
	return element;
}

public static WebElement status(WebDriver driver){
	
	element = driver.findElement(By.xpath("//div[@class='right-side-leads']/div[2]/div[2]/fieldset/p[3]/select[@name='status']"));
	return element;
}

public static WebElement selectstatus(WebDriver driver){
	
	element = driver.findElement(By.xpath("//div[@class='right-side-leads']/div[2]/div[2]/fieldset/p[3]/select[@name='status']/option[2]"));
	return element;
}

public static WebElement submitbutn(WebDriver driver){
	
	element = driver.findElement(By.xpath("//div[@class='submitformbuttons validator1']/button"));
	return element;
}

public static WebElement verifyoperentry(WebDriver driver){
	
	element = driver.findElement(By.xpath("//table[@id='dt_OpportunitiesApplication_latest_all_all']/tbody/tr[1]/td[3]/a[2]"));
	return element;
}

public static WebElement refresh(WebDriver driver){
	
	element = driver.findElement(By.xpath("//div[@id='OpportunitiesApplication']/div[1]/div/div[1]/button[2]"));
	return element;
}

public static WebElement clickonrecord(WebDriver driver){
	
	element = driver.findElement(By.xpath("//table[@id='dt_OpportunitiesApplication_latest_all_all']/tbody/tr[1]/td[3]"));
	return element;
}

public static WebElement ac(WebDriver driver){
	
	element = driver.findElement(By.xpath("//div[@id='OpportunitiesApplication']/div[1]/div/div[1]/button[3]"));
	return element;
}

public static WebElement selectcheckbox(WebDriver driver){
	
	element = driver.findElement(By.xpath("//table[@id='dt_OpportunitiesApplication_latest_all_all']/tbody/tr[1]/td[10]/input"));
	return element;
}

public static WebElement assignoppertunity(WebDriver driver){
	
	element = driver.findElement(By.xpath("//div[@id='OpportunitiesApplication']/div[1]/div/div[3]/div[1]/button"));
	return element;
}

public static WebElement prospectnew(WebDriver driver){
	
	element = driver.findElement(By.xpath("//div[@id='OpportunitiesApplication']/div[1]/div/div[3]/div[2]/button"));
	return element;
}
public static WebElement pipeline(WebDriver driver){
	
	element = driver.findElement(By.xpath("//div[@id='OpportunitiesApplication']/div[1]/div/div[3]/div[3]/button"));
	return element;
}

public static WebElement letaerow(WebDriver driver){
	
	element = driver.findElement(By.xpath("	//div[@id='OpportunitiesApplication']/div/a[2]"));
	return element;

}





}


