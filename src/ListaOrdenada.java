import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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
		gatos.add( new Gato("Azar", 2, "preto") );
		
		System.out.println("Lista de gatos (Ordem de inserção): " + gatos);
		Collections.shuffle(gatos);
		System.out.println("\nLista de gatos (Ordem aleatória): " + gatos);
		Collections.sort(gatos); //precisou implementar a interface Comparable e sobrescrever o método compareTo
		System.out.println("\nLista de gatos (Ordem alfabética): " + gatos);
		//Collections.sort(gatos, new ComparatorIdade()); //precisou implementar a interface Comparator e sobrescrever o método compareTo
		gatos.sort( new ComparatorIdade()); //pode ser esse ou o de cima
		System.out.println("\nLista de gatos (Ordem de Idade): " + gatos);
		Collections.sort(gatos, new ComparatorCor()); //precisou implementar a interface Comparator e sobrescrever o método compareTo
		System.out.println("\nLista de gatos (Ordem de cores): " + gatos);
		Collections.sort(gatos, new ComparatorNomeCorIdade()); //precisou implementar a interface Comparator e sobrescrever o método compareTo
		System.out.println("\nLista de gatos (Ordem de todas): " + gatos);
		
		
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

class ComparatorIdade implements Comparator<Gato>{

	@Override
	public int compare(Gato g1, Gato g2) {
		// TODO Auto-generated method stub
		return Integer.compare(g1.getIdade(), g2.getIdade());
	}
	
}

class ComparatorCor implements Comparator<Gato>{

	@Override
	public int compare(Gato g1, Gato g2) {
		// TODO Auto-generated method stub
		return g1.getCor().compareToIgnoreCase(g2.getCor());
	}
	
}


class ComparatorNomeCorIdade implements Comparator<Gato>{

	@Override
	public int compare(Gato g1, Gato g2) {
		//Tenta 1o por cor
		int cor = g1.getCor().compareToIgnoreCase(g2.getCor());
		if( cor != 0 )return cor;
		//Depois por nome
		int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
		if( nome != 0 )return cor;
		//depois idade
		return Integer.compare(g1.getIdade(), g2.getIdade());
	}
	
}
