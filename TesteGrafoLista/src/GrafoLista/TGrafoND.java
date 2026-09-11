package GrafoLista;

class TNo {
    public int w;
    public TNo prox;
}

public class TGrafoND {
    private int n;       // Quantidade de vértices
    private int m;       // Quantidade de arestas
    private TNo adj[];   // Vetor com o início da lista de adjacência de cada vértice

    public TGrafoND(int n) {
        this.n = n;
        this.m = 0;
        this.adj = new TNo[n];
        for (int i = 0; i < n; i++) {
            this.adj[i] = null;
        }
    }
    public void insereA(int v, int w) {
        if (v == w || v < 0 || v >= n || w < 0 || w >= n) {
            return;
        }

        // Primeiro verifica se a aresta já existe na lista de v
        TNo atual = adj[v];
        while (atual != null && w >= atual.w) {
            if (atual.w == w) {
                return; // Aresta já existe, não faz nada
            }
            atual = atual.prox;
        }

        // Vetores com as duas direções: (v -> w) e (w -> v)
        int[] origem = {v, w};
        int[] destino = {w, v};

        // Executa a inserção ordenada para ambos os sentidos
        for (int k = 0; k < 2; k++) {
            int orig = origem[k];
            int dest = destino[k];

            TNo no = adj[orig];
            TNo ant = null;

            while (no != null && dest > no.w) {
                ant = no;
                no = no.prox;
            }

            TNo novoNo = new TNo();
            novoNo.w = dest;
            novoNo.prox = no;

            if (ant == null) {
                adj[orig] = novoNo;
            } else {
                ant.prox = novoNo;
            }
        }

        m++; // Incrementa a contagem de arestas apenas uma vez
    }

    // Remove elemento de uma lista de adjacência (uso interno)
    public void removeA(int v, int w) {
        if (v < 0 || v >= n || w < 0 || w >= n) {
            return;
        }

        // 1. Verifica se a aresta realmente existe na lista de v
        TNo check = adj[v];
        boolean existe = false;
        while (check != null) {
            if (check.w == w) {
                existe = true;
                break;
            }
            check = check.prox;
        }

        if (!existe) {
            return; // Aresta não existe, encerra sem alterar m
        }

        // 2. Remove nos dois sentidos: (v -> w) e (w -> v)
        int[] origem = {v, w};
        int[] destino = {w, v};

        for (int k = 0; k < 2; k++) {
            int orig = origem[k];
            int dest = destino[k];

            TNo no = adj[orig];
            TNo ant = null;

            // Percorre a lista do vértice de origem procurando o de destino
            while (no != null && no.w != dest) {
                ant = no;
                no = no.prox;
            }

            if (no != null) {
                if (ant == null) {
                    adj[orig] = no.prox; // Remoção na cabeça da lista
                } else {
                    ant.prox = no.prox;  // Remoção no meio ou fim
                }
            }
        }

        m--; // Decrementa a contagem de arestas apenas uma vez
    }

    public void show() {
        System.out.println("Vértices (n): " + n);
        System.out.println("Arestas (m): " + m);
        for (int i = 0; i < n; i++) {
            System.out.print(i + ": ");
            TNo no = adj[i];
            while (no != null) {
                System.out.print(no.w + " ");
                no = no.prox;
            }
            System.out.println();
        }
    }

    public void completo(){
        int resultado =  (n * (n-1))/2;
        if(resultado == m){
            System.out.println("É um grafo completo");
        } else{
            System.out.println("Não é um grafo completo");
        }
    }
}