package Exception_Handle;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Except3 {

	public static void main(String[] args) 
	{
		try {
		      readFile("test1.txt");
		    } catch (FileNotFoundException e) 
		{
		      System.out.println("Error: " + e.getMessage());
		    }
		  }

		  public static void readFile(String fileName) throws FileNotFoundException
		  {
		    File file = new File(fileName);
		    Scanner scanner = new Scanner(file);

		    // Read and process the contents of the file
		    while (scanner.hasNextLine())
		    {
		      String line = scanner.nextLine();
		      System.out.println(line);
		    }
		    scanner.close();
	}

}
