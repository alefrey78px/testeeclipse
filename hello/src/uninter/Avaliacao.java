package uninter;

public class Avaliacao {
	float nota1, nota2, nota3;
	
	
	
	public Avaliacao(float nota1, float nota2, float nota3) {
		super();
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
	}

	float mediaAritmetica() {
		return (nota1 + nota2 + nota3) / 3;
	}

	float mediaPonderada() {
		return (nota1 * 2 + nota2 * 3 + nota3 * 4) / 9;
	}
	
}
