
import javax.swing.JOptionPane;
import java.*;

public class main {

    public static void main(String[] args) {
        doubleList lista = new doubleList();
        int opcion = 0, elemento;
        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1.Agregar un nodo al inicio \n"
                                + "2. Agregar un nodo al final\n"
                                + "3. Mostrar la lista de inicio a fin\n"
                                + "4. Mostrar al lista de fin a inicio\n"
                                + "5. Eliminar primer nodo\n"
                                + "6. Eliminar último nodo\n"
                                + "7. Salir\n"
                                + "Selecciona la acción deseada",
                        "Menu de Opciones", JOptionPane.INFORMATION_MESSAGE));
                switch (opcion) {
                    case 1:
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "ingresa el elemento del nodo",
                                "Agregando nodo al inicio",
                                JOptionPane.INFORMATION_MESSAGE));
                        lista.pushStart(elemento);
                        break;
                    case 2:
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "ingresa el elemento del nodo",
                                "Agregando nodo al final",
                                JOptionPane.INFORMATION_MESSAGE));
                        lista.pushEnd(elemento);
                        break;
                    case 3:
                        if (!lista.vacia()) {
                            lista.displayStartEnd();
                        } else {
                            JOptionPane.showMessageDialog(null, "No hay nodos",
                                    "lista vacia", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 4:
                        if (!lista.vacia()) {
                            lista.displayEndStart();
                        } else {
                            JOptionPane.showMessageDialog(null, "No hay nodos",
                                    "lista vacia", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 5:
                        if (!lista.vacia()) {
                            elemento = lista.pop();
                            JOptionPane.showMessageDialog(null, "El elemento eliminado es: " + elemento,
                                    "Eliminando primer nodo", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "No hay nodos",
                                    "lista vacia", JOptionPane.INFORMATION_MESSAGE);
                        }

                        break;
                    case 6:
                        if (!lista.vacia()) {
                            elemento = lista.popEnd();
                            JOptionPane.showMessageDialog(null, "El elemento eliminado es: " + elemento,
                                    "Eliminando último nodo", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "No hay nodos",
                                    "lista vacia", JOptionPane.INFORMATION_MESSAGE);
                        }

                        break;
                    case 7:
                        JOptionPane.showMessageDialog(null, "aplicacion finalizada", "Fin",
                                JOptionPane.INFORMATION_MESSAGE);

                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "opcion no registrada",
                                "Incorrecto", JOptionPane.INFORMATION_MESSAGE);

                }
            } catch (NumberFormatException n) {
                JOptionPane.showMessageDialog(null, "Error " + n.getMessage());
            }
        } while (opcion != 7);
    }
}
