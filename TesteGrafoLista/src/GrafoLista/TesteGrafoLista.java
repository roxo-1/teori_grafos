package GrafoLista;

public class TesteGrafoLista {

	public static void main(String[] args) {
	    // Cria um objeto para um Grafo com 4 vértices
	    // Armazendo em uma lista de adjacência
	    TGrafo g = new TGrafo(4);
	    // //insere as arestas do grafo g
	    // //A={(0,1),(0,2),(0,3),(2,1),(2,3),(1,3)}
	    g.insereA(0,1);
	    g.insereA(0,2);
	    g.insereA(0,3);
	    g.insereA(2,1);
	    g.insereA(2,3);
	    g.insereA(1,3);
		// g.completo();
		g.show();
		g.converte();
		// g.show();
		// g.removeV(1);
		// g.show();
		// g.ehSimetrico(g);
		// g.inDegree(2);
		// g.outDegree(2);
		// g.degree(2);

		// TGrafo g2 = new TGrafo(4);
	    //insere as arestas do grafo g2
	    //A={(0,1),(0,2),(0,3),(2,1),(2,3),(1,3)}
	    // g2.insereA(0,1);
	    // g2.insereA(0,2);
	    // g2.insereA(0,3);
	    // g2.insereA(2,1);
	    // g2.insereA(2,3);
	    // g2.insereA(1,3);
		
		// TGrafo g3 = new TGrafo(4);
	    //insere as arestas do grafo g2
	    //A={(0,1),(0,2),(1,0),(2,0),(1,3),(3,1)}
	    // g3.insereA(0,1);
	    // g3.insereA(0,2);
		// g3.insereA(1,0);
		// g3.insereA(2,0);
	    // g3.insereA(1,3);
	    // g3.insereA(3,1);

		// TGrafo g4 = new TGrafo(2);

		// g4.insereA(0,1);
	    // g4.insereA(1,0);
		
		// g.saoIguais(g, g2);
	    // mostra o grafo preenchido
	    // g.show();
		// g.ehSimetrico(g);
		//g.ehSimetrico(g);
		//g.converte(g);
		// g3.completo();
		// g4.completo();

		// g.ehfonte(g2, 2);
		// g.ehfonte(g2, 0);
		// g.ehsorveduro(g2, 3);
		// g.ehsorveduro(g2, 0);
		// g.showINV();
	    // g.removeA(0,3);  // remove a aresta (0,3)
	    // mostra o grafo preenchido
	    // System.out.print("\nDepois da remoção da aresta (0,3)\n");
	    // g.show();

		// TGrafoND g5 = new TGrafoND(4);
	    //insere as arestas do grafo g
	    //A={(0,1),(0,2),(0,3),(2,1),(2,3),(1,3)}
	    // g5.insereA(0,1);
	    // g5.insereA(0,2);
	    // g5.insereA(1,0);
	    // g5.insereA(2,0);
	    // g5.insereA(3,1);
	    // g5.insereA(1,3);
		// g5.show();
		// g5.completo();
		// g5.removeV(3);
		// g5.show();
	}

}
