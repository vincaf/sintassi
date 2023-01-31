package com.example.contenitori;

public class Coppia<T1, T2>{
	private T1 object1 = null;
	private T2 object2 = null;

	public Coppia(T1 object1, T2 object2) {
		super();
		this.object1 = object1;
		this.object2 = object2;
	}

	// metodo da esempio:
	// public boolean isVuoto() { return object1 == null }
	// public boolean isPieno() { return !isVuoto(); }
		
	public boolean isInvalid() { return object1 == null && object2 == null; }
	public boolean isValid() { return !isInvalid(); }

	public T1 getObject1() {
		return object1;
	}
	
	public T2 getObject2() {
		return object2;
	}
}
