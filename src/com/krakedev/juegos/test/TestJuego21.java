package com.krakedev.juegos.test;

import java.util.ArrayList;

import com.krakedev.juegos.entidades.Jugador;
import com.krakedev.juegos.servicios.Juego21;

//Prueba de la mesa completa: usa Juego21, Jugador y 
//Dealer (a través de getDealer()).
//Flujo: crear la mesa -> inscribir 3 jugadores -> 
//inicializar -> jugar -> mostrar ganadores -> verificar.
public class TestJuego21 {

	public static void main(String[] args) {

		Juego21 juego21 = new Juego21();

		Jugador jugador1 = new Jugador();

		jugador1.setNickname("Alexandra");
		juego21.agregarJugador(jugador1);

		Jugador jugador2 = new Jugador();
		jugador2.setNickname("Julian");
		juego21.agregarJugador(jugador2);

		Jugador jugador3 = new Jugador();
		jugador3.setNickname("David");
		juego21.agregarJugador(jugador3);

		juego21.inicializar();

		// Primera prueba: jugar() reparte hasta 3 rondas y devuelve los ganadores
		// (lista vacía si nadie llegó a 21). Cada ganador se muestra con
		// Jugador.imprimir().
		ArrayList<Jugador> ganadores = juego21.jugar();
		for (Jugador jugador : ganadores) {
			jugador.imprimir();
		}

		// Verificación 1: cada jugador muestra sus cartas (una por ronda jugada:
		// 2 o 3, según cuándo terminó el juego).
		jugador1.imprimir();
		jugador2.imprimir();
		jugador3.imprimir();

		System.out.println("-------------------------------------------------------------");

		// Verificación 2: el naipe del dealer ya no contiene las cartas repartidas.
		// juego21 -> getDealer() (su dealer) -> imprimirNaipe() (imprime su mazo).
		juego21.getDealer().imprimirNaipe();

		// Debe mostrar 52 menos las cartas repartidas (una por jugador en cada ronda
		// jugada).
		System.out.println("Cartas que quedan en el naipe: " + juego21.getDealer().getNaipe().size());

	}

}
