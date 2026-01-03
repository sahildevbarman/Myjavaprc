class G {
    public static void main(String[] args) {
        System.out.println(1);

        try {
            System.out.println(args[0]);
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Problem Solved...");
        }

        System.out.println(3);    
    }
}

//input: mohan
//input: