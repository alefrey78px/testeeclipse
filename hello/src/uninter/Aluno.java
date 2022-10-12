package uninter;

public class Aluno {
	
	String nome;
	public String curso;
	public Avaliacao notas;
	
	
	
	public Aluno(String nome, String curso, Avaliacao notas) {
		super();
		this.nome = nome;
		this.curso = curso;
		this.notas = notas;
	}



	public void mensagem() {
		System.out.println("Nome: " + nome);
		System.out.println("Curso: " + curso);
		System.out.println("Media aritmetica notas: " + notas.mediaAritmetica());
		System.out.println("Media ponderada notas: " + notas.mediaPonderada());
	}

}
