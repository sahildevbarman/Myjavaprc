import java.util.Arrays;

class G {
    public static void main(String[] args) {
        Student[] x = {
                new Student("umesh", 45),
                new Student("aman", 21),
                new Student("vigyan", 32),
                new Student("ekta", 28),
                new Student("mukta", 19)
        };

        Arrays.sort(x);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        for (Student next : x) {
            System.out.print(next + "\t");
        }
        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        Student y = new Student("mukta", 22);
        System.out.println(Arrays.binarySearch(x, y));
    }
}

class Student implements Comparable<Student> {
    String name;
    Integer age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + "$" + age;
    }

    public int compareTo(Student x) {
        return x.age.compareTo(this.age);
    }
}