package com.example.cancelleria;

public class Mina {

	private String colore = "Blu";

	public void scrivere(String testo) {
		String str = String.format("%s: %s", colore, testo); // simile a printf del C
		System.out.println(str);
	}

}
