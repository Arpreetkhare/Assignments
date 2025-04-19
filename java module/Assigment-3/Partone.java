import java.util.Arrays;
class Partone{


    public static int[] largestSmallest(int arr []){
        int max = arr[0];

        int min = arr[0];

        for ( int i = 1  ; i<arr.length ; i++){
            if (arr[i] > max){
                max = arr[i]; 
                }
            if (arr[i] < min){
                min = arr[i];

            } 


        }
        return new int[]{ max, min }; 
    }  


    public static int [] ReversedArray( int arr []){

        int i = 0;
        int j = arr.length - 1 ;

        while (i<=j){
            int temp = arr[i];
            arr[i] = arr[j] ;
            arr[j] = temp;
            i++;
            j--;


        }
        return arr;
        
    } 


     public static int secondLargest(int arr []){
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;


        for ( int i = 0  ; i<arr.length ; i++){
            if (arr[i] > max){
                secondMax=max;
                max = arr[i];
            }

            else if ( arr[i] > secondMax && arr[i] < max ){
                secondMax = arr[i];
            }

        }
        return (secondMax == Integer.MIN_VALUE) ? -1 : secondMax; 
       
    } 

    public static int AvegSum( int [] arr){
        int sum = 0 ;
        
        
        for ( int i = 0 ; i<arr.length ; i++){
            sum += arr[i];

        }
        int averag = sum / arr.length;
        return averag ;
    }  

    public static int[] margetwoArray(int arr1 [] , int arr2[]){
        int i=0;
        int j=0;
        int k=0;

        int [] temp = new int[arr1.length + arr2.length];

        while (i<arr1.length && j < arr2.length){
            if (arr1[i] <= arr2[j]){
                temp[k] = arr1[i];
                i++;
                k++;

            }
            else {
                temp[k] = arr2[j];
                j++;
                k++;
            }
        }    

        while ( i < arr1.length){
            temp[k] = arr1[i];
            i++;
            k++;
        }

        while ( j < arr2.length){
            temp[k] = arr2[j];
            j++;
            k++;
        }
        return temp ;
       




     }

    public static int Missingnumber(int [] arr ){
        int n = arr.length+1;
        int total = (n * (n + 1))/2 ;
        int sum = 0 ;

        for ( int i =0 ; i<n-1 ; i++){
            sum += arr[i];

        }
        return total - sum ;
    }

    public static void find(){
        int [] arr3 = new int[20] ;

        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = i + 1;
        }
        System.out.println("Array Initialized: " + Arrays.toString(arr3));

        int even = 0;
        int odd = 0;
        int multipulOfNumber3 = 0;
        for ( int i = 0 ; i<arr3.length ; i++){
            if (arr3[i] % 2 == 0){
                even++;

            }

            if ( arr3[i] %3 == 0){
                multipulOfNumber3++;
            }

            if ( arr3[i] % 2 !=0){
                odd++;
            }


        }  

        System.out.println("Even numbers count: " + even);
        System.out.println("Odd numbers count: " + odd);
        System.out.println("Multiples of 3 count: " + multipulOfNumber3);

    }
       




    public static void main(String[] args) {
        int[] arr = {1, 2, 3,5};
        int[] arr1 = {6, 7, 8, 9, 10};
        int[] arr2 = {11, 12, 13, 14, 15};
        
        find();



        int[] result = largestSmallest(arr);
        int[] reversed = ReversedArray(arr);
        int secondLargest = secondLargest(arr);
        int average = AvegSum(arr);
        int[] margee = margetwoArray(arr1, arr2);
        int missing = Missingnumber(arr);
        System.out.println("Max and Min: " + Arrays.toString(result));
        System.out.println("Reversed Array: " + Arrays.toString(reversed));
        System.out.println("Second Largest: " + secondLargest);
        System.out.println("Average: " + average);
        System.out.println("Merged Array: " + Arrays.toString(margee));
        System.out.println("Missing Number: " + missing);


    }
}
