class J {
    public static void main(String[] args) {
        System.out.println("~~~~~~~~~~ 1");

        try {
            int i = Integer.parseInt(args[0]);
            System.out.println("~~~~~~~~~~~~ 2");
        } catch(NumberFormatException e) {
            System.out.println(e);
        }
        System.out.println("~~~~~~~~~~~~~~~ 3");
    }
}


//commandline argument
// input: no input
// input: 1
// input: 2
// input: -22
// input: two
// input: <no input>