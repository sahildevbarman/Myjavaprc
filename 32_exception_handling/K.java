class K {
    public static void main(String[] args) {
        System.out.println("~~~~~~~~~~~~~~~ 1");

        try {
            int i = Integer.parseInt(args[0]);
            System.out.println("~~~~~~~~~~~~~~ 2");

            int[] x = {3, 0, 2};
            int n = x[i];
            System.out.println("~~~~~~~~~~~~~~ 3");
            System.out.println(n);

            int z = 12/n;
            System.out.println("~~~~~~~~~~~~~~~ 4");
            System.out.println(z);
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println(e + " AIOOBE");
        }
        catch(NumberFormatException e) {
            System.out.println(e + " NFE");
        }
        catch(ArithmeticException e) {
            System.out.println(e + " AE");
        }
        System.out.println("~~~~~~~~~~~~~~~ 5");
    }
}


//commandline argument
// input: no input
// input: a
// input: 1
// input: 2
// input: 0
// input: 3