package com.example.random;

import java.util.Random;

public class RandomExample {

	public static void main(String[] args) {
		Random rnd = new Random();

		for(int i=0; i<5; i++) {
			System.out.println( rnd.nextInt() );
		}

		for(int i=0; i<5; i++) {
			System.out.println( rnd.nextInt(3) );
		}

	}

}
