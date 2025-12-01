class F {
    public static void main(String[] args) {
        int[] x = new int[0];

        int[][] y = new int[2][];

        // System.out.println(x instanceof int[]);
        System.out.println(x instanceof int[][]);
        System.out.println(y instanceof int[]);
        // System.out.println(y instanceof int[][]);
    }
}

// F.java:8: error: incompatible types: int[] cannot be converted to int[][]
//         System.out.println(x instanceof int[][]);
//                            ^
// F.java:9: error: incompatible types: int[][] cannot be converted to int[]
//         System.out.println(y instanceof int[]);
//                            ^
// 2 errors
