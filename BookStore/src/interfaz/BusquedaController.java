package interfaz;

import javafx.fxml.FXML;
import javafx.scene.control.TableView;
import model.BookStore;

public class BusquedaController {

	private BookStore bookStore;
	private Main main;
	@FXML private TableView catalogo;
	@FXML private TableView clientes;
	@FXML private TableView libroXCliente;
	
	
	public void enlazarMain(Main main, BookStore bookStore) {
		this.bookStore=bookStore;
		this.main=main;
		darFunciones();
		}
	
	public void darFunciones() {}
}
