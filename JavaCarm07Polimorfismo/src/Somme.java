
public class Somme {

	/** Firma di un metodo è data da: 
	* - identificare (nome del metodo) e 
	* - dalla lista di parametri
	* 
	* La lista dei parametri a sua volta può essere:
	* - Tipale: tipi della lista di parametri
	* - Posizionale: posizione della lista dei parametri
	* - Numerico: numero di parametri
	*/
	
	public int somma(int a, int b){
		return a+b;
	}
	
	public int somma(int a, int b, int c){
		return a+b+c;
	}
	
	public double somma(double a, int b){
		return a+b;
	}
	
	public double somma(int a, double b){
		return a+b;
	}
}
