class Shape {
    int length;
    int width;
    int height;
    public Shape(int length, int width, int height) {
        this(length, width);
        System.out.println("3");
        this.height = height;
    }
    public Shape(int length, int width) {
        this(length);
        System.out.println("2");
        this.width = width;
    }
    public Shape(int length) {
        System.out.println("1");
        this.length = length;
    }
}

class O {
    public static void main(String[] args) {
        Shape s = new Shape(12, 13, 14);

        System.out.println(s.length + " _ " + s.width + " _ " + s.height);
    }
}