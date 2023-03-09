package controller;

public class ThreadVetor extends Thread {
	
	private int valor;
	private int vet[];
	
	public ThreadVetor(int valor, int vet[]) {
		this.valor = valor;
		this.vet = vet;
	}
	
	@Override
	public void run() {
		ImpoPar();
	}

	private void ImpoPar() {
		// TODO Auto-generated method stub
		if(valor % 2 == 0) {
			double TempoInicial = System.nanoTime();
			for(int i = 0; i < vet.length; i++) {
				
			}
			double TempoFinal = System.nanoTime();
			double TempoTotal = TempoFinal - TempoInicial;
			TempoTotal = TempoTotal / Math.pow(10, 9);
			System.out.println("Par ==> " + TempoTotal + "s.");
		} else {
			double TempoInicial = System.nanoTime();
			//foreach
			for(int variavel : vet) {
				
			}
			double TempoFinal = System.nanoTime();
			double TempoTotal = TempoFinal - TempoInicial;
			TempoTotal = TempoTotal / Math.pow(10, 9);
			
			System.out.println("Impar ==> " + TempoTotal + "s.");
		}
	}

}
