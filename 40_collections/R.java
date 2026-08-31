import java.util.TreeMap;
import java.util.Comparator;
import java.util.Scanner;

class R {
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

class NAS implements Comparator {
    public int compare(Object o1, Object o2) {
        Student s1 = (Student)o1;
        Student s2 = (Student)o2;

        String nm1 = s1.name;
        String nm2 = s2.name;

        return nm1.compareTo(nm2);
    }
}

class AAS implements Comparator {
    public int compare(Object o1, Object o2) {
        Student s1 = (Student)o1;
        Student s2 = (Student)o2;

        Integer ag1 = s1.age;
        Integer ag2 = s2.age;

        return ag1.compareTo(ag2);
    }
}

class ADS implements Comparator {
    public int compare(Object o1, Object o2) {
        Student s1 = (Student)o1;
        Student s2 = (Student)o2;

        Integer ag1 = s1.age;
        Integer ag2 = s2.age;

        return ag2.compareTo(ag1);
    }
}

class NDS implements Comparator {
    public int compare(Object o1, Object o2) {
        Student s1 = (Student)o1;
        Student s2 = (Student)o2;

        String nm1 = s1.name;
        String nm2 = s2.name;

        return nm2.compareTo(nm1);
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