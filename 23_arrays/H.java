class H {
    public static void main(String[] args) {
        Student x1 = new Student("om", 12);
        Student x2 = new Student("ram", 18);
        Student x3 = new Student("shyam", 13);
        Student x4 = new Student("ghanshyam", 10);

        Student[] y = new Student[4];

        System.out.println(y[0]);
        System.out.println(y[1]);
        System.out.println(y[2]);
        System.out.println(y[3]);

        y[0] = x1;
        y[1] = x2;
        y[2] = x3;
        y[3] = x4;

        System.out.println(y[0]);
        System.out.println(y[1]);
        System.out.println(y[2]);
        System.out.println(y[3]);
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
        return name + " _ " + age;
    }
}