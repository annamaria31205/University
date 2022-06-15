import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        Address address1 = new Address("Minsk", "Blue", 60, 346);
        Address address2 = new Address("Minsk", "Green", 31, 104);
        Address address3 = new Address("Minsk", "Red", 78, 45);

        Teacher teacher1 = new Teacher("Tatsiana", "Kondratuk", 60, address1, 516.94);
        Teacher teacher2 = new Teacher("Galina", "Artyomenko", 34, address3, 603.09);

//2 курс
        Student student1 = new Student("Vasya", "Zhyk", 17, address1);
        Student student2 = new Student("Maryia", "Kashevich", 18, address2);
        Student student3 = new Student("Karl", "Zhyk", 16, address1);
//1 курс
        Student student4 = new Student("Victor", "Morozov", 16, address1);
        Student student5 = new Student("Michael", "Bedov", 16, address2);
        Student student6 = new Student("Anna", "Golub", 17, address3);


        List<Student> st1 = new ArrayList<>();
        st1.add(student1);
        st1.add(student2);
        st1.add(student3);
        st1.stream()
                .forEach(s -> {
                    System.out.println(s);
                });

        List<Student> st2 = new ArrayList<>();
        st2.add(student4);
        st2.add(student5);
        st2.add(student6);
        st2.stream()
                .forEach(s -> {
                    System.out.println(s);
                });





        List<Teacher> tch = new ArrayList<>();
        tch.add(teacher1);
        tch.add(teacher2);
        //вывести учителей с отпределенной з/п
        tch.stream()
                .filter(s -> s.salary >= 600)
                .forEach(s -> {
                    System.out.println(s);
                });
        ExceptionUtil.checkAge(teacher1.age);
        ExceptionUtil.checkAge(teacher2.age);
        Collections.sort(tch);
        System.out.println(tch);


        Group group1 = new Group("AZ", 2, st1, teacher1, 2024, 2020);
        System.out.println("First group:  " + group1);
        Group group2 = new Group("AB", 1, st2, teacher2, 2025, 2021);
        System.out.println("Second group:  " + group2);

        List<Group> gr = new ArrayList<>();
        gr.add(group1);
        gr.add(group2);

//сортировка по дате выпуска
        gr.stream()
                .filter(s -> s.yearOfGraduate >= 2025)
                .forEach(s -> {
                    System.out.println("Year of graduate > 2025 in group: " + s);
                });


    }
}