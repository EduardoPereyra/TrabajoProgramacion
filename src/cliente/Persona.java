package cliente;

import java.util.ArrayList;
import java.util.Iterator;
import pelicula.Pelicula;

public class Persona extends Usuario{
	private int edad;
	private ArrayList<String> generos_preferidos = new ArrayList<>();
	private ArrayList<Pelicula> peliculas_vistas = new ArrayList<>();
	
	//gets y sets
	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void setGeneroPreferido(String genero_preferido) {
		this.generos_preferidos.add(genero_preferido);
	}
		
	public void valorarPelicula(Pelicula pelicula, int granos_cafe) {
		if(!this.contienePelicula(pelicula)) {
			if((granos_cafe < 6)&& (granos_cafe > 0)){
				pelicula.setVoto(this,granos_cafe);
				this.setPeliculaVista(pelicula);
			}
		}
	}
		
	public Iterator<Pelicula> getPeliculasVistas() {
		return this.peliculas_vistas.iterator();
	}
	
	public Iterator<String> getGenerosPreferidos(){
		return this.generos_preferidos.iterator();
	}
	
	//private
	private void setPeliculaVista(Pelicula pelicula_vista) {
		this.peliculas_vistas.add(pelicula_vista);
	}
	
	private boolean contienePelicula(Pelicula p) {
		return this.peliculas_vistas.contains(p);
	}

}
