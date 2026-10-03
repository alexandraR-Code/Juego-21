package com.krakedev.juegos.test;

import com.krakedev.juegos.servicios.Dealer;

public class TestAleatorio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dealer dea = new Dealer();
		int maximo = 5;
		boolean rMinimo = false; // valor minimo en salir
		boolean rMaximo = false; // Valor maximo en salir
		for (int i = 0; i < 100; i++) {
			int numero = dea.generarAleatorio(maximo);
			System.out.println("El numero es: " + numero);
			if (numero == 0) {
				rMinimo = true;
			}
			if (numero == maximo) {
				rMaximo = true;
			}
			if (numero < 0 || numero > maximo) {
				System.out.println("Fuera de rango: " + numero);

			}
		}
		System.out.println("Salio el : " + rMinimo);
		System.out.println("Salio el maximo: " + rMaximo);

	}

}
