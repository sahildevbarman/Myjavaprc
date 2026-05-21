import java.util.ArrayList;

class W {
    public static void main(String[] args) {
        ArrayList x = new ArrayList();

        x.add(new Student("mohan", 12));
        x.add(new Student("sohan", 10));
        x.add(new Student("rohan", 8));
        x.add(new Student("gohan", 15));
        x.add(new Student("tohan", 13));

        System.out.println(x);

        Student a = new Student("rahan", 8);
        System.out.println(x.contains(a));
        // System.out.println(x.remove(a));

        System.out.println(x);
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
        return name + " - " + age;
    }

    public boolean equals(Object obj) {
        System.out.println(this.name + " - " + ((Student) obj).name);
        return this.name.equals(((Student) obj).name) && this.age == ((Student) obj).age;
    }
}