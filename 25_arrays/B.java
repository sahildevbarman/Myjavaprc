class B {
    public static void main(String[] args) {
        // System.out.println(args.length);

        for(String str : args) {
            System.out.println(str);
        }
    }
}

// i/p: />java B mohan saxena vijay deenanath chouhan prithviraj  raso

// i/p: />java B "mohan saxena" "vijay deenanath chouhan" "prithviraj raso"

// i/p: />java B "mohan saxena" "vijay deenanath chouhan" 'prithviraj raso'

