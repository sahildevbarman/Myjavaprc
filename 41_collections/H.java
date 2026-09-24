import java.util.Arrays;
import java.util.Comparator;

class H {
    public static void main(String[] args) {
        Student[] x = {
            new Student("umesh", 45),
            new Student("aman", 21),
            new Student("vigyan", 32),
            new Student("ekta", 28),
            new Student("mukta", 19)
        };

        Comparator<Student> comp = new ADS();

        Arrays.sort(x, comp);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");        
        for(Student next : x) {
            System.out.print(next + "\t");
        }
        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        Student y = new Student("mukta", 22);
        System.out.println(Arrays.binarySearch(x, y, comp));
    }
}

class NAS implements Comparator<Student> {
    public int compare(Student e1, Student e2) {
        return e1.name.compareTo(e2.name);
    }
}

class NDS implements Comparator<Student> {
    public int compare(Student e1, Student e2) {
        return e2.name.compareTo(e1.name);
    }
}

class ADS implements Comparator<Student> {
    public int compare(Student e1, Student e2) {
        return e2.age.compareTo(e1.age);
    }
}

class AAS implements Comparator<Student> {
    public int compare(Student e1, Student e2) {
        return e1.age.compareTo(e2.age);
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