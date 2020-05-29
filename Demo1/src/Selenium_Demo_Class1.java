import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Wait;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.Collections;

public class Selenium_Demo_Class1 {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception{
		
		// TODO Auto-generated method stub
	
		
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\tyerubandhi\\Downloads\\Selenium_Demo\\chromedriver.exe");  
		 // WebDriver driver=new ChromeDriver();
	/*	  driver.get("http://demo.guru99.com/popup.php");			
	        driver.manage().window().maximize();		
	                		
	driver.findElement(By.xpath("//*[contains(@href,'popup.php')]")).click();			
	        		
	        String MainWindow=driver.getWindowHandle();		
	        		
	        // To handle all new opened window.				
	            Set<String> s1=driver.getWindowHandles();		
	        Iterator<String> i1=s1.iterator();		
	        		
	        while(i1.hasNext())			
	        {		
	            String abc=i1.next();		
	            		
	            if(!MainWindow.equalsIgnoreCase(abc))			
	            {    		
	                 
	                    // Switching to Child window
	                    driver.switchTo().window(abc);	                                                                                                           
	                    driver.findElement(By.name("emailid")).sendKeys("gaurav.3n@gmail.com");                			
	                    
	                    driver.findElement(By.name("btnLogin")).click();			
	                                 
				// Closing the Child Window.
	                        driver.close();		
	            }		
	        }		
	        // Switching to Parent window i.e Main Window.
	            driver.switchTo().window(MainWindow);	*/
		 //Assignment question : suppose i have 5 windows...How can i switch to 4th window
		  
		 //Frames
	            
	    	   /* driver.get("http://demo.guru99.com/test/guru99home/"); 
	    	       // navigates to the page consisting an iframe

	    	       driver.manage().window().maximize();
	    	     
	    	       //driver.switchTo().frame("a077aa5e"); //switching the frame by ID
	    	      driver.switchTo().frame(1);//Through indexing--frame index starts from zero
	    	 List<WebElement>  listofframes=   driver.findElements(By.xpath("//iframe"));
	    	 System.out.println(listofframes.size());//50 size
	    	 driver.switchTo().frame(49);
	    	 driver.switchTo().parentFrame();
	    	  driver.switchTo().frame(0);
	    	    WebElement e1=driver.findElement(By.xpath("//iframe[@name='a077aa5e']"));
	    	     
	    	      driver.switchTo().frame(e1);
	    	      
	    	      
	    			//System.out.println("********We are switch to the iframe*******");
	         		driver.findElement(By.xpath("html/body/a/img")).click();
	      		    //Clicks the iframe
	           
	      			System.out.println("*********We are done***************");*/
		  
		  //Dropdown handling
		 
		  /*
			driver.get("http://demo.guru99.com/test/newtours/register.php");
			

			Select drpCountry = new Select(driver.findElement(By.xpath("//select[@name='country']")));
			drpCountry.selectByVisibleText("ANTARCTICA");
		
			Thread.sleep(10000);
			//Selecting Items in a Multiple SELECT elements
			
			driver.get("file:///C:/Users/tyerubandhi/Documents/multiselect.html");
			Select fruits = new Select(driver.findElement(By.xpath("//select[@id='cars']")));
			fruits.selectByVisibleText("Volvo");
			fruits.selectByIndex(2);*/
		/*	//Handling dynamic tables
		  driver.get("http://demo.guru99.com/test/web-table-element.php");         
	        //No.of Columns
	        List<WebElement>  col = driver.findElements(By.xpath("//div[@id='leftcontainer']/table/thead/tr/th"));
	        System.out.println("No of cols are : " +col.size()); 
	        //No.of rows 
	        List<WebElement>  rows = driver.findElements(By.xpath("//div[@id='leftcontainer']/table/tbody/tr")); 
	        System.out.println("No of rows are : " + rows.size());
	        //suppose i want to get 3rd row 3rd cell data
	    WebElement e1=       driver.findElement(By.xpath("//div[@id='leftcontainer']/table/tbody/tr[3]/td[3]"));
	      String s1=  e1.getText();
	      System.out.println(s1);
	      
	      //How will you pick of Prev Close value of particular row and particualr column through scanner function
	      int row_number=5;
	      int col_number=2;
	   
	    String xpath1="//div[@id='leftcontainer']/table/tbody/tr["+row_number+"]/td["+col_number+"]";
	    	
	      WebElement e2=       driver.findElement(By.xpath(xpath1));
	      String s2=  e2.getText();
	      System.out.println(s2);
	      //what if new country is added but u dont know that where it will be added then how will you handle it.
	      driver.get("file:///C:/Users/tyerubandhi/Documents/dynamictable.html");
	      Thread.sleep(10000);
	      String name="Ramesh Raman";
	      String xpath2="//table/tbody/tr/td[text()='"+name;
	      String xpath3= "']/following-sibling::td" ;
	      String xpath4=xpath2+xpath3;
	      WebElement e3=       driver.findElement(By.xpath(xpath4));
	      String s3=  e3.getText();
	      System.out.println(s3);
	      
	      //Taking Screenshot
	      //converting driver object to Takescreenshot object
	      driver.get("https://www.google.com/");
	      Selenium_Demo_Class1.takeSnapShot(driver, "C:\\Users\\tyerubandhi\\Downloads\\Selenium_Sessions\\Content\\screnshot.png");
	     //JavaScript Executor
	  WebElement e=  driver.findElement(By.xpath("//div/a[contains(text(),'Gmail')]"));
	      JavascriptExecutor js = (JavascriptExecutor)driver;
	      
	      js.executeScript("arguments[0].click();", e);
	      js.executeScript("history.go(0)");   
	         driver.get("https://www.toolsqa.com/selenium-webdriver/javascript-and-selenium-javascriptexecutor/") ;  
	      js.executeScript("window.scrollBy(0,600)");
	      Thread.sleep(10000);*/
	      //How to scroll till the particular element
	      
