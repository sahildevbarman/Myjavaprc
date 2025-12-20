class R {
    public static void main(String[] args) {
        String[] names = {"gopal", "kamlesh", "rajeev", "manoj", "ritik", "prateek"};

        // for(String i : names) {
        //     System.out.print(i + ", ");
        // }
        
        // String str = String.join(" and ", names);
        String str = String.join(", ", names);
        System.out.println(str);
    }
}