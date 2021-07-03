/**
 * Clase para el procesamiento de texto (insert mode).
 * @author Ángela Calvo
 * @version 1.0
 */
public class InsertParser extends Parser{

    /**
     * Crea un nuevo InsertParser.
     * @author Ángela Calvo
     * @param edt Instancia a la cual asignar el parser.
     */
    public InsertParser(EDT edt){
        super(edt);
    }

    /**
     * Ejecuta un comando.
     * @author Ángela Calvo
     * @param c Comando a ejecutar o letra a insertar.
     */
    public void exe(char c){
        if(c=='&'){
            this.edt.setNormalMode();
        }else{
            this.edt.getWindow().ins(c);
        }
    }
}
