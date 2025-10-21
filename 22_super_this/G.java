class Y1 {
    int x = 88;
}
class G extends Y1 {
    int x = 44;

    void pro() {
        int x = 11;

        System.out.println(x);
    }
    public static void main(String[] args) {
        G g = new G();
        g.pro();
    }
}