package com.example.contenitori;

/**
 * Basato Object ha due proplemi principali:
 * Ha bisogno di conversioni esplicite per poter utilizzare l'oggetto estratto (DOWNCASTING)
 * Non garantisce la sensatezza del DOwncasting, quindi si presta ad errori a RUNTIME di utilizzo del contenuto
 * Questa soluzione è sconsigliatissima perchè fragile (Brittle) (violazione dell'LSP)
 */
public class ContenitoreDiObject {

	private Object object = null;

	public ContenitoreDiObject(Object object) {
		super();
		this.object = object;
	}

	public boolean isVuoto() { return object == null; }
	public boolean isPieno() { return !isVuoto(); }

	public Object getObject() {
		return object;
	}

}
