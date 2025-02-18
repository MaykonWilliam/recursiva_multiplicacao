package recursiva_multiplicacao;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		String inputA = JOptionPane.showInputDialog("Digite o primeiro número inteiro:");
		String inputB = JOptionPane.showInputDialog("Digite o segundo número inteiro:");

		int numeroA = Integer.parseInt(inputA);
		int numeroB = Integer.parseInt(inputB);

		int resultado = MultiplicacaoRecursiva.multiplicar(numeroA, numeroB);

		JOptionPane.showMessageDialog(null, "O resultado da multiplicação é: " + resultado);
	}

}
