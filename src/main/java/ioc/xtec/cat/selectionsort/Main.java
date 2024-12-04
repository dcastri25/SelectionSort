package ioc.xtec.cat.selectionsort;

import java.util.Scanner;

/**
 * Classe principal per treballar amb l'algoritme de selecció
 * @author David Castrillón Lladós
 * @version 1.0.0
 * @since 1.0.0
 */

public class Main {
    
    /**
     * Mètode principal. Demana la mida de l'array, els elements, el valor a buscar i mostra el resultat.
     * @param args no s'utilitza
     */
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Introdueix la mida de l'array: ");
            int size = scanner.nextInt();

            int[] array = new int[size];
            System.out.println("Introdueix els elements de l'array:");
            for (int i = 0; i < size; i++) {
                System.out.println("Element " + (i + 1) + ": ");
                array[i] = scanner.nextInt();
            }

            SelectionSort sorter = new SelectionSort();
            ArrayValidator validator = new ArrayValidator();

            try {
                validator.validateArray(array);

                System.out.print("Array original:");
                printArray(array);

                System.out.println("Introdueix un valor a buscar a l'array: ");
                int valueToSearch = scanner.nextInt();

                boolean contains = sorter.contains(array, valueToSearch);
                if (contains) {
                    System.out.println("El valor " + valueToSearch + " existeix a l'array.");
                } else {
                    System.out.println("El valor " + valueToSearch + " no existeix a l'array.");
                }

                sorter.sort(array);

                System.out.print("Array ordenat:");
                printArray(array);
                System.out.println("He aprés molt fent el mòdul 8 de DAW encara que hagi estat dur!!!");

            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }

            scanner.close();
        }
    
        /**
         * Mètode per pintar els elements de l'array
         * @param arr l'array que es pintarà
         */
        public static void printArray(int[] arr) {
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
}
