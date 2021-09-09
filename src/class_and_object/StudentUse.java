package class_and_object;

import java.util.Scanner;

public class StudentUse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Student s1 = new Student();
        s1.name = "ankush";
        s1.rollNo = 123;
        Student s2 = new Student();
        s2.name = "anushka";
        s2.rollNo = 456;
        Student s3 = new Student();
        s3.name = "radhe";
        s3.rollNo = 789;
        System.out.println(s1.name);
        System.out.println(s1.rollNo);
        System.out.println(s2.name);
        System.out.println(s2.rollNo);
        System.out.println(s3.name);
        System.out.println(s3.rollNo);
    }
}
