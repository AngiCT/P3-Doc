/**
 * Clase para gestionar el manejo de datos.
 * Los métodos están definidos en esta clase porque Array extiende de Data.
 * @author Ángela Calvo
 * @version 1.0
 */
public abstract class Data {
    public Output out;

    /**
     * Obtiene el contenido de una posición de una Array.
     * @author Ángela Calvo
     * @param p Posición del contenido a obtener.
     * @return Contenido a obtener.
     */
    public abstract Data get(int p);

    /**
     * Define el contenido de una Array.
     * @author Ángela Calvo
     * @param p Posición de la cuál definir el contenido.
     * @param v Contenido a definir.
     */
    public abstract void set(int p, Data v);

    /**
     * Elimina el contenido de una posición de una Array.
     * @author Ángela Calvo
     * @param p Posición de la cuál eliminar el contenido.
     */
    public abstract void rem(int p);

    /**
     * Elimina y shiftea el contenido de una posición de una Array.
     * @author Ángela Calvo
     * @param p Posición de la cuál eliminar y shiftear el contenido.
     */
    public abstract void del(int p);

    /**
     * Inserta (define y shiftea) contenido en una posición de una Array.
     * @author Ángela Calvo
     * @param p Posición de la cuál insertar el contenido.
     * @param v Contenido a ser insertado.
     */
    public abstract void ins(int p, Data v);

    /**
     * Obtiene el tamaño de una Array.
     * @author Ángela Calvo
     * @return Tamaño de la Array.
     */
    public abstract int getSize();

    /**
     * Define el Output de un objeto Data.
     * @author Ángela Calvo
     * @param o Output a ser definido.
     */
    public void setOutput(Output o){
        this.out = o;
    }

    /**
     * Imprime contenido.
     * @author Ángela Calvo
     */
    public abstract void print();

    /**
     * Comprueba si una posición existe.
     * @author Ángela Calvo
     * @param p Posición a ser comprobada.
     * @return True si existe, false si no.
     */
    public abstract boolean isLegal(int p);
}