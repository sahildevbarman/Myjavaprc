class M2 {
    public static void main(String[] args) {
        Student s = new Student("Kaju", 4, "GTech", "IT", 12);
        Teacher t = new Teacher("M K Fair", 42, "PostFix", 20, 80000000);

        System.out.println("~~~~~~~~~~~ Student Info ~~~~~~~~~~~ Before ~~~~~~~~");
        System.out.println(s.name);
        System.out.println(s.age);
        System.out.println(s.degree);
        System.out.println(s.branch);
        System.out.println(s.semester);

        System.out.println("~~~~~~~~~~~ Teacher Info ~~~~~~~~~~~ Before ~~~~~~~~");
        System.out.println(t.name);
        System.out.println(t.age);
        System.out.println(t.qualification);
        System.out.println(t.experience);
        System.out.println(t.salary);
    }
}
class User {
    String name;
    int age;
}
class Student extends User {
    // String name;
    // int age;
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
class Teacher extends User {
    // String name;
    // int age;
    int experience;
    String qualification;
    float salary;

    Teacher(String name, int age, String qualification, int experience, float salary) {
        this.name = name;
        this.age = age;
        this.qualification = qualification;
        this.experience = experience;
        this.salary = salary;
    }
}