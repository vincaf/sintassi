package com.example.exception;

public class ExceptionDemo {

	public static void main(String[] args) /* throws MyException */ { // se throws si rilancia l'eccezione

		// qualsiasi condizione anomala in Java viene segnalata tramite Exception
		// l'Exception è un meccanismo "out-of-band" che consente di lanciare (throw)
		// oggetti che
		// rappresentano errori

		ExceptionDemo ed = new ExceptionDemo();

		try { // inizio di un blocco di codice protetto
			ed.faiQualcosa();
		} catch (MyException e) { // succede un 'anomalia il controllo passa al blocco catch
			 e.printStackTrace();
			// System.exit(1); // abort immediata ed incondizionata del programma (non è una bella cosa)
			 throw new MyRuntimeException("abortito per precauzione", e);
		}

		System.out.println("Il programma sta finendo");
	}

	public String faiQualcosa() throws MyException {
		MyException myE = new MyException("Exception di prova");

		// per segnalare la condizione anomala occorre far partire l'exception
		throw myE;
		// return "Hello";
	}

}
