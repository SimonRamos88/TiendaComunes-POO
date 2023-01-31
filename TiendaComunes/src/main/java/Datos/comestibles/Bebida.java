
package Datos.comestibles;


public abstract class Bebida extends Comestible{
    private float contenidoMililitros;
    private String empaquetado;
    private boolean origenNatural;
    
    // SETTERS Y GETTERS

    public float getContenidoMililitros() {
        return contenidoMililitros;
    }

    public void setContenidoMililitros(float contenidoMililitros) {
        this.contenidoMililitros = contenidoMililitros;
    }

    public String getEmpaquetado() {
        return empaquetado;
    }

    public void setEmpaquetado(String empaquetado) {
        this.empaquetado = empaquetado;
    }

    public boolean isOrigenNatural() {
        return origenNatural;
    }

    public void setOrigenNatural(boolean origenNatural) {
        this.origenNatural = origenNatural;
    }
    
    // CONSTRUCTORES
    
     protected Bebida(float contenidoMililitros, String empaquetado, boolean origenNatural
        , String vencimiento, float peso, int unidadesVenta, float calorias,
        int codigo, String nombre, String empresa, float precio, String desp) {
        
        super(vencimiento, peso, unidadesVenta, calorias, codigo, nombre, empresa,
                precio, desp);
        this.contenidoMililitros = contenidoMililitros;
        this.empaquetado = empaquetado;
        this.origenNatural = origenNatural;
     }
    
     /*
    protected Bebida(float contenidoMililitros, String empaquetado, boolean origenNatural
    , String vencimiento, float peso, int unidadesVenta, float calorias) {
        
        super(vencimiento, peso, unidadesVenta, calorias);
        this.contenidoMililitros = contenidoMililitros;
        this.empaquetado = empaquetado;
        this.origenNatural = origenNatural;
    }*/
    
    protected Bebida(float contenidoMililitros, String empaquetado, boolean origenNatural) {
        super();
        this.contenidoMililitros = contenidoMililitros;
        this.empaquetado = empaquetado;
        this.origenNatural = origenNatural;
    }

    protected Bebida() {
        this(0, "Desconocido", true);
    }
    
    
    
    @Override
    public String toString(){
        String cad = super.toString();
        cad += "Volumen ml: " + this.contenidoMililitros + " Tipo empaquetado: "
                + this.empaquetado + " Origen Natural: " + this.origenNatural + "\n";
        return cad;
    }
    
    
}
