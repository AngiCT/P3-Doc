/**
 * Clase para añadir la posición del cursor a la salida del sistema.
 * @author Ángela Calvo
 * @version 1.0
 */
public class WindowOutput extends DecoratedOutput{

    /**
     * Añade el la posición del cursor.
     * @author Ángela Calvo
     * @param w Ventana a imprimir.
     */
    public void print(Window w){
        System.out.println("[" + w.x + "-" + w.y + "]");
        super.print((Matrix) w);
    }
}
