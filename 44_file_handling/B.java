import java.io.File;

class B {
    public static void main(String[] args) {
        File file = new File("D:\\javaprac\\44_file_handling_reading_writing\\java_examples"); 
        //non-existing, absolute folder path

        System.out.println(file);
        System.out.println(file.exists());
    }
}
