package Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
 
import io.github.bonigarcia.wdm.WebDriverManager;

public class Lab_4 {
public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/index.php?");
		driver.manage().window().setSize(new Dimension(1552, 832));
	
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
}
