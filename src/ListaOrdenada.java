import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListaOrdenada {
	
	public static void main(String[] args) {
		
		List<Gato> gatos = new ArrayList<>() {
			{
				add(new Gato("Miau", 0, "branco"));
				add(new Gato("Persa", 7, "branco"));
			}
		};
		Gato gato1 = new Gato("Simba", 1, "amarelo");
		Gato gato2 = new Gato("Kiara", 1, "amarelo");
		Gato gato3 = new Gato("Black", 3, "preto");
		gatos.add(gato1);
		gatos.add(gato2);
		gatos.add(gato3);
		gatos.add( new Gato("Fedido", 5, "cinza") );
		
		System.out.println("Lista de gatos (Ordem de inserção): " + gatos);
		Collections.shuffle(gatos);
		System.out.println("\nLista de gatos (Ordem aleatória): " + gatos);
		Collections.sort(gatos); //precisou implementar a interface Comparable e sobrescrever o método compareTo
		System.out.println("\nLista de gatos (Ordem alfabética): " + gatos);
		
		
	}
}


class Gato implements Comparable<Gato>{
	private String nome;
	private Integer idade;
	private String cor;
	
	public Gato(String nome, Integer idade, String cor){
		this.nome = nome;
		this.idade = idade;
		this.cor = cor;
		
	}
	
	public String getNome(){
		return nome;
	}
	
	public Integer getIdade(){
		return idade;
	}
	
	public String getCor(){
		return cor;
	}
	
	//sobrescreve toString
	public String toString(){
		return "\n{" + "nome: " + nome + '\'' + " idade: " + idade + '\'' + " cor: " + cor + "}";
	}

	@Override
	public int compareTo(Gato gato) {
		return this.getNome().compareToIgnoreCase(gato.getNome());
	}
	
}
