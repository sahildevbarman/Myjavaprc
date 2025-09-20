abstract class X { }

class XY extends X { }

class N {
    public static void main(String[] args) {
        //Case 3:
        X x = new XY();

        //Case 2:
        // X x = new X();

        // N.java:11: error: X is abstract; cannot be instantiated
        // X x = new X();
        //       ^
        // 1 error


        //Case 1:
        // X x;
    }
}