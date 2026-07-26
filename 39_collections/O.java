import java.util.TreeSet;
import java.io.Console;
import java.util.Comparator;

class O {
    public static void main(String[] args) {
        Console con = System.console();

        System.out.println("Press 1 for NS, \n2 for NDS \n3 for AS\n4 for ADS: ");
        int input = Integer.parseInt(con.readLine());

        Comparator comp = null;

        if (input == 1) {
            comp = new NameSort();
        } else if (input == 2) {
            comp = new NameDscSort();
        } else if (input == 3) {
            comp = new AgeSort();
        } else if (input == 4) {
            comp = new AgeDscSort();
        }

        TreeSet set = new TreeSet(comp);

        set.add(new Student("karthik", 18));
        set.add(new Student("simha", 9));
        set.add(new Student("vijendra", 12));
        set.add(new Student("prasad", 5));
        set.add(new Student("ganesh", 10));

        System.out.println(set);
    }
}

class NameSort implements Comparator<Student> {
    public int compare(Student obj1, Student obj2) {
        return obj1.name.compareTo(obj2.name);
    }
}

class NameDscSort implements Comparator<Student> {
    public int compare(Student obj1, Student obj2) {
        return obj2.name.compareTo(obj1.name);
    }
}

class AgeSort implements Comparator<Student> {
    public int compare(Student o1, Student o2) {
        return o1.age.compareTo(o2.age);
    }
}

class AgeDscSort implements Comparator<Student> {
    public int compare(Student o1, Student o2) {
        return o2.age.compareTo(o1.age);
    }
}

class Student {
    String name;
    Integer age;

    Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + " ^ " + age;
    }
}