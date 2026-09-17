import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Z {
    public static void main(String[] args) {
        ArrayList<Employee> x = new ArrayList<Employee>();

        x.add(new Employee("manoj", 52));
        x.add(new Employee("geet", 23));
        x.add(new Employee("balram", 19));
        x.add(new Employee("om", 47));
        x.add(new Employee("deepak", 62));
        x.add(new Employee("yamraj", 32));

        System.out.println(x);

        // NDS comp = new NDS();
        // NAS comp = new NAS();
        AAS comp = new AAS();
        // ADS comp = new ADS();
        Collections.sort(x, comp);

        Employee emp = new Employee("manoj", 19);
        System.out.println(Collections.binarySearch(x, emp, comp));
    }
}

class NAS implements Comparator<Employee> {
    public int compare(Employee e1, Employee e2) {
        return e1.name.compareTo(e2.name);
    }
}

class NDS implements Comparator<Employee> {
    public int compare(Employee e1, Employee e2) {
        return e2.name.compareTo(e1.name);
    }
}

class ADS implements Comparator<Employee> {
    public int compare(Employee e1, Employee e2) {
        return e2.age.compareTo(e1.age);
    }
}

class AAS implements Comparator<Employee> {
    public int compare(Employee e1, Employee e2) {
        return e1.age.compareTo(e2.age);
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