public class ResultModule {
    
    public String calculateGrade(double avg) {
        if (avg >= 90) return "A+";
        else if (avg >= 75) return "A";
        else if (avg >= 60) return "B";
        else if (avg >= 50) return "C";
        else return "Fail";
    }

    public void displayResult(StudentModule s, MarksModule m) {
        double avg = m.averageMarks();
        String grade = calculateGrade(avg);

        System.out.println("\n--- Final Result ---");
        s.displayStudent();
        m.displayMarks();
        System.out.println("Average: " + avg + ", Grade: " + grade);
    }
}
