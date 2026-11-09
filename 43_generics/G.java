class G {
    <T> G(T x) {
        System.out.println(x);
    }
    
    public static void main(String[] args) {
        G g = new G(new Car());
    }
}
