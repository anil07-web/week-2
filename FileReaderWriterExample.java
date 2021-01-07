import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriterExample {
    public static void readFile(String fileName) 
    {
        try
        {
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while((line=br.readLine())!=null)
            {
                System.out.println(line);
            }
            br.close();
        }
        catch(FileNotFoundException f){
            
        }
        catch(IOException ex){

        }
        
        

    }
    public static void writeToAFile(String fileName)
    {
        File file = new File(fileName);
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            bw.write("Good Morning");
            //bw.append("File writer append");
            bw.write("Hello");
            bw.close();
        }
        catch(FileNotFoundException f){}
        catch(IOException e){}
    }

    public static void main(String[] args) {
        //readFile("sample.txt");
        writeToAFile("write.txt");
    }
}