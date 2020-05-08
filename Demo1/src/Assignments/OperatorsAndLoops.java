package Assignments;	
import java.util.Scanner;

public class OperatorsAndLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//casting examples
		System.out.println("*** Casting***");
		
		 	/*char ch = 'c'; 
		    int num = 88; 
		    ch =  (char) num; 
		    System.out.println(ch);
		    
		    int i=10;
		    float j=20;
		    System.out.println(j);
		    i=(int) j;
		    System.out.println(i);
		    		
		     int a=80;
		     char c='g';
		     c=(char) a;
		     
		     System.out.println("c:"+c);
		     
		    
		    double myDouble = 9.78;
		    int myInt =  (int) myDouble; // Manual casting: double to int

		    System.out.println(myDouble);   // Outputs 9.78
		    System.out.println(myInt);     */ // Outputs 9    
		    
//2. Unary Operators Example
		System.out.println("*** Unary Operator***");
		/*int x=10;

		System.out.println(x++);//10 (11)  
		System.out.println(++x);//12  
		System.out.println(x--);//12 (11)  
		System.out.println(--x);//10  

		

		int a=10;  
		int b=10;  
		System.out.println(a++ + ++a);//10+12=22 
		System.out.println(b++ + b++);//10+11=21  

		

		int a1=10;  
		int b1=-10;  
		boolean c=true;  
		boolean d=false;  

		System.out.println(~a1);//-11 (minus of total positive value which starts from 0)  
		System.out.println(~b1);//9 (positive of total minus, positive starts from 0)  
		System.out.println(!c);//false (opposite of boolean value)  
		System.out.println(!d);//true  
*/		

		
//3. Write a program with using all the operators at any line of the code. Every operator should be present in your source file	    
		
		System.out.println("****Unary Operator****");
		/*// ++, --, +,_, ~, !
		//Prefix & postfix 
		
		int a=10;  
		int b=10;  
	
		int c=10;  
		int d=-10;  
		boolean e=true;  
		boolean f=false;
		System.out.println(~c);  //-c-1==  -10-1=-11
		System.out.println(~d);  //-(-d-1)== -(-10)-1=10-1=9
		System.out.println(!e);// false
		System.out.println(!f); // true
		
		System.out.println(++a + ++a); // 11+12=23
		System.out.println(a++ + a++);// 12+13=25
		System.out.println(++a + a++);//15+15=30
		System.out.println(a++ + ++a);//16+18=34
		
		System.out.println(a++ + a--);//18+19=37
		System.out.println(--a + a--);//17+17=34
		System.out.println(a-- + a++);//16+15=31
		System.out.println(a);//16
		
			
		
		System.out.println("Arithmetic operators");
		int x=10;
		int y=20;
		System.out.println(x + y);//30
	      System.out.println(x - y);// -10
	      System.out.println(x * y);//200
	      System.out.println(x / y);// 0
	      System.out.println(x % y); //10
	 		
		System.out.println("****Logical operator****");
		//&& – logical AND,		|| – logical OR, 		! logical NOT
		int g=10;
		int h=20;
	    boolean result1= g<h;
	    System.out.println(result1);
	    boolean result2=(g <g*h) && (h>g*h); 
	    System.out.println(result2);
	    boolean result3=(g <g*h) || (h>g*h); 
	    System.out.println(result3);
	     boolean result4=(!(g <g*h) || (h>g*h)); 
	    System.out.println(result4);
	    	    int n1=5;
	    System.out.println(n1<10 && n1<=5);
	    	
		
		System.out.println("****Relational operators****");
		int x1=10;
		int y1=20;
				
		System.out.println(x1 == y1);
		System.out.println(x1 != y1);
		System.out.println(x1 > y1);
		System.out.println(x1 < y1);
		System.out.println(x1 >= y1);
		System.out.println(x1 <= y1);
		
		System.out.println("****Shift operator****");
		System.out.println(x1<<2);
		//10==0000 1010  moving 2bits left side 0010 1000=32+8=40[ shift two bits left side]
		//10==0000 1010  moving 2bits right side 0000 0010=2{shift two bits right side]
		//10==0000 1010 
		System.out.println(x1>>2);
		//System.out.println(x1>>>2);
		
		System.out.println("****Bitwise operators****");
		System.out.println(x1 & y1);
		//0000 1010 & 0001 0100=0
		//0000 1010 | 0001 0100=30
		//0000 1010 ^ 0001 0100=30
		
		System.out.println(x1 | y1);//30
		System.out.println(x1 ^ y1);//30
		System.out.println(~x1);
		
		System.out.println("****Ternary operator****");
		int num1 = 10;
		int num2 = 20;

		int res=(num1>num2) ? (num1+num2):(num1-num2);// if else condition type
		System.out.println(res);

		
		System.out.println("****Assignment operator****");
		
		System.out.println(num1=9);
		System.out.println(num1);
		System.out.println(num1+=9);
		System.out.println(num1-=9);
		System.out.println(num1%=9);
		System.out.println(num1/=9);
		    
*/

