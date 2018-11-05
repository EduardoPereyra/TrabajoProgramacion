package pelicula;

import java.util.ArrayList;

public class Pelicula {
	private ArrayList<String> actores;
	private ArrayList<String> directores;
	private ArrayList<String> categorias;
	private String titulo;
	private String sinopsis;
	private int anio_estreno;
	private int duracion;
	private int total_votos; //hacer hash map y arreglar sus funciones
	private int veces_vista;
	
	public Pelicula(String titulo, String sinopsis, int anio_estreno, int duracion) {
		super();
		this.actores = new ArrayList<>();
		this.directores = new ArrayList<>();
		this.categorias = new ArrayList<>();
		this.titulo = titulo;
		this.sinopsis = sinopsis;
		this.anio_estreno = anio_estreno;
		this.duracion = duracion;
		this.total_votos = 0;
		this.veces_vista = 0;
	}
	
	//gets y sets
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getSinopsis() {
		return sinopsis;
	}
	public void setSinopsis(String sinopsis) {
		this.sinopsis = sinopsis;
	}
	public int getAnioEstreno() {
		return anio_estreno;
	}
	public void setAnioEstreno(int anio_estreno) {
		this.anio_estreno = anio_estreno;
	}
	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	public int getTotalVotos() {
		return total_votos;
	}
	public void setTotalVotos(int total_votos) {
		this.total_votos += total_votos;
		this.veces_vista++;
	}
	public int getVecesVista() {
		return veces_vista;
	}	
	
	public double getPuntuacionPromedio() {
		if(veces_vista > 0) {
			return (this.total_votos/this.veces_vista);
		}
		return 0;
	}

}
