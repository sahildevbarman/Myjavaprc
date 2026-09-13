import java.util.ArrayList;
import java.util.Collections;

class W1 {
    public static void main(String[] args) {
        ArrayList<Employee> x = new ArrayList<Employee>();

        x.add(new Employee("kartik", 20));
        x.add(new Employee("raghav", 34));
        x.add(new Employee("kejriwal", 56));
        x.add(new Employee("rahul", 55));
        x.add(new Employee("khadge", 74));

        System.out.println(x);

        Collections.sort(x);

        System.out.println(x);
    }
}

class Employee implements Comparable<Employee> {
    String name;
    Integer age;

    Employee(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + "#" + age;
    }

    public int compareTo(Employee o) {
        return this.age.compareTo(o.age);
    }
}