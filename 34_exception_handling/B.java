class B {
    public static void main(String[] args) {
        if(args.length == 0) {
            try {
                throw new MissingCommandLineArgumentException();
            } catch(MissingCommandLineArgumentException e) {
                e.printStackTrace();
            }            
        } else {
            System.out.println(args[0]);
        }
    }
}


class MissingCommandLineArgumentException extends Exception {

}