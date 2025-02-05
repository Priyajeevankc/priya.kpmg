package InputOutput;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFileExample {

	public static void main(String[] args) 
	{
		try {
              FileWriter fr = new FileWriter("MyFile.txt", true);
              String content = "This is My File" ;
              fr.write(content);
              fr.flush();
              System.out.println("DONE");
		}
        catch(IOException e) 
		{
	           e.printStackTrace();
                   }
	        }

}
