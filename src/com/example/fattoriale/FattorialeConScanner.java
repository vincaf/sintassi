package com.example.fattoriale;

import java.util.Scanner;

public class FattorialeConScanner {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Inserisci un numero : ");
		int num = sc.nextInt();

		// NON E' GIUSTO QUESTO SWITCH.
		switch (num) {
		case 0:
			System.out.println("1");
			break;
		case -1:
			System.out.println(1);
			break;
		}

		FattorialeConScanner fcs = new FattorialeConScanner();
		int risultato = fcs.fattoriale(num);
		System.out.println("Il fattoriale è: " + risultato);

	}

	public int fattoriale(int num) {
		int risultato = 1;
		for (int i = num; i >= 1; i--) {
			risultato = risultato * i;

		}
		return risultato;
	}

}
