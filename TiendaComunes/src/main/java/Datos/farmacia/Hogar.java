
package Datos.farmacia;


final public class Hogar extends Farmacia {
    
    private boolean quimico;
    private boolean biodegradable;
    private String modoDeUso;

    public boolean isQuimico() {
        return quimico;
    }

    public void setQuimico(boolean quimico) {
        this.quimico = quimico;
    }

    public boolean isBiodegradable() {
        return biodegradable;
    }

    public void setBiodegradable(boolean biodegradable) {
        this.biodegradable = biodegradable;
    }

    public String getModoDeUso() {
        return modoDeUso;
    }

    public void setModoDeUso(String modoDeUso) {
        this.modoDeUso = modoDeUso;
    }

    public Hogar() {
        super();
        this.quimico = false;
        this.biodegradable = false;
        this.modoDeUso = " ni idea pai ";
    }

    public Hogar(String caducidad , boolean quimico, boolean biodegradable, String modoDeUso, float contenido, String restr, String us0, int codigo, String nombre, String empresa, float precio, String desp) {
        super(caducidad, contenido, restr, us0, codigo, nombre, empresa, precio, desp);
        this.quimico = quimico;
        this.biodegradable = biodegradable;
        this.modoDeUso = modoDeUso;
    }
   
   

      @Override
    public String toString() {
        String gen = this.isQuimico()? "SI":"NO";
        String gen2 = this.isBiodegradable()? "SI":"NO";
        String info_farmacia = super.toString(); 
        String info_hogar = info_farmacia + " Modo de uso: "  + this.getModoDeUso()+ "\n" +
                 "Es quimico: " + gen2 + "\n" 
                 + "Es biodegradable: " + gen + "\n" ;
        
        return  info_hogar; 

    }
    
     //OVERRIDE DE METODOS ABSTRACTOS
    
    @Override
    public final float valorTotalProducto(int cantidad){
       return super.getPrecio()*cantidad;
    }
    
    @Override
    public final float promocion(int cantidad){
         float presio_final = super.getPrecio();
        if(this.isQuimico() && cantidad>2){
           
            presio_final *= 1.50; //aumenta un 150%
           // super.setPrecio(presio_final);
            
        }
        else if(this.isBiodegradable() && this.isQuimico()==false){
            presio_final *= .75; //descuento del 25%
           // super.setPrecio(presio_final);
        }
       
        return presio_final*cantidad;
    }
    
    

}
