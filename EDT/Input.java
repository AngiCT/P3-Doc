/**
 * Clase encargada de la entrada de información al sistema.
 * @author Ángela Calvo
 * @version 1.0
 */
public class Input {
    protected String s;
    private int p;

    /**
     * Establece el input (comandos).
     * @author Ángela Calvo
     * @param s Input a establecer.
     */
    public Input(String s){
        this.s=s;
        this.p=0;
    }

    /**
     * Obtiene el último comando del input.
     * @author Ángela Calvo
     * @return El último comando.
     */
    public char get(){
        char r = 0;
        if (p<s.length()){
            r=s.charAt(p);
            this.p++;
        }
        return r;
    }
}
