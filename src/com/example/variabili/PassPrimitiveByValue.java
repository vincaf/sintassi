package com.example.variabili;

public class PassPrimitiveByValue {
	public static void main(String[] args) {
		Contenitore c = new Contenitore(100, 200);
		c.stampa("PRIMA");
		swap(c); // come se fosse swap(100, 200)
		c.stampa("DOPO");

	}

	// gli argomenti in java vengono passati by value
	private static void swap(Contenitore c) {
		int t = c.x;
		c.x = c.y; //x=200
		c.y = t; //y=100
		c.stampa("DURANTE");
	}
}

class Contenitore {
	int x;
	int y;

	public Contenitore(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	void stampa(String msg) {
		System.out.println(msg+": Il valore di x è: " + x + " Il valore di y è: " + y);
	}
}