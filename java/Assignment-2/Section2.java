public class Section2 {

    public static void gradeClassification(int score) {
        if (score >= 90) {
            System.out.println("A");
        } else if (score >= 80) {
            System.out.println("B");
        } else if (score >= 70) {
            System.out.println("C");
        } else if (score >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }

    public static void dayOfWeek(int day) {
        switch (day) {
            case 1:
                System.out.println("Monday - Weekday");
                break;
            case 2:
                System.out.println("Tuesday - Weekday");
                break;
            case 3:
                System.out.println("Wednesday - Weekday");
                break;
            case 4:
                System.out.println("Thursday - Weekday");
                break;
            case 5:
                System.out.println("Friday - Weekday");
                break;
            case 6:
                System.out.println("Saturday - Weekend");
                break;
            case 7:
                System.out.println("Sunday - Weekend");
                break;
            default:
                System.out.println("Invalid day number");
        }
    }

    public static void calculator(double num1, double num2, char operator) {
        switch (operator) {
            case '+':
                System.out.println("Result: " + (num1 + num2));
                break;
            case '-':
                System.out.println("Result: " + (num1 - num2));
                break;
            case '*':
                System.out.println("Result: " + (num1 * num2));
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                } else {
                    System.out.println("Result: " + (num1 / num2));
                }
                break;
            default:
                System.out.println("Invalid operator");
        }
    }

    public static double discountCalculation(double totalPurchase, boolean hasMembership) {
        double discount;
        if (totalPurchase >= 1000) {
            discount = 0.20;
        } else if (totalPurchase >= 500) {
            discount = 0.10;
        } else {
            discount = 0.05;
        }
        if (hasMembership) {
            discount += 0.05;
        }
        double finalAmount = totalPurchase - (totalPurchase * discount);
        System.out.println("Final amount after discount: Rs." + finalAmount);
        return finalAmount;
    }

    public static void studentPassFailStatus(int subject1, int subject2, int subject3) {
        int failedSubjects = 0;
        if (subject1 <= 40) failedSubjects++;
        if (subject2 <= 40) failedSubjects++;
        if (subject3 <= 40) failedSubjects++;

        if (failedSubjects == 0) {
            System.out.println("Student passed in all subjects.");
        } else {
            System.out.println("Student failed in " + failedSubjects + " subject(s).");
        }
    }

    

    public static void main(String[] args) {
        gradeClassification(85);
        dayOfWeek(3);
        calculator(15, 3, '/');
        discountCalculation(1000, true);
        studentPassFailStatus(45, 39, 50);
    }
}
