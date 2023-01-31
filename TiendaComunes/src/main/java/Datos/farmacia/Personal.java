
package Datos.farmacia;


final public class Personal extends Farmacia {
    
    private int edadRecomendada;
    private String zonaCuerpo;
    private boolean unisex;
    

    public int getEdadRecomendada() {
        return edadRecomendada;
    }

    public void setEdadRecomendada(int edadRecomendada) {
        this.edadRecomendada = edadRecomendada;
    }

    public String getZonaCuerpo() {
        return zonaCuerpo;
    }

    public void setZonaCuerpo(String zonaCuerpo) {
        this.zonaCuerpo = zonaCuerpo;
    }

    public boolean isUnisex() {
        return unisex;
    }

    public void setUnisex(boolean unisex) {
        this.unisex = unisex;
    }

    public Personal() {
        super();
        this.edadRecomendada = 0;
        this.zonaCuerpo = "ninguna";
        this.unisex = false;
    }

    public Personal(String caducidad ,int edadRecomendada, String zonaCuerpo, boolean unisex, float contenido, String restr, String us0, int codigo, String nombre, String empresa, float precio, String desp) {
        super(caducidad ,contenido, restr, us0, codigo, nombre, empresa, precio, desp);
        this.edadRecomendada = edadRecomendada;
        this.zonaCuerpo = zonaCuerpo;
        this.unisex = unisex;
    }
    
 
        @Override
    public String toString() {
        String gen = this.isUnisex()? "SI":"NO";
        String info_farmacia = super.toString(); 
        String info_per = info_farmacia + "Edad recomendada: " + this.getEdadRecomendada()+ "\n" +
                 "Zona del cuerpo:" + this.getZonaCuerpo()+ "\n" +
                "Es unisex: " + gen + "\n" ;
        return  info_per; 

    }
    
     //OVERRIDE DE METODOS ABSTRACTOS
    
    @Override
    public final float valorTotalProducto(int cantidad){
      float presio_final = super.getPrecio();
        if(this.isUnisex()==false){
            presio_final *= 1.05;
          //  super.setPrecio(presio_final);//el precio subirá un 5%
        }
      
       return presio_final*cantidad;
    }
    
    @Override
    public final float promocion(int cantidad){
        float presio_final = super.getPrecio();
        if(cantidad>5){
            presio_final *= .97;
         //  super.setPrecio(presio_final);//el precio tendrá un descuento del 3%
        }
      
       return presio_final*cantidad;
    }

   
}
