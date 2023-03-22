package ActividadLista;
import java.util.ArrayList;
import java.util.List;
public class Fibonacci {

	
	public static List<Integer>CreateFibonacci(){
		List<Integer> fibu=new ArrayList<>();
		fibu.add(0);
		fibu.add(1);
		for(int i=2;i<32;i++) {
			int segundo=fibu.get(i-1)+fibu.get(i-2);
			fibu.add(segundo);
			}
		return fibu;
	}
	
	
}
