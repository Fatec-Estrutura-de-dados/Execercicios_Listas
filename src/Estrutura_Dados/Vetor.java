package Estrutura_Dados;


public class Vetor {

	private Object[] obj = new Object[100];
	 private int size = 0;

	
	public void adiciona(Object obj) {
		
		this.garanteArray();
		
		if(this.obj.length == size) {
			System.out.println("Vetor esta cheio");
			return;
		}
		this.obj[size] = obj;
		size++;
	}
	
	public void adicionaInicio(Object obj) {
		 this.adiciona(1, obj);
	}
	
	private void garanteArray() {
		
		if(size==this.obj.length) {
			 Object[]  newArray = new Object[this.obj.length*2];
			 
			 for(int i =0;i<this.obj.length;i++) {
					newArray[i] = this.obj[i];
				}
			 this.obj = newArray;
		}
			
	}
	
	
	public Object removeInicio() {
		return this.remove(1);
	}
	
	public Object removeFinal() {
		
		 return this.remove(size);
	}
	
	private boolean posicaoOcupado(int posicao) {
		  int pos  =( posicao -1);
		return pos<0 || pos>size+1 || pos==obj.length;
		
	}
	
	public Object remove(int posicao) {
		if(posicaoOcupado(posicao)) {
			System.out.println("Posição invalida");
			throw new IllegalArgumentException("posição Invalida");
		}else if(posicao==size){
			 Object obj =this.obj[posicao-1];
			 this.obj[posicao-1] = null;
			size--;
			return obj;
		}
		
		Object pbj = this.obj[posicao-1];
		for(int i=posicao-1;i<   size;i++) {
			this.obj[i] = this.obj[i+1];
		}
		 
		 size--;
		 return obj;
		
	}
	
	public void adicionaFinal(Object obj) {
		
		if(size==this.obj.length) {
			System.out.println("Posição invalida");
			throw new IllegalArgumentException("posição Invalida");
		}
		
		 int posicao = this.size;
		 this.obj[posicao] = obj;
		 this.size++;
	}
	
	public void adiciona(int posicao, Object aluno) {
		
		if(posicaoOcupado(posicao)) {
		System.out.println("Posição invalida");
			throw new IllegalArgumentException("posição Invalida");
		}
		
		for(int i=size;i>=   posicao;i--) {
			this.obj[i] = this.obj[i-1];
		}
		 this.obj[posicao-1] = aluno;
		 System.out.println("Adicionado com sucesso");
		 size++;
	}
	
	public Object pega(int posicao) {
		
		if(posicaoOcupado(posicao)) {
			System.out.println("Posição invalida");
			throw new IllegalArgumentException("posição Invalida");
		}
		
		return this.obj[posicao-1];
		
	}
	
	public boolean Empty() {
		return size ==0;
	}
	
	public boolean Cheia() {
		return this.size == obj.length;
	}
	public int tamanho(){
		
		return size ;
	}
	
	
	public String toString() {

		if (this.size == 0) {
			return "[]";
		}

		StringBuilder builder = new StringBuilder("[");

		for (int i = 0; i < this.size; i++) {
			builder.append(this.obj[i]);
			builder.append(",");

		}

		builder.append("]");

		return builder.toString();
	}
}
