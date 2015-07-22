public class mainclass {

	public static void main(String[] args) {

		/**
		 * Esistono 2 tipi di polimorfismo: 
		 * 1) Polimorfismo per Metodi 
		 * 2) Polimorfismo per Dati
		 * 
		 * 1) Polimorfismo per Metodi 
		 * Overload --> Sovraccarico 
		 * Override --> Riscrittura
		 */
		Somme s = new Somme();
		double sum = s.somma(2.5, 4);
	}

}
