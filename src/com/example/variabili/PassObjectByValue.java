package com.example.variabili;

public class PassObjectByValue {
	public static void main(String[] args) {
		int x=100;
		int y=200;
		System.out.println("PRIMA: Il valore di x è: " + x + " Il valore di y è: " + y);
		swap(x, y); // come se fosse swap(100, 200)
		System.out.println("DOPO: Il valore di x è: " + x + " Il valore di y è: " + y);

	}

	// gli argomenti in java vengono passati by value
	private static void swap(int x, int y) {
		int t = x;
		x = y; //x=200
		y = t; //y=100
		System.out.println("DURANTE: Il valore di x è: " + x + " Il valore di y è: " + y);
	}
}