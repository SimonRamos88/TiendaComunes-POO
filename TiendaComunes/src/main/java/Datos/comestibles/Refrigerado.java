
package Datos.comestibles;

public abstract class Refrigerado extends Comestible{
    
    private float temperaturaMinima;
    private String procedenciaAnimal; 
    private int cadenaFrio;
    
    //GETTERS AND SETTERS

    public float getTemperaturaMinima() {
        return temperaturaMinima;
    }

    public void setTemperaturaMinima(float temperaturaMinima) {
        this.temperaturaMinima = temperaturaMinima;
    }

    public String getProcedenciaAnimal() {
        return procedenciaAnimal;
    }

    public void setProcedenciaAnimal(String procedenciaAnimal) {
        this.procedenciaAnimal = procedenciaAnimal;
    }

    public int getCadenaFrio() {
        return cadenaFrio;
    }

    public void setCadenaFrio(int cadenaFrio) {
        this.cadenaFrio = cadenaFrio;
    }
    
    // CONSTRUCTORES
    
    protected Refrigerado(float temperatura, String procedencia, int cadena,
            String vencimiento, float peso, int unidadesVenta, float calorias,
            int codigo, String nombre, String empresa, float precio, String desp){
        
        super(vencimiento, peso, unidadesVenta, calorias, codigo, nombre, empresa,
                precio, desp);
        this.temperaturaMinima = temperatura;
        this.procedenciaAnimal = procedencia;
        this.cadenaFrio = cadena;
    }
    
    protected Refrigerado(float temperatura, String procedencia, int cadena){
        super();
        this.temperaturaMinima = temperatura;
        this.procedenciaAnimal = procedencia;
        this.cadenaFrio = cadena;
    }
    
    protected Refrigerado(){
        this(0, "Desconocido", 0);
    }
    
    @Override
    public String toString(){
        String cad = super.toString();
        cad += "Temperatura mínima centigrados: " + this.temperaturaMinima + " Procedencia Animal: "
                + this.procedenciaAnimal + " cadena de frío del alimento: " + this.cadenaFrio + "minutos\n";
        return cad;
    }
    
    
}
