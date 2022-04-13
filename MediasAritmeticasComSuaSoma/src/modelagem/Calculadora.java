package modelagem;

public class Calculadora {
	private int a;
	private int b;
	private int c;
	
	public Calculadora(int nota1, int nota2, int nota3) {
		this.a = nota1;
		this.b = nota2;
		this.c = nota3;
	}
	
	public double media() {
		int resultado = (this.a + this.b + this.c)/3;
		return resultado;
	}
	
	public double soma(double media1, double media2) {
		return media1 + media2;
	}
}
