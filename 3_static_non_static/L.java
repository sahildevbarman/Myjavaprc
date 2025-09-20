class Student {
    static String name;
    static int age;

    public static void main(String[] args) {
        Student x = new Student();
        x.name = "mohan";
        x.age = 12;

        Student y = new Student();
        y.name = "ganesh";
        y.age = 15;

        Student z = new Student();
        z.name = "mangal";
        z.age = 21;

        System.out.println(x.age);
        System.out.println(y.name);
    }
}