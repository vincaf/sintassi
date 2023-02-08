package com.example.exception;

public class FinallyDemo {

	public static void main(String[] args) {

		try {
			throw new RuntimeException("Eccezione di prova runtime");
		} catch (Exception e) {
			System.out.println(e);
		} finally { // sempre eseguito incondizionatamente
			System.out.println("blocco finale attivato");
		}

		try {
			//throw new RuntimeException("Eccezione di prova runtime");
		} catch (Exception e) {
			System.out.println(e);
		} finally { // sempre eseguito incondizionatamente
			System.out.println("blocco finale 2 attivato");
		}

		throw new RuntimeException("eccezione runtime");

		// System.out.println("Fine del programma");
	}

}
