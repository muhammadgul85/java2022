package screenshots;

//Create Folder 
import java.io.File;

public class FolderDemo {
	public static void main(String[] args) {
		System.out.println(System.getProperty("user.dir"));
		
		File folder = new File(System.getProperty("user.dir")+ "\\ABC");
		folder.mkdir();
	}

}
