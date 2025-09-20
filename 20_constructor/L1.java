class Student {
    String name;
    int age;

    Student(String nm, int ag) {
        name = nm;
        age = ag;
    }
}
class L1 {
    public static void main(String[] args) {
        Student a = new Student("Indumati", 7);

        System.out.println(a.name);
        System.out.println(a.age);
    }
}