import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectReadWrite {
    static void readObj() {
        ObjectInputStream in;
        try {
            in = new ObjectInputStream(new FileInputStream("E://Test//data.txt"));
            Student sobj = (Student) in.readObject();
            System.out.println(sobj.getSid() +" - "+sobj.getName()+" - "+sobj.getAddr());
        } catch (IOException e) {            
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
           
            e.printStackTrace();
        }
       
    }
    static void writeObj()
    {
        Student s = new Student(101,"Tara","123 A main");
        try{
        FileOutputStream fo = new FileOutputStream("E://Test//data.txt");
        ObjectOutputStream ob = new ObjectOutputStream(fo);
        ob.writeObject(s);
        ob.flush();
        ob.close();
        }
        catch(FileNotFoundException f){}
        catch(IOException e){}
    }
    public static void main(String[] args) {
        writeObj();
        readObj();
    }
}
