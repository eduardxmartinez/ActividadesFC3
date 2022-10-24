import javax.swing.JOptionPane;

public class doubleList {
    private doubleNode inicio, fin;

    public doubleList() {
        inicio = fin = null;
    }

    public boolean vacia() {
        return inicio == null;
    }

    // añadir elemento al final de la lista
    public void pushEnd(int elemento) {
        if (!vacia()) {
            fin = new doubleNode(elemento, null, fin);
            fin.anterior.siguiente = fin;
        } else {
            inicio = fin = new doubleNode(elemento);
        }
    }

    // añadir elemento al inicio de la lista
    public void pushStart(int elemento) {
        if (!vacia()) {
            inicio = new doubleNode(elemento, inicio, null);
            inicio.siguiente.anterior = inicio;
        } else {
            inicio = fin = new doubleNode(elemento);
        }
    }

    // mostrat lista
    public void displayStartEnd() {
        if (!vacia()) {
            String datos = "<=>";
            doubleNode auxiliar = inicio;
            while (auxiliar != null) {
                datos = datos + "[" + auxiliar.dato + "] <=>";
                auxiliar = auxiliar.siguiente;
                JOptionPane.showMessageDialog(null, datos, "Mostrar Lista de inicio a fin ",
                        JOptionPane.INFORMATION_MESSAGE);

            }
        }
    }

    public void displayEndStart() {
        if (!vacia()) {
            String datos = "<=>";
            doubleNode auxiliar = fin;
            while (auxiliar != null) {
                datos = datos + "[" + auxiliar.dato + "] <=>";
                auxiliar = auxiliar.anterior;
                JOptionPane.showMessageDialog(null, datos, "Mostrar Lista de fin a inicio ",
                        JOptionPane.INFORMATION_MESSAGE);

            }
        }
    }

    // eliminar primer elemento
    public int pop() {
        int elemento = inicio.dato;
        if (inicio == fin) {
            inicio = fin = null;

        } else {
            inicio = inicio.siguiente;
            inicio.anterior = null;

        }
        return elemento;
    }

    //eliminar ultimo elemento
    public int popEnd() {
        int elemento = fin.dato;
        if (inicio == fin) {
            inicio = fin = null;

        } else {
            fin = fin.anterior;
            fin.siguiente = null;

        }
        return elemento;
    }

}
