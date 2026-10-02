package com.krakedev.juegos.entidades;

public class Carta {
	// Atributos
	private String valor; // "A", "2"… "10", "J", "Q", "K";
	private int valorJuego;
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

	// Metodo imprimir
	public void imprimir() {
		System.out.println(getValor() + " - " + getPalo() + " , " + " Valor juego: " + getValorJuego());
	}

}
