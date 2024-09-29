
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.lang.instrument.Instrumentation;

public class LoadBigBytes {
    public static void main(String[] args) {
        
 try {
            
            FileInputStream fileIn = new FileInputStream("/Users/bdivya/bytesObject1.txt");
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
 
            BigObject obj = (BigObject) objectIn.readObject();
 
            System.out.println("The Object has been read from the file "+Sizeof.sizeof(obj));
            objectIn.close();
           // return obj;
 
        } catch (Exception ex) {
            ex.printStackTrace();
           // return null;
        }
    }

}
