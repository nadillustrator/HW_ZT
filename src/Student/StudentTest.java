package Student;

public class StudentTest {
    public static void main(String[] args) {
        Student st1 = new Student();
        st1.numberOfStudentTicket = 123;
        st1.name = "Ivan";
        st1.surname = "Ivanov";
        st1.yearOfStudy = 2014;
        st1.averageMathScore = 4.6;
        st1.averageEconomyScore = 5;
        st1.averageLanguageScore = 3.8;

        Student st2 = new Student();
        st2.numberOfStudentTicket = 456;
        st2.name = "Ury";
        st2.surname = "Gagarin";
        st2.yearOfStudy = 2008;
        st2.averageMathScore = 3.6;
        st2.averageEconomyScore = 3.8;
        st2.averageLanguageScore = 4.3;

        Student st3 = new Student();
        st3.numberOfStudentTicket = 789;
        st3.name = "Pavel";
        st3.surname = "Popov";
        st3.yearOfStudy = 2018;
        st3.averageMathScore = 4.8;
        st3.averageEconomyScore = 4;
        st3.averageLanguageScore = 4.2;





        Student.info(st1);
        Student.averageCommonScore(st1);
        System.out.println();
        Student.info(st2);
        Student.averageCommonScore(st2);
        System.out.println();
        Student.info(st3);
        Student.averageCommonScore(st3);

    }
}