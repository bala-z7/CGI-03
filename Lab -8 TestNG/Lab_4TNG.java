package Package1;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
 
import io.github.bonigarcia.wdm.WebDriverManager;

public class Lab_4TNG {
	WebDriver driver;
  @Test(dataProvider = "dp")
  public void f(Integer n, String s) {
	  
	  driver.get("https://tutorialsninja.com/demo/index.php?");
	  
	  String Title = driver.getTitle();
		
		if (Title.contains("Your Store")) {
			System.out.println("Title verified!");
		} else {
			System.out.println("Verfication failed!");
		}
		
		driver.findElement(By.linkText("Desktops")).click();
	    driver.findElement(By.linkText("Mac (1)")).click();
	    
	    String Heading = driver.getTitle();
	    if (Heading.contains("Mac")) {
	    	System.out.println("Heading verified!");
	    } else {
	    	System.out.println("Verification failed");
	    }
	    
	    WebElement dropdown = driver.findElement(By.id("input-sort"));
	    dropdown.findElement(By.xpath("//option[. = 'Name (A - Z)']")).click();
	    
	    driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div/div/div[2]/div[2]/button[1]")).click();
	    driver.findElement(By.name("search")).click();
	    driver.findElement(By.name("search")).sendKeys("Mobile");
	    driver.findElement(By.cssSelector(".fa-search")).click();
	    	    
	    driver.findElement(By.id("description")).click();
	    
	    driver.findElement(By.id("button-search")).click();
	    
	    driver.findElement(By.name("search")).clear();
	    driver.findElement(By.name("search")).sendKeys("Monitors");
	    driver.findElement(By.cssSelector(".fa-search")).click();
  }
  @BeforeMethod
  public void beforeMethod() {
	  
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.manage().window().setSize(new Dimension(1552, 832));
  }

  @AfterMethod
  public void afterMethod() {
	  
	  driver.quit();
  }


  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void beforeSuite() {
  }

  @AfterSuite
  public void afterSuite() {
  }

}
