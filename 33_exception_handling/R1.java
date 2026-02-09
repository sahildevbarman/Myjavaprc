class R1 {
    public static void main(String[] args) {
        try {
            String x = "mohan";

            System.out.println(x.charAt(100));

            int[] y = {12, 45, 76};
            System.out.println(y[3]);
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            e.printStackTrace();

        } catch(IndexOutOfBoundsException e) {
            System.out.println("#####################################");
            e.printStackTrace();
        }
    }
}