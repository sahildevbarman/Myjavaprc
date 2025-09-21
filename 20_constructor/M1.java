class M1 {
    public static void main(String[] args) {
        Student s = new Student("Raju", 4, "MTech", "CS", 8);
        Teacher t = new Teacher("M K Nair", 42, 21, "PostDoc", 8000000);

        System.out.println("~~~~~~~~~~~~Student Info~~~~~~~~~~~~");
        System.out.println(s.name);
        System.out.println(s.age);
        System.out.println(s.degree);
        System.out.println(s.branch);
        System.out.println(s.semester);

        System.out.println("~~~~~~~~~~~~Teacher Info~~~~~~~~~~~~");
        System.out.println(t.name);
        System.out.println(t.age);
        System.out.println(t.qualification);
        System.out.println(t.experience);
        System.out.println(t.salary);
    }
}
class Student {
    String name;
    int age;
    String degree;
    String branch;
    int semester;

    Student(String name, int age, String degree, String branch, int semester) {
        this.name = name;
        this.age = age;
        this.degree = degree;
        this.branch = branch;
        this.semester = semester;
    }
}
class Teacher {
    String name;
    int age;
    int experience;
    String qualification;
    float salary;

    Teacher(String name, int age, int experience, String qualification, float salary) {
        this.name = name;
        this.age = age;
        this.experience = experience;
        this.qualification = qualification;
        this.salary = salary;
    }
}