abstract class Shape{ 
	
 abstract void draw(); 
 abstract void d1();
 void d2(){}
 
}  
//In real scenario, implementation is provided by others i.e. unknown by end user  
class Rectangle extends Shape{  
void draw(){
	System.out.println("drawing rectangle");
	
}  
void d1(){
	
}
}  
class Circle1 extends Shape{

	@Override
	void draw() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void d1() {
		// TODO Auto-generated method stub
		
	}  

}  
//In real scenario, method is called by programmer or user  
class TestAbstraction1{  
public static void main(String args[]){  
Shape s=new Circle1();//In a real scenario, object is provided through method, e.g., getShape() method  
s.draw();  
}  
}  