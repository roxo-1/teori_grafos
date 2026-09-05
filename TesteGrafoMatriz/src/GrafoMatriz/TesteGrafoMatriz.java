package GrafoMatriz;

public class TesteGrafoMatriz {
	public static void main(String args[]) {
		//  chama o construtor para criar um grafo 4x4
		TGrafoND g = new TGrafoND(4);
		
		// insere as arestas do grafo com pesos
		// A={(0,1,2.5),(0,2,1.0),(2,1,3.2),(2,3,4.0),(1,3,5.5)}
		// g.insereA(0, 1, 2.5f);
		// g.insereA(0, 2, 1.0f);
		// g.insereA(2, 1, 3.2f);
		// g.insereA(2, 3, 4.0f);
		// g.insereA(1, 3, 5.5f);

		
		// g.inDegree(3);
		// g.outDegree(3);
		// g.degree(3);
		// g.fonte(3);
		// g.sorvedouro(3);
		// g.ehSimetrico(g);
		
		// mostra o grafo preenchido com pesos e infinito
		// g.show();
		// g.removeV(0);
		// g.show();


		// TGrafoND g = new TGrafoND(4);
		g.insereAND(0 , 1);
		g.insereAND(0,2);
		g.insereAND(2,1);
		g.insereAND(2,3);
		g.insereAND(1,3);
		g.degreeND(3);
		g.showND();
		g.removeVND(0);
		g.showND();


	}
}