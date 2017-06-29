import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class MViewC {

	private Listing listing = new Listing();

	@FXML
	TextField textField;

	@FXML
	ListView<String> listView;

	@FXML
	public void onListButton() {
		listing.setPath(textField.getText());
		//System.out.println(listing.listFilesAndFolders() + "\n");	//works
	}

	ObservableList<String> files = FXCollections.observableArrayList("Asdasdas","Asdasd","ASdasd","ASdasd");	//tak działa
	//ObservableList<String> files = FXCollections.observableArrayList(listing.listFilesAndFolders());	//tak nie :(
	
	@FXML
	void initialize() {
		textField.setText(System.getProperty("user.dir")); // current directory
		listView.setItems(files);
	}

}
