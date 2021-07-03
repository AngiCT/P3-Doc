/**
 * Clase para añadir la decoración EDT a la salida del sistema.
 * @author Ángela Calvo
 * @version 1.0
 */
public class EDTOutput extends WindowOutput{

    /**
     * Añade el texto "EDT".
     * @author Ángela Calvo
     * @param edt Editor a imprimir.
     */
    public void print(EDT edt){
        System.out.print("EDT ");
        super.print(edt.getWindow());
    }
}
