import java.io.File;

class B {
    public static void main(String[] args) {
        File file = new File("java_examples"); 
        //non-existing, relative folder path

        System.out.println(file);
        System.out.println(file.exists());
    }
}
