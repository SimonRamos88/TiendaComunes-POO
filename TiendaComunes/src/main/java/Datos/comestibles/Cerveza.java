
package Datos.comestibles;

import java.util.ArrayList;


final public class Cerveza extends Bebida{

    
    private float gradoAlcohol;
    private String ingredientes;
    private String tipoFermentacion;
    
    // METODOS PROPIOS
    
    public int[] SixPack( int cantidad, int[] six){
        
        if(cantidad < 6){
            return six;
            
        }else if( cantidad >= 24){
            cantidad = cantidad - 24;
            int cantidadPacks = six[1];
            cantidadPacks +=1;
            six[1] = cantidadPacks ;
            return SixPack(cantidad,six);
            
        }else{
            cantidad -= 6;
            int cantidadSixs = six[0];
            cantidadSixs += 1;
            six[0] = cantidadSixs;        
            return SixPack(cantidad,six);
               
        }
    }
    // SOBREESCRITURA METODOS HEREDADOS
    
    @Override
    
    public final float valorTotalProducto(int cantidad){
        
        float precio = this.getPrecio();
        float precioSix = precio - 600;
        float precioPack = precio-1200;    
        int excedente = cantidad%6;
        
        float total = precio*excedente;
        
        int[] polas = {0,0};
 
        int[] polasTotal = SixPack(cantidad,polas);

        total += precioSix * (polasTotal[0] * 6); 
        total += precioPack * (polasTotal[1] * 24);
        

        return total;
    }
    
    @Override
    
    public final float promocion(int cantidad){     
        float precio = valorTotalProducto(cantidad); 
        
        if (cantidad >= 120) {
            precio -= (precio * 30) / 100;
            
        }else if (cantidad >= 80){
            precio -= (precio * 25) / 100;
            
        }else if (cantidad >= 72){
            precio -= (precio * 15) / 100;
 
        }    
        
        return precio;
    }
    //GETTERS AND SETTERS

    public float getGradoAlcohol() {
        return gradoAlcohol;
    }

    public void setGradoAlcohol(float gradoAlcohol) {
        this.gradoAlcohol = gradoAlcohol;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public String getTipoFermentacion() {
        return tipoFermentacion;
    }

    public void setTipoFermentacion(String tipoFermentacion) {
        this.tipoFermentacion = tipoFermentacion;
    }
    
    //CONSTRUCTORES
    
    public Cerveza(float grado, String ingredientes, String fermentacion, 
           float contenido, String empaquetado, boolean origenNatural,String vencimiento, 
            float peso, int unidadesVenta, float calorias,int codigo, String nombre, 
            String empresa, float precio, String desp){
        
        super(contenido, empaquetado, origenNatural, vencimiento, peso, unidadesVenta, 
                calorias, codigo, nombre, empresa, precio, desp);
        this.gradoAlcohol = grado;
        this.ingredientes = ingredientes;
        this.tipoFermentacion = fermentacion; 
    }
    
    
    public Cerveza(float grado, String ingredientes, String fermentacion){
        super();
        this.gradoAlcohol = grado;
        this.ingredientes = ingredientes;
        this.tipoFermentacion = fermentacion; 
    }
    
    public Cerveza(){
        this(0,"Desconocidos", "Desconocido");
    }
    
    @Override
    public String toString(){
        String cad = super.toString();
        cad += "Grado alcohol: " + this.gradoAlcohol + " Ingredientes: " + 
                this.ingredientes + " Tipo de fermentación: "+ this.tipoFermentacion;
        return cad;
    }
    
 
    
}
