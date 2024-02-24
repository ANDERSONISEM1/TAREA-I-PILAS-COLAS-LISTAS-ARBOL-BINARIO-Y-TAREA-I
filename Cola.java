
package cola;

import java.util.ArrayList;
import java.util.List;

public class Cola {
    private List<Integer> elementos;

    public Cola() {
        elementos = new ArrayList<>();
    }

    public void enqueue(int elemento) {
        elementos.add(elemento);
    }

    public int dequeue() {
        if (elementos.isEmpty()) {
            throw new IllegalStateException("La cola está vacía");
        }
        return elementos.remove(0);
    }

    public int peek() {
        if (elementos.isEmpty()) {
            throw new IllegalStateException("La cola está vacía");
        }
        return elementos.get(0);
    }

    public boolean estaVacia() {
        return elementos.isEmpty();
    }
}

