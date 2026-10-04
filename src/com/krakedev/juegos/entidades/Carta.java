package com.krakedev.juegos.entidades;

//Representa UNA carta del naipe (por ejemplo, la K de Diamante).
//Solo guarda datos: valor, palo y valorJuego.
//La crea y llena Dealer (generarNaipe), la usa Jugador (la guarda en su mano)
//y Juego21 le asigna su valorJuego (cargarValores).
public class Carta {
	// Atributos
	private String valor; // "A", "2"… "10", "J", "Q", "K";
	private int valorJuego; // Puntos de la carta en el 21; se asigna después (Juego21.cargarValores)
	private String palo; // "D" Diamante, "T" Trébol, "CN" Corazón Negro, "CR" Corazón Rojo.

	// getter y setter

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public int getValorJuego() {
		return valorJuego;
	}

	public void setValorJuego(int valorJuego) {
		this.valorJuego = valorJuego;
	}

	public String getPalo() {
		return palo;
	}

	public void setPalo(String palo) {
		this.palo = palo;
	}

	// Muestra los 3 datos de la carta en una línea. Lo invocan Dealer.imprimirNaipe
	// y Jugador.imprimir, que recorren listas de cartas y le piden a cada una que
	// se imprima.
	public void imprimir() {
		System.out.println(getValor() + " - " + getPalo() + " , " + " Valor juego: " + getValorJuego());
	}

}
