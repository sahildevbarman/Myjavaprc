class H {
    public static void main(String[] args) {
        Object x = new SportsCar();

        if(x instanceof Object) {
            System.out.println("SportsCar IS-A Object");
        } else {
            System.out.println("Sportscar IS-not-A Object");
        }
    }
}