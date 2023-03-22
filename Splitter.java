package ActividadLista;
import java.util.ArrayList;
import java.util.List;

public class Splitter {
	 public static List<Integer> SplitPares(List<Integer> AnyList) {
	        List<Integer> pares = new ArrayList<>();
	        for (Integer i : AnyList) {
	            if (i % 2 == 0) {
	                pares.add(i);
	            }
	        }
	        return pares;
	    }

	    public static List<Integer> SplitImpares(List<Integer> AnyList) {
	        List<Integer> impares = new ArrayList<>();
	        for (Integer i : AnyList) {
	            if (i % 2 != 0) {
	                impares.add(i);
	            }
	        }
	        return impares;
	    }
}
