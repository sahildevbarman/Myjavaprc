import java.io.File;

class E {
    public static void main(String[] args) {
        File file = new File("nobita");

        String absolutePath = file.getAbsolutePath();

        System.out.println(">" + absolutePath + "<");
    }
}
