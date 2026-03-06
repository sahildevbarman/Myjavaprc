class C {
    public static void main(String[] args) {
        if(args.length == 0) {
            try {
                throw new NoCommandLineArgumentException("Command Line Argument is missing... Sorry!");
            } catch(NoCommandLineArgumentException e) {
                e.printStackTrace();
            }            
        } else {
            System.out.println(args[0]);
        }
    }
}


class NoCommandLineArgumentException extends Exception {
    NoCommandLineArgumentException() {

    }

    NoCommandLineArgumentException(String message) {
        super(message);
    }
}