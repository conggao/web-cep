package demo.ClassFile;

import org.junit.Test;

import java.io.*;

/**
 * Created by pc on 2017/4/1.
 */
public class AddFunction {
    @Test
    public void testAddFunction() {
        File file = new File(System.getProperty("user.dir") + "\\src\\main\\java\\com\\cep\\service\\FileService.java");
        try {
            String line = null;
            Reader reader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(reader);
            
         /*   while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }*/
            int a  = 0;
            while ((a = bufferedReader.read()) !=-1){
                if((char)a!='}')
                System.out.print((char)a);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
