
package Logica;
import Datos.*;
import Datos.farmacia.*;
import java.util.HashMap;
public class pruebas2 {

    Medicamento med_prueba = new Medicamento ();
    
    
    public static void main(String args[]) {
        // TODO code application logic here
        //System.out.println("El objeto" + Instancias.aseo_1.valorTotalProducto(3));
        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "value 1");

        map.put(2, "value 2");

        map.put(3, "value 3");
        map.remove(4);
        System.out.println(map);
    }
    
  
}
