import ordenadores.Ordenador;
import ordenadores.OrdenarPorInsercao;
import ordenadores.OrdenarPorMerge;
import ordenadores.OrdenarPorSelecao;

public class Main {
    public static void main(String[] args) {
        int[] array = { 5, 3, 2, 4, 7};
        int[] array2 ={0, 1, 2, 22, 30};
        OrdenarPorMerge n = new OrdenarPorMerge();
        int[] r = n.merge(array, array2);
        for(int i : r){
            System.out.println(i);
        }
        }
}

