import java.io.IOException;

class U {
    public static void main(String[] args) throws Throwable {
        System.out.println(1);
        
        if(12 < 13) {        
            // throw new ArithmeticException();
            // throw new ClassCastException();
            // throw new IOException();
            // throw new Exception();
            // throw new Error();
            // throw new AssertionError();
            // throw new RuntimeException();

            throw new U();
        }
        

        System.out.println(2);
    }    
}


// U.java:16: error: incompatible types: U cannot be converted to Throwable
//             throw new U();
//             ^
// 1 error