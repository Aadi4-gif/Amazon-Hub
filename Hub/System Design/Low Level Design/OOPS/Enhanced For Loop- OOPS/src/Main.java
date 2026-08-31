public class Main {
    public static void main(String[] args){
        int arr[] = new int[4];
        arr[0]=4;
        arr[1]=8;
        arr[2]=3;
        arr[3]=4;

//        Enhanced for loop, it allows you to traverse through a collection or array without using indexing, counter, range, increments, no exception.

        for(int n:arr){
            System.out.print(n + " ");
        }
        System.out.println();
//        2.e.g.
        //      Object creation
        Student s1 = new Student();
        s1.rollNo = 04;
        s1.name = "Aadi";
        s1.marks = 89;

        Student s2 = new Student();
        s2.rollNo = 11;
        s2.name = "Levi";
        s2.marks = 91;

        Student s3 = new Student();
        s3.rollNo = 01;
        s3.name = "Eminem";
        s3.marks = 100;

//        Array of objects
        Student students[] = new Student[3];
        students[0]=s1;
        students[1]=s2;
        students[2]=s3;

// Array of objects, printing using Enhanced for loop.

        for(Student stud:students){
//            If you print the array without specifying in the print statement, it will print the address of the array objects elements instead specify the parameters as given below.
            System.out.println(stud.rollNo + "-" + stud.name + "-" + stud.marks + ".");
        }
    }
}