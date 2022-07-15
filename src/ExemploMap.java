import java.util.HashMap;
import java.util.Map;

public class ExemploMap {
	public static void main(String[] args) {
		
		Map<String, Double> carros = new HashMap<>() {{
			put("Uno", 15.6);
			put("Gol", 14.4);
		}};
		carros.put("Mobi", 16.1);
		carros.put("Kwid", 15.6);
		carros.put("Hb20", 14.5);
		System.out.println("Carros: " + carros);
		carros.put("Gol", 15.2);
		System.out.println("Carros: " + carros.toString());
		
		System.out.println("Tem Sandero? " + carros.containsKey("Sandero") );
		System.out.println("Tem Gol? " + carros.containsKey("Gol") );
		System.out.println("Qual o consumo do Uno? " + carros.get("Uno") );
		//Não existe indice
		System.out.println("Exibir Modelos: " + carros.keySet() );
		System.out.println("Exibir Consumos: " + carros.values() );
		
		
		
		
		
		
		
		
		
	}

}
