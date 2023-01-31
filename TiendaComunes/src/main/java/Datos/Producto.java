
package Datos;


public abstract class  Producto {
    private int codigo;
    private String nombre;
    private String empresa;
    private float precio;
    private String descripcion;
    
    // SETTERS AND GETTERS
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    // CONSTRUTORES
    
    public Producto(){
        this(0, "Desconocido", "Desconocida", 0, "");
    }
    
    public Producto(int codigo){
        this(codigo, "Desconocido", "Desconocida", 0, "");
    }
    
    public Producto(int codigo, String nombre){ 
        this(codigo, nombre, "Desconocida", 0, "");
    }
    
    public Producto(int codigo, String nombre, String empresa){
        this(codigo, nombre, empresa, 0, "");
    }
    
    public Producto(int codigo, String nombre, String empresa, float precio){
        this(codigo, nombre, empresa, precio, "");
    }
    public Producto(int codigo, String nombre, String empresa, float precio, String desp){
        this.codigo =  codigo;
        this.nombre = nombre;
        this.empresa= empresa;
        this.precio = precio;
        this.descripcion = desp;
    }
    
    @Override
    public String toString(){
        String presio = String.valueOf(this.getCodigo());
        String cad = "Nombre del producto: " + this.getNombre() + "\n"
                + "Codigo: " + presio+ "\n" + 
                "Empresa productora: " + this.getEmpresa() + "\n" +
                "Descripcion: "+ this.getDescripcion()+"\n"
                + "Precio del producto: " + this.getPrecio()+"\n";
        return cad;
    }
    

    public abstract float valorTotalProducto(int cantidad);
    public abstract float promocion (int cantidad);

}
