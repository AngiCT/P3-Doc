/**
 * Clase genérica para el procesamiento de comandos.
 * @author Ángela Calvo
 * @version 1.0
 */
public abstract class Parser {
    protected EDT edt;

    /**
     * Crea un nuevo Parser.
     * @author Ángela Calvo
     * @param edt Instancia a la cual asignar el parser.
     */
    public Parser(EDT edt){
        this.edt=edt;
    }

    /**
     * Ejecuta un comando.
     * @author Ángela Calvo
     * @param c Comando a ejecutar.
     */
    public abstract void exe(char c);
}
