package com.krakedev.juegos.entidades;

import java.util.ArrayList;

public class Jugador {
	// Atributos
	private String nickname;
	private ArrayList<Carta> cartas = new ArrayList<>();

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

	// Metodo recibirCarta
	public void recibirCarta(Carta carta) {
		cartas.add(carta);

	}

}
