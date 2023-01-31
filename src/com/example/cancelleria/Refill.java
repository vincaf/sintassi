package com.example.cancelleria;

public class Refill {

	private String colore = "Verde";

	public void scrivere(String testo) {
		String str = String.format("%s: %s", colore, testo); // simile a printf del C
		System.out.println(str);
	}
}
