import java.io.File;
import java.io.IOException;

public class File03 {
    public static void main(String[] args) throws IOException{
       

        File file = new File("Test.java");
        boolean isCreated = file.createNewFile();
        if(isCreated){
            System.out.println("创建成功！");
        }else{
            System.out.println("创建失败！");
        }
    }
    
}
