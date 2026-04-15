package com.student;

public class StudentGrade {

    private String studentName;
    private int marks;

    public StudentGrade(String studentName, int marks) {
        this.studentName = studentName;
        this.marks = marks;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getMarks() {
        return marks;
    }

    // Returns grade based on marks
    public String getGrade() {
        if (marks >= 90) {
            return "A";
        } else if (marks >= 75) {
            return "B";
        } else if (marks >= 50) {
            return "C";
        } else {
            return "F";
        }
    }

    // Returns true if student passed (marks >= 50)
    public boolean hasPassed() {
        return marks >= 50;
    }

    // Returns percentage out of 100
    public double getPercentage(int totalMarks) {
        return ((double) marks / totalMarks) * 100;
    }
}
