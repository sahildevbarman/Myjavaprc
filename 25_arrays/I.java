class I {
    public static void main(String[] args) {
        String[][] tuDArr = {new String[0], new String[3], new String[2]};

        for(String[] vnDArr : tuDArr) {
            for(String str : vnDArr) {
                System.out.println(str + " ");
            }
            System.out.println();
        } 
    }
}