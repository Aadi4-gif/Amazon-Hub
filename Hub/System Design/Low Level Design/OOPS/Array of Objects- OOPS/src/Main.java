public class Main {
    public static void main(String[] args){
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

        for(int i=0; i<students.length; i++){
//            If you print the array without specifying in the print statement, it will print the address of the array objects elements instead specify the parameters as given below.
            System.out.println(students[i].rollNo + "-" + students[i].name + "-" + students[i].marks + ".");
        }
    }
}
