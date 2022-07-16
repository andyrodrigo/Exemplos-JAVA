import javax.swing.JOptionPane;

public class Erros {
	static int dividir(int a, int b) {
		return a/b;
	}

	public static void main(String[] args) {
		
		boolean loop = true;
		int tentativa = 0;
		
		do {
			String a = JOptionPane.showInputDialog("Numerador: ");
			String b = JOptionPane.showInputDialog("Denominador: ");
			
			try {
				int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
				JOptionPane.showMessageDialog(null, resultado);
				loop = false;
			}catch(NumberFormatException e){
				//e.printStackTrace();
				JOptionPane.showMessageDialog(null, "Entrada Inválida: " + e.getMessage());
			}catch(ArithmeticException e){
				//e.printStackTrace();
				JOptionPane.showMessageDialog(null, "Não existe divisão por zero");
			}finally {
				tentativa++;
				System.out.println("Tentativas: " + tentativa);
			}
			
		}while(loop);
	}
}
