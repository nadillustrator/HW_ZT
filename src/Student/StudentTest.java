package Student;

public class StudentTest {
    public static void main(String[] args) {
        Student st1 = new Student();
        st1.studentID = 123;
        st1.name = "Ivan";
        st1.surname = "Ivanov";
        st1.yearOfStudy = 2014;
        st1.mathAverageGrade = 4.6;
        st1.economyAverageGrade = 5;
        st1.foreignLanguageAverageGrade = 3.8;

        Student st2 = new Student();
        st2.studentID = 456;
        st2.name = "Ury";
        st2.surname = "Gagarin";
        st2.yearOfStudy = 2008;
        st2.mathAverageGrade = 3.6;
        st2.economyAverageGrade = 3.8;
        st2.foreignLanguageAverageGrade = 4.3;

        Student st3 = new Student();
        st3.studentID = 789;
        st3.name = "Pavel";
        st3.surname = "Popov";
        st3.yearOfStudy = 2018;
        st3.mathAverageGrade = 4.8;
        st3.economyAverageGrade = 4;
        st3.foreignLanguageAverageGrade = 4.2;


        Student.info(st1);
        Student.averageCommonScore(st1);
        Student.info(st2);
        Student.averageCommonScore(st2);
        Student.info(st3);
        Student.averageCommonScore(st3);

    }
}