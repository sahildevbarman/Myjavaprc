import java.util.TreeMap;
import java.util.Comparator;
import java.util.Scanner;

class R1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter \n1 for NAS\n2 for NDS\n3 for AAS\n4 for ADS: ");

        int input = sc.nextInt();

        Comparator<Student> com = null;

        switch(input) {
            case 1:
                com = new NAS();
                break;                
            case 2:
                com = new NDS();
                break;
            case 3:
                com = new AAS();
                break;
            case 4:
                com = new ADS();
                break;
            default:
                System.out.println("Invalif Input...!!");
                System.exit(0);
        }

        TreeMap<Student,College> map = new TreeMap<Student,College>(com);

        map.put(new Student("om",21), new College("JEC"));
        map.put(new Student("hemant",19), new College("SRIT"));
        map.put(new Student("ratnesh",22), new College("Global"));
        map.put(new Student("ram",24), new College("HEC"));
        map.put(new Student("prateek",18), new College("GGCT"));
        map.put(new Student("kamal",23), new College("GGITS"));

        System.out.println(map);
    }
}

class NAS implements Comparator<Student> {
    public int compare(Student o1, Student o2) {
        return o1.name.compareTo(o2.name);
    }
}

class AAS implements Comparator<Student> {
    public int compare(Student o1, Student o2) {
        return o1.age.compareTo(o2.age);
    }
}

class ADS implements Comparator<Student> {
    public int compare(Student o1, Student o2) {
        return o2.age.compareTo(o1.age);
    }
}

class NDS implements Comparator<Student> {
    public int compare(Student o1, Student o2) {
        return o2.name.compareTo(o1.name);
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
        return name + " ^ " + age;
    }
}

class College {
    String name;

    College(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
}