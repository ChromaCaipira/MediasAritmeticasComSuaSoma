package aplicação;

import modelagem.Calculadora;

public class App {
	private static Calculadora calc1;
	private static Calculadora calc2;
	public static void main(String[] args) {
		double media1;
		double media2;
		double media3;
		double soma;
		
		calc1 = new Calculadora(8, 9, 7);
		calc2 = new Calculadora(4, 5, 6);
		
		media1 = calc1.media();
		media2 = calc2.media();
		
		soma = calc1.soma(media1, media2);
		
		media3 = (media1 + media2)/2;
		
		System.out.println("Soma das médias = " + soma);
		System.out.println("Média das médias = " + media3);
		
	}

}
