package atv11;

public class FilaLista implements IFila {

	private Noh inicio;
	private Noh fim;
	private int nElements;

	public FilaLista (){
		this.inicio = null;
		this.fim = null;
		this.nElements = 0;
	}
	
	public boolean add(Object info){
		Noh novo = new Noh(info);
		if (isEmpty() == true){
			inicio = novo;
			this.fim = novo;
			this.nElements++;
		}else {
			fim.setProx(novo);
			fim = novo;
			this.nElements++;
		}
		return true;
	}
	
	public boolean remove(){
		if (!isEmpty()){
			if (inicio == fim) {
				inicio = null;
				fim = null;
				this.nElements--;
				return true;
			} else {
				inicio = inicio.getProx();
				this.nElements--;
				return true;
			}
		}
		return false;
	}
	
	public boolean isEmpty() {
		if(this.inicio == null)
			return true;
		return false;
	}
	
	public int size() {
		return nElements;
	}
	
	public void imprimeList() {
		Noh element = this.inicio;
		for(int i = 0; i < size(); i++) {
			System.out.println(element.getInfo().toString());
			element = element.getProx();
		}
	}

}