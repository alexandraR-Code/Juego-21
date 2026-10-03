package com.krakedev.juegos.servicios;

import java.util.ArrayList;

import com.krakedev.juegos.entidades.Carta;
import com.krakedev.juegos.entidades.Jugador;

public class Juego21 {
	// Atributos
	private ArrayList<Jugador> jugadores = new ArrayList<>(); // Jugadores de la mesa; se crea aquí porque se agregan
																// antes de inicializar
	private Dealer dealer; // Se crea en inicializar()

	// Metodos setter y getter
	public ArrayList<Jugador> getJugadores() {
		return jugadores;
	}

	public void setJugadores(ArrayList<Jugador> jugadores) {
		this.jugadores = jugadores;
	}

	public Dealer getDealer() {
		return dealer;
	}

	public void setDealer(Dealer dealer) {
		this.dealer = dealer;
	}

	// Asigna el valorJuego de cada carta: A = 11, J/Q/K = 10,
	// números = su valor
	public void cargarValores() {
		for (Carta carta : dealer.getNaipe()) {
			if (carta.getValor().equals("A")) {
				carta.setValorJuego(11);
			} else if (carta.getValor().equals("J") || carta.getValor().equals("Q") || carta.getValor().equals("K")) {
				carta.setValorJuego(10);
			} else {
				// Convierte el texto ("7") en número (7)
				carta.setValorJuego(Integer.parseInt(carta.getValor()));

			}

		}

	}

	// Prepara la mesa: crea el dealer y carga los valores. El orden importa
	public void inicializar() {
		dealer = new Dealer();
		cargarValores();

	}

	// Agrega a la lista jugadores el jugador que llega a la mesa
	public void agregarJugador(Jugador jugador) {
		jugadores.add(jugador);

	}

}
