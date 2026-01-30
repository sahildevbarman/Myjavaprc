import java.io.FileNotFoundException;

class O {
    public static void main(String[] args) {
        System.out.println(1);

        try {
            System.out.println(2);
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println(3);
    }
}

// O.java:9: error: exception FileNotFoundException is never thrown in body of corresponding try statement
//         } catch(FileNotFoundException e) {
//           ^
// 1 error
