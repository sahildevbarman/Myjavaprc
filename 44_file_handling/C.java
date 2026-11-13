import java.io.File;

class C {
    public static void main(String[] args) {
        File file = new File("java.txt");
        //the file must exist is the current context, create one if one does not exist
        //try creating a folder with the same name instead of a file...

        System.out.println(file.isDirectory());
        System.out.println(file.isFile());
    }
}
