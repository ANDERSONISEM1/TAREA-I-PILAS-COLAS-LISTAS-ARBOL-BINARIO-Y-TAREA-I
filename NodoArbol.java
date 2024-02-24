

package nodoarbol;


public class NodoArbol {
    int valor;
    NodoArbol izquierda, derecha;

    public NodoArbol(int item) {
        valor = item;
        izquierda = derecha = null;
    }
}