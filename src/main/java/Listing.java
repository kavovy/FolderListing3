import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Listing {

	private String path;
	private List<String> files = new ArrayList<String>();

	public void setPath(String path) {
		this.path = path;
	}

	public List<String> listFilesAndFolders() {
		File directory = new File(path);
		File[] fList = directory.listFiles();
		for (File file : fList) {
			files.add(file.getName());
		}

		return files;
	}

}
