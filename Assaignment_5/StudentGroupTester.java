package Assaignments.Assaignment_5;

import Assaignments.Assaignment_5.StudentGroup.SortOrder;

public class StudentGroupTester {
    public static void main(String[] args) {
        Student[] class_1 = new Student[4];
        class_1[0] = new Student(444, "Cdef", 70.0);
        class_1[1] = new Student(333, "Jokl") ;
        class_1[2] = new Student(111, "Abco", 100.0);
        class_1[3] = new Student(222, "Ghio", 0.0);

        StudentGroup Software_Engineering = new StudentGroup(5);
        Software_Engineering.addStudents(class_1);
        System.out.println("Before Sort :");
        Software_Engineering.printStudents();
        System.out.println("Sorted by ID :");
        Software_Engineering.sort(SortOrder.BY_ID);
        Software_Engineering.printStudents();
        System.out.println("Sorted by NAME :");
        Software_Engineering.sort(SortOrder.BY_NAME);
        Software_Engineering.printStudents();
        System.out.println("Sorted by SCORE :");
        Software_Engineering.sort(SortOrder.BY_SCORE);
        Software_Engineering.printStudents();
    }
}
