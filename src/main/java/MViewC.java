import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class MViewC {

	private Listing listing = new Listing();

	@FXML
	private TextField textField;

	@FXML
	private ListView<String> listView;

	@FXML
	public void onListButton() {
		listing.setPath(textField.getText());
		ObservableList<String> files = FXCollections.observableArrayList(listing.listFilesAndFolders());
		listView.setItems(files);
	}
	
	@FXML
	public void onOpen(){
		System.out.println("onOpen");

	}
	
	@FXML
	public void onInfo(){
		System.out.println("onInfo");
		
	}

	@FXML
	void initialize() {
		textField.setText(System.getProperty("user.dir")); // current directory
	}

}
