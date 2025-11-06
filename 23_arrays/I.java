class I {
    public static void main(String[] args) {
        Teacher[] x = new Teacher[3];

        x[0] = new Teacher("Ganesh", 31);
        x[1] = new Teacher("Samaksh", 45);
        x[2] = new Teacher("Vigyan", 28);

        System.out.println(x);

        System.out.println(x[0]);
        System.out.println(x[1]);
        System.out.println(x[2]);
    }
}