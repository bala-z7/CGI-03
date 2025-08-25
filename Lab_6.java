package Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Lab_6 {
    public static void main(String[] args) {
        
    	//Initialising Web Driver
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://tutorialsninja.com/demo/index.php?");
        
        // 1. Login
        driver.findElement(By.xpath("//*[@id='top-links']/ul/li[2]/a/span[1]")).click();
        driver.findElement(By.linkText("Login")).click();
        
        driver.findElement(By.id("input-email")).sendKeys("reylm@gmail.com");
        driver.findElement(By.id("input-password")).sendKeys("12344321@");
        driver.findElement(By.xpath("//*[@id='content']/div/div[2]/div/form/input")).click();
        
        //2. Components tab
        driver.findElement(By.linkText("Components")).click();
        
        //3. Monitors
        driver.findElement(By.linkText("Monitors (2)")).click();
        
        // 4. 25 from drop-down
        driver.findElement(By.id("input-limit")).click();
        driver.findElement(By.xpath("//*[@id='input-limit']/option[2]")).click();
        
        //5. Add to cart (1st item)
        driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[1]/div/div[2]/div[2]/button[1]")).click();
        
        JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)"); 
		JavascriptExecutor js1=(JavascriptExecutor)driver;
		js1.executeScript("window.scrollBy(0,1500)");
 
        
        //6. Specification tab
        driver.findElement(By.linkText("Specification")).click();

        
        //7. Verify specifications text
        WebElement verifySpecs = driver.findElement(By.xpath("//*[@id='tab-description']/p"));
        String specText = verifySpecs.getText();
        
        if (specText.contains("Clockspeed")) {
            System.out.println("Specs verified: " + specText);
        } else {
            System.out.println("Verification failed. Found: " + specText);
        } 
        
        //8. Add to wishlist
        driver.findElement(By.xpath("//button[@data-original-title='Add to Wish List']")).click();

        //9. Verify Message
        WebElement VerifyMsg = driver.findElement(By.linkText("Apple Cinema 30"));
        String Msg = VerifyMsg.getText();
        
        if (Msg.contains("Apple Cinema 30")) {
        	System.out.println("Message verified!");
        } else {
        	System.out.println("verification failed");
        } 
        
        //10. Mobile in search field
        driver.findElement(By.xpath("//*[@id=\"search\"]/input")).click();
        driver.findElement(By.xpath("//*[@id=\"search\"]/input")).sendKeys("Mobile");
        
        //11. Search button
        driver.findElement(By.xpath("//*[@id=\"search\"]/span/button")).click();
        
        //12. Check box
        driver.findElement(By.id("description")).click();
        driver.findElement(By.xpath("//*[@id=\"button-search\"]")).click();
        
        //13. Click on link
        driver.findElement(By.linkText("HTC Touch HD")).click();
        
        //14. Find text box, clear default value and update
        Object textbox = driver.findElement(By.xpath("//*[@id=\"input-quantity\"]"));
        ((WebElement) textbox).click();
        ((WebElement) textbox).clear();
        ((WebElement) textbox).sendKeys("3");
        
        //15. Add to cart
        driver.findElement(By.xpath("//*[@id=\"button-cart\"]")).click();
        
        //17.Vie cart 
        driver.findElement(By.xpath("//*[@id=\"cart\"]/button")).click();
        
        WebElement VerifyMsg2 = driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[2]/a"));
        String Msg2 = VerifyMsg2.getText();
        
        if (Msg2.contains(" HTC Touch HD ")) {
        	System.out.println("Message verified!");
        } else {
        	System.out.println("verification failed");
        } 
        
        driver.findElement(By.xpath("//*[@id=\"cart\"]/ul/li[2]/div/p/a[2]")).click();
        
        //19. Checkout
        driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[2]/a")).click();
        
        //20. Dropdown
        driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/span[1]")).click();
        
        //21. Logout
        driver.findElement(By.linkText("Logout")).click();
        
        //driver.quit();
    }
}
