/**
 * Clase para el procesamiento de comandos especificos (normal mode).
 * @author Ángela Calvo
 * @version 2.0
 */
public class NormalParser extends Parser{

    /**
     * Crea un nuevo NormalParser.
     * @author Ángela Calvo
     * @param edt Instancia a la cual asignar el parser.
     */
    public NormalParser(EDT edt){
        super(edt);
    }

    /**
     * Ejecuta un comando.
     * @author Ángela Calvo
     * @param c Comando a ejecutar.
     */
    public void exe(char c){
        switch (c){
            case '0':
                this.edt.getWindow().first();
                break;
            case 'd':
                this.edt.getWindow().del();
                break;
            case 'g':
                this.edt.getWindow().setPosY(0);
                break;
            case 'G':
                this.edt.getWindow().setPosY(this.edt.getWindow().getSize()-1);
                break;
            case 'h':
                this.edt.getWindow().prev();
                break;
            case 'i':
                this.edt.setInsertMode();
                break;
            case 'j':
                this.edt.getWindow().nextLine();
                break;
            case 'k':
                this.edt.getWindow().prevLine();
                break;
            case 'l':
                this.edt.getWindow().next();
                break;
            case 'o':
                this.edt.getWindow().ins();
                this.edt.getWindow().first();
                this.edt.setInsertMode();
                break;
            case 'x':
                this.edt.getWindow().delPos();
                break;
            case 'X':
                if(this.edt.getWindow().x != 0){
                    this.edt.getWindow().prev();
                    this.edt.getWindow().delPos();
                }
                break;
            case '$':
                this.edt.getWindow().last();
                break;
        }
    }
}
