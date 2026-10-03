package com.krakedev.juegos.servicios;

import java.util.ArrayList;

import com.krakedev.juegos.entidades.Carta;

public class Dealer {
	// atributos
	// Mazo del dealer: lista con las 52 cartas
	private ArrayList<Carta> naipe;

	// Crea la lista vacía y genera las 52 cartas (en ese orden)
	public Dealer() {
		naipe = new ArrayList<Carta>();
		generarNaipe();

	}

	// metodos getter y setter

	public ArrayList<Carta> getNaipe() {
		return naipe;
	}

	public void setNaipe(ArrayList<Carta> naipe) {
		this.naipe = naipe;
	}

	// Genera las 52 cartas del mazo.
	// No asigna valorJuego: eso lo hará Juego21
	public void generarNaipe() {
		// Lista auxiliar con las iniciales de los palos
		ArrayList<String> palos = new ArrayList<String>();
		palos.add("T");
		palos.add("CN");
		palos.add("CR");
		palos.add("D");
		// Lista auxiliar con los 13 valores de cada palo
		ArrayList<String> valores = new ArrayList<String>();
		valores.add("A");
		valores.add("2");
		valores.add("3");
		valores.add("4");
		valores.add("5");
		valores.add("6");
		valores.add("7");
		valores.add("8");
		valores.add("9");
		valores.add("10");
		valores.add("J");
		valores.add("Q");
		valores.add("K");

		// Por cada palo (4) se recorren todos los valores (13):
		// 4 x 13 = 52 cartas
		for (String palo : palos) {

			for (String valor : valores) {
				// Se crea una carta nueva en cada vuelta; si fuera una sola,
				// el mazo tendría la misma carta repetida
				Carta carta = new Carta();
				carta.setValor(valor);
				carta.setPalo(palo);
				naipe.add(carta);
			}
		}
	}

	// Metodo imprimir
	// recorre el naipe y le pide a cada carta que se imprima
	public void imprimirNaipe() {
		for (Carta carta : naipe) {
			carta.imprimir();
		}

	}

	// Retorna un entero entre 0 y maximo,
	// ambos incluidos: se multiplica por maximo + 1
	public int generarAleatorio(int maximo) {
		int aleatorio = (int) (Math.random() * (maximo + 1));
		return aleatorio;
	}

	// Saca una carta al azar del naipe:
	// la toma, la elimina y la retorna
	public Carta entregarCarta() {
		int posicion = generarAleatorio(naipe.size() - 1);
		Carta carta = naipe.get(posicion);
		naipe.remove(posicion);
		return carta;

	}

}
