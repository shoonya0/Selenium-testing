package Automation;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Gmail {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://mail.google.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		WebElement createAccountLink = driver.findElement(By.xpath("//*[text()='Create account']"));
		createAccountLink.click();
		
		Thread.sleep(1000);
		
		WebElement forMyPersonalUseOption = driver.findElement(By.xpath("//*[text()='For my personal use']"));
		forMyPersonalUseOption.click();
        
        Thread.sleep(1000);
        
        WebElement firstName = driver.findElement(By.id("firstName"));
        firstName.sendKeys("Arsh");
        
        WebElement lastName = driver.findElement(By.id("lastName"));
        lastName.sendKeys("Singh");
        
        Thread.sleep(1000);
        
        WebElement nextButton = driver.findElement(By.xpath("//span[text()='Next']"));
        nextButton.click();
        
        Thread.sleep(10000);
        
        WebElement month = driver.findElement(By.xpath("//*[@id=\"month\"]"));
        Select monthSelect = new Select(month);
        monthSelect.selectByIndex(4);
        
        WebElement day = driver.findElement(By.id("day"));
        day.sendKeys("11");
        
        WebElement year = driver.findElement(By.id("year"));
        year.sendKeys("2003");
        
        WebElement gender= driver.findElement(By.xpath("//*[@id=\"gender\"]"));
        Select genderSelect= new Select(gender);
        genderSelect.selectByIndex(2);
        
        Thread.sleep(1000);
        
        WebElement nextButton1 = driver.findElement(By.xpath("//span[text()='Next']"));
        nextButton1.click();
        
        Thread.sleep(10000);
        
        WebElement createGmailAddress = driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div[2]/div/div/div/form/span/section/div/div/div/div[1]/div/div[1]/div/div[1]/input"));
        createGmailAddress.sendKeys("arshsinghpatel1458");
        
        Thread.sleep(1000);
        
        WebElement nextButton2 = driver.findElement(By.xpath("//span[text()='Next']"));
        nextButton2.click();
		
        Thread.sleep(9000);
        
        WebElement password = driver.findElement(By.xpath("//*[@name='Passwd']"));
        password.sendKeys("singh@1234");
        
        WebElement confirmPassword = driver.findElement(By.xpath("//*[@name='PasswdAgain']"));
        confirmPassword.sendKeys("singh@1234");
        
        WebElement nextButton3 = driver.findElement(By.xpath("//span[text()='Next']"));
        nextButton3.click();
        
	}
}