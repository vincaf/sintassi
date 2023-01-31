package com.example.contenitori;

import com.example.cancelleria.StrumentoPerScrivere;

/**
 * Parto dal presupposto: non deve essere generico solo il contenuto, ma anche il tipo del contenuto
 */
public class Contenitore<T> {

	private T object = null;

	public Contenitore(T object) {
		super();
		this.object = object;
	}

	public boolean isVuoto() { return object == null; }
	public boolean isPieno() { return !isVuoto(); }

	public T getObject() {
		return object;
	}

}
