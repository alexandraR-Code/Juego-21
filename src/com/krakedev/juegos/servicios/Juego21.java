package com.krakedev.juegos.servicios;

import java.util.ArrayList;

import com.krakedev.juegos.entidades.Carta;
import com.krakedev.juegos.entidades.Jugador;

public class Juego21 {
	// Atributos
	private ArrayList<Jugador> jugadores = new ArrayList<>();
	private Dealer dealer;

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

	// Metodo cargarValores
	public void cargarValores() {
		for (Carta carta : dealer.getNaipe()) {
			if (carta.getValor().equals("A")) {
				carta.setValorJuego(11);
			} else if (carta.getValor().equals("J") || carta.getValor().equals("Q") || carta.getValor().equals("K")) {
				carta.setValorJuego(10);
			} else {
				carta.setValorJuego(Integer.parseInt(carta.getValor()));

			}

		}

	}
}
