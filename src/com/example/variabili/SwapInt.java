package com.example.variabili;

public class SwapInt {

	public static void main(String[] args) {
		int x = 100;
		int y = 200;

		// swap
		// mettere il valore di x in y e viceversa
		// x=200, y=100

		// con variabile di appoggio
		int t = x;
		x = y;
		y = t;

		// senza variabile di appoggio
		x = x + y;
		y = x - y;
		x = x - y;


		// con un metodo
		SwapInt si = new SwapInt();
		y = si.swap(x, x=y);
		System.out.println("x="+x+" y="+y);

		String r="Hello";
		String s="World";
		s = si.swap(r, r=s);
		System.out.println("r="+r+" s="+s);

	}

	private int swap(int x, int y) {
		return x;
	}

	private String swap(String x, String y) {
		return x;
	}

}
