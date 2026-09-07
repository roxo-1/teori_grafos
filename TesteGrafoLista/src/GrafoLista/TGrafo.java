package GrafoLista;

//definicao da classe de nós da lista
class TNo{ // define uma struct (registro)
	public	int w;  // vértice que é adjacente ao elemento da lista
	public TNo prox;
}

//definição de uma classe para armezanar um grafo
public class TGrafo{
	// atributos privados
	private	int n; // quantidade de vértices
	private	int m; // quantidade de arestas
	private	TNo adj[]; // um vetor onde cada entrada guarda o inicio de uma lista
	// métodos públicos
	// Construtor do grafo com a lista de
	// adjacência
	public TGrafo( int n ) {
	    // aloca a estrutura TGrafo
	    this.n = n;
	    this.m = 0;
	    // aloca m vetor para guardar lista de adjacencias
	    TNo adjac[] = new TNo[n];
	    // Inicia o vetor com nullL
		for(int i = 0; i< n; i++)
			adjac[i]=null;	
	    this.adj = adjac;
	};
	/*
	Método que cria uma aresta v-w no grafo. O método supõe que
	v e w são distintos, positivos e menores que V.
	Se o grafo já tem a aresta v-w, o método não faz nada.
	O método também atualiza a quantidade de arestas no grafo.
	*/
	public void insereA( int v, int w) {
		
	    TNo novoNo;
	    // anda na lista para chegar ao final
	    TNo no = adj[v];
	    TNo ant = null;
	    // anda na lista enquanto no != NULL E w  > no->w
	    while( no != null && w >= no.w ){
	        if( w == no.w)
	            return;
	        ant = no;
	        no = no.prox;
	    };
	    // cria o novo No para guardar w
	    novoNo = new TNo();
	    novoNo.w = w;
	    novoNo.prox = no;
	    // atualiza a lista
	    if( ant == null){
	        // insere no inicio
	        adj[v] = novoNo;
	    } else
	        // insere no final
	        ant.prox = novoNo;
	    m++;	
	}
	
	/*
	Método que remove do grafo a aresta que tem ponta inicial v
	e ponta final w. O método supõe que v e w são distintos,
	positivos e menores que V. Se não existe a aresta v-w,
	o método não faz nada. O método também atualiza a
	quantidade de arestas no grafo.
	*/
	public void removeA( int v, int w) {
	    // Obtém o início da lista do vértice v
	    TNo no = adj[v];
	    TNo ant = null;
	    // Percorre a lista do vértice v
	    // procurando w (se adjacente)
	    while( no != null && no.w != w ){
	    		ant = no;
	    		no = no.prox;
	    }
	    // Se w é adjacente, remove da lista de v
	    if (no != null){
	    	ant.prox = no.prox;
	    	no = null;
	    	m--;
		}	
	}
	/*
	Para cada vértice v do grafo, este método imprime, em
	uma linha, todos os vértices adjacentes ao vértice v
	(vizinhos ao vértice v).
	*/
	public void show() {
	    System.out.print("n: " + n);
	    System.out.print("\nm: " + m + "\n");
	    for( int i=0; i < n; i++){
	    	System.out.print("\n" + i + ": ");
	        // Percorre a lista na posição i do vetor
	        TNo no = adj[i];
	        while( no != null ){
	        	System.out.print(no.w + " ");
	            no = no.prox;
	        }
	    }
	    System.out.print("\n\nfim da impressao do grafo.\n");
	}
	public int inDegree(int v){
		// System.out.print("inDegree");
		int degree = 0;
		//percorre todas as listas procurando por int v
		for(int i=0; i<n; i++){
			TNo no= adj[i];
			while(no != null){
				if(no.w == v){
					degree++;
				}
				no = no.prox;	
			}
		}
		// System.out.print("fim do indegree");
		return degree;
	}
	public int outDegree(int v){
		// System.out.print("outDegree");
		int degree = 0;
		//percorre a lista de int v
		TNo no = adj[v];
		while(no != null){
			degree++;
			no = no.prox;
		}
		return degree;
	}

	public int degree(int v){
		// System.out.print("degree");
		int entrada = inDegree(v);
		int saida = outDegree(v);
		int total = entrada+saida;
		System.out.print("\nGrau de entrada é "+ entrada);
		System.out.print("\nGrau de saída é "+ saida);
		System.out.print("\nGrau de total é "+ total+"\n");
		return total;
	}

	public int saoIguais(TGrafo g1, TGrafo g2){
		for(int i=0; i<n; i++){
			TNo no1= g1.adj[i];
			TNo no2 = g2.adj[i];
			// System.out.print("\ng1" + g1.adj[i]);
			// System.out.print("\ng2" + g2.adj[i]);
			while( no1 != null || no2 != null){
				System.out.print("\nNo1: " + no1.w);
				System.out.print("\nNo2: " + no2.w);
				if(no1.w != no2.w){
					System.out.print("\nSão diferentes\n");
					return 0;
				}
				no1 = no1.prox;
				no2 = no2.prox;
			}
		}
		System.out.print("\nSão iguais");
		return 1;
	}
		public void showINV() {
	    for( int i=0; i < n; i++){
	        TNo ant = null;
			TNo proximo = null;
	        TNo atual = adj[i];
	        while( atual != null ){
	        	proximo = atual.prox; // guarda prox
				atual.prox = ant; // inverte
				ant = atual; // avança anterior
				atual = proximo; //avança atual
	        }
			adj[i] = ant;
		}
	}

	public int ehfonte(TGrafo g, int v) {
		int entrada = g.inDegree(v);
		int saida = g.outDegree(v);
		if (saida > 0 && entrada == 0) {
			System.out.println("Vértice " + v + " é fonte");
			return 1;
		}
		System.out.println("Vértice " + v + " não é fonte");
		return 0;
	}

	public int ehsorveduro(TGrafo g, int v) {
		int entrada = g.inDegree(v);
		int saida = g.outDegree(v);
		if (saida == 0 && entrada > 0) {
			System.out.println("Vértice " + v + " é sorvedouro");
			return 1;
		}
		System.out.println("Vértice " + v + " não é sorvedouro");
		return 0;
	}

	public int ehSimetrico(TGrafo g) {
		int aux = 0;
		int teste = this.n;
		for( int i=0; i < n; i++){
	        // Percorre a lista na posição i do vetor
	        TNo no = g.adj[i];
			if (g.inDegree(no.w) == g.outDegree(no.w)) {
				aux ++;
			}
			no = no.prox;
		} if ( aux == teste) {
			System.out.println("Grafo é simétrico");
			return 1;
		}
		System.out.println("Grafo não é simétrico");
		return 0;
	}
}