/**
 * Clase para dar soporte a vectores que contienen la información, extendida de la clase Data.
 * @author Ángela Calvo
 * @version 1.1
 */
public class Array extends Data {
    protected Data[] content;
    protected int size;
    private Data def;
    public Array(){

    }

    /**
     * Crea una linea.
     * @author Ángela Calvo
     * @param size Tamaño de la linea.
     * @param def Contenido de la linea.
     * @param o Output al cuál imprimir.
     */
    public Array(int size, Data def, Output o){
        this.content = new Data[size];
        this.setOutput(o);
        this.size = size;
        this.def = def;
        for(int i = 0; i < this.content.length;  i++){
            this.content[i] = this.def;
        }
    }

    /**
     * Obtiene el tamaño.
     * @author Ángela Calvo
     * @return Tamaño.
     */
    public int getSize(){
        return this.size;
    }

    /**
     * Define el contenido de una posición.
     * @author Ángela Calvo
     * @param p Posición a la cuál definir el contenido.
     * @param v Contenido a definir.
     */
    public void set(int p, Data v){
        if(this.isLegal(p)){


            this.content[p] = v;
        }
    }

    /**
     * Obtiene el contenido de una posición.
     * @author Ángela Calvo
     * @param p Posición del contenido a obtener.
     * @return Contenido a obtener.
     */
    public Data get(int p){
        if(this.isLegal(p)){
            return this.content[p];
        }else {
            System.out.println("Error, get");
            return new Char('x', this.out);
        }
    }

    /**
     * Elimina el contenido de una posición.
     * @author Ángela Calvo
     * @param p Posición a la cuál eliminar el contenido.
     */
    public void rem(int p){
        if(this.isLegal(p)) {
            this.set(p, this.def);
        }
    }

    /**
     * Obtiene la longitud.
     * @author Ángela Calvo
     * @return La longitud.
     */
    public int length(){
        return content.length;
    }

    /**
     * Comprueba si una posición existe.
     * @author Ángela Calvo
     * @param p Posición a ser comprobada.
     * @return True si existe, false si no.
     */
    public boolean isLegal(int p){
        return(p >= 0 && p < this.size);
    }

    /**
     * Inserta (define y shiftea) contenido en una posición.
     * @author Ángela Calvo
     * @param p Posición a la cuál insertar el contenido.
     * @param v Contenido a insertar.
     */
    public void ins(int p, Data v){
        if(this.isLegal(p)){
            for(int i = this.size-1; i > p; i--){
                this.set(i, this.get(i-1));
            }
            this.set(p, v);
        }
    }

    /**
     * Elimina y shiftea el contenido de una posición.
     * @author Ángela Calvo
     * @param p Posición a la cuál eliminar y shiftear el contenido.
     */
    public void del(int p){
        if(this.isLegal(p)){
            for(int i = p; i < this.size-1; i++){
                this.set(i, this.get(i+1));
            }
            this.rem(this.size-1);
        }
    }

    /**
     * Imprime contenido.
     * @author Ángela Calvo
     */
    @Override
    public void print(){
        this.out.print(this);
    }

    /**
     * Inserta el contenido (def) en una posición.
     * @author Ángela Calvo
     * @param p Posición a la cuál insertar def.
     */
    public void ins(int p){
        this.ins(p, this.def);
    }

    /**
     * Define el contenido (def).
     * @author Ángela Calvo
     * @param def Contenido a definir.
     */
    protected void setDef(Data def){
        this.def = def;
    }
}