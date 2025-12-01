class C1 {
    public static void main(String[] args) {
        int age = Integer.parseInt(args[1]);
        float marks = Float.parseFloat(args[2]);
        boolean flag = Boolean.parseBoolean(args[3]);

        System.out.println(args[0]);
        System.out.println(age + 1);
        System.out.println(marks + 1);
        System.out.println(args[3]);
    }
}