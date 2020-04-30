package br.com.formacao.java.collections.java;

/**
 * Classe que representa o Teste de Cursos com alunos
 * 
 * @author Guilherme Vilela
 * @version 0.1
 */
public class TestaCursoComAluno {
    
    /**
     * 
     * @param args 
     */
	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Dominando as cole��es", "Paulo Silveira");

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com cole��es", 24));

		Aluno a1 = new Aluno("Rodrigo Turini", 34672);
		Aluno a2 = new Aluno("Guilherme Silveira", 5617);
		Aluno a3 = new Aluno("Mauricio Aniche", 17645);

		javaColecoes.matricular(a1);
		javaColecoes.matricular(a2);
		javaColecoes.matricular(a3);

		System.out.println("Todos os alunos matriculados nesse curso: ");
		javaColecoes.getAlunos().forEach(a -> {
			System.out.println(a);
		});
		
		System.out.println("O aluno: " + a1 + " est� matriculado");
		System.out.println(javaColecoes.estaMatriculado(a1));
		
		
		Aluno turini = new Aluno("Rodrigo Turini", 34672);
		System.out.println("E ese Turini, est� matriculado?");
		System.out.println(javaColecoes.estaMatriculado(turini));
		
		System.out.println("O a1 � equals ao Turino?");
		System.out.println(a1.equals(turini));
	}
}
