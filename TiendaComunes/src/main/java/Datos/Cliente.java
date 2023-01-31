
package Datos;

import java.util.HashMap;

public class Cliente {
    private int id;
    private String nombre;
    private float dineroDisponible;
    private HashMap<Integer,Compra> historial;
    
    // GETTERS AND SETTERS
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getDineroDisponible() {
        return dineroDisponible;
    }

    public void setDineroDisponible(float dineroDisponible) {
        this.dineroDisponible = dineroDisponible;
    }

    public HashMap<Integer,Compra> getHistorial() {
        return historial;
    }

    public void setHistorial(HashMap<Integer,Compra> historial) {
        this.historial = historial;
    }
    
    // CONSTRUCTORES

    public Cliente(int id, String nombre, float dineroDisponible, HashMap<Integer, Compra> historial) {
        this.id = id;
        this.nombre = nombre;
        this.dineroDisponible = dineroDisponible;
        this.historial = historial;
    }
    
    
    public Cliente(){
        this(0,"Desconocido",0,new HashMap<Integer, Compra>());
    }
    
    @Override
    public String toString(){
        String cad = "ID cliente: " + this.getId() + "\nNombre: " + this.getNombre()
                + "\nDinero disponible: "+this.getDineroDisponible() + "\nHistorial compras: "+
                this.getHistorial();
        return cad;
    }
    
    public void aniadirHistorial(Compra compra, int codigo){
        HashMap<Integer,Compra> historial_viejo = this.getHistorial();
        historial_viejo.put(codigo, compra);
        this.setHistorial(historial_viejo);
        
    }
}
