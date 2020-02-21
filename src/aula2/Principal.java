package aula2;

public class Principal {

	public static void main(String[] args) {
		
		String nomeProcurado = "Harry";
		
		Thread autores = new Thread(new TarefaBuscaNome("autores.txt", nomeProcurado));
		autores.start();

		Thread assinatura1 = new Thread(new TarefaBuscaNome("assinaturas1.txt", nomeProcurado));
		assinatura1.start();
		
		Thread assinatura2 = new Thread(new TarefaBuscaNome("assinaturas2.txt", nomeProcurado));
		assinatura2.start();
		
		Thread livros = new Thread(new TarefaBuscaNome("listaLivros.txt", nomeProcurado));
		livros.start();
		
		Thread filmes = new Thread(new TarefaBuscaNome("listaFilmes.txt", nomeProcurado));
		filmes.start();
	}

}
