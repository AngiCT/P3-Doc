/**
 * Clase para representar la información a nivel de pantalla.
 * @author Ángela Calvo
 * @version 1.0
 */
public class Window extends Matrix {
    public int x;
    public int y;

    /**
     * Crea una ventana.
     * @author Ángela Calvo
     * @param width Longitud de las líneas.
     * @param height Número de líneas.
     * @param def Contenido de la linea.
     * @param o Output al cuál imprimir.
     */
    public Window(int width,int height, Data def, Output o){
        super(width,height,def,o);
        this.x=0;
        this.y=0;
    }

    /**
     * Establece la posición del cursor.
     * @author Ángela Calvo
     * @param x Columna.
     * @param y Fila.
     * @return True si existe la posición, false si no.
     */
    public boolean setPos(int x, int y){
        return this.setPosX(x)&&this.setPosY(y);
    }

    /**
     * Establece la columna del cursor.
     * @author Ángela Calvo
     * @param x Columna.
     * @return True si existe la columna, false si no.
     */
    public boolean setPosX(int x){
        if(this.isLegalX(x)) {
            this.x=x;
            return true;
        }
        return false;
    }

    /**
     * Establece la fila del cursor.
     * @author Ángela Calvo
     * @param y Fila.
     * @return True si existe la fila, false si no.
     */
    public boolean setPosY(int y){
        if(this.isLegal(y)) {
            this.y=y;
            return true;
        }
        return false;
    }

    /**
     * Comprueba si existe la posición.
     * @param x Columna.
     * @param y Fila.
     * @return True si existe, false si no.
     */
    public boolean isLegalPos(int x, int y){
        return this.isLegalX(x)&&this.isLegalY(y);
    }

    /**
     * Comprueba si existe la posición.
     * @return True si existe, false si no.
     */
    public boolean isLegalPos(){
        return this.isLegalPos(this.x,this.y);
    }

    /**
     * Comprueba si existe la columna.
     * @param x Columna.
     * @return True si existe, false si no.
     */
    public boolean isLegalX(int x){
        if(this.get(this.y).isLegal(x)) {
            return true;
        }
        return false;
    }

    /**
     * Comprueba si existe la fila.
     * @param y Fila.
     * @return True si existe, false si no.
     */
    public boolean isLegalY(int y){
        if(super.isLegal(y)) {
            return true;
        }
        return false;
    }

    /**
     * Inserta información
     * @author Ángela Calvo
     * @param v Información a insertar.
     */
    public void ins(Data v){
        if(this.isLegalX(this.x)) {
            super.ins(this.x, this.y, v);
            this.setPosX(this.x+1);
        }
    }

    /**
     * Inserta una nueva linea.
     * @author Ángela Calvo
     */
    public void ins(){
        this.nextLine();
        this.ins(this.y);
    }

    /**
     * Elimina y shiftea el contenido de una fila.
     * @author Ángela Calvo
     */
    public void del(){
        this.del(this.y);
    }

    /**
     * Elimina el contenido de una posición.
     * @author Ángela Calvo
     */
    public void delPos(){
        this.get(this.y).del(this.x);
    }

    /**
     * Establece la posición del cursor en la siguiente columna.
     * @author Ángela Calvo
     * @return True si ha podido, false si no.
     */
    public boolean next(){
        return this.setPosX(this.x+1);
    }

    /**
     * Establece la posición del cursor en la anterior columna.
     * @author Ángela Calvo
     * @return True si ha podido, false si no.
     */
    public boolean prev(){
        return this.setPosX(this.x-1);
    }

    /**
     * Establece la posición del cursor en la siguiente fila.
     * @author Ángela Calvo
     * @return True si ha podido, false si no.
     */
    public boolean nextLine(){
        return this.setPosY(this.y+1);
    }

    /**
     * Establece la posición del cursor en la anterior fila.
     * @author Ángela Calvo
     * @return True si ha podido, false si no.
     */
    public boolean prevLine() {
        return this.setPosY(this.y-1);
    }

    /**
     * Establece la posición del cursor en la primera columna.
     * @author Ángela Calvo
     */
    public void first(){
        this.setPosX(0);
    }

    /**
     * Establece la posición del cursor en la última columna.
     * @author Ángela Calvo
     */
    public void last(){
        this.setPosX(this.get(this.y).getSize()-1);
    }

    /**
     * Establece la posición del cursor en la primera fila.
     * @author Ángela Calvo
     */
    public void firstLine(){
        this.setPosY(0);
    }

    /**
     * Establece la posición del cursor en la última fila.
     * @author Ángela Calvo
     */
    public void lastLine(){
        this.setPosY(this.getSize()-1);
    }

    /**
     * Imprime contenido.
     * @author Ángela Calvo
     */
    public void print(){
        this.out.print(this);
    }
}