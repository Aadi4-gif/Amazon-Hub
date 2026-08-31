import java.util.*;
public class Main {
    public static void main(String[] args){
// Jagged Array
        int arr[][] = new int[3][];
        arr[0]= new int[3];
        arr[1]= new int[4];
        arr[2]= new int[2];
        int random = 0;
        for(int i=0;i< arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                // This is an inbuilt function which is used to generate random values. This function has double values, which can be converted into int by using type casting(int)(Math.random()*100), we are multiplying by 100 because it will convert the decimal into integer.
                arr[i][j] = (int)(Math.random()*100);
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

//        Enhanced for loop;
//        In enhanced for loop, It can read the values indefinite of the size of the array, for eg jagged array.
//        here n is a variable which contains each array. to get the elements of that array another loop is initialized.
        for(int n[] : arr){
            for(int m:n){
                System.out.print(m + " ");
            }
            System.out.println();

        }

// 3D array
        int arr1[][][] = new int[3][4][5];
        int randoms = 0;
        for(int i=0;i<3;i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 5; k++) {
                    // This is an inbuilt function which is used to generate random values. This function has double values, which can be converted into int by using type casting(int)(Math.random()*100), we are multiplying by 100 because it will convert the decimal into integer.
                    arr1[i][j][k] =(int) (Math.random() * 100);
                    System.out.print(arr1[i][j][k] + " ");
                }

            }System.out.println();
        }

//        Enhanced for loop;
//        In enhanced for loop, It can read the values indefinite of the size of the array, for eg jagged array.
//        here n is a variable which contains each array. to get the elements of that array another loop is initialized.
        for(int[][] n : arr1){
            for(int[] m:n) {
                for (int o:m) {
                    System.out.print(o + " ");
                }
            }
            System.out.println();

        }
    }
}