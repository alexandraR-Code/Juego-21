package com.krakedev.juegos.entidades;

import java.util.ArrayList;

//Un jugador de la mesa: tiene un apodo (nickname) y la lista de cartas que ha recibido.
//Juego21 guarda a los jugadores en su lista jugadores y les entrega cartas con recibirCarta.
public class Jugador {
	// Atributos
	private String nickname; // Apodo con el que se identifica el jugador
	private ArrayList<Carta> cartas = new ArrayList<>(); // Cartas recibidas; se inicializa aquí para evitar
															// NullPointerException

	// Metodos getter y setter

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public ArrayList<Carta> getCartas() {
		return cartas;
	}

	public void setCartas(ArrayList<Carta> cartas) {
		this.cartas = cartas;
	}

	// Agrega a la mano del jugador la carta que le entrega el dealer.
	// La invoca Juego21.repartirCarta con la carta que sale de
	// Dealer.entregarCarta().
	public void recibirCarta(Carta carta) {
		cartas.add(carta);

	}

//------------------------------------------------------------------------------------//
// for-each: recorre la lista de principio a fin, una vuelta por cada elemento
//  for      → palabra reservada que inicia un ciclo
//  ( )      → encierran cómo funciona el ciclo
//  Carta    → TIPO de cada elemento de la lista
//  carta    → NOMBRE de la variable que guarda UNA carta en cada vuelta
//  :        → se lee "de" / "en": "para cada carta DE la lista"
//  cartas   → la LISTA que se recorre
//  { }      → el bloque que se repite en cada vuelta
//-----------------------------------------------------------------------------------//
	// Muestra el apodo del jugador y cada una de sus cartas (cada Carta se imprime
	// con Carta.imprimir()).
	// Lo usa TestJuego21 para verificar qué carta recibió cada jugador.
	public void imprimir() {
		System.out.println("Jugador: " + getNickname());
		for (Carta carta : cartas) {
			carta.imprimir();
		}

	}

}
