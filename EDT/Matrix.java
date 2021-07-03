/**
 * Clase para gestionar la matriz que gestiona el texto de cada ventana.
 * @author Ángela Calvo
 * @version 1.0
 */
public class Matrix extends Array {
    private int width;
    private Data def;

    /**
     * Crea una matriz.
     * @author Ángela Calvo
     * @param width Longitud de las líneas.
     * @param height Número de líneas.
     * @param def Contenido de la linea.
     * @param o Output al cuál imprimir.
     */
    public Matrix(int width, int height, Data def, Output o) {
        this.size = height;
        this.width = width;
        this.def = def;
        this.setOutput(o);
        this.content = new Data[height];
        this.setDef(new Array(width, def, this.out));
        for(int i = 0; i < height; i++){
            this.content[i] = new Array(width, def, this.out);
        }
    }

    /**
     * Inserta (define y shiftea) contenido en una posición.
     * @author Ángela Calvo
     * @param x Columna en la cuál insertar el contenido.
     * @param y Fila en la cuál insertar el contenido.
     * @param v Contenido a insertar.
     */
    public void ins(int x, int y, Data v){
        this.get(y).ins(x, v);
    }

    /**
     * Elimina y shiftea el contenido de una posición.
     * @author Ángela Calvo
     * @param x Columna en la cuál se encuentra la posición a eliminar.
     * @param y Fila en la cuál se encuentra la posición a eliminar.
     */
    public void del(int x, int y){
        this.get(y).del(x);
    }

    /**
     * Inserta una nueva fila.
     * @author Ángela Calvo
     * @param y Posición en la cuál insertar la nueva fila.
     */
    public void ins(int y){
        this.ins(y, new Array(this.width, this.def, this.out));
    }

    /**
     * Imprime contenido.
     * @author Ángela Calvo
     */
    @Override
    public void print(){
        this.out.print(this);
    }
}