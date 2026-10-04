package com.krakedev.juegos.servicios;

import java.util.ArrayList;

import com.krakedev.juegos.entidades.Carta;
import com.krakedev.juegos.entidades.Jugador;

//El organizador de la mesa: coordina al Dealer y a los Jugadores.
//No guarda cartas por sí mismo: usa Dealer (el mazo) y Jugador (las manos).
//Orden de uso: agregarJugador (varios) -> inicializar -> repartirRonda.
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

	// Asigna el valorJuego de cada Carta del naipe del dealer: A = 11, J/Q/K = 10 y
	// números = su valor.
	// Recorre dealer.getNaipe() y usa los métodos de Carta (getValor y
	// setValorJuego).
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

	// Prepara la mesa: crea el Dealer (que genera el naipe de 52 cartas) y luego
	// asigna los puntos
	// con cargarValores(). El orden importa: cargarValores necesita que el dealer
	// ya exista.
	public void inicializar() {
		dealer = new Dealer();
		cargarValores();

	}

	// Inscribe a un jugador en la mesa: lo guarda en la lista jugadores.
	// Se puede usar antes de inicializar() porque la lista jugadores ya existe
	// desde el inicio.
	public void agregarJugador(Jugador jugador) {
		jugadores.add(jugador);

	}

	// Reparte UNA carta a UN jugador: la pide al dealer (Dealer.entregarCarta) y se
	// la entrega
	// al jugador (Jugador.recibirCarta). Así la carta pasa del naipe a la mano del
	// jugador.
	public void repartirCarta(Jugador jugador) {
		Carta carta = dealer.entregarCarta();
		jugador.recibirCarta(carta);

	}

	// Reparte una ronda: recorre la lista jugadores y llama a repartirCarta por
	// cada uno,
	// asi todos reciben una carta. Al final invoca calcularTotal() para
	// actualizar los puntos.
	public void repartirRonda() {
		for (Jugador jugador : jugadores) {
			repartirCarta(jugador);
		}
		calcularTotal();

	}

	// Calcula los puntos de cada jugador: suma el valorJuego de todas sus cartas
	// (Carta.getValorJuego) y guarda el total en Jugador.puntajeCartas.
	// Lo invoca repartirRonda al terminar de repartir.
	public void calcularTotal() {
		for (Jugador jugador : jugadores) {
			int total = 0;
			for (Carta carta : jugador.getCartas()) {
				total += carta.getValorJuego();
			}
			jugador.setPuntajeCartas(total);

		}
	}
}
