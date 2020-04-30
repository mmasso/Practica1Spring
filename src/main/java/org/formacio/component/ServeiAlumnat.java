package org.formacio.component;

import org.springframework.stereotype.Service;

@Service
public class ServeiAlumnat {

	@Autowired //Afegim notació Spring
	private RepositoriAlumnes repositori;

	/**
	 * ha de donar d'alta a la base de dades d'alumnes l'alumne indicat amb 
	 * el corresponent codi.
	 * Si el nom de l'alumne es null, no l'ha de donar d'alta
	 * Retorna true si l'alumne s'ha inserit, false si no.
	 */
	public boolean matricula(int id, String alumne) {
		if (alumne != null) {
			repositori.altaAlumne(id, alumne);
			return true;}
		return false;
	}

	@PostConstruct
	public void initializator() {
		this.inicialitzarRepositoriAlumnes();
	}
	
	public void inicialitzarRepositoriAlumnes() {

		final byte posicioRepositori = 1;
		String[] alumnes = {"Antonia", "Joan"};

		for (String alumne : alumnes) {
			repositori.altaAlumne((int) posicioRepositori, alumne);
			posicioRepositori += 1;
		}
	}



	public int numeroAlumnesRepositori() {
		return repositori.llistaAlumnes().size();
	}

}
