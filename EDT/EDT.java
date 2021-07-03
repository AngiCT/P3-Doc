/**
 * Clase para definir la lógica de la aplicación, hace de punto de entrada al programa.
 * @author Ángela Calvo
 * @version 1.0
 */
public class EDT {
    private CharWindow w;
    protected Input input;
    protected Parser normalParser;
    protected Parser insertParser;
    protected Parser parser;
    protected Output out;
    public EDT(){
    }

    /**
     * Inicializa EDT.
     * @author Ángela Calvo
     * @param width Número de columnas.
     * @param height Número de filas.
     * @param i Entrada a ser procesada (comandos).
     * @param o Output al cuál imprimir.
     */
    public void setup(int width,int height,Input i,Output o){
        this.out=o;
        this.w=new CharWindow(width,height,' ',o);
        this.setupInput(i);
    }

    /**
     * Ejecuta la entrada (los comandos uno por uno).
     * @author Ángela Calvo
     */
    public void run(){
        char c = input.get();
        while(c!=0){
            parser.exe(c);
            c=input.get();
        }
        this.print();
    }

    /**
     * Obtiene la ventana.
     * @author Ángela Calvo
     * @return La ventana.
     */
    public CharWindow getWindow(){
        return this.w;
    }

    /**
     * Imprime contenido.
     * @author Ángela Calvo
     */
    public void print(){
        this.out.print(this);
    }

    /**
     * Define el input.
     * @author Ángela Calvo
     * @param i Input a ser definido.
     */
    public void setupInput(Input i){
        this.input=i;
    }

    /**
     * Inicializa el parser para el modo normal.
     * @author Ángela Calvo
     * @param normalParser Instancia de Parser.
     */
    public void setupNormalParser(Parser normalParser){
        this.normalParser = normalParser;
        this.parser=this.normalParser;
    }

    /**
     * Inicializa el parser para el modo inserción.
     * @author Ángela Calvo
     * @param insertParser Instancia del Parser.
     */
    public void setupInsertParser(Parser insertParser){
        this.insertParser = insertParser;
    }

    /**
     * Cambia el parser a modo normal.
     * @author Ángela Calvo
     */
    public void setNormalMode(){
        this.parser=normalParser;
    }

    /**
     * Cambia el parser a modo inserción.
     * @author Ángela Calvo
     */
    public void setInsertMode(){
        this.parser=insertParser;
    }

    public void next() { }
    public void prev() { }
}