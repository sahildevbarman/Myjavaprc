import java.io.File;

class A {
    public static void main(String[] args) {
        File file = new File("java.txt"); 
        //non-existing, relative file path

        System.out.println(file);
        System.out.println(file.exists());
    }
}
