package com.krakedev.juegos.test;

import com.krakedev.juegos.servicios.Dealer;

//Prueba del Dealer: new Dealer() debe dejar un naipe con las 52 cartas.
//Imprime el mazo con imprimirNaipe() y muestra la cantidad con getNaipe().size().
public class TestConstructorDealer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dealer dea = new Dealer();
		dea.imprimirNaipe();
		System.out.println("Cantidad de cartas: " + dea.getNaipe().size());
	}

}
