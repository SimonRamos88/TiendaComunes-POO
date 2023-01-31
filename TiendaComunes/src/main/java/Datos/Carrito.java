
package Datos;

import java.util.HashMap;
import java.util.Set;


public class Carrito {
    
    private int cantidad;
    private Cliente user;
    private HashMap<Producto, Integer> bolsa;
    

    public int getCantidad() {
        return this.cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Cliente getUser() {
        return this.user;
    }

    public void setUser(Cliente user) {
        this.user = user;
    }

    public HashMap<Producto, Integer> getBolsa() {
        return this.bolsa;
    }

    public void setBolsa(HashMap<Producto,Integer> bolsa) {
        this.bolsa = bolsa;
    }

   
  
    public Carrito(){
        this(0,new Cliente(),new HashMap<Producto, Integer>());
    }
    
    public Carrito(int cantidad, Cliente user, HashMap<Producto,Integer> bolsa){
        this.cantidad = cantidad;
        this.user = user;
        this.bolsa = bolsa;
             
    }
    
    public float calcularCostoPedido(){
        Set<Producto> llaves = this.getBolsa().keySet();
        float costoTotal= 0;
        for(Producto p : llaves){
            float costoReal=0;
            int cantidad = this.getBolsa().get(p);
            float costoPosible1 = p.valorTotalProducto(cantidad);
            float costoPosible2 = p.valorTotalProducto(cantidad);
            if(costoPosible1>costoPosible2) costoReal = costoPosible2;
            else if(costoPosible2> costoPosible1) costoReal= costoPosible1;
            else costoReal= costoPosible1;
            costoTotal +=costoReal ;
        }
        return costoTotal;
    }
}
