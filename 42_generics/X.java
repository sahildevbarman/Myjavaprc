import java.util.ArrayList;

class X {
    public static void main(String[] args) {
        ArrayList<?> x1 = new ArrayList<Integer>();
        ArrayList<?> x2 = new ArrayList<Car>();
        ArrayList<?> x3 = new ArrayList<AAA>();
        ArrayList<?> x4 = new ArrayList<Object>();
        ArrayList<?> x5 = new ArrayList<>();

        // x1.add(12);
        // x4.add(new Car());
    }
}

class Car {}

interface AAA { }
