public class doubleNode {

    public int dato;
    doubleNode siguiente, anterior;

    public doubleNode(int elemento) {
        this(elemento, null, null);
    }

    public doubleNode(int elemento, doubleNode a, doubleNode b) {
        dato = elemento;
        siguiente = a;
        anterior = b;
    }

}
