package com.example.contenitori;

import org.junit.jupiter.api.Test;

import com.example.cancelleria.Bic;
import com.example.cancelleria.Matita;

class CoppiaTest {

	@Test
	void test() {
		Coppia<Bic, Matita> contenitore = new Coppia<>( new Bic(), new Matita() );

		Bic b = contenitore.getObject1();
		Matita m = contenitore.getObject2();

		b.scrivere("Ciao sono una bic!");
		m.scrivere("Io sono una matita");

	}

}
