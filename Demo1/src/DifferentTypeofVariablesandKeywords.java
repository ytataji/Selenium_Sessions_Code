
public class DifferentTypeofVariablesandKeywords {
	
	
	public static void main(String[] args) {
		//long x=2147483648;
		//long y=2147483647;
		//byte x=32767;
		
		//down cast 
		//upcast
		
		byte x=(byte)128;
	
		/*int _=10;
		System.out.println(_);
		
		int x=10;
		//uniary operators
		System.out.println(x++);//10 (11)  
				int y=++x + 11;
				int z=++x+y+10;
				int m=
		
		System.out.println(++x);//12  
		System.out.println(x--);//12 (11)  
		System.out.println(--x);//10  
		

		
		System.out.println(y);
		
		int a=10;  
		int a1=-10;  
		boolean b1=true;  
		boolean b2=false;  
		System.out.println(~a);//-11 (minus of total positive value which starts from 0)  
		//my answer would be -a-1
		System.out.println(~a1);//9 (positive of total minus, positive starts from 0)  
		//-(-10)-1=9
		//ex:156 base 10---->6 *10^0+ 5 *10^1 +1 *10^2=156
		//ex :10011100 base 2-->0*2^0+0*2^1+1*2^2....=156
		
		//binary represenation of 10-->0000 1010--> 1111 0101(1's complement representation)->00001011-->11
		
		//ex:10010000--01110000
		
		
		System.out.println(!b1);//false (opposite of boolean value)  
		System.out.println(!b2);//true  
*/		
	
	
		/*	int a=10;  
					int b=10;  
					System.out.println(a++ + ++a);//10+12=22 intially value of a is 10 so a++ is 10 and ++a = 12  
					System.out.println(b++ + b++);//10+11=21  initally value of b is 10 so b++ is 10 and b++= 11 
					System.out.println(++a);
					System.out.println(++b);
					System.out.println(++a + ++b); */

	
	//Arthematic operators
		System.out.println("********Arithmatic Precedence********");
	int c=10;  
	int d=5;  
	
	System.out.println(c+d);//15  
	System.out.println(c-d);//5  
	System.out.println(c*d);//50  
	System.out.println(c/d);//2  
	System.out.println(c%d);//0  
	
	//operator precedence
	System.out.println("********Operator Precedence********");
	//BODMAS--bracket of divison multiplication addition and substraction
	System.out.println(10*10/5+3-1*4/2); 
	//10/5=2 and 4/2=2 then expression will be 10*2+3-1*2
	//20+3-2=21
	
	//0000 1010--00010100..00101000
	//logical or operator
	System.out.println("********Logical operators********");
	//logica AND --both the inputs are high the output will be high--&&
	//logical OR-if one of the inputs is high then output will be high-||
	int a2=10;  
	int d1=5;  
	int e1=20;  
	System.out.println(a2<d1  &&  a2<e1);//false && true = false  
	System.out.println(a2<d1 && d1<e1);//false & true = false  
	System.out.println(a2<d1 || d1<e1);
	
	System.out.println("********Ternary operators********");

	
	int a3=2;  
	int b3=5;  
	int min=(a3<=1)?a3:b3;  
	System.out.println(min);  
	System.out.println("********Assignment operators********");
	
	int a5=10;  
	//a5+=3;//10+3  
	a5=12;
	//once if you give data type..then system will store that datatype..you can use/modify that variable whereeve you want--
	//this we call it as mutable.
	//immuatable is we can't change

	System.out.println(a5);  
	a5-=4;//13-4  
	System.out.println(a5);  
	a5*=2;//9*2  
	System.out.println(a5);  
	a5/=2;//18/2  
	System.out.println(a5);  
	//Logical operators
	//Assignment opeartos
		//Relatioal operators
	System.out.println("Relational operators");
	int height=10;
	int weight=20;
	if(height>=10){
		if(weight==20){
			System.out.println();
		}
		if(weight!=20){
			System.out.println();
		}
	}
	
	
	System.out.println("Bitwise operators");
	//int x=10;
	int y=20;
	//00010100
	//x=10--0000 1010
	//y=10--0001 0100
	//      0000 0000 
	
	
	System.out.println(x & y);
	
	
	}
	
}
