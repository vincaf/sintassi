package com.example.lambda;

import java.util.function.BiFunction;

public class Convertitore {

	public static void main(String[] args) {

		Convertitore convertitore = new Convertitore();

		BiFunction<Double, Double, Double> convertitoreDiValuta = (importoValuta, tassoDiCambio) -> importoValuta * tassoDiCambio;
		BiFunction<Double, Double, Double> metriInKm = (metri, fattDiConversione) -> metri * fattDiConversione;
		BiFunction<Double, Double, Double> kmInMetri = (km, fattDiConversione) -> km / fattDiConversione;

		System.out.println( convertitore.calcola(convertitoreDiValuta, 12, 0.91) + "€" );
		System.out.println( convertitore.calcola(metriInKm, 1, 1000) + "km" );
		System.out.println( convertitore.calcola(kmInMetri, 1, 1000) + "m" );
	}

	public double calcola(BiFunction<Double, Double, Double> calcolatore, double v, double z) {
		return calcolatore.apply(v, z);
	}

}

