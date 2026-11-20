import java.io.File;

class I {
    public static void main(String[] args) {
        File file = new File("om/ram/jay");
        // folder om does not exist

        System.out.println(file.exists());

        System.out.println(file.mkdir());
    }
}

