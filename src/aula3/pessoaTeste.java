package aula3;

public class pessoaTeste {
	public static void main(String[] args) {
		pessoa pessoa1 = new pessoa();
		pessoa pessoa2 = new pessoa();
		pessoa pessoa3 = new pessoa();
		
		pessoa1.nome = "João";
		pessoa1.idade = 25;
		pessoa1.peso = 68.5;
		
		pessoa2.nome = "Maria";
		pessoa2.idade = 30;
		pessoa2.peso = 55.6;
		
		pessoa3.nome = "José";
		pessoa3.idade = 32;
		pessoa3.peso = 62.4;
		
		System.out.println("============ Pessoa 1 ============");
		System.out.println(pessoa1.nome);
		System.out.println(pessoa1.idade);
		System.out.println(pessoa1.peso);
		System.out.println("\n");

		System.out.println("============ Pessoa 2 ============");
		System.out.println(pessoa2.nome);
		System.out.println(pessoa2.idade);
		System.out.println(pessoa2.peso);
		System.out.println("\n");

		System.out.println("============ Pessoa 3 ============");
		System.out.println(pessoa3.nome);
		System.out.println(pessoa3.idade);
		System.out.println(pessoa3.peso);

	}

}
