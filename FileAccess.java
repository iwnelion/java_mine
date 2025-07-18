import java.io.File;

public class FileAccess {
    public static void main(String[] args) {
        File file = new File("accessed_file.txt");

        //check if file exists
        if(file.exists()){
            System.out.println("this file exists");
            System.out.println(file.getAbsolutePath());     //absolute path of the file
            System.out.println(file.isFile());          //(true), check if it is a file
            file.delete();          //delete the file
        }else{
            System.out.println("this file does not exist");
        }
    }
}
