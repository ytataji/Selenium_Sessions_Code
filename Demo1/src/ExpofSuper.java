
class Animal{  
Animal(){
	System.out.println("animal is created");
	}  
}  
class Dog extends Animal{  
Dog(){  
	
System.out.println("dog is created");  


}  

}  

public class ExpofSuper {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d=new Dog();  
		//when you are creating reference/calling default constructor of child clas..first it will call default constructor of parent class
	}

}
