package ordenadores;

public class OrdenarPorSelecao implements Ordenador{

    @Override
    public int[] ordene(int[] array) {
        int n = array.length;
        for (int i = 0; i < n; i++){
            int menor = i;
            for(int j = i + 1; j < n; j++){
                if (array[j] < array[menor]){
                    menor = j;
                }
            }
            int temp = array[menor];
            array[menor] = array[i];
            array[i] = temp;
        }
    return array;
    
    }
}