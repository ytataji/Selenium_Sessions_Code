
public class SwitchStatement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=1; 
		
	    //Switch expression  
	    switch(x){  
	    //Case statements  
	    case 1: 
	    System.out.println("Please execute all test cases in chrome browser");  
	    break;  
	    case 2: 
	    System.out.println("Please execute all test cases in Firefox browser");  
	    break;  
	    case 3: 
	    System.out.println("Please execute all test cases in IE browser");  
	    break;  
	    //Default case statement  
	    default:System.out.println("Please execute all test cases with safari");  

	}
	   
	//what will happen if you don't give break statement
	    System.out.println("**************************");
	    switch(x){  
	    //Case statements  
	    case 1: 
	    System.out.println("Please execute all test cases in chrome browser");  
	    case 2: 
	    System.out.println("Please execute all test cases in Firefox browser");
	    
	    case 3: 
	    System.out.println("Please execute all test cases in IE browser");  
	    //Default case statement  
	    default:System.out.println("Please execute all test cases with safari");  

	}
	   
	 
}}
