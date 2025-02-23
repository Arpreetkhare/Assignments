public class Section3Part2{
    public static void FirstPattern(){
        for (int i = 0; i < 5; i++) {        // Loop for rows
            for (int j = 0; j < 5; j++) {    // Loop for columns
                System.out.print("*");
            }
            System.out.println();           // Move to the next line after each row
        }


    }

    public static void SecondPattern(){
        for (int i = 0; i < 5; i++) {        // Loop for rows
            for (int j = i+1; j < 5; j++) {    // Loop for columns
                System.out.print(i);
            }
            System.out.println();           // Move to the next line after each row
        }


    }

    public static void main(String[] args) {
        FirstPattern();
        System.out.println();
        SecondPattern();
    }
}