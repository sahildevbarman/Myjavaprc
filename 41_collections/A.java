import java.util.Arrays;

class A {
    public static void main(String[] args) {
        int[] x = {56, 9, 34, 19, 27, 5, 48};

        for(int next : x) {
            System.out.print(next + " ");
        }

        Arrays.sort(x);
        System.out.println();

        for(int next : x) {
            System.out.print(next + " ");
        }
    }
}