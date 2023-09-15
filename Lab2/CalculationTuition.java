class Student {
    private String name;
    private int studentNumber;
    private char residencyCode;
    private int creditHours;

    // Constructor
    public Student(String name, int studentNumber, char residencyCode, int creditHours) {
        this.name = name;
        this.studentNumber = studentNumber;
        this.residencyCode = residencyCode;
        this.creditHours = creditHours;
    }

    // Getter and setter methods for attributes
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public char getResidencyCode() {
        return residencyCode;
    }

    public void setResidencyCode(char residencyCode) {
        this.residencyCode = residencyCode;
    }

    public int getCreditHours() {
        return creditHours;
    }

    public void setCreditHours(int creditHours) {
        this.creditHours = creditHours;
    }

    // Method to calculate tuition
    public double calculateTuition() {
        double tuition = 0.0;

        // Define tuition rates based on residency code
        double inStateRate = 95.5;
        double outOfStateRate = 250.0;

        // Calculate tuition based on residency code and credit hours
        if (residencyCode == 'I') {
            tuition = inStateRate * creditHours;
        } else {
            tuition = outOfStateRate * creditHours;
        }

        // Round tuition to two decimal places
        return Math.round(tuition * 100.0) / 100.0;
    }
}

public class CalculationTuition {
    public static void main(String[] args) {
        // Create student objects and test cases
        Student student1 = new Student("Mary Jones", 123456, 'I', 16);
        Student student2 = new Student("John Smith", 789012, 'O', 12);

        // Display information for each student
        displayStudentInfo(student1);
        displayStudentInfo(student2);
    }

    // Method to display student information
    public static void displayStudentInfo(Student student) {
        System.out.println("Student " + student.getStudentNumber() + " " + student.getName() +
                " takes " + student.getCreditHours() + " credit hours, residency=" +
                student.getResidencyCode() + ", tuition = " + student.calculateTuition());
    }
}
