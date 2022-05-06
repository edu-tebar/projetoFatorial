public class Fatorial{
	// Versao iterativa do cálculo fatorial	

	public int calculo(int n){
	int resultado = 1;
	for (int i=2;i<=n;i++){
		resultado *= i;
	}
	return resultado;
	}
}

