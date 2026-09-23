import java.util.Arrays;

class F {
    public static void main(String[] args) {
        String[] x = {"samyak", "hitesh", "vikas", "ganesh", "manoj"};

        Arrays.sort(x);

        for(String next : x) {
            System.out.print(next + " ");
        }

        System.out.println();

        // String str = new String("hitesh");
        String str = new String("naman");
        System.out.println(Arrays.binarySearch(x, str));
    }
}