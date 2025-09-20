class Student {
    String name;
    int age;

    public static void main(String[] args) {
        Student x = new Student();
        x.name = "mohan";
        x.age = 12;

        Student y = new Student();
        y.name = "ganesh";
        y.age = 9;

        System.out.println(x.name);
        System.out.println(y.age);
    }
}