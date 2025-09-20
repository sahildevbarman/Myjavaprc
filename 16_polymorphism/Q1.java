class Q1 {
    public static void main(String[] args) {
        Teacher x = new Teacher();
        attendence(x);

        Student y = new Student();
        attendence(y);
    }
    static void attendence(User t) {
        System.out.println("Present " + t);
    }
    // static void attendence(Teacher t) {
    //     System.out.println("Present");
    // }
    // static void attendence(Student t) {
    //     System.out.println("Present");
    // } 
}