/**
 * Clase para dar soporte a los carácteres de los cuales se compone el texto.
 * @author Ángela Calvo
 * @version 1.0
 */
public class Char extends Array {
    protected char content;

    /**
     * Crea un carácter.
     * @author Ángela Calvo
     * @param c Carácter a crear.
     * @param o Output al cuál imprimir.
     */
    public Char(char c,Output o){
        this.setOutput(o);
        this.set(c);
    }

    /**
     * Define el carácter.
     * @author Ángela Calvo
     * @param c Carácter a definir.
     */
    public void set(char c){
        this.content=c;
    }

    /**
     * Imprime el carácter.
     * @author Ángela Calvo
     */
    @Override
    public void print(){
        this.out.print(this);
    }
}