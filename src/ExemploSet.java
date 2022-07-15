import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class ExemploSet {
	
	public static void main(String[] args) {
		Set<Double> notas = new HashSet<>(Arrays.asList(7d,8.5,9.3,5d,7d,0d,3.6));
		//Não existem índices em SET
		//Não recebes objetos iguais
		System.out.println(notas.toString());
		System.out.println("Existe a nota 5.0 no conjunto? " + notas.contains(5.0));
		System.out.println("A menor nota é? " + Collections.min(notas) );
		System.out.println("A maior nota é? " + Collections.max(notas) );
		
		Iterator<Double> iterador = notas.iterator();
		Double soma = 0d;
	    while( iterador.hasNext() ) {
	    	Double next = iterador.next();
	    	soma+= next;
	    }
	    System.out.println("Soma das notas: " + soma);
	    System.out.println("Média das notas: " + soma/notas.size());
	    notas.remove(0d);
	    System.out.println("removido: " + notas);
	    
	    Iterator<Double> iterador2 = notas.iterator();
	    while( iterador2.hasNext() ) {
	    	Double next = iterador2.next();
	    	if(next < 7.0) {
	    		iterador2.remove();
	    	}
	    }
	    System.out.println("Filtro de notas 7.0: " + notas );
	    
	    Set<Double> notas2 = new TreeSet<>(notas);
	    System.out.println("Ordem Crescente: " + notas2 );
	    notas.clear();
	    System.out.println("Apagado? " + notas.isEmpty() );
		
		
	}

}
