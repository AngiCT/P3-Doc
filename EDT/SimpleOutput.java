/**
 * Clase resultante de la implementación de la clase Output para visualizar la información.
 * @author Ángela Calvo
 * @version 1.0
 */
public class SimpleOutput extends Output {

    /**
     * Imprime un caracter Char.
     * @author Ángela Calvo
     * @param c Carácter a imprimir.
     */
    @Override
    public void print(Char c){
        System.out.print(c.content);
    }

    /**
     * Imprime una linea Array.
     * @author Ángela Calvo
     * @param a Array a imprimir.
     */
    @Override
    public void print(Array a){
        for (int i = 0; i < a.length(); i++) {
            a.get(i).print();
        }
    }

    /**
     * Imprime una matriz Matrix.
     * @author Ángela Calvo
     * @param m Matriz a imprimir.
     */
    @Override
    public void print(Matrix m){
        System.out.println();
        for(int i = 0; i < m.content.length; i++){
            m.content[i].print();
            System.out.println();
        }
    }

    /**
     * Imprime una ventana Window.
     * @author Ángela Calvo
     * @param w Ventana a imprimir.
     */
    @Override
    public void print(Window w){
    }

    /**
     * Imprime una instancia del editor edt.
     * @author Ángela Calvo
     * @param edt Editor a imprimir.
     */
    @Override
    public void print(EDT edt){
    }

}