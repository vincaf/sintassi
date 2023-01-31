package com.example.cancelleria;

public class Matita  extends StrumentoPerScrivere {

	private Mina mina = new Mina();

	public void scrivere(String testo) {
		mina.scrivere(testo); // System.out.println(testo);
	}

}
