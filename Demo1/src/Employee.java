
public class Employee {

	/**
	 * @param args
	 */
	String empname="tataji";
	int empid;
	double empsalary;
	char gender;
	public Employee(String empname, int empid,double empsal,char gender){
		this.empname=empname;
		this.empid=empid;
		empsalary=empsal;
		
	}
	//overloading
	public Employee(String empname,int empid){
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp=new Employee("tataji",100,100.50,'M');
		System.out.println(emp.empname);

	}

}
