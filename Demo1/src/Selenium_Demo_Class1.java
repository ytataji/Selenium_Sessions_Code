import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Selenium_Demo_Class1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int i=10;
		
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\tyerubandhi\\Downloads\\Selenium_Demo\\chromedriver.exe");  
		  Webdriver driver=new ChromeDriver(); 
		 
		    driver.close();
		      
		// Launch website  
		    
		    driver.navigate().to("https://www.techlistic.com/p/selenium-practice-form.html");  
		   
		 // Click on the search text box and send value  
		    driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Tataji");  
		          
		    // Click on the search button  
		    driver.findElement(By.xpath("//button[@name='submit']")).click();  
		    
		    driver.close();
		    
		    
		    

	}

}
