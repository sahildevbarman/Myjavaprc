import java.io.IOException;
class U3 {
    public static void main(String[] args) throws Throwable {
        System.out.println(1);

        if(12 < 13) {
            throw new Throwable();
        }

        System.out.println(2);
    }
}