	//      js.executeScript("arguments[0].scrollIntoView();", Element);
	 /*           //How to handle Auto suggestions
	      
	      driver.get("https://www.google.com/");
			driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Selenium");
			
			*//**
			 * Example for Visibility of Elements located by
			 *//*
			Thread.sleep(10000);
			List<WebElement> list = driver.findElements(By.xpath("//div/ul[@role='listbox']//li"));
			
			System.out.println("Auto Suggest List ::" + list.size());
			
			for(int i = 0 ;i< list.size();i++)
			{
				System.out.println(list.get(i).getText());
				
				if(list.get(i).getText().equals("selenium interview questions"))
				{
					list.get(i).click();
					break;
				}
			}
	            
	            
	            
	            */
	            
	            
	            
	            
	            
	            
		      //if you want to say i know selenium...u must know locators..
		  //80% of the selenium delas with locators...
		// Launch website  
		    
		 
		  //  http://demo.guru99.com/test/facebook.html
		    //Basic Rules :
		    
		    //**************CSS Explanation******************
		    
		    //for id : htmltag#id or #id
		    
		  // for class:htmltag.classname,.classname,
		  //from parent to child navigation:parenttag>childtag
		    //tagname[attribute=attributevalue]
		    //tagname[attribute1=attribute1value][attribute2=attributevalue2]
		    //ex for contains:input[id*='user'] ex2:input[name*='email']
		    //ex for starts with input[name^='em']
		    //ex for ending with input[name$='il']
		    //ex for first-of-type li.dropdown:first-of-type
		    //ex for last-of-type li.dropdown:last-of-type
		    //ex for nth-of-type li.dropdown:nth-of-type(8)
		    //ex for sibling of an element li.dropdown>a+ul
		    
		    //********Xpath Explanation****************************
		    //difference between relative(/) and absolute(//) ex://div/label and //div//label
		    //  //tagname[@attribute='attributevalue'] ex ://input[@name='pass']
		    //   //tagname[@attribute1='attributevalue1' and @attribute='attributevalue2'] ex://input[@class='inputtext' and @name='pass']
		  
		
		    //ex for contains ://input[contains(@name,'pass')]
		    //ex for starts with ://input[starts-with(@name,'pass')]
		    //ends-with is not supported in xpath
		    //ex for text://div/label[text()='Keep me logged in']
		    //ex for indexing :(//li[@class='dropdown']/a)[1]
		    //ex for following-sibling : //li[@class='dropdown']/following-sibling::li
		    //ex for preceding-sibling : //li[@class='dropdown']/preceding-sibling::li
		    //ex for parent : //li/a/parent::li
		    //ex for child: //li/child::a
		    // ex: //td/child::input/parent::td
		    //extra thing text() with contains() function 
		    ////label[contains(text(),'Keep me logged in')]
		 
		    
		  /*// Launch Website    
          driver.navigate().to("https://www.testandquiz.com/selenium/testing.html");     

          //Click on the Link Text using click() command    
          driver.findElement(By.linkText("This is a link")).click();  
       
          //Go back to Home Page  
          driver.navigate().back();   

          //Go forward to Registration page  
          driver.navigate().forward();  

          // Go back to Home page  
          driver.navigate().to("https://www.testandquiz.com/selenium/testing.html");  

          //Refresh browser  
          driver.navigate().refresh();  
     */
          //Closing browser using driver.close();
       //driver.close();
          ////Closing browser using driver.quit();
    //  driver.quit();

          //Handling Alerts
        /*  
          driver.get("http://demo.guru99.com/test/delete_customer.php");
          driver.findElement(By.name("cusid")).sendKeys("53920");					
          driver.findElement(By.name("submit")).submit();
          
   
     		
     // Displaying alert message		
    
   Thread.sleep(5000);
   //i got my alert in 2 seconds....
     		
   Alert a=     driver.switchTo().alert();
   Thread.sleep(5000);
   
   // Capturing alert message.    
   String alertMessage= a.getText();	
   System.out.println(alertMessage);	
   
     // Accepting alert		
     a.accept();		*/
    // a.accept();
    // a.dismiss();
     
     /*//Handling windows
     
     driver.get("http://demo.guru99.com/popup.php");			
     driver.manage().window().maximize();		
             		
driver.findElement(By.xpath("//*[contains(@href,'popup.php')]")).click();			
     		
     String MainWindow=driver.getWindowHandle();		
     		
     // To handle all new opened window.				
         Set<String> s1=driver.getWindowHandles();		
     Iterator<String> i1=s1.iterator();		
     		
     while(i1.hasNext())			
     {		
         String ChildWindow=i1.next();		
         		
         if(!MainWindow.equalsIgnoreCase(ChildWindow))			
         {    		
              
                 // Switching to Child window
                 driver.switchTo().window(ChildWindow);	                                                                                                           
                 driver.findElement(By.name("emailid"));
                                 			
                 
                 driver.findElement(By.name("btnLogin")).click();			
                              
			// Closing the Child Window.
                     driver.close();	
         }		
     }		
     // Switching to Parent window i.e Main Window.
         driver.switchTo().window(MainWindow);	
     */
     //synchronization
		  //Explanation for Thread.sleep()
 /*    
     driver.get("https://www.easemytrip.com/");
     driver.manage().window().maximize();

     driver.findElement(By.id("FromSector_show")).sendKeys("Delhi", Keys.ENTER);
     driver.findElement(By.id("Editbox13_show")).sendKeys("Mumbai", Keys.ENTER);
     driver.findElement(By.id("ddate")).click();
     driver.findElement(By.id("snd_0_07/06/2020")).click();
   
     driver.findElement(By.className("src_btn")).click();
     //Thread.sleep(20000)
     driver.findElement(By.xpath("//button[text()='Book Now']")).click();*/
     //Example for implicit wait
    
    
    /* driver.get("https://www.easemytrip.com/");
     driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );
     //it is applicable throught the application..no need to write everywhere
     //it will take the time required to find the element...it will not waste.//Common for all waits
     driver.findElement(By.id("FromSector_show")).sendKeys("Delhi", Keys.ENTER);
     driver.findElement(By.id("Editbox13_show")).sendKeys("Mumbai", Keys.ENTER);
     driver.findElement(By.id("ddate")).click();
     driver.findElement(By.id("snd_4_08/08/2019")).click();
     driver.findElement(By.className("src_btn")).click();*/
     //Example for Explicit wait
     
