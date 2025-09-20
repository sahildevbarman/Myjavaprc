class Circle  {
    int radius;
    static float pi = 3.14f;

    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.radius = 78;
        Circle c2 = new Circle();
        c2.radius = 21;

        clacArea();
    }

    void calcArea() {
        System.out.println(pi*radius*radius);
    }
}

// D.java:11: error: cannot find symbol
//         clacArea();
//         ^
//   symbol:   method clacArea()
//   location: class Circle
// 1 error
