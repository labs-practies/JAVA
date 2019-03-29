import by.gsu.pmslab.Student;
import java.util.*;
public class Runner {
    public static void main(String[] args) {
        Student[] students = {
                new Student("Ivanov", 19, true),
                new Student("Sukachev", 21, false),
                new Student("Ivanov", 18, false),
                new Student("Vinogradov", 19, true),
                new Student("Sinugin", 20, true),
                new Student("Ivanov", 21, false),
                new Student("Kosterev", 22, true),
                new Student("Ivanov", 18, false),
                new Student("Yarosevich", 20, true),
                new Student("Sokolov", 21, true),
        };
        for (Student i : students) {
            System.out.println(i);
        }
        System.out.println("____________\n");

        Arrays.sort(students,new Comparator<Student>(){
            public int compare(Student o1, Student o2){
                return o1.getAge()-o2.getAge();
            }
        });
        for (Student i : students) {
            System.out.println(i);
        }
        System.out.println("______________\n");
        Arrays.sort(students,new Comparator<Student>(){
            public int compare(Student o1, Student o2){
                return o1.getLastName().compareTo(o2.getLastName());
            }
        });
        for (Student i : students) {

            System.out.println(i);
        }

        int sum = 0;
        for (Student i : students) {
            if (i.isDebt()) {
                sum++;
            }
        }
        System.out.println("Сумма: " + sum);
        int sumOfAge = 0;
        for (Student i : students){
        sumOfAge += i.getAge();
        }
        System.out.println("Среднее значение: "+ (double)sumOfAge/students.length);


    }
}
