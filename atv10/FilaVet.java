package atv10;

public class FilaVet implements IFila { // tem funcionamento circular
	private int nElemFila;
	private int inicio;
	private Object[] vetFila;

	public FilaVet(int tamFila) { // construtor
		this.nElemFila = 0;
		this.inicio = 0;
		this.vetFila = new Object[tamFila];
	}

	public boolean add(Object info) { // método que insere na fila
		if (this.nElemFila == vetFila.length) {
			System.out.println("Capacidade da fila esgotou");
			return false;
		}
		int fim = (this.inicio + this.nElemFila) % this.vetFila.length;
		this.vetFila[fim] = info;
		this.nElemFila++;
		return true;
	}

	public boolean remove() { // método que retira da fila
		if (this.isEmpty()) { // como verificar se está vazia?
			System.out.println("Fila estah vazia");
			return false;
		}
		this.vetFila[inicio] = null;
		this.inicio = (this.inicio + 1) % this.vetFila.length;
		this.nElemFila--;
		return true;
	}

	public boolean isEmpty() {
		if (this.nElemFila == 0) {
			return true;
		}
		return false;
	}

	public int size() {
		return this.vetFila.length;
	}

	public void imprimirFila() {
		int k = 0;
		int fim = (this.inicio + this.nElemFila) % this.vetFila.length;
		for (int i = this.inicio; i < this.vetFila.length; i++) {
			if (vetFila[i] != null) {
				System.out.println(this.vetFila[i]);
				k++;
			}
		}
		if (k != this.nElemFila) {
			for (int i = 0; i <= fim; i++) {
				if (this.vetFila[i] != null) {
					System.out.println(this.vetFila[i]);
				}
			}
		}
	}
}