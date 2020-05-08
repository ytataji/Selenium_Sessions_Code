
public class ifelseifelse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//example for if
		int x =4;
		//relational operators will provide you return type of boolean true or false
		if(x>10){
			System.out.println("Given number is greater than 5");
		}
		
		
	char c='A';
	if(c=='A'){
		
		System.out.println("Given character is A");
	}
		//example for if-else
	
	int a=100;
	if(a>0){
		System.out.println("Given number is positive number ");
	}
	else{
		System.out.println("Given number is negative number");
	}
	//example for if-else if-else
	int Marks=200;
	if(Marks>=150 && Marks<=175){
		System.out.println("You secured Grade A");
	}
else if(Marks>175){
		System.out.println("YOu secured GRade A++");
	}
	else if(Marks<150 && Marks >=100){
		System.out.println("You securd grade b");
		
	}
	else{
		System.out.println("You are not passed");
	}
	//example for nested if(When ever there is a minimum qualification required)
	int first_round_marks=10;
	int second_round_marks=8;
	int third_round_marks=5;
	if(first_round_marks>=10)
	{
		if(second_round_marks>=8){
			if(third_round_marks>=5){
				System.out.println("Candidate has been selected");
			}
			else{
				System.out.println("Sorry you can't pass through the third round");
			}
			
		}
		else{
			System.out.println("sorry you can't pass through the second round");
		}
	}
	else{
		System.out.println("sorry you can't pass trhough the first round");
	}
	}

}
