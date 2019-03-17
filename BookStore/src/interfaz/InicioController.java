package interfaz;

import javafx.event.EventHandler;
import javafx.fxml.FXML;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import javafx.scene.input.MouseEvent;
import model.BookStore;
import model.Client;
import model.Seller;

public class InicioController {

	private BookStore bookStore;
	private Main main;

	@FXML
	private TextField numCajeros;
	@FXML
	private TextField numClientes;
	@FXML
	private Button botonInicio;

	public InicioController() {
	}

	public void initialize() {

	}

	public void enlazarMain(Main main, BookStore bookStore) {
		this.bookStore = bookStore;
		this.main = main;
		darFunciones();
	}

	public void darFunciones() {

		botonInicio.setOnMouseClicked(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent e) {
				for (int i = 0; i < Integer.parseInt(numCajeros.getText()); i++) {
					Seller  seller = new Seller(i+1);
					bookStore.addSeller(seller);
				}
				for (int i = 0; i < Integer.parseInt(numClientes.getText()); i++) {
					int aleator=(int) (Math.random()*20000)+1000;
					Client client = new Client(aleator+"");
					bookStore.addClient(client);
				}
				
				
				main.cargarBusquedaController();
			}

		});

	}

}
