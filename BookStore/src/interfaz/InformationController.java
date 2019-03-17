package interfaz;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import model.BookStore;

public class InformationController {

	private BookStore bookStore;
	private Main main;
	
	 @FXML private TextArea information;
	 
	
	 
	 
	 
	 public void enlazarMain(Main main, BookStore bookStore) {
			this.bookStore = bookStore;
			this.main = main;
			
		}
	 
}
