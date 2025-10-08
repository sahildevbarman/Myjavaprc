class Student {
    String name;
    String email;
    String password;
    String degree;
    String branch;
    String semester;

    Student(String email, String password) {
        this.email = email;
        this.password = password;
    }
    Student(String name, String email, String password, String degree, String branch, String semester) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.degree = degree;
        this.branch = branch;
        this.semester = semester;
    }
}
class N {
    public static void main(String[] args) {
        Student s1 = new Student("om@gmail.com", "123456");

        System.out.println("~~~~~~~~~~ Student 1 ~~~~~~~~~~~");
        System.out.println("Name: " + s1.name);
        System.out.println("Email: " + s1.email);
        System.out.println("Password: " + s1.password);
        System.out.println("Degree: " + s1.degree);
        System.out.println("Branch: " + s1.branch);
        System.out.println("Semester: " + s1.semester);

        Student s2 = new Student("om kumar", "om@gmail.com", "123456", "MTech", "IT", "4th");

        System.out.println("~~~~~~~~~~ Student 2 ~~~~~~~~~~~");

        System.out.println("Name: " + s2.name);
        System.out.println("Email: " + s2.email);
        System.out.println("Password: " + s2.password);
        System.out.println("Degree: " + s2.degree);
        System.out.println("Branch: " + s2.branch);
        System.out.println("Semester: " + s2.semester);
    }
}