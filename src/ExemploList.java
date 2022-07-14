import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Iterator;

public class ExemploList {
	public static void main(String[] args) {
		
		List<Double> notas = new ArrayList<>();
		notas.add(7d);
		notas.add(8.0);
		notas.add(6.2);
		notas.add(5.0);
		notas.add(5d);
		notas.add(4.3);
		notas.add(0d);
		notas.add(1.5);
		notas.add(10d);
		notas.add(9.1);
		System.out.println("Lista de Notas: " + notas);
		System.out.println("Posição da nota 5.0: " + notas.indexOf(5d));
		
		notas.add(7.4);
		System.out.println("Lista de Notas: " + notas);
		notas.add(3, 6.5); //com indice
		System.out.println("Lista de Notas: " + notas);
		notas.set(0, 7.1); //com indice
		System.out.println("Lista de Notas: " + notas);
		notas.set(notas.indexOf(5d), 5.8); //com indice
		System.out.println("Lista de Notas: " + notas);
		System.out.println("Posição da nota 5.0: " + notas.indexOf(5d));
		System.out.println("Possui nota 8? " + notas.contains(8d));
		System.out.println("Possui nota 2? " + notas.contains(2.0));
		System.out.println("Qual a nota na posição 8? " + notas.get(8));
		System.out.println("Qual a menor nota? " + Collections.min(notas));
		System.out.println("Qual a maior nota? " + Collections.max(notas));
		
		Iterator<Double> iterador = notas.iterator();
		Double soma = 0d;
	    while( iterador.hasNext() ) {
	    	Double next = iterador.next();
	    	soma+= next;
	    }
	    
	    System.out.println("Soma das notas: " + soma);
	    System.out.println("Média das notas: " + soma/notas.size());
	    notas.remove(0);
	    System.out.println("Removida a posição 0: " + notas );
	    notas.remove(0d);
	    System.out.println("Removida a nota 0: " + notas );
	    
	    Iterator<Double> iterador2 = notas.iterator();
	    while( iterador2.hasNext() ) {
	    	Double next = iterador2.next();
	    	if(next < 5.0) {
	    		iterador2.remove();
	    	}
	    }
	    System.out.println("Filtro de notas 5.0: " + notas );
	    
	    System.out.println("A lista está vazia? " + notas.isEmpty() );
	    notas.clear();
	    System.out.println("A lista está vazia? " + notas.isEmpty() );
	    
	}
}
