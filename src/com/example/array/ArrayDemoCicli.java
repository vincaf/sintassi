package com.example.array;

import java.util.Arrays;

public class ArrayDemoCicli {

	public static void main(String[] args) {

		int [] interi = {23, 65, -77, 8, -34};

		String str = String.format("lungezza array \"interi\"=%s", interi.length);
		System.out.println(str);

		str = String.format("indice inferione=%s indice superiore=%s", 0, interi.length-1);
		System.out.println(str);

		for (int i = 0; i < interi.length; i++) {
			str = String.format("FOR: indice=%s valore=%s", i, interi[i]);
			System.out.println(str);
		}

		int i = 0;
		while(i < interi.length) {
			str = String.format("WHILE: indice=%s valore=%s", i, interi[i]);
			System.out.println(str);
			i++;
		}

		// forEach
		for (int intero : interi) {
			str = String.format("forEach: valore=%s", intero);
			System.out.println(str);
		}


		// da java (1.)8
		// elaborazione funzionale dell'array tramite "Stream"
		Arrays.stream(interi).parallel().forEach(System.out::println);
	}

}