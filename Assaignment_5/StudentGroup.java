package Assaignments.Assaignment_5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentGroup{

    ArrayList<Student> StudentGroup = new ArrayList<>();
    
    int max_cap;

    StudentGroup(int max_cap){
        this.max_cap = max_cap;
    }

    public void addStudents(Student[] students){
        for(Student student : students){
            if(StudentGroup.size() >= max_cap){ return; }
            StudentGroup.add(student);
        }
    }

    public void addStudents(Student student){
        if(StudentGroup.size() >= max_cap){ return; }
        StudentGroup.add(student);
    }

    public void printStudents(){
        for(Student student : StudentGroup){
            System.out.println(student.toString());
        }
    }

    public void updateScore(Student student, double score){
        student.setScore(score);
    }
    /*
    "The enum implements the Comparator interface 
    so that the sort method of StudentGroup can invoke the compare method to collate two students."
    
    I have no idea what this means soooo.........
    */
    enum SortOrder{
        BY_ID, BY_NAME, BY_SCORE;
    }

    public void sort(SortOrder sortOrder){
        
        Collections.sort(StudentGroup, new Comparator<Student>(){
            public int compare(Student s1, Student s2){
                switch (sortOrder){
                    case BY_ID:
                        return Integer.valueOf(s1.ID).compareTo(s2.ID);
                    case BY_NAME:
                        return String.valueOf(s1.name).compareTo(s2.name);
                    case BY_SCORE:
                        return Double.valueOf(s2.score).compareTo(s1.score);
                }
                return 0;
            }
        });
    }
}// class 