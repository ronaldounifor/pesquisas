public class App {
    public static void main(String[] args) throws Exception {
        int valores[] = new int[]{7, 1, 2, 5, 3};
        int alvo = 2;

        int posicao = pesquisaLinearRecursiva(valores, alvo);
        System.out.println("Na posicao "+posicao);
    }
    
    /*
     * 
     */
    private static int pesquisaLinearIterativa(int[] valores, int alvo) {
        for (int pos = 0; pos < valores.length; pos++)
            if (valores[pos] == alvo) return pos;

        return -1;
    }

    private static int pesquisaLinearRecursiva(int[] valores, int alvo) {
        return pesquisaLinearRecursiva(valores, alvo, 0);
    }
    
    /*
     * 
     */
    private static int pesquisaLinearRecursiva(int[] valores, int alvo, int atual) {
        if (atual >= valores.length) return -1;

        if (valores[atual] == alvo) return atual;

        return pesquisaLinearRecursiva(valores, alvo, atual + 1);
    }



}
