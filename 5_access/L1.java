class Student extends Pen {
    public static void main(String[] args) {
        Student pen = new Student();
        pen.write();
    }
}
class Pen {
    void write() {
        System.out.println("write some thing.. on note book");
    }
}