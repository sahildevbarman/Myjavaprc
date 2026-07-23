import java.util.TreeSet;

class M {
    public static void main(String[] args) {
        TreeSet set = new TreeSet();

        set.add(new Student("karthik", 18));
        set.add(new Student("simha", 9));
        set.add(new Student("vijendra", 12));
        set.add(new Student("prasad", 5));
        set.add(new Student("ganesh", 10));
        set.add(new Student("vijendra", 12));

        System.out.println(set);
    }
}


class Student implements Comparable<Student> {
    String name;
    Integer age;

    Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + " ^ " + age;
    }

    public int compareTo(Student obj) {
        String nm1 = this.name;
        String nm2 = obj.name;

        return nm1.compareTo(nm2);
    }
}