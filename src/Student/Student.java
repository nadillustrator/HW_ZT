package Student;

public class Student {
    int studentID; //instance variables
    String name; //instance variables
    String surname;  //instance variables
    int yearOfStudy;
    double mathAverageGrade;
    double economyAverageGrade;
    double foreignLanguageAverageGrade;


    public static void averageCommonScore(Student student) {
        double average = (student.economyAverageGrade + student.mathAverageGrade + student.foreignLanguageAverageGrade) / 3;
        String result = String.format("%.3f", average);
        System.out.println(student.name + "has average common grade :" + result);
        System.out.println();
    }

    static void info(Student student){
        System.out.println("Student " + student.name + " " + student.surname);
        System.out.println("ID: " + student.studentID);
        System.out.println("Graduation year: " + student.yearOfStudy);
        System.out.println();
    }

}
