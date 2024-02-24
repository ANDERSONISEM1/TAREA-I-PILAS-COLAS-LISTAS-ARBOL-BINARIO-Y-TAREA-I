
package lista;

import java.util.ArrayList;
import java.util.List;
    public class Lista {
    private List<Integer> elementos;

    public Lista() {
        elementos = new ArrayList<>();
    }

    public void agregar(int elemento) {
        elementos.add(elemento);
    }

    public void eliminar(int indice) {
        elementos.remove(indice);
    }

    public void imprimir() {
        for (int elemento : elementos) {
            System.out.print(elemento + " ");
        }
        System.out.println();
    }

    public int obtener(int indice) {
        return elementos.get(indice);
    }

    public int tamano() {
        return elementos.size();
    }
}
