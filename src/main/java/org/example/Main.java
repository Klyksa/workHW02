package org.example;

public class Main {
    public static void main(String[] args) {
        University university = new University();
        university.setId("119991");
        university.setFullName("Московский государственный университет");
        university.setShortName("МГУ");
        university.setYearOfFoundation(1949);
        university.setMainProfile(StudyProfile.ENGINEERING);

        Student student = new Student();
        student.setFullName("Кирилл Приказчиков");
        student.setUniversityId("119991");
        student.setCurrentCourseNumber(2);
        student.setAvgExamScore(85.5f);

        System.out.println("Информация об университете:\n" + university);
        System.out.println("\nИнформация о студенте:\n" + student);
    }
}