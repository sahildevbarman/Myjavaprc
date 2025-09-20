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

        showInfo();
    }

    void showInfo() {
        System.out.println(name);
    }
}

// N.java:17: error: non-static method showInfo() cannot be referenced from a static context
//         showInfo();
//         ^
// 1 error
