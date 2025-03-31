import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        int valores[] = new int[]{7, 1, 2, 5, 3};
        int alvo = 2;

        // int posicao = pesquisaLinearRecursiva(valores, alvo);
        // System.out.println("Na posicao "+posicao);
        
        Arrays.sort(valores);
        int posicao = pesquisaBinariaRecursiva(valores, alvo, 0, valores.length - 1);
        System.out.println("Na posicao "+posicao);
        
    }
        
    /*
     * T(n) = n + 1 + n = 2n + 1 = O(n)
     */
    private static int pesquisaLinearIterativa(int[] valores, int alvo) {
        for (int pos = 0; pos < valores.length; pos++)//n + 1
            if (valores[pos] == alvo) return pos;//n

        return -1;
    }

    private static int pesquisaLinearRecursiva(int[] valores, int alvo) {
        return pesquisaLinearRecursiva(valores, alvo, 0);
    }
    
    /*
     * T(n) = T(n - 1) + c = cn = O(n)
     */
    private static int pesquisaLinearRecursiva(int[] valores, int alvo, int atual) {
        if (atual >= valores.length) return -1;

        if (valores[atual] == alvo) return atual;

        return pesquisaLinearRecursiva(valores, alvo, atual + 1);
    }

    private static int pesquisaBinariaIterativa(int[] valores, int alvo, int inicio, int fim) {
        while(inicio <= fim) {
            int meio = (fim + inicio)/2;

            if (valores[meio] == alvo) return meio;

            if (valores[meio] > alvo) fim = meio - 1;
            else inicio = meio + 1;
        }

        return -1;
    }

    /*
     * T(n) = 
     */
    private static int pesquisaBinariaRecursiva(int[] valores, int alvo, int inicio, int fim) {
        if(inicio > fim) return -1;

        int meio = (fim + inicio)/2;

        if (valores[meio] == alvo) return meio;
        
        if (valores[meio] > alvo) return pesquisaBinariaRecursiva(valores, alvo, inicio, meio - 1);
        else return pesquisaBinariaRecursiva(valores, alvo, meio + 1, fim);
    }

}
