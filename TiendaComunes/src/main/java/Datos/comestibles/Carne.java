
package Datos.comestibles;

final public class Carne extends Refrigerado{
    
    private String corteAnimal;
    private boolean importado;
    private String tipo;
    
    // MÉTODOS SOBREESCRITOS HEREDADOS
    
    @Override
    public float valorTotalProducto(int cantidad){
        float precio = this.getPrecio();
        float total = cantidad * precio;
        return total;
    }
    
    @Override
    public float promocion (int cantidad){
        float precio = valorTotalProducto(cantidad); 
        
        if (cantidad >= 100) {
            precio -= (precio * 25) / 100;
 
        }else if (cantidad >= 80){
            precio -= (precio * 15) / 100;

        }else if (cantidad >=  50){
            precio -= (precio * 10) / 100;
     
        }    
        
        return precio;
    }
    
    //GETTERS AND SETTERS

    public String getCorteAnimal() {
        return corteAnimal;
    }

    public void setCorteAnimal(String corteAnimal) {
        this.corteAnimal = corteAnimal;
    }

    public boolean isImportado() {
        return importado;
    }

    public void setImportado(boolean importado) {
        this.importado = importado;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    //CONSTRUCTORES
    
    public Carne(String corteAnimal, boolean importado, String tipo, float temperatura, 
            String procedencia, int cadena,String vencimiento, float peso, int unidadesVenta,
            float calorias,int codigo, String nombre, String empresa, float precio, String desp) {
        
        super(temperatura, procedencia, cadena,vencimiento, peso, unidadesVenta, 
                calorias, codigo, nombre, empresa, precio, desp);
        this.corteAnimal = corteAnimal;
        this.importado = importado;
        this.tipo = tipo;
    }
    
    public Carne(String corteAnimal, boolean importado, String tipo) {
        super();
        this.corteAnimal = corteAnimal;
        this.importado = importado;
        this.tipo = tipo;
    }
    
    public Carne(){
        this("Desconocido", false, "Desconocido");
    }
    
    @Override
    public String toString(){
        String cad = super.toString();
        cad += "Corte de la Carne: " + this.corteAnimal + " Importada: " + this.importado
        + " Tipo de carne: " + this.tipo;
        return cad;
    }
    
  
}
