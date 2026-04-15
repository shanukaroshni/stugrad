package com.student;

import org.junit.Test;
import static org.junit.Assert.*;

public class StudentGradeTest {

    // Test Case 1: Check correct grade assignment
    @Test
    public void testGradeAssignment() {
        StudentGrade student = new StudentGrade("Alice", 85);
        assertEquals("B", student.getGrade());
    }

    // Test Case 2: Check if student passed or failed
    @Test
    public void testPassOrFail() {
        StudentGrade passingStudent = new StudentGrade("Bob", 60);
        StudentGrade failingStudent = new StudentGrade("Charlie", 40);

        assertTrue(passingStudent.hasPassed());
        assertFalse(failingStudent.hasPassed());
    }

    // Test Case 3: Check percentage calculation
    @Test
    public void testPercentageCalculation() {
        StudentGrade student = new StudentGrade("Diana", 75);
        double percentage = student.getPercentage(100);
        assertEquals(75.0, percentage, 0.01);
    }
}
