package ioc.xtec.cat.selectionsort;

/**
 * Classe amb validacions que miren que un array existeixi i no estigui buit
 * @author David Castrillón Lladós
 * @version 1.0.0
 * @since 1.0.0
 */

public class ArrayValidator {
    /**
     * Mètode que mira que un array no sigui null i que no estigui buit
     * @param arr l'array a validar
     * @throws IllegalArgumentException si l'array és null
     * @throws IllegalArgumentException si l'array és buit
     */
    public void validateArray(int[] arr) {
        if (arr == null) {
            throw new IllegalArgumentException("L'array no pot ser nul.");
        }
        if (arr.length == 0) {
            throw new IllegalArgumentException("L'array no pot estar buit.");
        }
    }
    
}
