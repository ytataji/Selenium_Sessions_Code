package Assignments;

public class Pushpa_operators {

	public static void main(String[] args) {
		
		
		//unary operator
		
		/*int a=10;  
		int b=10;  
		System.out.println(a++ + ++a);//10+12=22 intially value of a is 10 so a++ is 10 and ++a = 12  
		System.out.println(b++ + b++);//10+11=21  initally value of b is 10 so b++ is 10 and b++= 11 
		System.out.println(++a);
		System.out.println(++b);
		System.out.println(++a + ++b); //12+11 = 22*/
		
		/*int x=20;
		
		System.out.println(x--); //12-1=11
		
		System.out.println(x-a++); //20-12=8
		
		System.out.println(x---b); //20-12=8  */
		
		
		//upcasting and down casting of various primitive data types
		
		
		/*byte i =(byte)128;//upcasting
	    int x = 126;
	    
	    byte i1=(byte) x; //downcasting
	    
		
		System.out.println(i); // we get -128
		System.out.println(i1);*/
		
		
		/*double f = 123.4; // upcasting
		long l = (long) f; //downcasting
		int i = (int) f;

		System.out.println(f);
		System.out.println("long: " + l + " int: " + i);*/
		
		//int i = long(2147483648);
		
		
	
		/*int i = 10;
		String s1 = "11";

		String s2 = s1 + i;
				
		System.out.println(s2);*/
		
		
		
		
		
		
		
		
		//Assignment on operators
		
		//1.Write a program with using all the operators at any line of the code. Every operator should be present in your source file(.java file)

	//	Arthimetic operators
		
		int a= 10;
		int b= 5;
		int c= 2;
		
		/*int y= a/b*2+c+2*a/b;
		int z=y%2;
		
		System.out.println(y);
		System.out.println(z);*/
		
		
	// Relational operators
		
		/*if(a>=b && a>=c)
		{
		 
			 System.out.println("A is largest no");
		}
			 else if(b>=a && b>=c)
			{
			
			System.out.println("B is largest no");
		}
			
			
			else {
				
				
					System.out.println("C is the largest no");
				
				
			}*/
		
		
    // logical operators
		
		boolean x= true;
		
		
		/*if(x!=(a>b) )
			
		{
		System.out.println("x is false");
		}
		
		else {
			System.out.println("x is true");
		}*/
			
		
		//Bit wise operators
		
		
		
		/*//a - 0000 1010
		//b - 0000 0101
		
		//a&b = 0000 0000
		
		System.out.println(a&b); //0
		
		
		//a|b = 1111 0000
		
		System.out.println(a|b); //15
		
		//a^b = 0000 1111
		
		System.out.println(a^b);//15
*/		
		
		
		
		//assignment operators
		
		
		/*a+=10;
		
		System.out.println(a); //a a+10=20;
		
		a-=10;
		System.out.println(a); //a a-10=0;
		
		
		a*=10;
		System.out.println(a); //a a*10=100;
		
		
		a%=3;
		System.out.println(a); //a a%3=1 - reminder
		
		int d=10; 
		
		d/=3;
		System.out.println(d); //d d/3=3 - quotient
		
		d&=3;
		System.out.println(d); //d d&3=2 
		
		d^=3;
		System.out.println(d); //d d^3=9 - quotient
*/		
		
		/*//Ternanry operators
		
				int year = 2010;
				
				System.out.println(((year%2==0)?"-leap":"-not leap")); //if year is divisible by 4 it is leap year
				*/
		
//2 Write a program to print whether a given year is leap year or not using if else and some operators
		
		// if a year is divisible by 4 it is leap year.
		
		/*int year = 2021;
		
		if (year%4==0)
			
		{
			System.out.println(" Year is leap year");
		}
		
		else
			
		{
			System.out.println(" Year is not leap year");
		}
		*/
		
		
//3.Write a program to print whether you are eligible for blood donation or not? 
		//cond1 your weight should be greater than 55 if your age above 20
		//cond2 your weight should be greater than 45 if your age is between 15 to 20
		
		
		/*int age = 12;
		int weight = 60;
		
		if (weight>=55 && age >=20)
			
		{
			System.out.println("You are eligible for blood donation");
		}
		
		
		else if (weight>=45 && (age<=20 && age>=15))
		{
			System.out.println("You are eligible for blood donation");
		}
		
	
		
		else {
			
			System.out.println("You are not eligible for blood donation");
			
		}*/
		
		
//4. Write a logic to print a name of the month based on the number given..Ex:January-1,February-2…Default statement should be “invalid month”
		
		
		
		/*int month=11;
		
		switch(month)
		{
			case 1: 
				
				System.out.println("The month is January");
				break;
				
             case 2: 
				
				System.out.println("The month is February");	
				break;
				
             case 3: 
 				
 				System.out.println("The month is March");
 				break;
 				
             case 4: 
 				
 				System.out.println("The month is April");
 				break;
 				
             case 5: 
 				
 				System.out.println("The month is May");
 				break;
 				
             case 6: 
 				
 				System.out.println("The month is June");
 				break;
 				
             case 7: 
  				
  				System.out.println("The month is July");
  				break;
		
             case 8: 
  				
  				System.out.println("The month is August");
  				break;
  				
             case 9: 
  				
  				System.out.println("The month is September");
  				break;
  				
             case 10: 
  				
  				System.out.println("The month is October");
  				break;
  				
             case 11: 
  				
  				System.out.println("The month is November");
  				break;
  				
             case 12: 
  				
  				System.out.println("The month is December");
  				break;
		
		default: System.out.println("Invalid month");
		
		}
		*/
		
		
		
		//if break is used then it will print only that month. If break is not used it will print the
		//corresponding month following by next months also where ever break is not given.
		
		
		
		
		
	}
	
	

}
