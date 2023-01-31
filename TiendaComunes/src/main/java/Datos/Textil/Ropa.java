
package Datos.Textil;
import Datos.Producto;


public abstract class Ropa extends Producto{
    private String etiqueta;
    private int talla;
    private String garantia;

    public String getEtiqueta() {
        return etiqueta;
    }

    public void setEtiqueta(String etiqueta) {
        this.etiqueta = etiqueta;
    }

    public int getTalla() {
        return talla;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }

    public String getGarantia() {
        return garantia;
    }

    public void setGarantia(String garantia) {
        this.garantia = garantia;
    }
    
    // CONSTRUTORES
    
    public Ropa() {
        this("",0,"-",0, "Desconocido", "Desconocida", 0, "");
    }

    public Ropa(String etiqueta, int talla, String garantia, int codigo, String nombre, String empresa, float precio, String desp) {
        super(codigo, nombre, empresa, precio, desp);
        this.etiqueta = etiqueta;
        this.talla = talla;
        this.garantia = garantia;
    }

    @Override
    public String toString() {
        String cadena = super.toString();
        return (cadena + "etiqueta=" + etiqueta + ", talla=" + talla + ", garantia=" + garantia);
    }
    
    
       
}
