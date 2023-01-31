
package Datos;

public class Compra {
    private int codigo;
    private String fecha;
    private String factura;
    private Cliente comprador;
    
    
    // GETTERS AND SETTERS
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getFactura() {
        return factura;
    }

    public void setFactura(String factura) {
        this.factura = factura;
    }

    public Cliente getComprador() {
        return comprador;
    }

    public void setComprador(Cliente comprador) {
        this.comprador = comprador;
    }
    
    // CONSTRUCTORES
    public Compra(int codigo, String fecha, String factura, Cliente comprador) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.factura = factura;
        this.comprador = comprador;
    }

    public Compra() {       
       this(0," Compra Fallida", " La compra ha sido rechazada por: \n 1. Dinero insuficiente \n 2. Stock insuficiente ", new Cliente());
    }
    
    

    @Override
    public String toString() {
        String generado = "fecha= " + this.getFecha() +"\n" + ", factura= " + this.getFactura()+"\n";
        return generado;
    }
    
}
