class Circle {
    int radius;
    static float pi = 3.14f;

    public static void main(String[] args) {
        defineCircle();
        defineCircle();
    }

    static void defineCircle() {
        System.out.println("Circle is a ....");
    }

    void calcArea() {
        System.out.println(pi*radius*radius);
    }

    static float getPI() {
        return pi;
    }
}