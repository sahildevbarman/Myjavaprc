interface Y { }

class YZ implements Y { }

class P {
    public static void main(String[] args) {
        //Case 3:
        Y x = new YZ();

        //Case 2:
        // Y x = new Y();

        // P.java:11: error: Y is abstract; cannot be instantiated
        // Y x = new Y();
        //       ^
        // 1 error


        //Case 1:
        // Y x;
    }
}