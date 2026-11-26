import java.io.File;

class M {
    public static void main(String[] args) {
        File f1 = new File("YAMRAJJI");   //existing
        File f2 = new File("CHITRAGUPT"); //non-existing

        f1.renameTo(f2);
    }
}
