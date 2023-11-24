package Practice;

import java.io.BufferedReader;
import java.io.FileReader;

public class FileReading {
    public static void main(String[] args) throws Exception{
        //will read the content of file as a stream of chars
        FileReader reader=new FileReader("D:/Core Java/Shraddha.txt/");

        //Buffered Reader will wrap up the fileReader and will provide the buffering for effecient reading of chars
        //It makes the program more effecient by minimising the number of I/O operations.

        BufferedReader bfReader=new BufferedReader(reader);
        while(bfReader.ready()){
            System.out.println(bfReader.readLine());
        }
    }
}
