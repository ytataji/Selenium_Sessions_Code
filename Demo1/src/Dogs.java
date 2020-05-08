
 public class Dogs {

	/**
	 * @param args
	 */

static String breed;
int Age;
String color;
double expense_per_month;
String browser;
static int x=10;
static String empname="tataji";


public Dogs(){
	
}

public Dogs(String breed,int Age,String color,double expense_per_month){
	this.breed=breed;
	this.Age=Age;
	
	this.color=color;
	this.expense_per_month=expense_per_month;

}

public Dogs(String breed,int age,String color){
	
	this.breed="tataji";

}

//overload--when it has same name and different number of arguments.--it is applicable to both

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dogs dogsobject=new Dogs();
		Dogs dogsobject2=new Dogs();
		Dogs dogsobject3=new Dogs("husky",25,"blue",100.56);
		Dogs dogsobject4=new Dogs("busky",25,"blue");
		dogsobject3.Age=30;
		//what is the use of the constructor to initialize the fields/variables in the class;
		
		//dogsobject2 should contain only breed,age,color
		

		
	
		//System.out.println(dogsobject4.breed);
		System.out.println(dogsobject.breed);
		int j=10;
	
	System.out.println(dogsobject4.abcd());
	
		//System.out.println(dogsobject4.expense_per_month);
		
		//System.out.println(dogsobject.addition(8, 9));
	}
	
public int addition(int a ,int b){
	a=5;
	b=10;
	return a+b;
			
}
//what is method signature ;;name of the method+

public int addition(int a,int b,int c){
	return a+b+c;
}

public int addition(double a,double b){
	return 0;
}
public static void main(int args){
	
}



public Dogs abcd(){
	
	Dogs d=new Dogs("sony",25,"blue");
	return d;
}

}
