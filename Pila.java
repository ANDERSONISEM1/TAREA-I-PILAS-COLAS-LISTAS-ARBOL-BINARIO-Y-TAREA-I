
package pila;


import java.util.ArrayList;
import java.util.List;

public class Pila {
    private List<Integer> elementos;

    public Pila() {
        elementos = new ArrayList<>();
    }

    public void push(int elemento) {
        elementos.add(elemento);
    }

    public int pop() {
        if (elementos.isEmpty()) {
            throw new IllegalStateException("La pila está vacía");
        }
        return elementos.remove(elementos.size() - 1);
    }

    public int peek() {
        if (elementos.isEmpty()) {
            throw new IllegalStateException("La pila está vacía");
        }
        return elementos.get(elementos.size() - 1);
    }

    public boolean estaVacia() {
        return elementos.isEmpty();
    }
}

