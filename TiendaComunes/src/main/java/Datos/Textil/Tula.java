
package Datos.Textil;

final public class Tula extends Maletin {
    private String gama;
    private boolean personalizado;
    private int correas;

    public String getGama() {
        return gama;
    }

    public void setGama(String gama) {
        this.gama = gama;
    }

    public boolean getPersonalizado() {
        return personalizado;
    }

    public void setPersonalizado(boolean personalizado) {
        this.personalizado = personalizado;
    }

    public int getCorreas() {
        return correas;
    }

    public void setCorreas(int correas) {
        this.correas = correas;
    }

    public Tula() {
        this("",false,0,"",false,0,0, "Desconocido", "Desconocida", 0, "");
    }

    public Tula(String gama, boolean personalizado, int correas, String medidas, boolean personalizable, int bolsillos, int codigo, String nombre, String empresa, float precio, String desp) {
        super(medidas, personalizable, bolsillos, codigo, nombre, empresa, precio, desp);
        this.gama = gama;
        this.personalizado = personalizado;
        this.correas = correas;
    }

    @Override
    public String toString() {
        String cadena = super.toString();
        return (cadena + "gama=" + gama + ", personalizado=" + personalizado + ", correas=" + correas);
    }
    
    @Override
    
    public final float valorTotalProducto(int cantidad){
        return (cantidad*this.getPrecio());
    };
    
    
    @Override
    public final float promocion (int cantidad){
        if (cantidad < 3){
            return(cantidad);
        } else{
            return(float) (this.getPrecio() * 2 * (cantidad/3) + (this.getPrecio() * (cantidad%3)));   
        }
    };

    
}