   /*  driver.get("https://www.rentomojo.com/");
     
     driver.findElement(By.xpath("//span[@class='rm-city__selectorBoxLoca'][contains(text(),'Delhi')]")).click();
     
     
     
     WebDriverWait abc=new WebDriverWait(driver,10);
     
     abc.until(ExpectedConditions.visibilityOf()));
   
     
     driver.findElement(By.xpath("//div[@class='Campaign__innerWrapper']/button")).click();
          
		  */
		    
		    
		
		
     //Fluent Wait
		

/*
     Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
       .withTimeout(120, SECONDS) // this defines the total amount of time to wait for
       .pollingEvery(4, SECONDS) // this defines the polling frequency
       .ignoring(NoSuchElementException.class);
     // this defines the exception to ignore 
      WebElement xyz = fluentWait.until(new Function<WebDriver, WebElement>()
    		  {
    	  
    	  public WebElement apply(WebDriver driver)  //in this method defined your own subjected conditions for which we need to wait for
    	     { 
    	    	 return driver.findElement(By.id("id2"));
    	     }
     
     }
      
    		  );
      xyz.click();*/
		    
		//Explantation of Mouse events
		  //selenium has introduced the class called Actions
		  //AWT package we have class called Robot
		/*  
		  driver.manage().window().maximize();	
	        driver.get("http://www.google.com/"); // sample url	
	        Robot robot = new Robot();	
	        robot.mouseMove(630, 420); // move mouse point to specific location	
	        robot.delay(1500);        // delay is to make code wait for mentioned milliseconds before executing next step	
	        
	        
	        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // press left click	
	        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // release left click	
	        robot.delay(1500);	
	        
	        robot.keyPress(KeyEvent.VK_DOWN); // press keyboard arrow key to select particular thing
	        Thread.sleep(2000);	
	        robot.keyRelease(KeyEvent.VK_DOWN);
	        
	        robot.keyPress(KeyEvent.VK_ENTER);	
	        
	        robot.keyRelease(KeyEvent.VK_ENTER);
	        //Extra keys other than show in the example
	        //related to mouse
	        driver.navigate().back();
	        robot.mousePress(InputEvent.BUTTON3_DOWN_MASK); // press right click	
	        robot.mouseRelease(InputEvent.BUTTON3_DOWN_MASK); // release right click	
	        robot.delay(1500);	
	        robot.keyPress(KeyEvent.VK_DOWN); // press keyboard arrow key to select particular thing
	        Thread.sleep(2000);	
	        robot.keyRelease(KeyEvent.VK_DOWN);
	        
	        robot.keyPress(KeyEvent.VK_ENTER);	
	        
	        robot.keyRelease(KeyEvent.VK_ENTER);
	       
	        //robot.mousePress(InputEvent.BUTTON2_DOWN_MASK); // this is for mouse wheel
	       // robot.mouseRelease(InputEvent.BUTTON2_DOWN_MASK); // this is for mouse wheel	
	       // robot.delay(1500);	
*/	        
	     /*   //Uploading Files using Robot and  StringSelection class in java
	        driver.get("https://tus.io/demo.html");
	   Robot robot=new Robot();
	        WebElement uploadElement = driver.findElement(By.xpath("//p//input[@type='file']"));
	        uploadElement.click();
	        Thread.sleep(5000);
	        //StringSelection is a class that can be used for copy and paste operations.
	        StringSelection stringSelection = new StringSelection("C:\\Users\\tyerubandhi\\Downloads\\Anil.pdf");	
	        
	        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
	      
	     
	      //native key strokes for CTRL, V and ENTER keys
          
	
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);
            
            robot.keyRelease(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
		  */
		  /*//Actions Class 
		  
		  driver.get("http://demo.guru99.com/test/newtours/");           
          WebElement link_Home = driver.findElement(By.linkText("Home"));
          WebElement td_Home = driver
                  .findElement(By
                  .xpath("//html/body/div"
                  + "/table/tbody/tr/td"
                  + "/table/tbody/tr/td"
                  + "/table/tbody/tr/td"
                  + "/table/tbody/tr"));    
          //interveiwe will come and ask u instantiate robot class Actions class
        
          Actions builder = new Actions(driver);
        
          
         
          
           
          String bgColor = td_Home.getCssValue("background-color");
          System.out.println("Before hover: " + bgColor);    
          Thread.sleep(10000);
        //  mouseOverHome.perform(); 
          Thread.sleep(10000);
          bgColor = td_Home.getCssValue("background-color");
          System.out.println("After hover: " + bgColor);
          driver.close();
          
          //Multiple Actions//tate capgemeni website here
          //need to explain click operation ,doubleclick,contextclick
          //Drag and Drop using Actions class
          
          driver.get("http://demo.guru99.com/test/drag_drop.html");					
          
  		//Element which needs to drag.    		
          	WebElement From=driver.findElement(By.xpath("//*[@id='credit2']/a"));	
           
           //Element on which need to drop.		
           WebElement To=driver.findElement(By.xpath("//*[@id='bank']/li"));					
           		
           //Using Action class for drag and drop.		
           Actions act=new Actions(driver);					

  	//Dragged and dropped.		
           act.dragAndDrop(From, To).build().perform();	
          
          */
      
        //Example for Checked Exception
		  
