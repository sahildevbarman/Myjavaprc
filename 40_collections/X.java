import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class X {
    public static void main(String[] args) {
        ArrayList<Employee> x = new ArrayList<Employee>();

        x.add(new Employee("kartik", 20));
        x.add(new Employee("raghav", 34));
        x.add(new Employee("kejriwal", 56));
        x.add(new Employee("rahul", 55));
        x.add(new Employee("khadge", 74));

        System.out.println(x);

        Collections.sort(x, new NDS());

        System.out.println(x);
    }
}

class NDS implements Comparator<Employee> {
    public int compare(Employee e1, Employee e2) {
        return e2.name.compareTo(e1.name);
    }
}

class Employee {
    String name;
    Integer age;

    Employee(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + "#" + age;
    }
}