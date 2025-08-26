package Package1;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
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

public class Lab_3TNG {
	
	WebDriver driver;
  @Test(dataProvider = "dp")
  public void f(Integer n, String s) {
	  
	  driver.get("https://tutorialsninja.com/demo/index.php?");
	  
	  driver.findElement(By.linkText("Desktops")).click();
	    driver.findElement(By.linkText("Mac (1)")).click();
	    driver.findElement(By.id("input-sort")).click();
	    
	    WebElement dropdown = driver.findElement(By.id("input-sort"));
	    dropdown.findElement(By.xpath("//option[. = 'Name (A - Z)']")).click();
	    
	    driver.findElement(By.cssSelector(".button-group .hidden-xs")).click();
  }
  @Parameters("browser")
  @BeforeMethod
  public void beforeMethod(String brow) {
	  
	  if(brow.equalsIgnoreCase("chrome"))
	  {
	  WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
	  }
	  if(brow.equalsIgnoreCase("edge"))
	  {
	  WebDriverManager.edgedriver().setup();
		 driver=new EdgeDriver();
	  }
	  
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
