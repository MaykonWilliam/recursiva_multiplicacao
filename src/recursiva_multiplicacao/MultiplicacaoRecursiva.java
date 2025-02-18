package recursiva_multiplicacao;

public class MultiplicacaoRecursiva {
	public static int multiplicar(int a, int b) {
		if (b == 0) {
			return 0;
		}
		return a + multiplicar(a, b - 1);
	}

}
