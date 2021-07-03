/**
 * Clase que permite utilizar un fichero de texto como entrada al programa.
 * @author Ángela Calvo
 * @version 1.0
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileInput extends Input{
    public FileInput(String url){
        super("");
        this.s = this.readFile(url);
    }
    private String readFile(String url) {
        File file = new File(url);
        String res = "";
        Scanner scan = null;
        try {
            scan = new Scanner(file);
            while (scan.hasNextLine()){
            res += scan.nextLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return res;
    }
}

