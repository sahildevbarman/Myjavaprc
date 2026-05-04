class Y {
    public static void main(String[] args) {
        ThreadGroup tg = new ThreadGroup("QUAD");
        ThreadGroup parentTg = tg.getParent();
        System.out.println("New THread Group(QUAD), Without Declaring Parent Thread Group, is Child of Default THread Group (Main): " + tg.getName()); 
        System.out.println("QUAD's Parent Thread Group: " + parentTg.getName()); 
    }    
}