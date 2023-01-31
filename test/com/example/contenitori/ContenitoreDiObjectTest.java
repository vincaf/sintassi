package com.example.contenitori;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.example.cancelleria.Bic;
import com.example.cancelleria.Biro;
import com.example.cancelleria.Matita;

class ContenitoreDiObjectTest {

	@Test
	void test() {
		Bic b = new Bic();
		ContenitoreDiObject cdo = new ContenitoreDiObject(b);


		Biro biro = (Bic) /* ammesso anche (Biro) */ cdo.getObject(); // Operazione di DOWNCASTING
		biro.scrivere("Ci sono riuscito!!!");

		cdo = new ContenitoreDiObject( new Matita() );
		biro = (Bic) cdo.getObject(); // Operazione di DOWNCASTING ===> ClassCastException
		biro.scrivere("Ci sono riuscito ancora!!!");

	}

}
