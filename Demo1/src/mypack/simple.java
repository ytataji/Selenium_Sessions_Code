package mypack;
 class A{ 
	 //private A(){};
 private int data=40;  
private void msg(){
	System.out.println("Hello java");
	}  
	
}  
  
class simple{  
 public static void main(String args[]){  
   A obj=new A();  
 
   //System.out.println(obj.data);//Compile Time Error  
   //obj.msg();//Compile Time Error  
   }  
}  