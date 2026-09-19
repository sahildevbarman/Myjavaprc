import java.util.Arrays;

class B {
    public static void main(String[] args) {
        String[] x = {"samyak", "hitesh", "vikas", "ganesh", "manoj"};

        for(String next : x) {
            System.out.print(next + " ");
        }

        Arrays.sort(x);
        System.out.println();

        for(String next : x) {
            System.out.print(next + " ");
        }
    }
}