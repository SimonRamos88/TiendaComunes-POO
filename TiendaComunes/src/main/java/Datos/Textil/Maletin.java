
package Datos.Textil;
import Datos.Producto;

public abstract class Maletin extends Producto{
    private String medidas;
    private boolean personalizable;
    private int bolsillos;

    public String getMedidas() {
        return medidas;
    }

    public void setMedidas(String medidas) {
        this.medidas = medidas;
    }

    public boolean getPersonalizable() {
        return personalizable;
    }

    public void setPersonalizable(boolean personalizable) {
        this.personalizable = personalizable;
    }

    public int getBolsillos() {
        return bolsillos;
    }

    public void setBolsillos(int bolsillos) {
        this.bolsillos = bolsillos;
    }

    public Maletin() {
        this("",false,0,0, "Desconocido", "Desconocida", 0, "");
    }

    public Maletin(String medidas, boolean personalizable, int bolsillos, int codigo, String nombre, String empresa, float precio, String desp) {
        super(codigo, nombre, empresa, precio, desp);
        this.medidas = medidas;
        this.personalizable = personalizable;
        this.bolsillos = bolsillos;
    }

    @Override
    public String toString() {
        String cadena = super.toString();
        return (cadena + "medidas=" + medidas + ", personalizable=" + personalizable + ", bolsillos=" + bolsillos);
    }
    
}
