class Student {
    String name;
    int age;
}

class L {
    public static void main(String[] args) {
        Student a = new Student();

        System.out.println(a.name);
        System.out.println(a.age);

        a.name = "raju";
        a.age = 4;

        System.out.println(a.name);
        System.out.println(a.age);
    }
}