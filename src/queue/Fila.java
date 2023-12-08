package queue;

public class Fila<T> {
	private No<T> entradaFila;
	private No<T> primeiroFila;

	public Fila() {
		this.entradaFila = null;
		this.primeiroFila = null;
	}
	
	public void enqueue(T obj) {
		No<T> novoNo = new No<>(obj);
		if (primeiroFila == null) {
			primeiroFila = novoNo;
		}
		if (entradaFila == null) {
			entradaFila = novoNo;
		} else {
			entradaFila.setRefNo(novoNo);
			entradaFila = novoNo;
		}
	}
	
	public T first() {
		if (this.isEmpty()) {
			return null;	
		} else {
			return primeiroFila.getObject();
		}
	}
	
	public T dequeue() {
		if (this.isEmpty()) {
			return null;	
		} else {
			No<T> noAuxiliar = primeiroFila;
			primeiroFila = noAuxiliar.getRefNo();
			noAuxiliar.setRefNo(null);
			
			return noAuxiliar.getObject();
		}
	}
	
	public boolean isEmpty() {
		return (this.entradaFila == null);
	}
	
	@Override
	public String toString() {
		String stringRetorno = "";
		No<T> noAuxiliar = primeiroFila;
		while(true) {
			stringRetorno += "[No{objeto=" + noAuxiliar.getObject() + "}]--->";
			if(noAuxiliar.getRefNo() == null) {
				stringRetorno += "null";
				break;
			}
			noAuxiliar = noAuxiliar.getRefNo();
		}
		
		return stringRetorno;
	}
}
