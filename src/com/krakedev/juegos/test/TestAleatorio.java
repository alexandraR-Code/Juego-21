package com.krakedev.juegos.test;

import com.krakedev.juegos.servicios.Dealer;

//Prueba de Dealer.generarAleatorio(5) con 100 llamadas: comprueba que el resultado siempre
//está entre 0 y 5, y que en algún momento salieron el 0 y el máximo.
public class TestAleatorio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dealer dea = new Dealer();
		int maximo = 5;
		boolean rMinimo = false; // valor minimo en salir
		boolean rMaximo = false; // Valor maximo en salir

		// for tradicional: repite el bloque mientras la condición sea verdadera
		// for → palabra reservada que inicia un ciclo
		// int i = 0 → INICIO: crea el contador i en 0 (solo ocurre una vez)
		// ; → separa las tres partes del paréntesis
		// i < 100 → CONDICIÓN: si es verdadera, hace otra vuelta (0 a 99 = 100 vueltas)
		// i++ → AVANCE: suma 1 a i al terminar cada vuelta
		// { } → el bloque que se repite

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
