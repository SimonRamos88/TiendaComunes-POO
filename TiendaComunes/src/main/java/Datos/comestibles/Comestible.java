
package Datos.comestibles;

import Datos.Producto;

public abstract class Comestible extends Producto{
    private String vencimiento;
    private float peso;
    private int unidadesVenta;
    private float calorias;
    
    // SETTERS y GETTERS

    public String getVencimiento() {
        return vencimiento;
    }

    public void setVencimiento(String vencimiento) {
        this.vencimiento = vencimiento;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getUnidadesVenta() {
        return unidadesVenta;
    }

    public void setUnidadesVenta(int unidadesVenta) {
        this.unidadesVenta = unidadesVenta;
    }

    public float getCalorias() {
        return calorias;
    }

    public void setCalorias(float calorias) {
        this.calorias = calorias;
    }
    
    // CONSTRUCTORES
    
    protected Comestible(String vencimiento, float peso, int unidadesVenta, float calorias,
    int codigo, String nombre, String empresa, float precio, String desp) {
        
        super(codigo,nombre,empresa,precio,desp);
        this.vencimiento = vencimiento;
        this.peso = peso;
        this.unidadesVenta = unidadesVenta;
        this.calorias = calorias;
    }

    protected Comestible(String vencimiento, float peso, int unidadesVenta, float calorias) {
        super();
        this.vencimiento = vencimiento;
        this.peso = peso;
        this.unidadesVenta = unidadesVenta;
        this.calorias = calorias;
    }
    
    protected Comestible(){
        this("----", 0, 0, 0);
    }
    
    @Override
    public String toString(){
        String cad = super.toString();
        cad += "Fecha de vencimmiento: " + this.vencimiento + " peso kg: " +this.peso
                + " unidades disponibles: " + this.unidadesVenta+ " calorias: " + 
                this.calorias+ "\n";
        return cad;
    }
}