//Write a program to print whether a given year is leap year or not using if else and some operators
	
	/* int year = 1900;
     
     System.out.println();  
     
     if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
     	
     	System.out.println("Year " + year + " is a leap year");
     
    else
 	   
 	   System.out.println("Year " + year + " is not a leap year");
     
     	System.out.println();
	*/
//Write a program to print whether you are eligible for blood donation or not?
		 int age = 22;
	        
	        int weight=56;
	        
	    if(weight>55 && age>20)
	    	
	    {
	    	
	    	System.out.println("You are eligible for blood donation");
	    	
	            }
	    
	     else if(weight>45 &&( age>15 && age<=20)){
	    	 
	    	 System.out.println("You are eligible for blood donation");
	    	 
	            }
	    
	    else if(age<19){
	    	
	    	System.out.println("You are not eligible for blood donation");
	    	
	    }

	else{
		
		System.out.println("not eligible");

			}
	    
//Write a logic to print a name of the month based on the number given..Ex:January-1,February-2…Default statement should be “invalid month”
		int month=8;
		String MonthName="";
		
		
		
		switch(month){
		case 1:MonthName="January";
				break;
		case 2:MonthName="Febrauary";
				break;
		case 3:MonthName="March";
				break;
		case 4:MonthName="April";
				break;
		case 5:MonthName="May";
				break;
		case 6:MonthName="June";
				break;
		case 7:MonthName="July";
				break;
		case 8:MonthName="August";
				break;
		case 9:MonthName="September";
				break;
		case 10:MonthName="October";
				break;
		case 11:MonthName="November";
				break;
		case 12:MonthName="December";
				break;
		default:System.out.println("InValid Month");
		}
		System.out.println("MonthName:"+MonthName);
		
//Write a program to print this output
		/*   1
		 *   1   2
		 *   1   2    3
		 *   1   2    3   4
		 *   1   2    3   4    5
		
		 */
	    
		 for (int i=1; i<=5; i++){
				for (int j=1; j<=i;j++){
					
					System.out.print(j+" ");
					
				}
				System.out.println();
			}
//Write a program to print this output
			/*   * * * * * *
			 *   * * * * *
			 *   * * * *
			 *   * * *
			 *   * *
			 *   *
			 			
			 */
		 System.out.println("Reverse logic");
			for (int i=1; i<=6; i++){
				for (int j=6; j>=i;j--){
					
					System.out.print("* ");
					
				}
				System.out.println();
					
		    }
//Peform the above program  with combination of for and while loop instead of two for loops
			System.out.println("using for & while loop");
			for (int i=1; i<=5; i++){
				int j=5;
				while(j>=i){
				//for (int j=5; j>=i;j--){
					
					System.out.print("* ");
					j--;
					
				}
				System.out.println();
					}
//Print prime number from 1 to 100
			int count;
			for (int i=2; i<=100; i++){
				count=0;
		
				for(int j=2; j<i; j++){
					
					if(i%j==0){
						count++;
					}
				}
				if(count==0){
					System.out.print(i+" ");
				}
			}
			
//Print Fibonacci series of 10 numbers without using any recursion(because I did n’t explain what is recursive)
			 int n = 10, t1 = 0, t2 = 1;
		        System.out.print("First " + n + " terms: ");

		        for (int i = 1; i <= n; ++i)
		        {
		            System.out.print(t1 + "  ");

		            int sum = t1 + t2;
		            t1 = t2;
		            t2 = sum;
		        }
		        
//Please write a program to explain the functionality of ATM Machine
		        int myPin=1234;
				int balance=10000;
				
				Scanner myObj = new Scanner(System.in);  // Create a Scanner object
			    
				System.out.println("Enter pin number");
				
			   int pinNumber = myObj.nextInt();
			   
			
			   
			   
			  // System.out.println(pinNumber);
			   
			
			   
			    if(pinNumber==myPin)
			    {
			    	
			    	System.out.println("Pin Matched");
			    	
			    	System.out.println("Enter With draw Amount");
			    	int WithDraw = myObj.nextInt();
			    	
			    	
			    	if(WithDraw<=balance){
			    		
			    
			    	 System.out.println(" Your transaction was successfull."+"Remaining Balance="+(balance-WithDraw));
			    		
			    		
			    		
			    	}
			    	else{
			    		System.out.println("You are not having sufficient amount");
			    	}
			    	
			    	
			    }
			    else{
			    	System.out.println("InValid Pin Number");
			    }


	}

}
