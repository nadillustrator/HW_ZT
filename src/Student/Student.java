package Student;

public class Student {
    int numberOfStudentTicket; //instance variables
    String name; //instance variables
    String surname;  //instance variables
    int yearOfStudy;
    double averageMathScore;
    double averageEconomyScore;
    double averageLanguageScore;


    public static void averageCommonScore(Student student) {
        double average = (student.averageEconomyScore + student.averageMathScore + student.averageLanguageScore) / 3;
        String result = String.format("%.3f", average);
        System.out.println("has average common grade :" + result);
    }

    static void info(Student student){
        System.out.println("Student " + student.name + " " + student.surname);
        System.out.println("ID: " + student.numberOfStudentTicket);
        System.out.println("Graduation year: " + student.yearOfStudy);
    }

}
