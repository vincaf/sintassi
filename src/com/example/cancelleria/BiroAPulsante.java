package com.example.cancelleria;

public class BiroAPulsante extends Biro {


	public BiroAPulsante() {
		super();
	}

	private boolean possoScrivere = false;

	@Override
	public void scrivere(String testo) {
		if(!possoScrivere) { // if(possoScrivere == false) ...
			return;
		}
		super.scrivere(testo);
	}

	public void premerePulsante() {
		possoScrivere = !possoScrivere;
	}
}
