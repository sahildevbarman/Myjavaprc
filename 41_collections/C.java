import java.util.Arrays;

class C {
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
        
        Arrays.sort(x);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        

        for(Student next : x) {
            System.out.print(next + "\t");
        }
    }
}


class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + "$" + age;
    }
}




// Exception in thread "main" java.lang.ClassCastException: class Student cannot be cast to class java.lang.Comparable (Student is in unnamed module of loader 'app'; java.lang.Comparable is in module java.base of loader 'bootstrap')
//         at java.base/java.util.ComparableTimSort.countRunAndMakeAscending(ComparableTimSort.java:320)
//         at java.base/java.util.ComparableTimSort.sort(ComparableTimSort.java:188)
//         at java.base/java.util.Arrays.sort(Arrays.java:1249)
//         at C.main(C.java:19)