		 /* File file = new File("E://file.txt");
	      FileReader fr = new FileReader(file); */
		  //Example for unchecked Exception
		 /* int num[] = {1, 2, 3, 4};
	      System.out.println(num[5]);
		  */
		  //example for try ,catch and finally
		/* try{ WebDriver driver = new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		  driver.get("https://chercher.tech/java/index-selenium-webdriver");
		
		  driver.findElement(By.id("this-id-is-not-present")).click();
		  //3 lines of codes here
		  System.out.println("I am in the try block");
		  }
		 catch(NoSuchElementException e1){
			 
		 }
		 catch(ElementNotInteractableException e){
			 
			 System.out.println("you got an exception");
			 
		 	}
	
		 catch(Exception e){
			 
		 }
		
	
		*/
		 
		 
	/*	  try {
		   // no element is present with such id
		   driver.findElement(By.id("this-id-is-not-present")).click();

		  } catch (Exception e) {
		   System.out.println("*************Exception Occurred***********");
		   
		  }
		  finally{
			  System.out.println("Please close the driver");
		  }*/
		  //try without exception
		  /*WebDriver driver = new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		  driver.get("https://chercher.tech/java/index-selenium-webdriver");
		  try {
		   System.out.println("========try==============");

		  } catch (Exception e) {
		   System.out.println("*************catch block***********");
		  } finally {
		   System.out.println("######you have reached Finally block#####");
		  }*/
		  //try without catch
		 /* WebDriver driver = new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		  driver.get("https://chercher.tech/java/index-selenium-webdriver");
		  try {
		   System.out.println("========try==============");
		   // no element is present with such id
		   } finally {
			   System.out.println("######you have reached Finally block#####");
		  }*/
		  //Mentioning the exact exception
		  //what are the different exceptions in selenium
		 /* try{ // no element is present with such id driver.findElement(By.id("this-id-isnot-present")).click();

		  }
		  catch(NoSuchElementException e){
			  
			  System.out.println("element is not there");
			  }*/
		  //Multiple Catch blocks
		  //below will be allowed
		 /* try{
			  
		  }
		  catch(NoSuchElementException e2){
			  
		  }
		  catch(Exception e){
			  
		  }
		  //below will not be allowed why?
		  	try{
			  
		  	}
		  catch(Exception e2){
			  
		  }
		  catch(NoSuchElementException e){
			  
		  }*/
		 
		/* System.out.println("Before throwing an exception"); 
		 //throw new Exception("Bingo,, we are throwing an exception"); 
	
		  
		  //Nested try catch 
		  try{
			  
			  System.out.println("first element is found");
			 // driver.findelement();
			  	//
		  }
		  catch(Exception e){
			 
			
			  try{ 
				  driver.findelemnt();
			  }
			  
			  finally{
				  
			  }
			  			 // System.out.println("first element is not found trying for second element");
			  try{
				  
			  }
			  catch(Exception e1){
				  System.out.println("second element is also not found");
			  }
			  finally{
				  System.out.println("I could check two elements");
			  }
		  }		
		  finally{
			  System.out.println("Please close the driver");
		  }*/
		 //soujanya- first element is found,first element is not found trying for second element,I could check two elements,close the driver
		  //yagnasri-first element is found,Bingo,, we are throwing an exception,,first element is not found trying for second element,second element is also not found,we could check two elements,close the driver
		  //maheswari-feif,feisnftfse,please close the driver,
		  //pushpa-feif,bingo we are throwing an exception,please close the driver.
//maheswari--first element is found,I could check two elements,Please close the driver
		  //soujanya--first element is found,I could check two elements,Plesae close the driver
		  //pushpa--first element is found,I could check two elements,Please close the driver
		  //ys-first element is found,please close the driver.
		  
		  
		 //Example for throw keyword
		/*  System.out.println("Before throwing an exception"); 
		  throw new Exception("Bingo,, we are throwing an exception"); 
		  */
		 // Thread.sleep(10000);
		  
		 
	     /*  File file = new File("E://file.txt");
	      FileReader fr = new FileReader(file);
	      */
		 // is Arrays a java keyword
		 
		  int x=10;
		  int y=11;
		int z=12;
	//	int m=13;
		
	    //Arrays in Java
	/*	int a;
		a=10;
		int [] a1;//here no memory location will allcoated
				a1=new int[100];//Here memory location will be allocated...
				//index starts from o to end is 99
				
		a1[0]=25;
		a1[1]=55;
		a1[2]=33;
		a1[5]=44;
		for(int p=0;p<100;p++ ){
			a1[p]=p;
		}
		//pushpa--arrays are mutable
		
		//System.out.println(x);
		System.out.println(a1[0]);
		System.out.println(a1[1]);
		System.out.println(a1[2]);
		for(int p=0;p<=100;p++){
			System.out.println(a1[p]);
		}*/
		
