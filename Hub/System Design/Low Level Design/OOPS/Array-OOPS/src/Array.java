public class Array {
    public static void main(String[] args){
//        creating array
        int arr[] = {1,2,3};
//        updating array
        arr[1] = 6;
        System.out.println(arr[0]);

//        Empty array without values which is all 5 sizes contains 0.
        int arr1[] = new int[5];
//        Updating empty array
        arr1[0]=1;
        arr1[1]=3;
        arr1[2]=6;
        arr1[3]=5;
        arr1[4]=8;
//        Fetching the values;
        for(int i=0;i<arr1.length;i++){
            System.out.println(arr1[i]);
        }
    }
}
