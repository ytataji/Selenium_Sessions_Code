
public class DifferentLoopingTechniques {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*System.out.println("Printing number from 1 to 10");
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
		System.out.println(6);
		System.out.println(7);
		System.out.println(8);
		System.out.println(9);
		System.out.println(10);*/
	System.out.println("Printing number from 1 to 10 in a different approach");
	/*int j=10;
	j++;
	
	++j;
	
	System.out.println(j);*/
//int j=10;
	   //Code of Java for loop  
	/* for(int i=1;i<=10;++i){  
	        System.out.println(i);  
	        
	        
	    }*/ 
	 //explanation:
	// 1)initialization
	 //repeated
	 //2)condition check
	 //3)go to the body
	 //4)increment operation
	 
	// System.out.println(i);
	 //variales;local,instance,static
	/* 
	 System.out.println("Printing two conditions in for loop");
	 for(int i=0,k=0;(i<=5 &&  k<=5);i++,k++){  
		 System.out.println(i+"*"+k+"="+(i*k));
		 
	    }  */
	 
	/*int a=3;
	int b=3;
	System.out.println(a+b);
	//+ sign can also be used for concatination 
	System.out.println("Sum of two number"+(a+b)+6);*/
/*System.out.println("Nested for loop");
	//loop of i  
	 for(int i=1;i<=3;i++){  
	 //loop of j  
	 for(int k=1;k<=3;k++){  
	         System.out.println(i+" "+k);  
	         
	 }//end of k 
	 }//end of i
	 System.out.println("my for loop was ended");*/
	 //take a notebook and pen
	 //i=1 && condition passed i<=3
	 //it entered into the body
	 //body is again for loop
	 //initailz condition chek body
	 //i=1, 1 1 1 2 1 3 
	 //if i asked you to print 1 to 10 tables upto 10's
	
	 
	/* System.out.println("Pyramid example using two for loops");
	  int count=065;
		 for(int i=1;i<=5;i++){  
		 for(int m=1;m<=i;m++){  
			 //065--character--a
			 
		         System.out.print("a ");  
		         syso(" b")
		         count=count+1;
		 }  
		 System.out.println();//new line  
		 }  */
		 //i=1,m=1,condition 1<=1 true...i=2 ,what are the values for m 1,2 
		/* System.out.println("*");
		 System.out.println("* *");
		 System.out.println("* * * ");
		 System.out.println("* * * *");
		 System.out.println("* * * * *");*/
	
	//System.out.println("Basic while loop");	 
	/*  
    while(g<=10){  
        System.out.println(g);  
        //sta
        //st
    g++;  
	} */ 
   /* System.out.println("Printing infinte loop");
    int g=1;
    while(g>0){  
        System.out.println("infinitive while loop");  
      }  
    System.out.println("Basic do  while loop");*/
    /*int i=1;  
    do{  
        System.out.println(i);  
    i++;  
    }while(i<=10);  */
    
    //From starting of putting your card into atm until you get the money
    //can anybody tell me the program inside??
    
   //java break statement usage
    
  /*  for(int n=1;n<=10;n++){  
        if(n==5){  
            //breaking the loop  
            break;  
        }  
        System.out.println(n);  
    }  */
   /* for(int m=1;m<=3;m++){    
        //inner loop  
        for(int n=1;n<=3;n++){    
            if(m==2&&n==2){    //m=1 and n=1 m=1, n=2 m=2,n=1 m=2 ,n=2
                //using break statement inside the inner loop  
                  
            }    
            System.out.println(m+" "+n);    
        }  
       break;
       }    */
   
    
    //m=1,n=1 -->11 
    //m=1,n=2== 1 2
    //m=1,n=3==1 3 
 
    //ys-1 1,1 2,1 3
    //maheswari--same output as previous program
    //soujanya-- 11,12,13,21,22,23,31,32,33
    //pushpa--same output as previous program
	
    /*System.out.println("Labelled for loop to use break");
    aa:  
        for(int m=1;m<=3;m++){    
                bb:  
                for(int n=1;n<=3;n++){    
                    if(m==2&&n==2){    
                        //using break statement with label  
                        break aa;    
                    }    
                    System.out.println(m+" "+n);    
                } 
    System.out.println("Iterating round : "+m);
    
        }    */
    
    System.out.println("continue statement");
  //ex:if don't want to give hike to somebody
    //trataji,mano,soo/
    for(int m=1;m<=10;m++){  
        if(m==5){  
            //using continue statement 
        	
            continue;//it will skip the rest statement  
        }  
        System.out.println(m);  
    }  
    
	
	}	
}