	/*	//Array index start from zero
		
		
	//	String[]a1=new String[25];
		
		  int intArray[]; 
		  int[] intArray1;

		  byte byteArray[];
		  short shortsArray[];
		  boolean booleanArray[];
		  long longArray[];
		  float floatArray[];
		  double doubleArray[];
		  char charArray[];
		  
		  //One way of assigning
		  int[] a2=new int[]{1,2,3,4,5,6,7,8,9};
		
		  //Other way of assiging
		// declares an Array of integers. 
	      int[] arr; 
	          
	      // allocating memory for 5 integers. 
	      arr = new int[5]; 
	          
	      // initialize the first elements of the array 
	      arr[0] = 10; 
	          
	      // initialize the second elements of the array 
	      arr[1] = 20; 
	          
	      //so on... 
	      arr[2] = 30; 
	      arr[3] = 40; 
	      arr[4] = 50; 
	      
	      for(int p=0;p<arr.length;p++){
	    	  System.out.println(arr[p]);
	      }
	    
	          
	      // accessing the elements of the specified array 
	      for (int j = 0; j < arr.length; j++) 
	         System.out.println("Element at index " + j +  
	                                      " : "+ arr[j]);   
	      
	      //Declaring two dimensional array
	      int arr_2[][] = { {1,2,3},{3,6,1,2},{7,4,2} };
	      
	      //
	      
	    
	      
	      System.out.println(arr_2[2][0]);
	      
	    //  firts loop is 0 to arr_2.length-1;
	    //second loop is o to 
	      //string many of the time you need to run your program on chararry--
	  
	      for(int p=0;p<arr_2.length;p++){
	    	  for(int m=0;m<arr_2[p].length;m++){
	    		  
	    	  }
	      }
	        // printing Multi Dimensional array 
	        for (int m=0; m< 3 ; m++) 
	        { 
	            for (int n=0; n < 3 ; n++) 
	                System.out.print(arr_2[m][n] + " "); 
	  
	            System.out.println(); 
	        } 
	        //pass by value 
	        //pass by reference 
	        
	        
		  //passing arrays to methods
	   
	        
	        int arr4[] = {3, 1, 2, 5, 9}; 
	          
	        // passing array to method m1 
	        System.out.println("soujanya add method :"+soujanya(arr4));
	        
	        //For each loop in java ....most important
	        int a1[]=new int[]{1,2,3,5};
	        
	        for(int v:a1){
	        	System.out.println(v);
	        	
	        }
	        
	        int[] marks = { 125, 132, 95, 116, 110 }; 
            
            int highest_marks = maximum(marks); 
            System.out.println("The highest score is " + highest_marks); 
	      
	      
	}
	
	public static int maximum(int[] numbers) 
    {  
        int maxSoFar = numbers[0]; 
       
          
      
        // for each loop 
        for (int num : numbers)  
        { 
            if (num > maxSoFar) 
            { 
                maxSoFar = num; 
            } 
        } 
    return maxSoFar; 
    } 
	public static void sum(int[] arr)  
    { 
        // getting sum of array values 
        int sum = 0; 
          
        for (int i = 0; i < arr.length; i++) 
            sum+=arr[i]; 
          
        System.out.println("sum of array values : " + sum); 
    } 

	
public static int soujanya(int[] arr){
	int a=0;
//	arr={3,1,2,5,9};
	//ys-3,pushpa=3,soujanya=3,maheswari=20
	
	for(int i=0;i<arr.length;i++){
		a=a+arr[i];
		//3
		if(a>15){
			return a;
		}
		
	}
	
	return 0;
	
}*/
/*		
	//Strings in java
		
	String s1="welcome";
	String s2="welcome";
	String s3=new String("welcome");
	String s4=new String("welcome");
	//explanation of immutable in strings
	String s="sachin";
	s.concat("Tendulkar");
	System.out.println(s);
	//To print sachin tendulkar what i need to do ?
	s=s.concat("Tendulkar");
	System.out.println(s);
	
	//equals() method--check with content of the string
		System.out.println("equals() method");
	String s1="Sachin";  
	   String s2="Sachin";  
	   String s3=new String("Sachin");  
	   String s4="Saurav"; 
	   String s5="SAURAV";
	   System.out.println(s1.equals(s2));//true  
	   System.out.println(s1.equals(s3));//true  
	   System.out.println(s1.equals(s4));//false  
	   System.out.println(s4.equals(s5));//false
	   System.out.println(s4.equalsIgnoreCase(s5));//true
	   //== operator..memory location comparasion
	   System.out.println("== operator");
	   System.out.println(s1==s2);
	   System.out.println(s1==s3);//excellent..false
	   
	   //CompareTo() method --lexographical comparision--please try this.
	   System.out.println("CompareTo() method");
	   System.out.println(s1.compareTo(s2));//0  
	   System.out.println(s1.compareTo(s4));//1(because s1>s3)  
	   System.out.println(s1.compareTo(s5));//-1(because s3 < s1 ) 
	   
	   //String concatnation in java
	   //+ operator
	   String s10="tataji";
	   s10=s10+78;
	   System.out.println(s10);
	   
	   //concat()
	   //String s50="sachin"+"Tendulkar";
	   String s60="kakinada";
	   String s61="kakinada";
	 String s62="kakinada";
	 
	 s9.concat("Tendulkar");//sachinTendulkar
	  System.out.println(s9);
	 // s9=s9.concat(5);
	  
	  //Substring
	  String s25="SachinTendulkar";  
	   System.out.println(s.substring(6));//Tendulkar  
	   System.out.println(s.substring(0,6));//Sachin//end index is excluded  
	   //toUpperCase and toLowerCase()
	   String s26="Sachin";  
	   System.out.println(s26.toUpperCase());//SACHIN  
	   System.out.println(s26.toLowerCase());//sachin  
	   System.out.println(s26);//Sachin
	   //trim() method
	   String s27=" Sachin ";
	   System.out.println(s27.trim());//Sachin
	   System.out.println(s27);// Sachin 
	   //startswith() and endswith()
	   System.out.println(s27.startsWith("Sa"));//boolean false
	   System.out.println(s27.endsWith("in"));//false
	   //charAt() method
	   System.out.println(s27.charAt(3));//c
	   
	   //length() method
	   System.out.println(s27.length());
	   
	   //replace() method
	   String s28="Java is a programming language. Java is a platform. Java is an Island.";    
	   String replaceString=s28.replace('J','K');//replaces all occurrences of "Java" to "Kava"    
	   System.out.println(replaceString);    
	  String rs= s28.replaceAll("Java", "Kava");
	  System.out.println(rs);
	  //StringBuffer class
	  //append() method
	  StringBuffer sb=new StringBuffer("Hello ");  
	  sb.append("Java");//now original string is changed  
	  System.out.println(sb);//prints 
	   //insert() method
	  StringBuffer sb1=new StringBuffer("Hello ");  
	  sb1.insert(1,"Java");//now original string is changed  
	  System.out.println(sb1);//prints HJavaello 
	  
	  //reverse() method
	  StringBuffer sb2=new StringBuffer("Hello");  
	  sb2.reverse();  
	  System.out.println(sb2);//prints olleH  
	  
	  //reverse the string without using Stringbuffer or stringbuilder
	  
	  //stringBuilder class
	  //append() method
	  StringBuilder  sb3=new StringBuilder ("Hello");  
	  sb3.append("java");  
	  System.out.println(sb3); 
	  
	  //insert() method
	  StringBuilder sb4=new StringBuilder("Hello ");  
	  sb4.insert(1,"Java");//now original string is changed  
	  System.out.println(sb4);//prints HJavaello  
	  
	  //reverse() method
	  StringBuilder sb5=new StringBuilder("Hello");  
	  sb5.reverse();  
	  System.out.println(sb5);//prints olleH  

	  //toString() method in java
	 String k= sb5.toString();
	 System.out.println(k);
	 //synchronus-- safe
	 //asynchronus--unsafe
*/	  
		//difference between arrays and collection is collection can have objects of different type
		//but arrays can have only one type of objects.
	/*	List obj=new ArrayList();
		//ArrayList obj1=new ArrayList();
		obj.add(1);
		
		for(int p=0;p<obj.size();p++){
			
			System.out.println(obj.get(p));
			
		}
		
		System.out.println("foreachloop object based");
		//Object --is parent class in java for all ojbects.
		for(Object obj1:obj){
			System.out.println(obj1);
		}
		
		System.out.println("Iterator handling");
		
		Iterator itr6= obj.iterator();
		while(itr6.hasNext()){  
		Object obj5=itr6.next();
		System.out.println(obj5);  
		}  
		System.out.println("List Iterator");
	
		ListIterator<String> list2=obj.listIterator(obj.size()); 
		//n=5 first its starts from 5..now cursor will gone to 4
		//5th will be printd
		//cursor will be gone to 3 print the value of 4
		//cursor will be gone to 2 print the value of 3
		//cursor will be gone to 1 print the value of 2
		//cursor will be gone to 0 print the value of 1
		//cursor will be cone to -1 print the value of 0
		//what are components availbel to iterate a list ...
		
        while(list2.hasPrevious())  
        {  
            Object str=list2.previous();  
            System.out.println(str);  
        }   
		
		
        
        ArrayList<String> list3=new ArrayList<String>();
        
        ArrayList<Integer> list4=new ArrayList<Integer>();
    
        
		
		
		
		
		
	  //ArrayList
		//Through for each loop
		   //List without datatypes
			List s1=new ArrayList();
			s1.add("Tataji");
			
			s1.add(2.5);
			s1.add(5);
			//s1.add(1, "likes");
			Iterator itr1=s1.iterator();  
			while(itr1.hasNext()){  
			System.out.println(itr1.next());  
			} 
		
		List<String> s=new ArrayList<String>();
		ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
		list.add("Ravi");//Adding object in arraylist  
		list.add("Vijay");  
		list.add("Ravi");  
		list.add("Ajay");  
		System.out.println("With Iterator");
		Iterator itr=list.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
		
		//above iteration with foreach loop
		System.out.println("With for each loop");
		for(String abc:list){
			System.out.println(abc);
		}
	   System.out.println("with for loop ");
	   for(int g=0;g<list.size();g++){
		   
		   System.out.println(list.get(g));
		   
		   }
	   
	   System.out.println("Traversing list through List Iterator:");  
       //Here, element iterates in reverse order  
           
	   //adding all elements of another list
          ArrayList<String> s4=new ArrayList<String>();
          s4.add("tataji1");
          s4.add("Vijay1");
          s4.addAll(list);
          System.out.println("Printing added list");
          for(int k=0;k<s4.size();k++){
        	 String s0= s4.get(k);
        	 System.out.println(s0);
        	 
          }
	
          s4.remove(0);
          s4.remove("tataji1");
          */
         //all the list related classes will allow duplicates
/*		 LinkedList<String> al=new LinkedList<String>();  
		  al.add("Ravi");  
		  al.add("Vijay");  
		  al.add("Ravi");  
		  al.add("Ajay");  
		Iterator itrl=  al.iterator();
		while(itrl.hasNext()){
			System.out.println(itrl.next());//curosor at 3rd value
		}
		//indexs from o to 3
		//4 elements are there it will be passed
		//itr1.next() will give value at oth index and move to cursor to first index
		//itrl.hasnext()..it will check whether values are present or not from the index at cursor
		//itr1.next() will give value at 1st index and move to 2nd
		//itr1.next() move to 3rd //one value is present 
		  //add operation in different ways
		  LinkedList<String> ll=new LinkedList<String>();  
          System.out.println("Initial list of elements: "+ll);  
           ll.add("Ravi");  
          ll.add("Vijay"); 
          ll.add("Ajay");  
          System.out.println("After invoking add(E e) method: "+ll);  
          //Adding an element at the specific position  
          ll.add(1, "Gaurav");  
          System.out.println("After invoking add(int index, E element) method: "+ll);  
          LinkedList<String> ll2=new LinkedList<String>();  
          ll2.add("Sonoo");  
          ll2.add("Hanumat");  
          //Adding second list elements to the first list  
          ll.addAll(ll2);  
          System.out.println("After invoking addAll(Collection<? extends E> c) method: "+ll);  
          LinkedList<String> ll3=new LinkedList<String>();  
          ll3.add("John");  
          ll3.add("Rahul");  
          //Adding second list elements to the first list at specific position  
          ll.addAll(1, ll3);  
          System.out.println("After invoking addAll(int index, Collection<? extends E> c) method: "+ll);  
          //Adding an element at the first position  
          ll.addFirst("Lokesh");  
          System.out.println("After invoking addFirst(E e) method: "+ll);  
          //Adding an element at the last position  
          ll.addLast("Harsh");  
          System.out.println("After invoking addLast(E e) method: "+ll);  
          
          ll.remove(0); 
          
          System.out.println("After removing element: "+ll);  
          //printing in reverse order
        System.out.println("List iterator");
       ArrayList<String> linked=new ArrayList<String>();
       linked.add("tataji");
       linked.add("ys");
       
        ListIterator<String> il3=linked.listIterator(linked.size());
    
        while(il3.hasPrevious()){
        	System.out.println(il3.previous());
        }
        System.out.println("descending iterator");
          Iterator i12=ll.descendingIterator();  
          while(i12.hasNext())  
          {  
              System.out.println(i12.next());  
          }  
          
          System.out.println("List iterator");
          ListIterator<String> list23=ll.listIterator(ll.size()); 
  		//n=5 first its starts from 5..now cursor will gone to 4
  		//5th will be printd
  		//cursor will be gone to 3 print the value of 4
  		//cursor will be gone to 2 print the value of 3
  		//cursor will be gone to 1 print the value of 2
  		//cursor will be gone to 0 print the value of 1
  		//cursor will be cone to -1 print the value of 0
  		//what are components availbel to iterate a list ...
  		
          while(list23.hasPrevious())  
          {  
              Object str=list23.previous();  
              System.out.println(str);  
          }   
          
  		
  		//Vector
          System.out.println("Talking about the vector");
          Vector<String> v=new Vector<String>();  
          v.add("Ayush");  
          v.add("Amit");  
          v.add("Ashish");  
          v.add("Garima");  
          Iterator<String> itr26=v.iterator();  
          while(itr26.hasNext()){  
          System.out.println(itr26.next());  
          }
          //Stack
          System.out.println("Taking about the stack ");
          Stack<String> stack = new Stack<String>();  
          stack.push("Ayush");  
          stack.push("Garvit");  
          stack.push("Amit");  
          stack.push("Ashish");  
          stack.push("Garima");  
          System.out.println("pop");
        System.out.println( stack.pop() ); 
          Iterator<String> itr27=stack.iterator();  
          while(itr27.hasNext()){  
          System.out.println(itr27.next());  
          }  */
          
          
			//	Set
      /*    HashSet<String> set2=new HashSet();  
          set2.add("One");    
          set2.add("Two");    
          set2.add("Three");   
          set2.add("Four");  
          set2.add("Five");  
          set2.add("Six");  
          Iterator<String> itset=set2.iterator();  
          while(itset.hasNext())  
          {  
          System.out.println(itset.next());  
          }  */
          
