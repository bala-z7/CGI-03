package Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
 
import io.github.bonigarcia.wdm.WebDriverManager;

public class Lab_3 {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/index.php?");
		driver.manage().window().setSize(new Dimension(1552, 832));
		
		driver.findElement(By.linkText("Desktops")).click();
	    driver.findElement(By.linkText("Mac (1)")).click();
	    driver.findElement(By.id("input-sort")).click();
	    
	    WebElement dropdown = driver.findElement(By.id("input-sort"));
	    dropdown.findElement(By.xpath("//option[. = 'Name (A - Z)']")).click();
	    
	    driver.findElement(By.cssSelector(".button-group .hidden-xs")).click();
	    
	    driver.quit();
		
	}
}
