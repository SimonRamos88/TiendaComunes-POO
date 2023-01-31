
package UI;

import java.util.ArrayList;

import java.util.Scanner;

import Datos.Producto;


public class Menu {

    public boolean BuscarCadena(String buscando, String recurso){
        char[] recursoArray = recurso.toCharArray();
        char[] buscandoArray = buscando.toCharArray();
        
        int limit = recursoArray.length -buscandoArray.length;
        int i = 0;
        boolean bandera = false;
        
        while( (i <= limit) && !bandera ){
            int j = 0;        
            while( j< buscandoArray.length && !bandera ){            
                if( buscandoArray[j] != recursoArray[j+i] ){
                    bandera = true;                 
                }
                j ++;
            }    
            bandera = !bandera;
            i ++;
        }
     return bandera;
    }
    
    public ArrayList<String> Buscar(String caracter, ArrayList<Producto> repo){
        ArrayList<String> productos = new ArrayList();
        int n = repo.size();
        for(int i=0; i<n; i++){
            Producto producto = repo.get(i);
            if( BuscarCadena(caracter, producto.getNombre()) ){
                productos.add((i+1) + ". " + producto.getNombre());
            }
        }
        
        return productos;
    }

    public void MostrarMain(){
        System.out.println(" ".repeat(18) + "/// BIENVENID@ A LA TIENDA ECOMUN \\\\\\");
        System.out.println("|| Por favor selecciona una de las siguientes opciones"
                + "para ir a una sección en el catálogo ||");
        System.out.println(" 0. Salir\n 1. Comestible\n 2. Textiles\n 3. Farmacia\n 4. Buscar");

    }


    public void MostrarTipo(String navegante){ 
        Scanner sc = new Scanner(System.in);
        int salir = 1;
        while(salir!=0){
            MostrarMain();
            System.out.println("Ingrese la opción que desea:");
            int bandera = sc.nextInt();
            int bandera2 = 1;
            if(bandera==1){
                while (bandera2!=0){
                    System.out.println("|| Por favor selecciona una de las siguientes opciones"
                        + "para ir a un tipo de producto en específico ||");
                    System.out.println(" 1. Bebidas\n 2. Refrigerados");
                    bandera2 = sc.nextInt();
                    if(bandera2==1){
                        System.out.println("Bebidas disponibles");
                    }
                }
            } else if(bandera == 2){
                System.out.println(" ".repeat(30) + "/// SECCIÓN TEXTILES \\\\\\");
                System.out.println("|| Por favor selecciona una de las siguientes opciones"
                        + "para ir a un tipo de producto en específico ||");
                System.out.println(" 1. Ropa\n 2. Morrales");
            } else if(bandera == 3){
                System.out.println(" ".repeat(30) + "/// SECCIÓN FARMACIA \\\\\\");
                System.out.println("|| Por favor selecciona una de las siguientes opciones"
                        + "para ir a un tipo de producto en específico ||");
                System.out.println(" 1. Medicamento\n 2. Aseo");
            } else if(bandera == 4){
                System.out.println(" ".repeat(7) + "/// BUSQUEDA \\\\\\");
                System.out.print("|| Ingrese el nombre del producto: ||");
            }
            else if(bandera != 0){
                System.out.println(" ".repeat(7) + "/// OPCIÓN NO DISPONIBLE \\\\\\");
            }
        }
        System.out.println(" ".repeat(18) + "/// GRACIAS POR USAR NUESTROS SERVICIOS \\\\\\");

    



    }
}
