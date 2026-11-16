import java.io.File;

class E1 {
    public static void main(String[] args) {
        File file = new File("nobita");

        File absoluteFile = file.getAbsoluteFile();

        System.out.println("-" + absoluteFile + "-");
    }
}
