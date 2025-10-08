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

    Student(String name, String degree, String branch, String semester, String email, String password) {
        this.name = name;
        this.degree = degree;
        this.branch = branch;
        this.semester = semester;
    }
}
class N1 {
    public static void main(String[] args) {
        Student s2 = new Student("om@gmail.com", "12345");

        System.out.println("~~~~~~~~~~~~ Student 2 ~~~~~~~~~~~~");
        System.out.println("Name:"+ s2.name);
        System.out.println("Email:"+ s2.email);
        System.out.println("Password:" + s2.password);
        System.out.println("Degree:" + s2.degree);
        System.out.println("Branch:" + s2.branch);
        System.out.println("Semester:" + s2.semester);
    }
}