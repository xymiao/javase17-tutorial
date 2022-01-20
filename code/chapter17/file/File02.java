import java.io.File;

public class File02 {
    public static void main(String[] args){
       

        File file = new File("File02.java");
        System.out.println(file);

        System.out.println(file.canExecute());
        System.out.println(file.canRead());
        System.out.println(file.canWrite());

        file = new File("NotFile.java");
        System.out.println(file);

        System.out.println(file.canExecute());
        System.out.println(file.canRead());
        System.out.println(file.canWrite());
    }
    
}
