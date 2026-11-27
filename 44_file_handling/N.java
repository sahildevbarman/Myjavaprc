import java.io.File;

class N {
    public static void main(String[] args) {
        File f1 = new File("VIKRAMADITYA"); //non-existing
        File f2 = new File("D:\\CHANDRAGUPT");   //existing

        f1.renameTo(f2);
    }
}