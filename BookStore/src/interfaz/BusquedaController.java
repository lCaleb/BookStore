package interfaz;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.input.MouseEvent;
import model.BookStore;

public class BusquedaController {

	private BookStore bookStore;
	private Main main;
	@FXML private TableView catalogo;
	@FXML private TableView clientes;
	@FXML private TableView libroXCliente;
	@FXML private Button siguiente;
	
	
	public void enlazarMain(Main main, BookStore bookStore) {
		this.bookStore=bookStore;
		this.main=main;
		darFunciones();
		}
	
	public void darFunciones() {

	siguiente.setOnMouseClicked(new EventHandler<MouseEvent>() {
		@Override
		public void handle(MouseEvent e) {

		}

	});
	}
}
