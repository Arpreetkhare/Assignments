//  class Bank {

// 	private double balance;

//     public Bank(){
//         this(500000);
//     }

//     public Bank(double initialBalance) {
//         this.balance = initialBalance;
//     }

//     public double getBalance() {
//         return this.balance;
//     }

	
// 	public static void balance( Bank bank){
// 		System.out.println( "Balance is " + bank.balance);
// 	}

// 	public static void withdraw( int amount , Bank bank){
// 		if ( amount > bank.balance){
// 			System.out.println( " insufficient Balance");

//         }    
// 		else{
// 			bank.balance = bank.balance - amount;
// 			System.out.println( "Balance is " +bank. balance);
// 			}
// 	}

	
// 	public static void deposit( int deposit , Bank bank){
// 		bank.balance = bank.balance + deposit;
// 		System.out.println(" new balance is " + bank.balance);

//     }    

		

// }





// class Customer{
	
// 	public  int id;
// 	public  String name;
// 	public  int age;
// 	public  String phone;
//     public Bank bankAccount ;
// 	// private double balance = 50000;
	
// 	Customer(){
// 		this( 1, "Rahul" , 18 , "1234567891", new Bank());
		
// 	}

// 	public Customer( int id , String name , int age , String phone , Bank bank){
// 		this.id = id ;
// 		this.name = name;
// 		this.age = age;
// 		this.phone = phone;
//         this.bankAccount = bank;
// 	}

   

    

// 	public void  balanceCheck(){
// 		System.out.println( "Balance is " + bankAccount.getBalance() );
// 	}

// }    

// class Demo{
//     public static void main( String [] args){

// 		Bank bank1 = new Bank();
// 		Bank bank2 = new Bank(400400);

		

// 		Customer c = new Customer();
//         Customer c1 = new Customer( 10 , "rahul" ,18, "1234567891" , bank1 );

// 		c1.balanceCheck();
// 		c.balanceCheck();


// 		Bank.deposit(10000, bank2);
// 		Bank.deposit(1000000, bank1);
// 		Bank.withdraw(1000000000, bank2);
		

       




//     }

// }
	


	
	
 


	
 

