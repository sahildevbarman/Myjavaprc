import java.util.Scanner;

class E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student[] x = new Student[3];

        for(Student s : x) {
            System.out.print(s + " ");
        }
        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        for(int i=0; i < x.length; i++) {
            System.out.println("Enter name: ");
            String name = sc.nextLine();
            System.out.print("Enter age: ");
            int age = sc.nextInt();
            x[i] = new Student(name, age);
            sc.nextLine();
        }
        for(Student s : x) {
            System.out.println(s);
        }
        sc.close();
    }
}