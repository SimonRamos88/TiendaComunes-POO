
package Datos.farmacia;




final public class Medicamento extends Farmacia {

    
    private String contraindicaciones;
    private boolean generica;
    private String frecuencia;
    
    

    public String getContraindicaciones() {
        return contraindicaciones;
    }

    public void setContraindicaciones(String contraindicaciones) {
        this.contraindicaciones = contraindicaciones;
    }

    public boolean isGenerica() {
        return generica;
    }

    public void setGenerica(boolean generica) {
        this.generica = generica;
    }

    public String getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(String frecuencia) {
        this.frecuencia = frecuencia;
    }
    
 

    public Medicamento() {
        super();
       
        this.contraindicaciones = "ninguna";
        this.generica = false;
        this.frecuencia = "ninguna";
    }

    public Medicamento(String caducidad , String contraindicaciones, boolean generica, String frecuencia, float contenido, String restr, String us0, int codigo, String nombre, String empresa, float precio, String desp) {
        super(caducidad ,contenido, restr, us0, codigo, nombre, empresa, precio, desp);
        
        this.contraindicaciones = contraindicaciones;
        this.generica = generica;
        this.frecuencia = frecuencia;
    }
    
       

    @Override
    public String toString() {
        String gen = this.isGenerica()? "SI":"NO";
        String info_farmacia = super.toString(); 
        String info_medicamento = info_farmacia + "\n" +
                 "Contraindicaciones:" + this.getContraindicaciones()+ "\n" +
                 "Frecuencia:  " + this.getFrecuencia()+ "\n" +
                 
                "Es generico: " + gen + "\n" ;
        return  info_medicamento; 
    }
    
    @Override
    public final float valorTotalProducto(int cantidad){
       float presio_final = super.getPrecio();
        if(this.isGenerica()){
            presio_final *= .80;
          //  super.setPrecio(presio_final);//el precio tendra descuento del 20%
        }
      
       return presio_final*cantidad;
    }
    
    @Override
    public final float promocion(int cantidad){
        float presio_final = super.getPrecio();
        if(cantidad>3){
            presio_final *= .90;
          //  super.setPrecio(presio_final);//el precio tendra un descuento del 90%
        }
      
       return presio_final*cantidad;
    }
    
    
    


}
