package Datos.Textil;
import Datos.Producto;

public abstract class Textil extends Producto{
    private String material;
    private String color;
    private String cuidados;

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String getCuidados() {
        return cuidados;
    }

    public void setCuidados(String cuidados) {
        this.cuidados = cuidados;
    }

    public Textil(String material, String color, String cuidados) {
        this("","","",0, "Desconocido", "Desconocida", 0, "");
    }
    public Textil(String material, String color, String cuidados, int codigo, String nombre, String empresa, float precio, String desp) {
        super(codigo, nombre, empresa, precio, desp);
        this.material = material;
        this.color = color;
        this.cuidados = cuidados;
    }

    @Override
    public String toString() {
        String cadena = super.toString();
        return (cadena + "material=" + material + ", color=" + color + ", cuidados=" + cuidados);
    }
    
}

