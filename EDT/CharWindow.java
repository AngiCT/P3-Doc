/**
 * Clase resultante de la implementación de la clase Output para visualizar la información.
 * @author Ángela Calvo
 * @version 1.0
 */
public class CharWindow extends Window {

    /**
     * Crea una ventana.
     * @author Ángela Calvo
     * @param width Longitud de las líneas.
     * @param height Número de líneas.
     * @param def Contenido de la linea.
     * @param o Output al cuál imprimir.
     */
    public CharWindow(int width, int height, char def, Output o){
        super(width, height, new Char(def, o), o);
    }

    /**
     * Inserta información
     * @author Ángela Calvo
     * @param c Información a insertar.
     */
    public void ins(char c){
        super.ins(new Char(c, this.out));
    }
}
