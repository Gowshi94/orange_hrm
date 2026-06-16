package orangeSite;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Orange {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		// log in
		WebElement user = driver.findElement(By.name("username"));
		user.sendKeys("Admin");
		WebElement pass = driver.findElement(By.name("password"));
		pass.sendKeys("admin123");
		WebElement logIn = driver.findElement(By.xpath("//button[@type='submit']"));
		logIn.click();

		// add employee
		// WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		WebElement pim = driver.findElement(By.xpath("//a[@href='/web/index.php/pim/viewPimModule']"));
		pim.click();
		WebElement addEmployee = driver.findElement(By.xpath("//button[normalize-space()='Add']"));
		addEmployee.click();
		WebElement firstName = driver.findElement(By.name("firstName"));
		firstName.sendKeys("John");
		WebElement middleName = driver.findElement(By.name("middleName"));
		middleName.sendKeys("Nick");
		WebElement lastName = driver.findElement(By.name("lastName"));
		lastName.sendKeys("Smith");
		WebElement toggle= driver.findElement(By.xpath("//span[contains(@class,'oxd-switch-input')]"));
		toggle.click();
		WebElement uname =driver.findElement(By.xpath("//div[@class='oxd-form-row'][2]//div[contains(@class,'oxd-grid-item')]//input"));
		uname.sendKeys("john@gmail.com");
		WebElement status = driver.findElement(By.xpath("//input[@type='radio' and @value='1']"));
		if (!status.isSelected()) {
			status.click();
		}

		List<WebElement> pword = driver.findElements(By.xpath("//input[@type='password']"));
		pword.get(0).sendKeys("john@123");
		pword.get(1).sendKeys("john@123");

		WebElement saveBtn = driver.findElement(By.xpath("//button[@type='submit']"));
		saveBtn.click();
		//leave apply
		//WebElement leave = driver.findElement(By.xpath("//a[@href='/web/index.php/leave/viewLeaveModule']"));
		//leave.click();
		//WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		//WebElement more =wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//li[conta")));
		//more.click();
		//WebElement assign = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@class,'--more')]")));
		//assign.click();
		
		
		
	}
}
