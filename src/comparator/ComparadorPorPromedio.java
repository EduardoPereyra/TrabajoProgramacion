package comparator;

import java.util.Comparator;
import pelicula.Pelicula;

public class ComparadorPorPromedio implements Comparator<Pelicula>{
	
	@Override
	public int compare(Pelicula p1, Pelicula p2) {
		return Double.compare(p1.getPuntuacionPromedio(), p2.getPuntuacionPromedio());
	}
}
