class H {
    public static void main(String[] args) {
        System.out.println(1);

        try {
            System.out.println(args[0]);
        } catch(NumberFormatException e) {
            System.out.println(2);
        }

        System.out.println(2);
    }
}

// input: 123
// input: abc