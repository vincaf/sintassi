package com.example.hello;

public class HelloWorld {  // la classe è un contenitore di metodi e dati(=variabili)

	int x = 0;

	// il metodo (funzione) main è l'entry point del programma
	// entry point = punto di attacco del'elaborazione da parte della JVM
	public static void main(String[] args) {
		
		HelloWorld hw = new HelloWorld(); // ottengo un istanza da HelloWorld e la chiamo hw
		
		
		// stampo "Hello World"
		System.out.println("Hello World");
	}

}
