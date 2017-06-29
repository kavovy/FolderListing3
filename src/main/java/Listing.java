import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Listing {

	private String path;

	public void setPath(String path) {
		this.path = path;
	}

	public ArrayList<String> listFilesAndFolders() {
		ArrayList<String> files = new ArrayList<String>();
		File directory = new File(path);
		File[] fList = directory.listFiles();
		for (File file : fList) {
			files.add(file.getName());
		}

		return files;
	}

}
