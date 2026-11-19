import java.io.File;

class H {
    public static void main(String[] args) {
        File file = new File("ganesh");

        System.out.println(file.exists());

        System.out.println(file.mkdir());
    }
}

// run twice