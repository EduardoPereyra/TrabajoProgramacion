package cliente;

import java.util.Iterator;
import pelicula.Pelicula;

public abstract class Usuario {
	private String nombre;
	
	//Contructor
	public Usuario(String nombre) {
		this.nombre = nombre;
	}
	
	//Gets y Sets
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	//Metodos Abstractos
	public abstract Iterator<String> getGenerosPreferidos();

	protected abstract void valorarPelicula(Pelicula pelicula,int granos_cafe);
	
	public abstract Iterator<Pelicula> getPeliculasVistas();
	
	public abstract boolean noLaVio(Pelicula pelicula);
}
