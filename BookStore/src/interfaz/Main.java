package interfaz;
	
import javafx.application.Application;
import javafx.stage.Stage;
import model.BookStore;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	
	private BookStore bookStore;
	private Stage primaryStage;
	private Scene scenePrincipal;
	private Scene sceneBusqueda;
		
	@Override
		public void start(Stage primaryStage) {
		try {
			
			FXMLLoader loader = new FXMLLoader(getClass().getResource("Inicio.fxml"));
			AnchorPane root = (AnchorPane) loader.load();
			InicioController inicioController = loader.getController();
			
			scenePrincipal = new Scene(root);
			this.primaryStage = primaryStage;
			scenePrincipal.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scenePrincipal);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void cargarBusquedaController() {
try {
			
			FXMLLoader loader = new FXMLLoader(getClass().getResource("Busqueda.fxml"));
			AnchorPane root = (AnchorPane) loader.load();
			BusquedaController busquedaController = loader.getController();
			busquedaController.enlazarMain(this, bookStore);
			sceneBusqueda = new Scene(root);
			
			scenePrincipal.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scenePrincipal);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	public static void main(String[] args) {
		launch(args);
	}
}