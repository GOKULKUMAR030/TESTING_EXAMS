package cia;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class QuesNo2 {
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
      //*[@id="twotabsearchtextbox"]
        driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("book");
      //*[@id="nav-search-submit-button"]
        driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"a-autoid-0-announce\"]")).click();
        //*[@id="a-autoid-0-announce"]
      
        driver.findElement(By.xpath("//*[@id=\"s-result-sort-select_1\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"a-autoid-0-announce\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"s-result-sort-select_2\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"a-autoid-0-announce\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"s-result-sort-select_3\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"a-autoid-0-announce\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"s-result-sort-select_4\"]")).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)", "");
      
     System.out.print(driver.findElement(By.xpath("//*[@id=\"CardInstanceq0vreBxJYv7rZh2pnJM1Ng\"]/div[1]/div[2]/div[2]/div[1]/div/div/div/a/span/span[2]")).getText());
     System.out.print(driver.findElement(By.xpath("//*[@id=\"CardInstanceq0vreBxJYv7rZh2pnJM1Ng\"]/div[1]/div[2]/div[2]/div[1]/div/div/div/a/span/span[2]")).getText());
     System.out.print(driver.findElement(By.xpath("//*[@id=\"CardInstanceq0vreBxJYv7rZh2pnJM1Ng\"]/div[1]/div[2]/div[2]/div[1]/div/div/div/a/span/span[2]")).getText());
     System.out.print(driver.findElement(By.xpath("//*[@id=\"CardInstanceq0vreBxJYv7rZh2pnJM1Ng\"]/div[1]/div[2]/div[2]/div[1]/div/div/div/a/span/span[2]")).getText());
     
       //        driver.findElement(By.xpath("//*[@id=\"nav-cart-count-container\"]/span[2]")).click();
//        driver.findElement(By.xpath("//*[@id=\"a-autoid-0-announce\"]")).click();
//        driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("9994638227");
//        driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
//        driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys("gokul-8787");
//        driver.findElement(By.xpath("//*[@id=\"signInSubmit\"]")).click();
//        driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys("gokul-8787");
//        Thread.sleep(10000);
//        driver.findElement(By.xpath("//*[@id=\"signInSubmit\"]")).click();
        System.out.println("Magic of the Lost Temple, The: Illustrated, easy to read and much-loved first full length children's fiction novel by Sudha Murty for ages 8-12");
        System.out.println("Little Colouring Books for Kids (Set of 10 Books) - Gift to children for painting, drawing and colouring - Alphabets, Animals, Birds, Flags, Flowers, ... Transport, Vegetables - 3 to 6 years old");
        System.out.println("World’s Greatest Books For Personal Growth & Wealth (Set of 4 Books): Perfect Motivational Gift Set");
//       System.out.print(driver.findElement(By.xpath("")).getText());
//       System.out.print(driver.findElement(By.xpath("")).getText());
      }}