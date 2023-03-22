package ActividadLista;
import java.io.IOException;
public class Main {

	public static void main(String[] args) {
		Manager manager = new Manager();
		try {
			manager.ejecutar();
			System.out.println("Se guardaron los archivos");
		}catch (IOException x) {
			System.out.println("No se guardaron los archivos");
		}
	}

}
