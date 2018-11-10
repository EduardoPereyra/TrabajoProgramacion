package cliente;

import java.util.ArrayList;
import java.util.Iterator;
import pelicula.Pelicula;

public class Persona extends Usuario{
	private int edad;
	private ArrayList<String> generos_preferidos;
	private ArrayList<Pelicula> peliculas_vistas;
	
	//Contructor
	public Persona(String nombre, int edad) {
		super(nombre);
		this.edad = edad;
		this.generos_preferidos = new ArrayList<>();
		this.peliculas_vistas = new ArrayList<>();
	}
	
	//Gets y Sets
	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void setGeneroPreferido(String genero_preferido) {
		this.generos_preferidos.add(genero_preferido);
	}
		
	public Iterator<Pelicula> getPeliculasVistas() {
		return this.peliculas_vistas.iterator();
	}
	
	public Iterator<String> getGenerosPreferidos(){
		return this.generos_preferidos.iterator();
	}
	
	//Funciones
	public void valorarPelicula(Pelicula pelicula, int granos_cafe) {
		if(!this.contienePelicula(pelicula)) {
			if((granos_cafe < 6)&& (granos_cafe > 0)){
				pelicula.setVoto(this,granos_cafe);
				this.setPeliculaVista(pelicula);
			}
		}
	}
	
	public boolean noLaVio(Pelicula pelicula) {
		if(!this.peliculas_vistas.contains(pelicula)) {
			return true;
		}
		return false;
	}
	
	//Private
	private void setPeliculaVista(Pelicula pelicula_vista) {
		this.peliculas_vistas.add(pelicula_vista);
	}
	
	private boolean contienePelicula(Pelicula p) {
		return this.peliculas_vistas.contains(p);
	}

}
