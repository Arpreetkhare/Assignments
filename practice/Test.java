
import java.util.Scanner;


class Test{

    public static void matrix(int [][] arr1 , int [][] arr2){

		System.out.println("Enter elements for first matrix:");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }

        // Input for second matrix
        System.out.println("Enter elements for second matrix:");
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }
        

        for (int i =0 ; i<arr1.length ; i++){
            for ( int j=0 ; j<arr1[i].length;j++){
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();


        }

        for (int i =0 ; i<arr2.length ; i++){
            for ( int j=0 ; j<arr2[i].length;j++){
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();


        }
    }
        
    public static void addMatrix( int arr1 [] [] , int arr2[][] ){

        System.out.println("add is");

        for (int i = 0 ;i<arr1.length;i++){
            for (int j = 0 ; j<arr1[i].length;j++){
				System.out.print(arr1[i][j] + arr2[i][j]+"\t");
                                             
            }
            System.err.println();

        }

    }

    public static void subtractMatrix( int arr1 [] [] , int arr2[][] ){

        System.out.println("add is");

        for (int i = 0 ;i<arr1.length;i++){
            for (int j = 0 ; j<arr1[i].length;j++){
				System.out.print(arr1[i][j] - arr2[i][j]+"\t");
                                             
            }
            System.err.println();

        }

    }


    public static void Transpose( int arr1 [] [] ){

        System.out.println("Transpose is ");
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int colms = sc.nextInt();

        int transpose [] [] = new int [rows][colms];

        for (int i = 0 ;i<rows;i++){
            for (int j = 0 ; j<colms;j++){
                transpose[j][i] = arr1[i][j];
                                             
            }
            System.err.println();

        }  

        for (int i = 0; i < transpose.length; i++) {
            for (int j = 0; j < transpose.length; j++) {
                System.out.print(transpose[i][j] + "\t");
            }
            System.out.println();
        }

    }
    

    

    

    public static void main ( String [] args){
        int [][]arr1 = new int [2][2];
        int[][] arr2 = new int [2][2];



        matrix(arr1,arr2);
        System.out.println("\nMatrix Output:");
        addMatrix(arr1, arr2);
        subtractMatrix(arr1, arr2);
        Transpose(arr1);
        

    }
}
    
