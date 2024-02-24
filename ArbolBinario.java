
package nodoarbol;


public class ArbolBinario {
    NodoArbol raiz;

    public ArbolBinario() {
        raiz = null;
    }

    private NodoArbol insertarNodo(NodoArbol nodo, int valor) {
        if (nodo == null) {
            nodo = new NodoArbol(valor);
            return nodo;
        }

        if (valor < nodo.valor) {
            nodo.izquierda = insertarNodo(nodo.izquierda, valor);
        } else if (valor > nodo.valor) {
            nodo.derecha = insertarNodo(nodo.derecha, valor);
        }

        return nodo;
    }

    public void insertar(int valor) {
        raiz = insertarNodo(raiz, valor);
    }

    private void inOrdenRecursivo(NodoArbol nodo) {
        if (nodo != null) {
            inOrdenRecursivo(nodo.izquierda);
            System.out.print(nodo.valor + " ");
            inOrdenRecursivo(nodo.derecha);
        }
    }

    public void inOrden() {
        inOrdenRecursivo(raiz);
        System.out.println();
    }

    private void preOrdenRecursivo(NodoArbol nodo) {
        if (nodo != null) {
            System.out.print(nodo.valor + " ");
            preOrdenRecursivo(nodo.izquierda);
            preOrdenRecursivo(nodo.derecha);
        }
    }

    public void preOrden() {
        preOrdenRecursivo(raiz);
        System.out.println();
    }

    private void postOrdenRecursivo(NodoArbol nodo) {
        if (nodo != null) {
            postOrdenRecursivo(nodo.izquierda);
            postOrdenRecursivo(nodo.derecha);
            System.out.print(nodo.valor + " ");
        }
    }

    public void postOrden() {
        postOrdenRecursivo(raiz);
        System.out.println();
    }
}
