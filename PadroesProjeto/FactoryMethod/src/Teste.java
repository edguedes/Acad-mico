public class Teste {

	public static void main(String[] args) {
		
		FabricaDeCarro fabrica = new FabricaFiat();
		Carro carro = fabrica.criarCarro();
		carro.exibirInfo();
		System.out.println();
		
		FabricaDeCarro fabrica2 = new FabricaGM();
		Carro carro2 = fabrica2.criarCarro();
		carro2.exibirInfo();
		System.out.println();
		
		FabricaDeCarro fabrica3 = new FabricaRenault();
		Carro carro3 = fabrica3.criarCarro();
		carro3.exibirInfo();
		
	}

}
