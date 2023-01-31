
package Datos.comestibles;


import java.lang.Math;

final public class Calientes extends Bebida{

    
    private boolean tradicional;
    private float nivelAzucar;
    private boolean instantaneo;
    
    
    // MÉTODOS SOBREESCRITOS HEREDADOS
    
    @Override
    public float valorTotalProducto(int cantidad){
        
        float precio = this.getPrecio();
        float peso = this.getPeso();
        float valorBulto = ( (10*precio) / peso ) - 7000;
        
        int pesoCantidad = Math.round(peso*cantidad);
        int cantidadBultos = (pesoCantidad - (pesoCantidad%10) ) /10;
        
        //System.out.println("Cantidad " + cantidadBultos);
        float pesoSobrante = pesoCantidad%10;
        
        float total = 0;
        if (cantidadBultos >= 5){
            System.out.println("Operacion " + (cantidadBultos - (cantidadBultos%5) ) / 5);
            total = ( (cantidadBultos - (cantidadBultos%5) ) ) * (valorBulto - 40000);
            cantidadBultos %= 5;
            System.out.println("Entro, total " + total);
            
        }
        total += valorBulto*cantidadBultos;
        //System.out.println(pesoSobrante);
        total += (pesoSobrante*precio) / peso;
        
        return total;
    }
    
    @Override
    public float promocion (int cantidad){
       float precio = valorTotalProducto(cantidad); 
        
        if (cantidad >= 140) {
            precio -= (precio * 35) / 100;
 
        }else if (cantidad >= 115){
            precio -= (precio * 30) / 100;

        }else if (cantidad >=  100){
            precio -= (precio * 27) / 100;
     
        }    
        
        return precio;
    }
    
    //GETTERS AND SETTERS

    public boolean isTradicional() {
        return tradicional;
    }

    public void setTradicional(boolean tradicional) {
        this.tradicional = tradicional;
    }

    public float getNivelAzucar() {
        return nivelAzucar;
    }

    public void setNivelAzucar(float nivelAzucar) {
        this.nivelAzucar = nivelAzucar;
    }

    public boolean isInstantaneo() {
        return instantaneo;
    }

    public void setInstantaneo(boolean instantaneo) {
        this.instantaneo = instantaneo;
    }
    
    //CONSTRUCTORES
    
    public Calientes(boolean tradicional, float nivelAzucar, boolean instantaneo,
        float contenido, String empaquetado, boolean origenNatural,String vencimiento, 
        float peso, int unidadesVenta, float calorias,int codigo, String nombre, 
        String empresa, float precio, String desp){     
        
        super(contenido, empaquetado, origenNatural, vencimiento, peso, unidadesVenta, 
                calorias, codigo, nombre, empresa, precio, desp);
        this.tradicional = tradicional;
        this.nivelAzucar = nivelAzucar;
        this.instantaneo = instantaneo;
    }
    
    public Calientes(boolean tradicional, float nivelAzucar, boolean instantaneo){          
        super();
        this.tradicional = tradicional;
        this.nivelAzucar = nivelAzucar;
        this.instantaneo = instantaneo;
    }
    
    public Calientes(){
        this(true,0,true);
    }
    
    @Override
    public String toString(){
        String cad = super.toString();
        cad += "Sabor Tradicional: " + this.tradicional + " Nivel de azúcar gr: " + this.nivelAzucar+
                " Bebida instantanea: " + this.instantaneo;
        return cad;
        
    }
    
   
}