          //Example for duplicates
        //Creating HashSet and adding elements  
         /* System.out.println("Hashset with duplicates");
          HashSet<String> setdup=new HashSet<String>();  
          setdup.add("Ravi");  
          setdup.add("Vijay");  
          setdup.add("Ravi");  
          setdup.add("Ajay");  
          //Traversing elements  
          Iterator<String> itr=setdup.iterator();  
          while(itr.hasNext()){  
           System.out.println(itr.next());  
          }  */
		/*System.out.println("Various methods on hashset");
          HashSet<String> set=new HashSet<String>();  
          set.add("Ravi");  
          set.add("Vijay");  
          set.add("Arun");  
          set.add("Sumit");  
          System.out.println("An initial list of elements: "+set);  
          //Removing specific element from HashSet  
          set.remove("Ravi");  
          System.out.println("After invoking remove(object) method: "+set);  
          HashSet<String> set1=new HashSet<String>();  
          set1.add("Ajay");  
          set1.add("Gaurav");  
          set.addAll(set1);  
          System.out.println("Updated List: "+set);  
          //Removing all the new elements from HashSet  
          set.removeAll(set1);  
          System.out.println("After invoking removeAll() method: "+set);  
         
          set.clear();  
          System.out.println("After invoking clear() method: "+set);  
		//Sending another type of collection to hashset//concept called hashing
          ArrayList<String> list=new ArrayList<String>();  
          list.add("Ravi");  
          list.add("Vijay");  
          list.add("Ajay");  
          list.add("Ravi");  
          HashSet<String> set5=new HashSet<String>(list);  
          
          set5.add("Gaurav"); 
          set5.add("Gaurav");
          
         
       
          Iterator<String> itr11=set5.iterator();  
          while(itr11.hasNext())  
          {  
          System.out.println(itr11.next());  
          }  
          
         
          //Maheswari--Ravi,Vijay,Ajay,Gaurav
	//soujanya-Ravi,Vijay,Ajay,Gaurav
     //Yangnasri--same as soujanya
          //pushpalatha-same as all
          //i can't tell the printing order
          
          //LinkedHashset
          System.out.println("Linked Hashset");
        LinkedHashSet<String> Lset=new LinkedHashSet<String>();  
          Lset.add("One");    
          Lset.add("Two");    
          Lset.add("Three");   
          Lset.add("Four");  
          Lset.add("Five");  
          
          Iterator<String> ilset=Lset.iterator();  
          while(ilset.hasNext())  
          {  
          System.out.println(ilset.next());  
          }  
          //linkedhashset also ignore the duplicate elements
          System.out.println("Linked hash set ignoring duplicates");
          LinkedHashSet<String> al=new LinkedHashSet<String>();  
          al.add("Ravi");  
          al.add("Vijay");  
          al.add("Ravi");  
          al.add("Ajay");  
          Iterator<String> itr=al.iterator();  
          while(itr.hasNext()){  
           System.out.println(itr.next());  
          }  
          //Treeset follow ascending order
          
          TreeSet<String> Ts=new TreeSet<String>();  
          Ts.add("Ravi");  
          Ts.add("Vijay");  
          Ts.add("Ravi");  
          Ts.add("Ajay");  
          //Traversing elements  
          Iterator<String> itrts=Ts.iterator();  
          while(itrts.hasNext()){  
           System.out.println(itrts.next());  
          }  
          //output is Ajay Ravi Vijay--default order is ascending only 
          //to remove the duplicates
          ArrayList<String> al1=new ArrayList<String>();
          al1.add("Tataji");
          al1.add("Pushpa");
          al1.add("Tataji");
          al1.add("Pushpa");
         al1.add("soujanya");
        		  
      
      //}
        	  //
        	  
        	  
          }
	//Map
*/	
		//Suppose i want to put data as a key value pair data
		//roll and it's value
		//key1-value1
		//key2-value2
		
