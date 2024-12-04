package ioc.xtec.cat.selectionsort;

/**
 * Classe que conté l'algoritme de selecció i la comprovació de si existeix l'element a l'array
 * @author David Castrillón Lladós
 * @version 1.0.0
 * @since 1.0.0
 */

public class SelectionSort {
    
    /**
     * Mètode per ordenar un array de nombres enters
     * @param arr l'array de nombres enters a ordenar
     */
    public void sort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
    
    /**
     * Mètode que comprova tant que un array no sigui null com que un valor enter existeix dins l'array
     * @param arr array de nombres enters
     * @param value nombre enter per validar si hi és a l'array
     * @return retorna si el nombre existeix o no dins l'array
     * @throws IllegalArgumentException Excepció que és llença si l'array és null
     */
    public boolean contains(int[] arr, int value) {
        if (arr == null) {
            throw new IllegalArgumentException("L'array no pot ser nul.");
        }

        for (int num : arr) {
            if (num == value) {
                return true;
            }
        }
        return false;
    }
    
}
