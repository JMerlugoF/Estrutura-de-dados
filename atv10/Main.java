package atv10;

public class Main {
	
	public static void main(String Arg[]) {
		FilaVet fila = new FilaVet(4);
		fila.add(67);
		fila.add(16);
		fila.add(5);
		fila.add(6);
		fila.remove();
		fila.remove();
		fila.add(10);

		fila.imprimirFila();
	}
}
