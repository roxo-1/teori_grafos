package GrafoMatriz;

public class TesteGrafoMatriz {
	public static void main(String args[]) {
		//  chama o construtor para criar um grafo 4x4
		//TGrafo g = new TGrafo(4);
		TGrafoND g = new TGrafoND(4);
		//insere as arestas do grafo
		//A={(0,1),(0,2),(2,1),(2,3),(1,3)}
		// g.insereA(0 , 1);
		// g.insereA(0,2);
		// g.insereA(2,1);
		// g.insereA(2,3);
		// g.insereA(1,3);
		// g.inDegree(3);
		// g.outDegree(3);
		// g.degree(3);
		// g.fonte(3);
		// g.sorvedouro(3);
		// g.ehSimetrico(g);

		g.insereAND(0 , 1);
		g.insereAND(0,2);
		g.insereAND(2,1);
		g.insereAND(2,3);
		g.insereAND(1,3);
		g.degreeND(3);
		g.showND();

		// mostra o grafo preenchido
		//g.show();
	}
}