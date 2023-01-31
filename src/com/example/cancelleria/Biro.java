package com.example.cancelleria;

public abstract class Biro extends StrumentoPerScrivere {
	private Refill refill = null;

	public Biro() {
		this.refill = new Refill();
	}

	@Override
	public void scrivere(String testo) {
		refill.scrivere(testo);
	}
}
