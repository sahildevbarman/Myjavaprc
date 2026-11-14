import java.io.File;

class D {
    public static void main(String[] args) {
        File file = new File("python");
        // create a file without extension and then try the same by creating a folder with the same name

        System.out.println(file.isDirectory());
        System.out.println(file.isFile());
    }
}
