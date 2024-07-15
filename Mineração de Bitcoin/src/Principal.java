import java.math.BigInteger;

public class Principal {
	// Constantes da classe
	private static final String TAMANHO = "1000000";
	
	// Método principal de execução da classe
	public static void main(String[] args) {
		for (BigInteger i = BigInteger.ZERO ;
			 true ;
			 i = i.add(new BigInteger(TAMANHO))) {
			new Minerador(i.toString(),
						  i.add(new BigInteger(TAMANHO))
						   .toString()).start();
		}
	}
}