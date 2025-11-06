class J {
    public static void main(String[] args) {
        Teacher[] x = new Teacher[3];

        x[0] = new Teacher("Ganesh", 31);
        x[1] = new Teacher("Samaksh", 45);
        x[2] = new Teacher("Vigyan", 28);

        System.out.println(x[0].name);
        System.out.println(x[1].name);
        System.out.println(x[2].name);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.println(x[0].age);
        System.out.println(x[1].age);
        System.out.println(x[2].age);
    }
}