class F {
    public static void main(String[] args) {
        for(int i=-128; i<0; i++) {
            System.out.println(i+"-"+((char)i)+"\t");
        }

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

    for(int i=0; i<128; i++) {
        System.out.println(i+"-"+((char)i)+"\t");
     }
   }
}