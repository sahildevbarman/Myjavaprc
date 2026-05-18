import java.util.ArrayList;

class T {
    public static void main(String[] args) {
        ArrayList x = new ArrayList();

        x.add(new Student("mohan", 12));
        x.add(new Student("sohan", 10));
        x.add(new Student("rohan", 8));
        x.add(new Student("gohan", 15));
        x.add(new Student("tohan", 13));

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

    // public String toString() {
    //     return name + " - " + age;
    // }
}