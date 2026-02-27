class W extends Throwable{
    public static void main(String[] args) {
        throw new W();
    }        
}



// W.java:3: error: unreported exception W; must be caught or declared to be thrown
//         throw new W();
//         ^
// 1 error