   /*     System.out.println("my hashmap");
		HashMap<String,Integer> hm1=new HashMap<String,Integer>();
         hm1.put("Mathsmarks",50);
         hm1.put("Sciencemarks", 90);
      Set s1=   hm1.entrySet();
   Iterator itr5=   s1.iterator();
   while(itr5.hasNext()){
	   Map.Entry entry1=   (Map.Entry) itr5.next();
	   System.out.println(entry1.getKey()+" "+entry1.getValue() );
   }
         
          HashMap<Integer,String> hm=new HashMap<Integer,String>();  
          //Adding elements to map  
          hm.put(1,"Amit");  
          hm.put(5,"Rahul");  
          hm.put(2,"Jai");  
          hm.put(6,"Amit");  
          //Traversing Map  
          Set set=hm.entrySet();//Converting to Set so that we can traverse  
          Iterator itr=set.iterator();  
          while(itr.hasNext()){  
              //Converting to Map.Entry so that we can get key and value separately  
        	  
              Map.Entry entry=(Map.Entry)itr.next();
           
              System.out.println(entry.getKey()+" "+entry.getValue());  
          }   
          //different examples
          //in the array a[i]
          //arraylist al.get(i)
        // System.out.println(hm.get("tataji"))
         
          HashMap<Integer,String> map=new HashMap<Integer,String>();          
          map.put(100,"Amit");    
          map.put(101,"Vijay");    
          map.put(102,"Rahul");  
          map.put(103, "Gaurav");  
          map.put(101, "Tataji");
      
        System.out.println("Initial list of elements: "+map);  
        //key-based removal  
        map.remove(100);  
        System.out.println("Updated list of elements: "+map);  
        //value-based removal  
        map.remove(101);  
        System.out.println("Updated list of elements: "+map);  
        //key-value pair based removal  
        map.remove(102, "Rahul");  
        System.out.println("Updated list of elements: "+map);  
          
        LinkedHashMap<Integer, String> lhm = new LinkedHashMap<Integer, String>();    
        //.put,.remove,.entryset,.get(key),keyset(),values()
        //Map.entry methods--getkey() and getvalue();
        //hm1.contains(key)--boolean
        lhm.put(100,"Amit");    
        lhm.put(101,"Vijay");    
        lhm.put(102,"Rahul");    
         //Fetching key  
         System.out.println("Keys: "+lhm.keySet());  
         //Fetching value  
         System.out.println("Values: "+lhm.values());  
         //Fetching key-value pair  
         System.out.println("Key-Value pairs: "+lhm.entrySet());  
         
         
         TreeMap<Integer,String> THM=new TreeMap<Integer,String>();    
         THM.put(100,"Amit");    
         THM.put(102,"Ravi");    
         THM.put(101,"Vijay");    
         THM.put(103,"Rahul");    
         System.out.println("Before invoking remove() method");  
         for(Map.Entry m:THM.entrySet())  
         {  
             System.out.println(m.getKey()+" "+m.getValue());      
         }  
         map.remove(102);      
         System.out.println("After invoking remove() method");  
         for(Map.Entry m:THM.entrySet())  
         {  
             System.out.println(m.getKey()+" "+m.getValue());      
         }  
        
         
         
 String str2="yygnasri@accenyture";
         
 //Question is : how many times each character is repeated
 //reverse the string
 
 // y-1 ,a-3......
 char[] c1=str2.toCharArray();
 HashMap<Character,Integer> hm4=new HashMap<Character,Integer>();*/
 //y-2
 //g-1
 //n-1
 //prime numbers 100 prime number
 //pusha 
 //
 /*for(Character c9:c1){
	 //1st iteration c9=y
	 //2nd iteration c9=y
	 //3rd iteration c9=g
	 if(hm4.containsKey(c9)){
		 hm4.put(c9, hm4.get(c9)+1);
	 }
	 else{
	 hm4.put(c9, 1);
	 
	 }
	
	 
 }
 System.out.println("hashmap print"+hm4);*/
        		 
 
         
