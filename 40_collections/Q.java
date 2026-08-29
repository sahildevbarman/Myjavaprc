import java.util.TreeMap;

class Q {
    public static void main(String[] args) {
        TreeMap<Student,College> map = new TreeMap<Student,College>();

        map.put(new Student("om",21), new College("JEC"));
        map.put(new Student("hemant",19), new College("SRIT"));
        map.put(new Student("ratnesh",22), new College("Global"));
        map.put(new Student("ram",24), new College("HEC"));
        map.put(new Student("prateek",18), new College("GGCT"));
        map.put(new Student("kamal",23), new College("GGITS"));

        System.out.println(map);
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



// Exception in thread "main" java.lang.ClassCastException: class Student cannot be cast to class java.lang.Comparable (Student is in unnamed module of loader 'app'; java.lang.Comparable is in module java.base of loader 'bootstrap')
//         at java.base/java.util.TreeMap.compare(TreeMap.java:1291)
//         at java.base/java.util.TreeMap.put(TreeMap.java:536)
//         at Q.main(Q.java:7)