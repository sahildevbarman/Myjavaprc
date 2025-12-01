class T {
    public static void main(String[] args) {
        Y[] x = new Y[3];

        System.out.println(x[0]);
        System.out.println(x[1]);
        System.out.println(x[2]);

        x[0] = new B1();
        x[1] = new B2();
        x[2] = new B3();

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.println(x[0]);
        System.out.println(x[1]);
        System.out.println(x[2]);
    }
}
abstract class Y {}

class B1 extends Y { }
class B2 extends Y { }
class B3 extends Y { }