/**
 * Clase para visualizar la información y aplicar diferentes salidas a nuestra información.
 * @author Ángela Calvo
 * @version 1.0
 */
abstract public class Output {

    /**
     * Imprime un carácter Char.
     * @author Ángela Calvo
     * @param c Char a imprimir.
     */
    public abstract void print(Char c);

    /**
     * Imprime una linea Array.
     * @author Ángela Calvo
     * @param a Array a imprimir.
     */
    public abstract void print(Array a);

    /**
     * Imprime una matriz Matrix.
     * @author Ángela Calvo
     * @param m Matrix a imprimir.
     */
    public abstract void print(Matrix m);

    /**
     * Imprime una ventana Window.
     * @author Ángela Calvo
     * @param w Window a imprimir.
     */
    public abstract void print(Window w);

    /**
     * Imprime una instancia del editor edt.
     * @author Ángela Calvo
     * @param edt Instáncia del editor a imprimir.
     */
    public abstract void print(EDT edt);
}