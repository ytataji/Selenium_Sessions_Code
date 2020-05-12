import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Selenium_Demo_Class1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int i=10;
		
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\tyerubandhi\\Downloads\\Selenium_Demo\\chromedriver.exe");  
		  WebDriver driver=new ChromeDriver();//
	
		 
		  
		 
		  
		 
		      //if you want to say i know selenium...u must know locators..
		  //80% of the selenium delas with locators...
		// Launch website  
		    
		    driver.navigate().to("http://demo.guru99.com/test/facebook.html"); 
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
		    
		    
		    
	
		    
		    
		
		
		
		
		
		   
		 
		    
		  
		    
		    
		    

	}

}
