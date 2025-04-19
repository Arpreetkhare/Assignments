class Task{

    public static void Swap(int a,int b){

            
            System.out.println("Before Swapping: "+a+" "+b);
            a=a^b;
            b=a^b;
            a=a^b;
            System.out.println("after Swapping: "+a+" "+b);
    }

    public static void check(int a){
		if((a&1) == 0){
			System.out.println(a + " is even");
		} else {
			System.out.println(a + " is odd");
		}
	}

    public static void multipleOf3(int n){
       
		if(n<0){
			n=-n;
		}
		
		while(n>3){
			n=(n&3)+(n>>2);
		}
		if(n==0||n==3){
			System.out.println("Division by 3");
		}else{
			System.out.println("Not division by 3");
		}	
    }


    public static void swap2( int a , int b){
		 System.out.println("Before Swap: a = " + a + ", b = " + b);
		 a=a+b;
		 b=a-b;
		 a=a-b;
		 System.out.println("After Swap: a = " + a + ", b = " + b);
    }


    /*Q7: Implement a Java program that checks whether a given year is a leap year or not using
    logical (&&, ||) operators*/
    public static void leapYear(int year){
        if(year%4==0 && (year%100!=0 || year%400==0
        )){
            System.out.println(year + " is a leap year");
        }
        else{
            System.out.println(year + " is not a leap year");
            }

    }


    /*Q8: Write a program that takes three boolean inputs and prints true if at least two of
    them are true.
    Hint: Use logical operators (&&, ||).*/
    public static void check(boolean a,boolean b,boolean c){
		if((a && (b||c)) || (c && (a||b)) || (b && (a||c))){
			System.out.println("true");
		}else{
		System.out.println("false");
		}
	}







    public static void main(String[] args){
		int a = 9, b = 10;
		check(a);
		check(b);
        Swap(2,10);
        multipleOf3(15);
        swap2(10,20);
        leapYear(2020);
        check(true,true,false);
        
	}


}