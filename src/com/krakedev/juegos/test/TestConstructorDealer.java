package com.krakedev.juegos.test;

import com.krakedev.juegos.servicios.Dealer;

public class TestConstructorDealer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dealer dea = new Dealer();
		dea.imprimirNaipe();
		System.out.println("Cantidad de cartas: " + dea.getNaipe().size());
	}

}
