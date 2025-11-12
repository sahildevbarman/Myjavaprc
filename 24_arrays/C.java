class C {
    public static void main(String[] args) {
        Teacher[] x = {
            new Teacher("mohan", 32),
            new Teacher("rohan", 23),
            new Teacher("arun", 42),
            new Teacher("sumit", 37)
        };

        for(Teacher y : x) {
            System.out.println(y);
        }
    }
}