package main;

import pelicula.Pelicula;
import empresa.Sede;
import java.util.ArrayList;
import java.util.Iterator;
import cliente.Grupo;
import cliente.Persona;
import buscador.BuscarActor;
import buscador.BuscarAnd;
import buscador.BuscarAnio;
import buscador.BuscarCategoria;
import buscador.BuscarDirector;
import buscador.BuscarOr;
import condicion.ContieneAlgunGenero;
import condicion.ContieneTodosGeneros;
import comparator.ComparadorPorPromedio;

public class Main {

	public static void main(String[] args) {
		
		//Creacion sede
		Sede pop_corn_time = new Sede("Pop Corn Time");
		
		//Creacion Personas
		Persona lisa = new Persona("Lisa", 8);
		lisa.setGeneroPreferido("Romantico");
		lisa.setGeneroPreferido("Musical");
		lisa.setGeneroPreferido("Infantil");
		lisa.setGeneroPreferido("Aventura");

		Persona bart = new Persona("Bart", 10);
		bart.setGeneroPreferido("Musical");
		bart.setGeneroPreferido("Infantil");
		bart.setGeneroPreferido("Aventura");
		bart.setGeneroPreferido("Accion");
		
		Persona maggie = new Persona("Maggie", 1);
		maggie.setGeneroPreferido("Musical");
		maggie.setGeneroPreferido("Infantil");
		maggie.setGeneroPreferido("Aventura");
		
		Persona marge = new Persona("Marge", 30);
		marge.setGeneroPreferido("Romantico");
		marge.setGeneroPreferido("Musical");
		marge.setGeneroPreferido("Infantil");
		marge.setGeneroPreferido("Aventura");
		
		Persona homero = new Persona("Homero", 30);
		homero.setGeneroPreferido("Musical");
		homero.setGeneroPreferido("Infantil");
		homero.setGeneroPreferido("Accion");
		
		//Agregar los usuarios a la sede
		pop_corn_time.setUsuarios(lisa);
		pop_corn_time.setUsuarios(bart);
		pop_corn_time.setUsuarios(maggie);
		pop_corn_time.setUsuarios(marge);
		pop_corn_time.setUsuarios(homero);
		
		//Creacion de Grupos
		Grupo hombres_simpson = new Grupo("Hombres Simpson");
		hombres_simpson.setCliente(bart);
		hombres_simpson.setCliente(homero);
		
		Grupo hermanos_simpson = new Grupo("Hermanos Simpson");
		hermanos_simpson.setCliente(lisa);
		hermanos_simpson.setCliente(bart);
		hermanos_simpson.setCliente(maggie);
		
		Grupo familia_simpson = new Grupo("Familia Simpson");
		familia_simpson.setCliente(hermanos_simpson);
		familia_simpson.setCliente(homero);
		familia_simpson.setCliente(marge);
		
		//Agregar los grupos a la sede
		pop_corn_time.setUsuarios(hombres_simpson);
		pop_corn_time.setUsuarios(hermanos_simpson);
		pop_corn_time.setUsuarios(familia_simpson);
		
		//Creacion de peliculas
		Pelicula up = new Pelicula("Up","Carl Fredricksen es un vendedor de globos de 78 años de edad dispuesto a cumplir su sueño:"+
									" atar miles de globos a su casa y volar a Sudamérica. Sin embargo,"+
									" descubre demasiado tarde a un joven e inesperado polizón. Lo que en principio será recelo,"+
									" acabará por tornarse simpatía hacia el muchacho mientras juntos pasan fascinantes aventuras en exóticos lugares.",
									2009,130);
		up.setDirector("Pete Docter");
		up.setDirector("Bob Peterson");
		up.setActor("Pete Docter");
		up.setActor("Bob Peterson");
		up.setActor("Jordan Nagai");
		up.setCategoria("Infantil");
		up.setCategoria("Accion");
		up.setCategoria("Drama");
		
		Pelicula los_simpson = new Pelicula("Los Simpson",
											"La combinación de Homero (Dan Castellaneta), su nuevo puerco mascota, "+ 
											"y un silo lleno de excremento podrían provocar un desastre que amenace no sólo a Springfield,"+
											" sino al mundo entero. Una muchedumbre enojada llega a la casa de los Simpson,"+ 
											" dividiendo a la familia. Con el destino de la Tierra en equilibrio,"+
											" Homero se prepara para intentar redimirse con la intención de salvar al mundo y ganarse el perdón de Marge (Julie Kavner).",
											2007,110);
		
		los_simpson.setDirector("David Silverman");
		los_simpson.setActor("Dan Castellaneta");
		los_simpson.setActor("Harry Shearer");
		los_simpson.setActor("Julie Kavner");
		los_simpson.setCategoria("Romantico");
		los_simpson.setCategoria("Musical");
		los_simpson.setCategoria("Infantil");
		los_simpson.setCategoria("Aventura");
		los_simpson.setCategoria("Comedia");
		
		Pelicula los_increibles = new Pelicula("Los Increibles","Un súper héroe retirado lucha contra el aburrimiento en un suburbio y junto con su"+ 
												"familia tiene la oportunidad de salvar al mundo.",
												2004,90);
		los_increibles.setDirector("Brad Bird");
		los_increibles.setActor("Brad Bird");
		los_increibles.setActor("Craig T. Nelson");
		los_increibles.setActor("Holly Hunter");
		los_increibles.setCategoria("Musical");
		los_increibles.setCategoria("Infantil");
		los_increibles.setCategoria("Aventura");
		los_increibles.setCategoria("Accion");
		
		Pelicula los_increibles2 = new Pelicula("Los Increibles 2",
												" Helen entra en acción y debe luchar contra un cibercriminal que planea hipnotizar el mundo a través de las pantallas de las computadoras."+
												" Eso deja al Sr. Increíble con uno de sus mayores desafíos: quedarse en casa y cuidar de tres niños traviesos.",
												2018,120);
		los_increibles2.setDirector("Brad Bird");
		los_increibles2.setActor("Brad Bird");
		los_increibles2.setActor("Craig T. Nelson");
		los_increibles2.setActor("Holly Hunter");
		los_increibles2.setCategoria("Musical");
		los_increibles2.setCategoria("Infantil");
		los_increibles2.setCategoria("Aventura");
		los_increibles2.setCategoria("Accion");
		
		Pelicula toy_story = new Pelicula("Toy Story",
											"Lo mejor de la animación computarizada produce esta historia sobre juguetes que cobran vida cuando su dueño se ausenta.",
											1995,120);
		toy_story.setDirector("John Lasseter");
		toy_story.setActor("Tim Allen");
		toy_story.setActor("Tom Hanks");
		toy_story.setActor("Don Rickles");
		toy_story.setActor("Wallace Shawn");
		toy_story.setCategoria("Infantil");
		toy_story.setCategoria("Aventura");
		toy_story.setCategoria("Accion");
		
		Pelicula monstersinc = new Pelicula("Monsters Inc.",
											"Monsters, Incorporated es la fábrica de sustos más grande en el mundo de los"+ 
											" monstruos y James P. Sullivan (John Goodman) es uno de sus mejores asustadores. Sullivan es un monstruo "+ 
											"grande e intimidante de piel azul, grandes manchas color púrpura y cuernos. Su asistente, mejor amigo y "+ 
											"compañero de cuarto es Mike Wazowski (Billy Crystal), un pequeño y alegre monstruo verde con un solo ojo."+ 
											" Boo (Mary Gibbs), una niña pequeña visita lugares en donde nunca antes había estado un ser humano.",
											2001,90);
		monstersinc.setDirector("Pete Docter");
		monstersinc.setActor("John Goodman");
		monstersinc.setActor("Billy Crystal");
		monstersinc.setActor("John Ratzenberger");
		monstersinc.setCategoria("Infantil");
		monstersinc.setCategoria("Musical");
		monstersinc.setCategoria("Aventura");
		monstersinc.setCategoria("Accion");
		
		//Agregar votos a las peliculas
		lisa.valorarPelicula(los_increibles, 5);
		bart.valorarPelicula(los_increibles, 2);
		homero.valorarPelicula(los_increibles, 4);
		marge.valorarPelicula(los_increibles, 2);
		marge.valorarPelicula(los_increibles2, 5);
		maggie.valorarPelicula(toy_story, 1);
		
		//Agregar las peliculas a la sede
		pop_corn_time.setPelicula(up);
		pop_corn_time.setPelicula(los_simpson);
		pop_corn_time.setPelicula(los_increibles);
		pop_corn_time.setPelicula(los_increibles2);
		pop_corn_time.setPelicula(toy_story);
		pop_corn_time.setPelicula(monstersinc);
		
		
		//1.Ver peliculas Marge
		System.out.println("-------------------------------\n");		
		System.out.println("1.Ver peliculas Marge");
		Iterator<Pelicula> itPeliculas = marge.getPeliculasVistas();
		while(itPeliculas.hasNext()) {
			System.out.println("-"+itPeliculas.next().getTitulo()+".");
		}
		
		//2.Ver peliculas Bart
		System.out.println("-------------------------------\n");
		System.out.println("2.Ver peliculas Bart");
		itPeliculas = bart.getPeliculasVistas();
		while(itPeliculas.hasNext()) {
			System.out.println("-"+itPeliculas.next().getTitulo()+".");
		}
	
		//3.Generar 2 recomendaciones para cada uno de los usuarios individuales y grupos creados,
		//considerando que las películas incluyan TODOS los géneros preferidos por el usuario,
		//ordenados por popularidad
		pop_corn_time.setCondicionPelicula(new ContieneTodosGeneros());
		
		//Recomendacion personas
		
		System.out.println("-------------------------------\n");
		System.out.println("3.Ver Recomendacion Lisa");
		ArrayList<Pelicula> recomendacionLisa = pop_corn_time.recomendar(lisa,2);
		for(int i = 0; i < recomendacionLisa.size(); i++) {
			System.out.println("-"+recomendacionLisa.get(i).getTitulo()+".");
		}
		
		System.out.println("-------------------------------\n");
		System.out.println("3.Ver Recomendacion Marge");
		ArrayList<Pelicula> recomendacionMarge = pop_corn_time.recomendar(marge,2);
		for(int i = 0; i < recomendacionMarge.size(); i++) {
			System.out.println("-"+recomendacionMarge.get(i).getTitulo()+".");
		}

		System.out.println("-------------------------------\n");		
		System.out.println("3.Ver Recomendacion Bart");
		ArrayList<Pelicula> recomendacionBart = pop_corn_time.recomendar(bart,2);
		for(int i = 0; i < recomendacionBart.size(); i++) {
			System.out.println("-"+recomendacionBart.get(i).getTitulo()+".");
		}

		System.out.println("-------------------------------\n");			
		System.out.println("3.Ver Recomendacion Homero");
		ArrayList<Pelicula> recomendacionHomero = pop_corn_time.recomendar(homero,2);
		for(int i = 0; i < recomendacionHomero.size(); i++) {
			System.out.println("-"+recomendacionHomero.get(i).getTitulo()+".");
		}

		System.out.println("-------------------------------\n");			
		System.out.println("3.Ver Recomendacion Maggie");
		ArrayList<Pelicula> recomendacionMaggie = pop_corn_time.recomendar(maggie,2);
		for(int i = 0; i < recomendacionMaggie.size(); i++) {
			System.out.println("-"+recomendacionMaggie.get(i).getTitulo()+".");
		}
	
		//Recomendacion grupos
		System.out.println("-------------------------------\n");		
		System.out.println("3.Ver Recomendacion Hombres Simpson");
		ArrayList<Pelicula> recomendacionHombresSimpson = pop_corn_time.recomendar(hombres_simpson,2);
		for(int i = 0; i < recomendacionHombresSimpson.size(); i++) {
			System.out.println("-"+recomendacionHombresSimpson.get(i).getTitulo()+".");
		}

		System.out.println("-------------------------------\n");			
		System.out.println("3.Ver Recomendacion Hermanos Simpson");
		ArrayList<Pelicula> recomendacionHermanosSimpson = pop_corn_time.recomendar(hermanos_simpson,2);
		for(int i = 0; i < recomendacionHermanosSimpson.size(); i++) {
			System.out.println("-"+recomendacionHermanosSimpson.get(i).getTitulo()+".");
		}

		System.out.println("-------------------------------\n");	
		System.out.println("3.Ver Recomendacion Familia Simpson");
		ArrayList<Pelicula> recomendacionFamiliaSimpson = pop_corn_time.recomendar(familia_simpson,2);
		for(int i = 0; i < recomendacionFamiliaSimpson.size(); i++) {
			System.out.println("-"+recomendacionFamiliaSimpson.get(i).getTitulo()+".");
		}
	
		//4.Generar 5 recomendaciones para cada uno de los usuarios individuales y grupos creados,
		//considerando que las películas incluyan ALGUNO de los géneros preferidos por el usuario,
		//ordenados por puntaje promedio
		pop_corn_time.setCondicionPelicula(new ContieneAlgunGenero());
		pop_corn_time.setComparador(new ComparadorPorPromedio());
		
		//Recomendacion Personas

		System.out.println("-------------------------------\n");			
		System.out.println("4.Ver Recomendacion Lisa");
		recomendacionLisa = pop_corn_time.recomendar(lisa,5);
		for(int i = 0; i < recomendacionLisa.size(); i++) {
			System.out.println("-"+recomendacionLisa.get(i).getTitulo()+".");
		}

		System.out.println("-------------------------------\n");			
		System.out.println("4.Ver Recomendacion Marge");
		recomendacionMarge = pop_corn_time.recomendar(marge,5);
		for(int i = 0; i < recomendacionMarge.size(); i++) {
			System.out.println("-"+recomendacionMarge.get(i).getTitulo()+".");
		}

		System.out.println("-------------------------------\n");			
		System.out.println("4.Ver Recomendacion Bart");
		recomendacionBart = pop_corn_time.recomendar(bart,5);
		for(int i = 0; i < recomendacionBart.size(); i++) {
			System.out.println("-"+recomendacionBart.get(i).getTitulo()+".");
		}

		System.out.println("-------------------------------\n");			
		System.out.println("4.Ver Recomendacion Homero");
		recomendacionHomero = pop_corn_time.recomendar(homero,5);
		for(int i = 0; i < recomendacionHomero.size(); i++) {
			System.out.println("-"+recomendacionHomero.get(i).getTitulo()+".");
		}

		System.out.println("-------------------------------\n");			
		System.out.println("4.Ver Recomendacion Maggie");
		recomendacionMaggie = pop_corn_time.recomendar(maggie,5);
		for(int i = 0; i < recomendacionMaggie.size(); i++) {
			System.out.println("-"+recomendacionMaggie.get(i).getTitulo()+".");
		}

		System.out.println("-------------------------------\n");			
		//Recomendacion grupos
		System.out.println("4.Ver Recomendacion Hombres Simpson");
		recomendacionHombresSimpson = pop_corn_time.recomendar(hombres_simpson,5);
		for(int i = 0; i < recomendacionHombresSimpson.size(); i++) {
			System.out.println("-"+recomendacionHombresSimpson.get(i).getTitulo()+".");
		}

		System.out.println("-------------------------------\n");			
		System.out.println("4.Ver Recomendacion Hermanos Simpson");
		recomendacionHermanosSimpson = pop_corn_time.recomendar(hermanos_simpson,5);
		for(int i = 0; i < recomendacionHermanosSimpson.size(); i++) {
			System.out.println("-"+recomendacionHermanosSimpson.get(i).getTitulo()+".");
		}

		System.out.println("-------------------------------\n");			
		System.out.println("4.Ver Recomendacion Familia Simpson");
		recomendacionFamiliaSimpson = pop_corn_time.recomendar(familia_simpson,5);
		for(int i = 0; i < recomendacionFamiliaSimpson.size(); i++) {
			System.out.println("-"+recomendacionFamiliaSimpson.get(i).getTitulo()+".");
		}	
	
		//5.Incorporar al sistema la información relativa a que los hermanos Simpson vieron la película
		//Up y la valoraron grupalmente con 4 granos de café.
		hermanos_simpson.valorarPelicula(up, 4);

		//6.Realizar nuevamente los listados correspondientes a los puntos 2, 3 y 4 anteriores
		//2.
		System.out.println("-------------------------------\n");	
		System.out.println("6.Ver peliculas Bart");
		itPeliculas = bart.getPeliculasVistas();
		while(itPeliculas.hasNext()) {
			System.out.println("-"+itPeliculas.next().getTitulo() +".");
		}
	
		//3.
		pop_corn_time.setCondicionPelicula(new ContieneTodosGeneros());
		
		//Recomendacion personas
		
		System.out.println("-------------------------------\n");
		System.out.println("6.3.Ver Recomendacion Lisa");
		recomendacionLisa = pop_corn_time.recomendar(lisa,2);
		for(int i = 0; i < recomendacionLisa.size(); i++) {
			System.out.println("-"+recomendacionLisa.get(i).getTitulo()+".");
		}
		
		System.out.println("-------------------------------\n");
		System.out.println("6.3.Ver Recomendacion Marge");
		recomendacionMarge = pop_corn_time.recomendar(marge,2);
		for(int i = 0; i < recomendacionMarge.size(); i++) {
			System.out.println("-"+recomendacionMarge.get(i).getTitulo()+".");
		}

		System.out.println("-------------------------------\n");		
		System.out.println("6.3.Ver Recomendacion Bart");
		recomendacionBart = pop_corn_time.recomendar(bart,2);
		for(int i = 0; i < recomendacionBart.size(); i++) {
			System.out.println("-"+recomendacionBart.get(i).getTitulo()+".");
		}

		System.out.println("-------------------------------\n");			
		System.out.println("6.3.Ver Recomendacion Homero");
		recomendacionHomero = pop_corn_time.recomendar(homero,2);
		for(int i = 0; i < recomendacionHomero.size(); i++) {
			System.out.println("-"+recomendacionHomero.get(i).getTitulo()+".");
		}

		System.out.println("-------------------------------\n");			
		System.out.println("6.3.Ver Recomendacion Maggie");
		recomendacionMaggie = pop_corn_time.recomendar(maggie,2);
		for(int i = 0; i < recomendacionMaggie.size(); i++) {
			System.out.println("-"+recomendacionMaggie.get(i).getTitulo()+".");
		}
	
		//Recomendacion grupos
		System.out.println("-------------------------------\n");		
		System.out.println("6.3.Ver Recomendacion Hombres Simpson");
		recomendacionHombresSimpson = pop_corn_time.recomendar(hombres_simpson,2);
		for(int i = 0; i < recomendacionHombresSimpson.size(); i++) {
			System.out.println("-"+recomendacionHombresSimpson.get(i).getTitulo()+".");
		}

		System.out.println("-------------------------------\n");			
		System.out.println("6.3.Ver Recomendacion Hermanos Simpson");
		recomendacionHermanosSimpson = pop_corn_time.recomendar(hermanos_simpson,2);
		for(int i = 0; i < recomendacionHermanosSimpson.size(); i++) {
			System.out.println("-"+recomendacionHermanosSimpson.get(i).getTitulo()+".");
		}

		System.out.println("-------------------------------\n");	
		System.out.println("6.3.Ver Recomendacion Familia Simpson");
		recomendacionFamiliaSimpson = pop_corn_time.recomendar(familia_simpson,2);
		for(int i = 0; i < recomendacionFamiliaSimpson.size(); i++) {
			System.out.println("-"+recomendacionFamiliaSimpson.get(i).getTitulo()+".");
		}
		
		//4.
		pop_corn_time.setCondicionPelicula(new ContieneAlgunGenero());
		pop_corn_time.setComparador(new ComparadorPorPromedio());
		
		//Recomendacion Personas

		System.out.println("-------------------------------\n");			
		System.out.println("6.4.Ver Recomendacion Lisa");
		recomendacionLisa = pop_corn_time.recomendar(lisa,5);
		for(int i = 0; i < recomendacionLisa.size(); i++) {
			System.out.println("-"+recomendacionLisa.get(i).getTitulo()+".");
		}

		System.out.println("-------------------------------\n");			
		System.out.println("6.4.Ver Recomendacion Marge");
		recomendacionMarge = pop_corn_time.recomendar(marge,5);
		for(int i = 0; i < recomendacionMarge.size(); i++) {
			System.out.println("-"+recomendacionMarge.get(i).getTitulo()+".");
		}

		System.out.println("-------------------------------\n");			
		System.out.println("6.4.Ver Recomendacion Bart");
		recomendacionBart = pop_corn_time.recomendar(bart,5);
		for(int i = 0; i < recomendacionBart.size(); i++) {
			System.out.println("-"+recomendacionBart.get(i).getTitulo()+".");
		}

		System.out.println("-------------------------------\n");			
		System.out.println("6.4.Ver Recomendacion Homero");
		recomendacionHomero = pop_corn_time.recomendar(homero,5);
		for(int i = 0; i < recomendacionHomero.size(); i++) {
			System.out.println("-"+recomendacionHomero.get(i).getTitulo()+".");
		}

		System.out.println("-------------------------------\n");			
		System.out.println("6.4.Ver Recomendacion Maggie");
		recomendacionMaggie = pop_corn_time.recomendar(maggie,5);
		for(int i = 0; i < recomendacionMaggie.size(); i++) {
			System.out.println("-"+recomendacionMaggie.get(i).getTitulo()+".");
		}

		System.out.println("-------------------------------\n");			
		//Recomendacion grupos
		System.out.println("6.4.Ver Recomendacion Hombres Simpson");
		recomendacionHombresSimpson = pop_corn_time.recomendar(hombres_simpson,5);
		for(int i = 0; i < recomendacionHombresSimpson.size(); i++) {
			System.out.println("-"+recomendacionHombresSimpson.get(i).getTitulo()+".");
		}

		System.out.println("-------------------------------\n");			
		System.out.println("6.4.Ver Recomendacion Hermanos Simpson");
		recomendacionHermanosSimpson = pop_corn_time.recomendar(hermanos_simpson,5);
		for(int i = 0; i < recomendacionHermanosSimpson.size(); i++) {
			System.out.println("-"+recomendacionHermanosSimpson.get(i).getTitulo()+".");
		}

		System.out.println("-------------------------------\n");			
		System.out.println("6.4.Ver Recomendacion Familia Simpson");
		recomendacionFamiliaSimpson = pop_corn_time.recomendar(familia_simpson,5);
		for(int i = 0; i < recomendacionFamiliaSimpson.size(); i++) {
			System.out.println("-"+recomendacionFamiliaSimpson.get(i).getTitulo()+".");
		}
		
		//7.Realizar las siguientes búsquedas:
		//a.Todas las películas en las que Pete Docter haya actuado y sido director al
		//mismo tiempo
		BuscarActor actor = new BuscarActor("Pete Docter");
		BuscarDirector director = new BuscarDirector("Pete Docter");
		BuscarAnd and = new BuscarAnd(actor,director);
		System.out.println("-------------------------------\n");	
		System.out.println("7.a. Peliculas con Pete Docter");
		ArrayList<Pelicula> Peliculas_PeteDocter = pop_corn_time.busqueda(and);
		for(int i = 0; i < Peliculas_PeteDocter.size(); i++) {
			System.out.println("-"+Peliculas_PeteDocter.get(i).getTitulo()+".");
		}	
		
		//b.Todas las películas en las que haya actuado Tom Hanks
		actor = new BuscarActor("Tom Hanks");
		System.out.println("-------------------------------\n");	
		System.out.println("7.b. Peliculas con Tom Hanks");
		ArrayList<Pelicula> Peliculas_TomHanks = pop_corn_time.busqueda(actor);
		for(int i = 0; i < Peliculas_TomHanks.size(); i++) {
			System.out.println("-"+Peliculas_TomHanks.get(i).getTitulo()+".");
		}
		
		//c.Todas las películas estrenadas a partir del año 2000
		BuscarAnio anio = new BuscarAnio(2000);
		System.out.println("-------------------------------\n");	
		System.out.println("7.c. Peliculas estrenadas a partir del año 2000");
		ArrayList<Pelicula> Peliculas_Post2000 = pop_corn_time.busqueda(anio);
		for(int i = 0; i < Peliculas_Post2000.size(); i++) {
			System.out.println("-"+Peliculas_Post2000.get(i).getTitulo()+".");
		}
		
		//d.Todas las películas con género romántico, comedia, o drama
		BuscarCategoria categoria1 = new BuscarCategoria("Romantico");
		BuscarCategoria categoria2 = new BuscarCategoria("Comedia");
		BuscarOr or1 = new BuscarOr(categoria1,categoria2);
		categoria1 = new BuscarCategoria("Drama");
		BuscarOr or2 = new BuscarOr(or1,categoria1); 
		System.out.println("-------------------------------\n");	
		System.out.println("7.d. Peliculas con género romántico, comedia, o drama");
		ArrayList<Pelicula> Peliculas_ConGenero = pop_corn_time.busqueda(or2);
		for(int i = 0; i < Peliculas_ConGenero.size(); i++) {
			System.out.println("-"+Peliculas_ConGenero.get(i).getTitulo()+".");
		}
	}
}
