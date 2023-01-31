
package Datos.Textil;

 final public class Chaqueta extends Ropa{
    private String accesorios;
    private boolean personalizable;
    private String tipo;

    public String getAccesorios() {
        return accesorios;
    }

    public void setAccesorios(String accesorios) {
        this.accesorios = accesorios;
    }

    public boolean getPersonalizable() {
        return personalizable;
    }

    public void setPersonalizable(boolean personalizable) {
        this.personalizable = personalizable;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    // CONSTRUCTORES

    public Chaqueta() {
        this("",false,"","",0,"-",0, "Desconocido", "Desconocida", 0, "");
    }

    public Chaqueta(String accesorios, boolean personalizable, String tipo, String etiqueta, int talla, String garantia, int codigo, String nombre, String empresa, float precio, String desp) {
        super(etiqueta, talla, garantia, codigo, nombre, empresa, precio, desp);
        this.accesorios = accesorios;
        this.personalizable = personalizable;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        String cadena = super.toString();
        return (cadena + "accesorios=" + accesorios + ", personalizable=" + personalizable + ", tipo=" + tipo);
    }
    
    @Override
    public final float valorTotalProducto(int cantidad){
        return (cantidad*this.getPrecio());
    };
    @Override
    public final float promocion (int cantidad){
        return(cantidad);
    };



}
