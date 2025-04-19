
public class Part1 {

    // Sum of 50 natural numbers
    public static int SumOf50NaturalNmumbers (){


        int sum = 0;
        int i;
        for(i=1 ; i <= 50 ; i++){
            sum = sum + i;

        }
        return sum ;

    }

    //Factorial of the number 10

    public static int FactorialOf10(){
        int fact = 1;
        int i;
        for(i=1 ; i <= 10 ; i++){
            fact = fact * i ;
        }
        return fact ;
    }


    //Multiples of 7 

    public static void multiplesOf7() {
        for (int i = 7; i <= 100; i += 7) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // reversed digits
    public static int reverseDigits(int number) {
        int reversed = 0;
        while (number > 0) {
            int num = number % 10 ;

            reversed = reversed * 10 + num;
            number /= 10;
        }
        return reversed;
    }

    // fibonacci up to 21
    public static void fibonacciUpTo21() {
        int a = 0, b = 1;
        while (a <= 21) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }

    //first 5 numbers 
    public static void first5Primes() {
        int count = 0, num = 2;
        while (count < 5) {
            if (isPrime(num)) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
        System.out.println();
    }
    // to cheak whether number is prime or not
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    //sum of digits
    public static int sumOfDigits(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    // coundown
    public static void countdown() {
        for (int i = 10; i >= 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    //largest digit 
    public static int largestDigit(int number) {
        int largest = 0;
        while (number > 0) {
            int digit = number % 10;
            if (digit > largest){
                largest = digit;

            }
            number = number / 10;
            }
            return largest;
    }

    // evennumber 1 to 50
    public static void evenNumbers1to50() {
        for (int i = 2; i <= 50; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void preIncrementPostDecrement() {
        int a = 5;
        int b = 10;
        int result = ++a + b--;
        System.out.println("Result of ++a + b--: " + result);
        System.out.println("Value of a after operation: " + a);
        System.out.println("Value of b after operation: " + b);
    }



    public static void main(String[] args) {
        System.out.println("Sum of 50 natural numbers is " + SumOf50NaturalNmumbers());
        System.out.println("Factorial of 10 is " + FactorialOf10());
        multiplesOf7();
        System.out.println("Reversed number 1234: " + reverseDigits(1234));
        System.out.println("Fibonacci sequence up to 21:");
        fibonacciUpTo21();
        System.out.println("First 5 prime numbers:");
        first5Primes();
        System.out.println("Sum of digits of 9876: " + sumOfDigits(9876));
        System.out.println("Countdown from 10 to 0:");
        countdown();
        System.out.println("Largest digit in 4825: " + largestDigit(4825));
        System.out.println("Even numbers between 1 and 50:");
        evenNumbers1to50();
        System.out.println("Pre-increment and Post-decrement demonstration:");
        preIncrementPostDecrement();
    }


}