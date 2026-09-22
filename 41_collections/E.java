import java.util.Arrays;
import java.util.Comparator;

class E {
    public static void main(String[] args) {
        Student[] x = {
            new Student("umesh", 45),
            new Student("aman", 21),
            new Student("vigyan", 32),
            new Student("ekta", 28),
            new Student("mukta", 19)
        };

        for(Student next : x) {
            System.out.print(next + "\t");
        }

        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        
        Arrays.sort(x, new ADS());

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        

        for(Student next : x) {
            System.out.print(next + "\t");
        }
    }
}

class ADS implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return s2.age.compareTo(s1.age);
    }
}

class Student {
    String name;
    Integer age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + "$" + age;
    }
}