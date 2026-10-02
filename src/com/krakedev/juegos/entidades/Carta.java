package com.krakedev.juegos.entidades;

public class Carta {
	// Atributos
	private String valor;
	private int valorJuego;
	private String palo;

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
		System.out.println("Valor: " + getValor());
		System.out.println("Valor juego: " + getValorJuego());
		System.out.println("Palo: " + getPalo());
	}

}
