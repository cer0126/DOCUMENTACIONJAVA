package principal;
import metodos.MandarPantalla;
/**
 * Programa principal que usa los metodos auxiliares para salto de linea de la clase MandarPantalla
 * @see <a href="http://www.elpais.com">
 * @author Alberto
 */
public class Main {

    /**
     * Punto de entrada único para el proyecto
     * 
     * <ul>
     *      <li> Utliza metodo sinSalto
     *      <li> Utliza metodo conSalto
     * </ul>
     * @param args es un arreglo de tipo String
     */
    public static void main(String[] args) {
        MandarPantalla mp = new MandarPantalla();
        
        mp.conSalto("Esto es una linea con salto");
        mp.sinSalto("Esto es una linea sin salto");
    }
    
}
