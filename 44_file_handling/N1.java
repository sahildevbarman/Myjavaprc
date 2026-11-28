import java.io.File;

class N1 {
    public static void main(String[] args) {
        File f1 = new File("D:\\CHANDRAGUPT");   //existing
        File f2 = new File("VIKRAMADITYA"); //non-existing

        f1.renameTo(f2);
    }
}