      /*   
         //Explanation of character occurence in a string
         String s="Tataji@Infosys";
         HashMap<Character, Integer> hmc=new HashMap<Character,Integer>();
         char[] carr=s.toCharArray();
         for(Character c: carr){
        	 if(hmc.containsKey(c)){
        		 hmc.put(c, hmc.get(c)+1);
        	 }
        	 else{
        		 hmc.put(c, 1);
        	 }
        	
        	 
         }
         System.out.println(s+" : "+hmc);
         HashMap<Character,Integer> hm6=new   HashMap<Character,Integer>();
        hm6= Selenium_Demo_Class1.counter("Evoketech");
        System.out.println("hm6 alues"+hm6);*/
        //what are the libraries you have used in your project to read/write an excel
		//one is APachePOI and another JXL
		
		ExcelHandling objExcelFile = new ExcelHandling();

	    //Prepare the path of excel file

	    String filePath = System.getProperty("user.dir")+"\\src\\testdata";

	    //Call read file method of the class to read data

	    objExcelFile.readExcel(filePath,"data.xlsx","Details");
         String s1="data.xlsx";
         String s2="Details";
         
         String[] valueToWrite = {"Mr. E","Noida"};
         //objExcelFile.writeExcel(filePath,s1,s2,valueToWrite);
} //Create an array with the data in the same order in which you expect to be filled in excel file

  
    
	/*public static HashMap<Character,Integer> counter(String s){
		   //Explanation of character occurence in a string
        //String s="Tataji@Infosys";
        HashMap<Character, Integer> hmc=new HashMap<Character,Integer>();
        char[] carr=s.toCharArray();
        for(Character c: carr){
       	 if(hmc.containsKey(c)){
       		 hmc.put(c, hmc.get(c)+1);
       	 }
       	 else{
       		 hmc.put(c, 1);
       	 }
       	
       	 
        }
        return hmc;
	}
	*/
	
	
	public static void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{

        //Convert web driver object to TakeScreenshot

        TakesScreenshot scrShot =((TakesScreenshot)webdriver);

        //Call getScreenshotAs method to create image file

                File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

            //Move image file to new destination

                File DestFile=new File(fileWithPath);

                //Copy file at destination

                FileUtils.copyFile(SrcFile, DestFile);

    }
	
	
}
