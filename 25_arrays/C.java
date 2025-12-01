class C {
    public static void main(String[] args) {
        System.out.println(args[0] instanceof String);
        System.out.println(args[1] instanceof String);
        System.out.println(args[2] instanceof String);
        System.out.println(args[3] instanceof String);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.println(args[0]);
        System.out.println(args[1] + 1);
        System.out.println(args[2] + 1);
        System.out.println(args[3]);
    }
}

// i/p: />java C mohan 23 89.45 true