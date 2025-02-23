
public class Task {

    //positive number
    public static boolean Positive(int num) {
        if (num > 0) {
            return true;
        }
        

        return false;

    };

    // Negative number
    public static boolean Negative(int num) {
       return num < 0 ;

    };

    // Odd or even
    public static String OddOrEven(int num){
        if (num % 2 == 0) {
            return "Even";
        }
        return "Odd" ;  
    }


    // Greeting
    static void displayGreeting(int time) {
        if (time >= 5 && time < 12) {
            System.out.println("Good Morning!");
        } else {
            System.out.println("It's not morning time.");
        }
    }


    //Area of square
    public static double side = 25; // 1st way to Predefined number
    public static double  calculateAreaOfSquare() {
        double area = side * side;
        return area;
    }

    //Area of rectangular
    public static double  calculateAreaOfRectangle(double  length, double width) {
        double area = length * width;
        return area ;

        
    }

    // Largest number 
    public static int  findLargest(int a, int b, int c) {
        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b ;
        } else {
            return c ;
        }
    }






    public static void main(String[] args) {

        //Check Positive Number: 
        System.out.println(Positive(5)); // prints: true
        System.out.println(Positive(-5)); // prints: False

        // Check Negative Number: 
        System.out.println(Negative(5)); // prints: False
        System.out.println(Negative(-5)); // prints: true

        //Check Odd or Even Number: 
        System.out.println("Number is an "+ OddOrEven(5)); // prints: Odd
        System.out.println("Number is an "+ OddOrEven(6)); // prints: Even

        // Display Good Morning Message Based on Time: 
        displayGreeting(13); // prints: It's not morning time.
        displayGreeting(6); // prints: Good Morning!

        // Print Area of a Square: 
        // System.out.println(Task.calculateArea(25)); //prints: 625.0!
        System.out.println("Area of the Square is " + calculateAreaOfSquare()); //prints: 625.0!

        // Print Area of a Rectangle: 
        double length = 20 ;
        double width = 30 ;
        System.out.println("Area of the Rectangular is " + calculateAreaOfRectangle(length, width)); // prints: 600.0


        // Find the Largest of Three Numbers: 
        int num1 = 15; // 2nd way to Predefined numbers
        int num2 = 42;
        int num3 = 27;
        System.out.println("The largest number among them is " + findLargest(num1, num2, num3)); //prints: 42




    }
}


