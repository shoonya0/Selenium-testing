package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class MamaEarth {
	WebDriver driver;

    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
        driver.get("https://mamaearth.in/");
        driver.manage().window().maximize();
    }

    @Test(priority = 1)
    public void verifyHomePage() {
        String expectedTitle = "Mamaearth";
        Assert.assertTrue(driver.getTitle().contains(expectedTitle), "Home page title does not contain 'Mamaearth'");
        System.out.println("URL: " + driver.getCurrentUrl());
        System.out.println("Title: " + driver.getTitle());
    }

    @Test(priority = 2)
    public void selectFaceWash() throws InterruptedException {
    	
    	Thread.sleep(3000);
    	
        WebElement faceMenu = driver.findElement(By.xpath("(//a[text()='Face'])[1]"));
        faceMenu.click();
        
        WebElement faceWashOption = driver.findElement(By.xpath("//a[text()='Face Wash']"));
        faceWashOption.click();
        
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("window.scrollBy(0,500)");
        
        Thread.sleep(6000);
        
        List<WebElement> faceWashProducts = driver.findElements(By.xpath("//*[@id=\"__next\"]/div[4]/div[3]/div[6]/div/div/button[4]"));
        Assert.assertTrue(faceWashProducts.size() > 0, "Tea Tree Face Wash not found");
        faceWashProducts.get(0).click();
    }

    @Test(priority = 3)
    public void selectConditioner() throws InterruptedException {
    	
    	Thread.sleep(3000);
    	
        WebElement hairMenu = driver.findElement(By.xpath("(//a[text()='Hair'])[1]"));
        hairMenu.click();
        
        WebElement conditionerOption = driver.findElement(By.xpath("//a[text()='Conditioner']"));
        conditionerOption.click();
        
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("window.scrollBy(0,600)");
        
        Thread.sleep(6000);

        List<WebElement> hennaConditioners = driver.findElements(By.xpath("//*[@id=\"__next\"]/div[4]/div[3]/div[5]/div/div/button[8]"));
        Assert.assertTrue(hennaConditioners.size() > 0, "Henna Conditioner not found");
        hennaConditioners.get(0).click();

        Thread.sleep(3000);
        
//        WebElement notifyMe = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[4]/div/div[1]/div/div[5]/div/div/div[4]/button"));
//        notifyMe.click();
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}

