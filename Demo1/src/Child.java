
public class Child extends Parent{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child obj1=new Child();
		int x=obj1.add1();
		//System.out.println(x);
		Parent obj2=new Child();//upcasting
		Parent obj3=new Parent();
		//Child obj=new Parent();
		
		System.out.println(obj2.add1());
		//static polymorpishm can be dealt with compile time only//overloading
		//dynamic polymorpishm can be dealt with run time//overriding
		
		//i will ge a,b,c,d,e
		//reusability of the code is possbile with overiding..

	}
	
	public int add1(){
		return 10;
	}
	public int add3(){
		return 10;
	}
	

}
