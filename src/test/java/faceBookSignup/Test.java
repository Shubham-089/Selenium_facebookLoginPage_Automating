package faceBookSignup;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		
		driver.manage().window().maximize();
		
		WebElement firstName = driver.findElement(By.xpath("(//input[@name='firstname'])"));  
		firstName.sendKeys("Shubham");    
		
		WebElement lastName = driver.findElement(By.xpath("(//input[@class=\"inputtext _58mg _5dba _2ph-\"])[2]"));
		lastName.sendKeys("yetonde");
		
	 	WebElement date = driver.findElement(By.id("day"));
	 	Select dropDownDate = new Select(date);
	 	dropDownDate.selectByValue("27");
	 	
	 	
		WebElement month = driver.findElement(By.id("month"));
		Select dropDownMonth = new Select(month);
		dropDownMonth.selectByValue("12");
		
		
		WebElement year = driver.findElement(By.xpath("(//select[@class=\"_9407 _5dba _9hk6 _8esg\"])[3]"));
		Select dropDownYear = new Select(year);
		dropDownYear.selectByValue("2001");
		
		
		List<WebElement> genderList = driver.findElements(By.xpath("(//input[@type=\"radio\"])"));
		int n = 0;
		for(WebElement index : genderList) {
			if(n==1) {
				index.click();
			}
			n++;
		}
		
		WebElement mNumber = driver.findElement(By.xpath("(//input[@type=\"text\"])[5]"));
		 mNumber.sendKeys("7083458569");
		
		WebElement password = driver.findElement(By.xpath("//input[@type=\"password\"]"));
		password.sendKeys("Shubham123");
		
		WebElement submit = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		submit.click();
	}

}
