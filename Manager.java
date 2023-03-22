package ActividadLista;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Manager {
private static final String GenerarFibonacci= "C:/Users/adalc/Downloads/eclipse/Actividad/src/ActividadLista/fibunacci.txt";
private static final String Pares= "C:/Users/adalc/Downloads/eclipse/Actividad/src/ActividadLista/pares.txt";
private static final String Impares= "C:/Users/adalc/Downloads/eclipse/Actividad/src/ActividadLista/impares.txt";

public void ejecutar () throws IOException{
	List<Integer>fibonacci=Fibonacci.CreateFibonacci();
	
	List<Integer> pares=Splitter.SplitPares(fibonacci);
	List<Integer> impares=Splitter.SplitImpares(fibonacci);
	
	Save(GenerarFibonacci,fibonacci);
	Save(Pares,pares);
	Save(Impares,impares);
}
private void Save(String name, List<Integer>AnyList)throws IOException{
	FileWriter FW = new FileWriter(name);
	for(Integer i : AnyList) {
		FW.write(i+"\n");
	}
	FW.close();
}

}
