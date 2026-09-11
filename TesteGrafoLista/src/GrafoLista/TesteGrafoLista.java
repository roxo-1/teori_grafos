package GrafoLista;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TesteGrafoLista {

	public static TGrafo carregaGrafo(String nomeArq) throws IOException {
		try (BufferedReader br = new BufferedReader(new FileReader(nomeArq))) {
			int n = Integer.parseInt(br.readLine().trim()); // 1ª linha: nº de vértices = n
			int m = Integer.parseInt(br.readLine().trim()); // 2ª linha: nº de arestas = m

			TGrafo g = new TGrafo(n);

			String linha;
			int lidas = 0;
			while ((linha = br.readLine()) != null) {
				linha = linha.trim();
				if (linha.isEmpty()) continue; // ignora linha em branco no final do arquivo

				String[] partes = linha.split("\\s+"); // \\s+ lida com espaço(s) e tab
				int v = Integer.parseInt(partes[0]);
				int w = Integer.parseInt(partes[1]);

				g.insereA(v, w); // lista não é ponderada, então não há peso aqui
				lidas++;
			}

			if (lidas != m) {
				System.out.println("Aviso: cabeçalho dizia " + m + " arestas, mas foram lidas " + lidas);
			}

			return g;
		}
	}

	public static void main(String[] args) throws IOException {
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

		// Exemplo de leitura de um grafo a partir de um arquivo texto
		// no formato: V na linha 1, A na linha 2, e A linhas "v w"
		TGrafo gArquivo = carregaGrafo("TesteGrafoLista/src/GrafoLista/grafo.txt");
		System.out.println("\nGrafo lido do arquivo grafo.txt:");
		gArquivo.show();

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