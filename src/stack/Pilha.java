package stack;
public class Pilha {
	
	private No refNoEntradaPilha;

	public Pilha() {
		this.refNoEntradaPilha = null;
	}
	
	public boolean isEmpty() {
		 return (refNoEntradaPilha == null);	
	}
	
	public void push(No novoNo) { 
		No auxiliar = refNoEntradaPilha;
		novoNo.setRefNo(auxiliar);
		refNoEntradaPilha = novoNo;	
	}
	
	public No pop() {
		if(isEmpty()) {
			return null;
		} else {
			No noPopped = refNoEntradaPilha;
			refNoEntradaPilha = refNoEntradaPilha.getRefNo();
			return noPopped;
		}
		
	}
	
	public No top() {
		return refNoEntradaPilha;
	}
	
	@Override
	public String toString() {
		String stringRetorno = "--------------------\n";
		stringRetorno += "\tPilha\n";
		stringRetorno += "--------------------\n";
		
		No noAuxiliar = refNoEntradaPilha;
		
		while(noAuxiliar != null) {
			stringRetorno += noAuxiliar.toString() + "\n";
			noAuxiliar = noAuxiliar.getRefNo();
		}
		stringRetorno += "====================\n";
		return stringRetorno;
	}
}
