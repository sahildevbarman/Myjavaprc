class Circle {
    int radius;
    static float pi = 3.14f;

    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.radius = 78;
        Circle c2 = new Circle();
        c2.radius = 21;

        calcArea();
    }

    static void calcArea() {
        System.out.println(pi*radius*radius);
    }
}

// C.java:15: error: non-static variable radius cannot be referenced from a static context
//         System.out.println(pi*radius*radius);
//                               ^
// C.java:15: error: non-static variable radius cannot be referenced from a static context
//         System.out.println(pi*radius*radius);
//                                      ^
// 2 errors