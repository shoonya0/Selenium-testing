package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailPart2 {

		public static void main(String[] args) throws InterruptedException {
			
			WebDriver driver = new ChromeDriver();
			driver.get("https://mail.google.com");
			driver.manage().window().maximize();
			
			WebElement email = driver.findElement(By.xpath("//*[@id=\"identifierId\"]"));
			email.sendKeys("arshsinghpatel1458@gmail.com");
			
			WebElement nextButton = driver.findElement(By.xpath("//span[text()='Next']"));
			nextButton.click();
			
			Thread.sleep(9000);
			
			WebElement password = driver.findElement(By.xpath("//*[@name='Passwd']"));
			password.sendKeys("singh@1234");
			
			WebElement nextButton1 = driver.findElement(By.xpath("//span[text()='Next']"));
			nextButton1.click();
			
			Thread.sleep(7000);
			
			WebElement composeButton = driver.findElement(By.xpath("//div[text()='Compose']"));
			composeButton.click();
			if(composeButton.isDisplayed()) {
				System.out.println("New mail window is opened successfully");
			}else {
				System.out.println("New mail window is not opened");
			}
			
			Thread.sleep(7000);
			
			WebElement toSend = driver.findElement(By.xpath("//*[@aria-label='To recipients']"));
			toSend.sendKeys("akashrajjnv2002@gmail.com");
			
			Thread.sleep(7000);
			
			WebElement subject = driver.findElement(By.xpath("//*[@name='subjectbox']"));
			subject.sendKeys("testing mail");
			
			Thread.sleep(7000);
			
			WebElement textInBody = driver.findElement(By.xpath("//*[@role=\"textbox\"]"));
			textInBody.sendKeys("asdfghjklzxcvbnmqwertyuiop");
			
			Thread.sleep(7000);
			
			WebElement sendButton = driver.findElement(By.xpath("//*[@aria-label=\"Send ‪(Ctrl-Enter)‬\"]"));
			sendButton.click();
			
			Thread.sleep(3000);
			driver.quit();			
			
		}
}