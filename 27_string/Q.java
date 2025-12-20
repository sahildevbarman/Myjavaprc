import java.util.Scanner;
class Q {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Enter your marks: ");
        float marks = sc.nextFloat();

        String str = String.format("My name is: %s, My age %d and My marks %f", name, age, marks);
        System.out.println(str);

        // System.out.println("My Name is: name, My Age is: age and My Marks: marks");
        // System.out.println("My Name is: " + name + ", My Age is: " + age + " and My Marks: " + marks);
    }
}