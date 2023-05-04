package cia;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class QuesNo1 {
	public static void main( String[] args ) throws InterruptedException
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.amazon.in/");
        driver.manage().window().maximize();
        System.out.println("TITLE OF THE WEBSITE IS "+driver.getTitle());
        if(driver.getTitle().equals("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in")) {
        	System.out.println("TESTCASE_02  :  TITLE OF THE GIVEN WEBSITE MATCHES ");
        }
        driver.findElement(By.xpath("//*[@id=\"nav-cart-count-container\"]/span[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"a-autoid-0-announce\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("9994638227");
        driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys("gokul-8787");
        driver.findElement(By.xpath("//*[@id=\"signInSubmit\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys("gokul-8787");
        Thread.sleep(10000);
        driver.findElement(By.xpath("//*[@id=\"signInSubmit\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"a-autoid-1\"]/span/input")).click();
        driver.findElement(By.xpath("//*[@id=\"sw-gtc\"]/span/a")).click();
        driver.findElement(By.xpath("//*[@id=\"a-autoid-0-announce\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"quantity_3\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"sc-buy-box-ptc-button\"]/span/input")).click();
      //*[@id="ap_email"]
      //*[@id="continue"]
      //*[@id="a-autoid-1"]/span/input
      //*[@id="sw-gtc"]/span/a
      //*[@id="a-autoid-0-announce"]
      //*[@id="sc-subtotal-amount-activecart"]/span
      //*[@id="a-autoid-3"]/span/input
      //*[@id="sc-buy-box-ptc-button"]/span/input
      //driver.findElement(By.xpath("//*[@id=\"sc-active-7a2140bd-9623-4d66-bed1-c358a584fd1b\"]/div[4]/div/div[3]/div[1]/span[2]/span/input")).click();
      
      
        
     }
}
