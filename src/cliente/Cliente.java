package cliente;

import java.util.Iterator;
import pelicula.Pelicula;

public abstract class Cliente { //Modicifacr los nombres de las clases
	private String nombre;
	
	//gets y sets
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public abstract Iterator<String> getGenerosPreferidos();


	protected abstract void valorarPelicula(Pelicula pelicula,int granos_cafe);
	
	public abstract Iterator<Pelicula> getPeliculasVistas();
}
