class Employee {
    String name;
    int age;

    public static void main(String[] args) {
        Employee emp = new Employee();

        emp.name = "jayant";
        emp.age = 28;

        emp.showInfo();
    }

    void showInfo() {
        showName();
        showAge();
    }

    void showName() {
        System.out.println(name);
    }

    void showAge() {
        System.out.println(age);
    }
}