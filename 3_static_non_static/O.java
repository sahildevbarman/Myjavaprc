class Student {
    String name;
    int age;

    static int maxAge = 20;

    public static void main(String[] args) {
        Student x = new Student();
        Student y = new Student();

        x.name = "om";
        x.age = 7;

        y.name = "tiket";
        y.age = 12;

        x.showInfo();
    }

    void showInfo() {
        System.out.println(name);
    }
}