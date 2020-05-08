interface Printable1{  
	
void print();  

}  
interface Showable{ 
	
void print1();  

}  
class A7 implements Printable1,Showable{  
	
public void print(){
	System.out.println("Hello");

}  

  
public static void main(String args[]){  
	Printable1 obj = new A7();  
obj.print();  
 
 }  
}  