
public class ReturninganObject {

	int a;
	int b;
	String c;
	ReturninganObject(){
		
	}
	
ReturninganObject(int a,int b){
	this.a=a;
	this.b=b;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReturninganObject obj1=new ReturninganObject();
		ReturninganObject obj=	ReturninganObject.rob();
		//ReturninganObject obj1=	obj1.rob1();
		//System.out.println(rb.a);
		
		
	}
	public static ReturninganObject rob(){
		return new ReturninganObject(1,2);
	}
	
	public ReturninganObject rob1(){
		return new ReturninganObject(1,2);
	}

}
