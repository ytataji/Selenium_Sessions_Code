package Assignments;

import java.util.Scanner;

public class Yagnasri { 
	public static void main(String[] args) {
		
		
	/*//pre increment and post increment 

		
		
		 {
			System.out.println("Example 1");
			 int x=10;
			 System.out.println(x++);// value of x=10
			 System.out.println(x);// post increment so value of x=10+1=11
			 
			 int y=10;
					 System.out.println(++y);//pre increment so value of x=1+10=11
			System.out.println(y); //value of x=11
			
			System.out.println("Example 2");
			
			int a=20;
			int b=a++;
			System.out.println(a);// a is post increment in b=a++,value of a=20 and b=20 but  used here(post increment) so a=20+1=21
			
			System.out.println(b);// In int b=a++ value of a is still 20 so b=20
			
			int c=30;
			int d=++c;
			
			System.out.println(c);// c is pre increment in d=++c, value of c=31 and d=31 
			
			System.out.println(d);//In d=++c value is 1+30=31,so d=31
			
}
	

	
	
	//downcasting 
	
	 {

		
				byte a=(byte) 129;
				
				
				short b=(short) 32770;
				short c=127;
				
				//int d = (int) 2147483648; // getting error here
				int e= 32770;
				
				
				
				float g = (float) 922337203685477580.7;
				
				double h= 92233720.7;
				
		}
	
	//Operators
	
	
	{

		System.out.println("Arthematic");
		System.out.println(3*8/2+4-1+4);
		System.out.println(10%2);
		
		System.out.println("Relational");
		
		int a=1;
		int b=4;
		
		if(a>0 && a<10) {
			System.out.println("a value is greater than 0 and a value is less than 10");
		}
		
		if(b>=5 || b<=10 ){
			System.out.println("b value is greater than or equal  5 and b value is less than or equal to 10");
		}
			
		System.out.println("Logical"); 
		
		if(a==1 && a!=b) {
			System.out.println("a value is 1 and not equal to b value");
		}
		
		System.out.println("Tenary"); 
		int c=40;
		
		System.out.println(((c%2==0) ? "even" :"odd"));
		
		System.out.println("Assignment");
		
		int d=100;
		
		d+=8;
		System.out.println(+d);
		d-=4;
		System.out.println(+d);
		d*=2;
		System.out.println(+d);
		d/=2;
		System.out.println(+d);
		d%=4;
		System.out.println(+d);
		
		System.out.println("Unary");
		
		int e=5;
		
		e++;
		System.out.println(+e);
		e--;
		System.out.println(+e);
		
		++e;
		System.out.println(+e);
		--e;
		System.out.println(+e);
	
	}
	
	
	//Verify is given year is leap year or not
	
	
	 {	
			Scanner in = new Scanner(System.in);
			
	
			
			System.out. println("Enter any year ");
	
			System.out. println(" ");
			int year = in. nextInt();
			
			if(year%4==0)
			{
				System.out.println("Given year is a leap year");
			}
			else
			{
				System.out.println("Given year is not Leap year");
			}

	}

	3)	Write a program to print whether you are eligible for blood donation or not?
	 Conditions :1) your weight should be greater than 55 if your age above 20..if condition fails you are not eligible for blood donation..true condtions is “You are eligible for blood donation”
	 2)your weight should be greater than 45 if your age is between 15 to 20..if condition fails you are not eligible for blood donation
	 3)you are not eligible for blood donation if your age is not greater than 19 

	
	
	 {
			
			
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter weight");
			int weight =sc.nextInt();
			System.out.println("Enter Age");
			int age =sc.nextInt();
			
			if((age>20))
			{ 
				if (weight>55 )
				{
				System.out.println("You are eligible for blood donation");
				}
				else System.out.println("Not eligible");
					
			}
			
			else if((age>15) && (age<20))
			{
				
			if((weight>45) ) {
				System.out.println("You are eligible for blood donation");
			}
			else System.out.println("Not eligible");
			}
			
			else if((age<19))
				System.out.println("Not eligible for blood donation");
			else
				System.out.println("Not eligible for blood donation");
			

		}
	
Write a logic to print a name of the month based on the number given..Ex:January-1,February-2…Default statement should be “invalid month”
	
	 
	 {
			
			
			Scanner sc=new Scanner (System.in);
			System.out.println("Enter number from 1 to 12");
			int month=sc.nextInt();
			
			switch(month)
			{
			
			case 1: System.out.println("January");break;
			case 2: System.out.println("February");break;
			case 3: System.out.println("March");break;
			case 4: System.out.println("April");break;
			case 5: System.out.println("May");break;
			case 6: System.out.println("June");break;
			case 7: System.out.println("July");break;
			case 8: System.out.println("August");break;
			case 9: System.out.println("September");break;
			case 10: System.out.println("October");break;
			case 11: System.out.println("November");break;
			case 12: System.out.println("December");break;
			
			default: System.out.println("Entered invalid month");
			}
			
	 }*/
			
	/*
	 1
	 12
	 123
	 1234
	 12345
	 */
			
			{
				
				for(int i=1;i<=5;i++)
				{
					for (int j=1;j<=i;j++)
					{
						System.out.print(j);
					}
					System.out.println();
				}
				
			}
				/*
				 *****
				 ****
				 ***
				 **
				 *    */
				
				{
					for(int i=5;i>=1;i--)
					{
						for(int j=1;j<=i;j++)
						{
						System.out.print("*");	
						}
						System.out.println("");
					
				}
					}
				
					
	//Task3: Peform the above task with combination of for and while loop instead of two for loops				
		
				{
					for(int i=5;i>=1;i--)
					{
						int j=1;
						while(j<=i)
						{
							System.out.print("*");
							j++;
						}
						System.out.println("");
						
					}
				}
					
				
	//Task5: Print Fibonacci series of 10 numbers without using any recursion(because I did n’t explain what is recursive)
				
				 {
						
						int a=0;
						int b=1;
						int c=a+b;
						
						do {if(a==0 && b==1) {
							System.out.print(a + " ");
							System.out.print(b + " ");}
						
						System.out.print(c+ " ");
						 a=b;
						 b=c;
						 c=a+b;}
						 while(c<=100);
						 
					}

				 
				 
				 
				 
}
}

	



	
	
