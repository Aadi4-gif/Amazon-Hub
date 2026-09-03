import java.util.*;
public class Main {
    public static void main(String[] args){

        int arr[][] = new int[3][4];
        int random = 0;
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                // This is an inbuilt function which is used to generate random values. This function has double values, which can be converted into int by using type casting(int)(Math.random()*100), we are multiplying by 100 because it will convert the decimal into integer.
                arr[i][j] = (int)(Math.random()*100);
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

//        Enhanced for loop;
//        here n is a variable which contains each array. to get the elements of that array another loop is initialized.
        for(int n[] : arr){
            for(int m:n){
                System.out.print(m + " ");
            }
            System.out.println();

        }
    }
}