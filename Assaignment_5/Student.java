package Assaignments.Assaignment_5;

public class Student {
    int ID;
    String name;
    double score;

    Student(int ID, String name, double score) {
        this.ID = ID;
        this.name = name;
        this.score = score;
    }

    Student(int ID, String name) {
        this.ID = ID;
        this.name = name;
        this.score = -1.0;
    }

    public Student withScore(double score) {
        return new Student(this.ID, this.name, score);
    }

    public int getID() {
        return this.ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return this.score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        if (score == -1) {
            return ("(" + ID + ", " + name + ", no score)");
        }
        return ("(" + ID + ", " + name + ", " + score + ")");
    }
}