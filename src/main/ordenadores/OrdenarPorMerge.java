package ordenadores;
public class OrdenarPorMerge implements Ordenador{

    @Override
    public int[] ordene(int[] array) {
        return array;
    }

    public int[] merge(int[] array, int[] array2) {
        int meio = array.length/2; 
        int inicio = array[0];
        int fim = array.length;
        int P1 = meio - inicio +1;
        int P2 = fim - meio;
        
        return array;
    }
    
}
