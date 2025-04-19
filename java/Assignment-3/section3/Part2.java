public class Part2{
    public static void FirstPattern(){
        for (int i = 0; i < 5; i++) {        // Loop for rows
            for (int j = 0; j < 5; j++) {    // Loop for columns
                System.out.print("*");
            }
            System.out.println();           // Move to the next line after each row
        }


    }
    //14Teenth pattern
    public static void SecondPattern(int n){
        for (int i = 1; i <= n; i++) {        // Loop for rows
            for (int j = 1; j <=i; j++) {    // Loop for columns
                System.out.print("*");
            }
            System.out.println();           // Move to the next line after each row
        }


    }
    //19th pattern
    public static void The19stPattern( int n){
        for (int i = 1; i <= n; i++) {        // Loop for rows
            for (int j = 1; j <=i; j++) { 
                System.out.print(j);
                if (j < i) {
                System.out.print("*");

                }   // Loop for columns
            }
            System.out.println();           // Move to the next line after each row
        }




    }

    //20th pattern
    public static void The20stPattern( int n){
        int odd = 5;
        for (int i = 1; i <= n; i++) { 
            odd = 5;

            for (int j = 1; j <=i; j++) { 
                System.err.print(odd);

                if ( j < i) {
                System.out.print("*");

                }


                odd--;
            }
            System.out.println();           // Move to the next line after each row
        }




    }


    //21th pattern
    public static void The21stPattern( int n){
        int odd = 1;
        for (int i = 1; i <= n; i++) { 
            odd = 1; 

            for (int j = 1; j <=i; j++) { 
                System.err.print(odd);

                if ( j < i) {
                System.out.print("*");

                }


                odd = odd +2;
            }
            System.out.println();           // Move to the next line after each row
        }




    }

    //25Teenth pattern

    public static void The25stPattern( int n){
        for (int i = 1; i <= n; i++) {        // Loop for rows
            for (int j = 1; j <=i; j++) {    // Loop for columns
                System.out.print(j);
            }
            System.out.println();           // Move to the next line after each row
        }




    }

    //23Teenth pattern


    public static void The23stPattern( int n){
        for (int i = 1; i <= n; i++) {        // Loop for rows
            for (int j = 1; j <=n; j++) {    // Loop for columns
                System.out.print(i);
            }
            System.out.println();           // Move to the next line after each row
        }




    }


    //24Teenth pattern
    public static void The24stPattern( int n){
        for (int i = 1; i <= n; i++) {        // Loop for rows
            for (int j = 1; j <=i; j++) {    // Loop for columns
                System.out.print(i);
            }
            System.out.println();           // Move to the next line after each row
        }

    }

    //26Teenth pattern
    public static void The26stPattern( int n){
        for (int i = 1; i <= n; i++) {        // Loop for rows
            for (int j = 1; j <=i; j++) {    // Loop for columns
                System.out.print(j);
            }
            System.out.println();           // Move to the next line after each row
        }

    }

    //27Teenth pattern
    public static void The27stPattern( int n){
        int num = 1;
        for (int i = 1; i <= n; i++) {        // Loop for rows
            for (int j = 1; j <=i; j++) {    // Loop for columns
                System.out.print(num);
                num++;
            }
            System.out.println();           // Move to the next line after each row
        }

    }
    //13teen patern

    public static void The13stPattern(int n) {
        for ( int i=1 ; i <=n ;i++){
            for (int j = 1 ; j <= i ;j++){
                System.out.print(i);
                if (j<i){
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        for ( int i=n ; i >=1 ; i--){
            for (int j = 1 ; j<=i ; j++){
                System.out.print(i);
                if (j<i){
                    System.out.print("*");
            }
            }
            System.out.println();


        }        
    }


    //15teen pattern
    public static void The15TeenPattern(int n){
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }


            for (int j = i ; j <n ; j++){
                System.out.print("*");
            }

            for (int j = i ; j <=n ; j++){
                System.out.print("*");
            }
            System.out.println();
        } 
    }  


    //17teen pattern

    public static void The17teenPattern(int n){

    for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print(" ");
            } 
            System.out.println();
        }
    }


    //16teen pattern
    public static void pyramid(int n) {
        for (int i = 1; i <= n; i++) {
            // Spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Stars (2*i - 1 for odd number of stars per row)
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }





    





    public static void main(String[] args) {
        FirstPattern();
        System.out.println();
        SecondPattern(5);
        System.out.println();
        The25stPattern(5);
        System.out.println();
        The23stPattern(5);
        System.out.println();
        The24stPattern(5);
        System.out.println();
        The26stPattern(5);  
        System.out.println();
        The27stPattern(5);
        System.out.println();
        The19stPattern(5);
        System.out.println();
        The21stPattern(5);
        System.out.println();
        The20stPattern(5);
        System.out.println();
        The13stPattern(5);
        System.out.println();
        The15TeenPattern(5);
        System.out.println();
        The17teenPattern(5);
        System.out.println();
        pyramid(5);



        



        
    }
}