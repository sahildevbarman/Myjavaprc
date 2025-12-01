import java.util.Scanner;
class D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        String[] names = new String[n];

        sc.nextLine();

        for(int i=0; i < n; i++) {
            System.out.println("Enter name: ");
            names[i] = sc.nextLine();
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~");

        for(String name : names) {
            System.out.println(name);
        }
    }
}