
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





    public static void main(String[] args){
		int a = 9, b = 10;
		check(a);
		check(b);
        Swap(2,10);
        multipleOf3(15);
	}