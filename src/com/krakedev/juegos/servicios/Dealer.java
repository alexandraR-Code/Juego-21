package com.krakedev.juegos.servicios;

import java.util.ArrayList;

import com.krakedev.juegos.entidades.Carta;

//El repartidor (crupier): guarda el mazo y entrega las cartas.
//Usa Carta (crea las 52 y las guarda en su lista naipe).
//Lo crea Juego21 en inicializar() y le pide cartas en repartirCarta().
public class Dealer {
	// atributos
	// Mazo del dealer: lista con las 52 cartas
	private ArrayList<Carta> naipe;

	// Al crear un Dealer, primero crea la lista vacía naipe y luego la llena con
	// generarNaipe().
	// Así, "new Dealer()" siempre entrega un mazo completo de 52 cartas.
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

	// Crea las 52 cartas (4 palos x 13 valores) como objetos Carta y las agrega al
	// naipe.
	// No asigna valorJuego: esas son reglas del Blackjack y las pone
	// Juego21.cargarValores().
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

	// Recorre el naipe y le pide a cada Carta que se imprima (Carta.imprimir()).
	// Lo usan TestConstructorDealer y TestJuego21 para ver el mazo.
	public void imprimirNaipe() {
		for (Carta carta : naipe) {
			carta.imprimir();
		}

	}

	// Retorna un entero al azar entre 0 y maximo, ambos incluidos (por eso se
	// multiplica por maximo + 1).
	// Lo usa entregarCarta para elegir una posición del naipe; TestAleatorio
	// comprueba su rango.
	public int generarAleatorio(int maximo) {
		int aleatorio = (int) (Math.random() * (maximo + 1));
		return aleatorio;
	}

	// Saca una carta al azar del naipe: elige una posición (generarAleatorio), toma
	// la carta,
	// la elimina del naipe (para que no vuelva a salir) y la retorna.
	// La invoca Juego21.repartirCarta, que luego se la entrega a un Jugador.
	public Carta entregarCarta() {
		int posicion = generarAleatorio(naipe.size() - 1);
		Carta carta = naipe.get(posicion);
		naipe.remove(posicion);
		return carta;

	}

}
