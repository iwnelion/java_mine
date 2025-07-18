import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {
    public static void main(String[] args) {
        //FileReader
        //read() returns int value of the byte value
        //read() returns -1 when end of file is reached

        try {
			FileReader reader = new FileReader("testFile.txt");
			try {
				int data = reader.read();
                //System.out.println((char)data);     //converting byte to char
                
                while(data != -1){
                    System.out.print((char)data);
                    data = reader.read();   //read next byte
                }
                reader.close();  //close the file
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
