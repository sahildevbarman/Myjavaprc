class Employee {
    String name;
    int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
class L2 {
    public static void main(String[] args) {
        Employee e = new Employee("mohan", 32);

        System.out.println(e.name);
        System.out.println(e.age);
    }
}