//Implementation: by second user  
class Chromdriver implements Webdriver{ 
	
public void click(){
	System.out.println("drawing rectangle");

}  

}  
class Firefox implements Webdriver{  
	
public void click(){
	System.out.println("drawing circle");

}  
}  
//Using interface: by third user  
class TestInterface1{  
public static void main(String args[]){  
Drawable d=new Circle();//In real scenario, object is provided by method e.g. getDrawable()  
d.draw();  
}}  