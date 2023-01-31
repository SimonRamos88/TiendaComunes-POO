
package Datos.comestibles;


final public class Lacteos extends Refrigerado{
    
    private boolean deslactosado;
    private boolean industrial;
    private String aditivos;
    
    // MÉTODOS SOBREESCRITOS HEREDADOS
    
    @Override
    public float valorTotalProducto(int cantidad){
        float precio = this.getPrecio();
        float precioDocenaYMedia = precio - (precio/12);
        
        float total = 0;
        
        if (cantidad >= 12){
            int cantidadDocenas = ( cantidad - (cantidad%12) ) / 12;
            total += cantidadDocenas*precioDocenaYMedia*12;
            cantidad %= 12;
        }
        
        if(cantidad >= 6){
            int cantidadMedias =  ( cantidad - (cantidad%6) ) / 6;
            total += cantidadMedias*precioDocenaYMedia*6;
            cantidad %= 6;
        
        }      
 
        total += precio*cantidad;
        
        return total;
    }
    
    @Override
    public float promocion (int cantidad){
        float precio = valorTotalProducto(cantidad); 
        
        if (cantidad >= 85) {
            precio -= (precio * 25) / 100;
 
        }else if (cantidad >= 70){
            precio -= (precio * 15) / 100;

        }else if (cantidad >=  50){
            precio -= (precio * 10) / 100;
     
        }    
        
        return precio;
    }
    
    //GETTERS AND SETTERS

    public boolean isDeslactosado() {
        return deslactosado;
    }

    public void setDeslactosado(boolean deslactosado) {
        this.deslactosado = deslactosado;
    }

    public boolean isIndustrial() {
        return industrial;
    }

    public void setIndustrial(boolean industrial) {
        this.industrial = industrial;
    }

    public String getAditivos() {
        return aditivos;
    }

    public void setAditivos(String aditivos) {
        this.aditivos = aditivos;
    }
    
    // CONSTRUCTORES
        
    public Lacteos(boolean deslactosado, boolean industrial, String aditivos, float temperatura, 
            String procedencia, int cadena,String vencimiento, float peso, int unidadesVenta,
            float calorias,int codigo, String nombre, String empresa, float precio, String desp){
        
        super(temperatura, procedencia, cadena,vencimiento, peso, unidadesVenta, 
                calorias, codigo, nombre, empresa, precio, desp);
        this.deslactosado = deslactosado;
        this.industrial = industrial;
        this.aditivos = aditivos;
    }
    
    public Lacteos(boolean deslactosado, boolean industrial, String aditivos){
        super();
        this.deslactosado = deslactosado;
        this.industrial = industrial;
        this.aditivos = aditivos;
    }
       
    public Lacteos(){
        this(true, true, "Desconocidos");
    }
    
    @Override
    public String toString(){
        String cad = super.toString();
        cad += "Deslactosada: " + this.deslactosado + " Producción industrial: "
                + this.industrial + " Aditivos del produtco: " + this.aditivos;
        return cad;
    }
    
   
}
