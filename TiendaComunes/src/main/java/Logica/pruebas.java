
package Logica;

import Datos.*;
import Datos.comestibles.*;
import Datos.farmacia.*;
import Datos.Textil.*;
import UI.*;
import java.util.ArrayList;
import java.util.Scanner;
import Datos.Textil.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class pruebas {
    
    static Cliente cliente_actual = new Cliente(24344, "Pepito flores", 150000f, new HashMap<Integer,Compra>());
    static Carrito carrito_actual = new Carrito(0, cliente_actual, new HashMap<Producto,Integer>());
    
    public static void main(String[] arqs){
        ArrayList<Chaqueta> chaquetas = Instancias.chaquetas;
        ArrayList<Sombrero> sombreros = Instancias.sombreros;
        ArrayList<Morral> morrales = Instancias.morrales;
        ArrayList<Tula> tulas = Instancias.tulas;
        ArrayList<Cerveza> cervezas = Instancias.cervezas;
        ArrayList<Calientes> calientes = Instancias.bebidasCalientes;
        ArrayList<Carne> carnes = Instancias.carnes;
        ArrayList<Lacteos> lacteos = Instancias.bebidasLacteas;
        ArrayList<Producto> productos = Instancias.CrearMegaArreglo(Instancias.todosProductos);
        
        Transacciones transaccion = new Transacciones();
        transaccion.setCarrito_actual(carrito_actual);
        transaccion.setCliente_actual(cliente_actual);
        
        
        Scanner sc = new Scanner(System.in);
        Scanner sx = new Scanner(System.in);
        Map<Producto, Integer> carritoCompra = new HashMap<Producto, Integer>();
        int seccion = 1;
        while(seccion != 0){
            MostrarMain();
            System.out.println("Ingrese la opción que desea:");
            seccion = sc.nextInt();
            int seccion2 = 1;
            if(seccion == 1){
                while (seccion2 != 0){
                    System.out.println(" ".repeat(30) + "/// SECCIÓN COMESTIBLES \\\\\\");
                    System.out.println("|| Por favor selecciona una de las siguientes opciones"
                            + " para ir a un tipo de comestible en específico ||");
                    System.out.println(" 1. Bebidas\n 2. Refrigerados \n 0. Volver");
                    System.out.println("Ingrese la opción que desea:");
                    seccion2 = sc.nextInt();
                    int seccion3 = 1;
                    if(seccion2 == 1){
                        while(seccion3 != 0){
                            System.out.println(" ".repeat(30) + "/// BEBIDAS \\\\\\");
                            System.out.println("|| Por favor selecciona una de las siguientes opciones"
                            + " para ir a un tipo de bebida en específico ||");
                            System.out.println(" 1. Cervezas\n 2. Bebidas calientes \n 0. Volver");
                            System.out.println("Ingrese la opción que desea:");
                            seccion3 = sc.nextInt();
                            int seccion4 =1;
                            if(seccion3 == 1){
                                System.out.println(" ".repeat(30) + "/// CERVEZAS DISPONIBLES \\\\\\");
                                for (int i=0;i<cervezas.size();i++){
                                    System.out.println(" "+ (i+1) +"."+ cervezas.get(i).getNombre());
                                }
                                System.out.println(" 0. Volver");
                                System.out.println("Ingrese el producto que desea detallar:");
                                seccion4 = sc.nextInt();
                                int seccion5 = 1; 
                                if(seccion4 == 0){
                                    seccion5 = 0;
                                }
                                
                                while (seccion4 > cervezas.size() || seccion4<0){
                                    System.out.println("Producto no válido, vuelvalo a intentar:");
                                    seccion4 = sc.nextInt();
                                }
                                while (seccion5 != 0){
                                    System.out.println(" ".repeat(30) + "/// DETALLES PRODUCTO \\\\\\");
                                    System.out.println(cervezas.get(seccion4-1).toString());
                                    System.out.println(" 1. Comprar\n 0. Volver");
                                    seccion5 = sc.nextInt();
                                    if(seccion5 == 1){
                                        System.out.println("Ingrese la cantidad del producto que quiere comprar:");
                                        int cantidadProducto = sc.nextInt();
                                        transaccion.AniadirCarro(cervezas.get(seccion4-1),cantidadProducto);
                                        seccion5=0;
                                        seccion4=0;
                                        seccion3=0;
                                        seccion2=0;
                                        System.out.println(" ".repeat(30) + "/// PRODUCTO AGREGADO CON ÉXITO \\\\\\");
                                    }else if (seccion5 != 0){
                                        System.out.println(" ".repeat(7) + "/// OPCIÓN NO DISPONIBLE \\\\\\");
                                    }
                                }   
                            }else if(seccion3 == 2){
                                System.out.println(" ".repeat(30) + "/// BEBIDAS CALIENTES DISPONIBLES \\\\\\");
                                for (int i=0;i<calientes.size();i++){
                                    System.out.println(" "+ (i+1) +"."+ calientes.get(i).getNombre());
                                }
                                System.out.println(" 0. Volver");
                                System.out.println("Ingrese el producto que desea detallar:");
                                seccion4 = sc.nextInt();
                                int seccion5 = 1; 
                                if(seccion4 == 0){
                                    seccion5 = 0;
                                }
                                
                                while (seccion4 > calientes.size() || seccion4<0){
                                    System.out.println("Producto no válido, vuelvalo a intentar:");
                                    seccion4 = sc.nextInt();
                                }
                                while (seccion5 != 0){
                                    System.out.println(" ".repeat(30) + "/// DETALLES PRODUCTO \\\\\\");
                                    System.out.println(calientes.get(seccion4-1).toString());
                                    System.out.println(" 1. Comprar\n 0. Volver");
                                    seccion5 = sc.nextInt();
                                    if(seccion5 == 1){
                                        System.out.println("Ingrese la cantidad del producto que quiere comprar:");
                                        int cantidadProducto = sc.nextInt();
                                        transaccion.AniadirCarro(calientes.get(seccion4-1),cantidadProducto);
                                        seccion5=0;
                                        seccion4=0;
                                        seccion3=0;
                                        seccion2=0;
                                        System.out.println(" ".repeat(30) + "/// PRODUCTO AGREGADO CON ÉXITO \\\\\\");
                                    }else if (seccion5 != 0){
                                        System.out.println(" ".repeat(7) + "/// OPCIÓN NO DISPONIBLE \\\\\\");
                                    }
                                }     
                            }else if(seccion3 != 0){
                                System.out.println(" ".repeat(7) + "/// OPCIÓN NO DISPONIBLE \\\\\\");
                            }
                        }
                    }else if(seccion2 == 2){
                        while(seccion3 != 0){
                            System.out.println(" ".repeat(30) + "/// REFRIGERADOS \\\\\\");
                            System.out.println("|| Por favor selecciona una de las siguientes opciones"
                            + " para ir a un tipo de refrigeraod en específico ||");
                            System.out.println(" 1. Carnes\n 2. Lacteos \n 0. Volver");
                            System.out.println("Ingrese la opción que desea:");
                            seccion3 = sc.nextInt();
                            int seccion4 =1;
                            if(seccion3 == 1){
                                System.out.println(" ".repeat(30) + "/// CARNES DISPONIBLES \\\\\\");
                                for (int i=0;i<carnes.size();i++){
                                    System.out.println(" "+ (i+1) +"."+ carnes.get(i).getNombre());
                                }
                                System.out.println(" 0. Volver");
                                System.out.println("Ingrese el producto que desea detallar:");
                                seccion4 = sc.nextInt();
                                int seccion5 = 1; 
                                if(seccion4 == 0){
                                    seccion5 = 0;
                                }
                                
                                while (seccion4 > carnes.size() || seccion4<0){
                                    System.out.println("Producto no válido, vuelvalo a intentar:");
                                    seccion4 = sc.nextInt();
                                }
                                while (seccion5 != 0){
                                    System.out.println(" ".repeat(30) + "/// DETALLES PRODUCTO \\\\\\");
                                    System.out.println(carnes.get(seccion4-1).toString());
                                    System.out.println(" 1. Comprar\n 0. Volver");
                                    seccion5 = sc.nextInt();
                                    if(seccion5 == 1){
                                        System.out.println("Ingrese la cantidad del producto que quiere comprar:");
                                        int cantidadProducto = sc.nextInt();
                                        transaccion.AniadirCarro(carnes.get(seccion4-1),cantidadProducto);
                                        seccion5=0;
                                        seccion4=0;
                                        seccion3=0;
                                        seccion2=0;
                                        System.out.println(" ".repeat(30) + "/// PRODUCTO AGREGADO CON ÉXITO \\\\\\");
                                    }else if (seccion5 != 0){
                                        System.out.println(" ".repeat(7) + "/// OPCIÓN NO DISPONIBLE \\\\\\");
                                    }
                                }   
                            }else if(seccion3 == 2){
                                System.out.println(" ".repeat(30) + "/// LACTEOS DISPONIBLES \\\\\\");
                                for (int i=0;i<lacteos.size();i++){
                                    System.out.println(" "+ (i+1) +"."+ lacteos.get(i).getNombre());
                                }
                                System.out.println(" 0. Volver");
                                System.out.println("Ingrese el producto que desea detallar:");
                                seccion4 = sc.nextInt();
                                int seccion5 = 1; 
                                if(seccion4 == 0){
                                    seccion5 = 0;
                                }
                                
                                while (seccion4 > lacteos.size() || seccion4<0){
                                    System.out.println("Producto no válido, vuelvalo a intentar:");
                                    seccion4 = sc.nextInt();
                                }
                                while (seccion5 != 0){
                                    System.out.println(" ".repeat(30) + "/// DETALLES PRODUCTO \\\\\\");
                                    System.out.println(lacteos.get(seccion4-1).toString());
                                    System.out.println(" 1. Comprar\n 0. Volver");
                                    seccion5 = sc.nextInt();
                                    if(seccion5 == 1){
                                        System.out.println("Ingrese la cantidad del producto que quiere comprar:");
                                        int cantidadProducto = sc.nextInt();
                                        transaccion.AniadirCarro(lacteos.get(seccion4-1),cantidadProducto);
                                        seccion5=0;
                                        seccion4=0;
                                        seccion3=0;
                                        seccion2=0;
                                        System.out.println(" ".repeat(30) + "/// PRODUCTO AGREGADO CON ÉXITO \\\\\\");
                                    }else if (seccion5 != 0){
                                        System.out.println(" ".repeat(7) + "/// OPCIÓN NO DISPONIBLE \\\\\\");
                                    }
                                }     
                            }else if(seccion3 != 0){
                                System.out.println(" ".repeat(7) + "/// OPCIÓN NO DISPONIBLE \\\\\\");
                            }
                        }
                    }else if(seccion2 != 0){
                        System.out.println(" ".repeat(7) + "/// OPCIÓN NO DISPONIBLE \\\\\\");
                    }
                }
                
                
                
            } else if(seccion == 2){
                
                //farmacia

                while (seccion2 != 0){
                    System.out.println(" ".repeat(30) + "/// SECCIÓN TEXTILES \\\\\\");
                    System.out.println("|| Por favor selecciona una de las siguientes opciones"
                            + " para ir a un tipo de textil en específico ||");
                    System.out.println(" 1. Ropa \n 2. Maletines \n 0. Volver");
                    System.out.println("Ingrese la opción que desea:");
                    seccion2 = sc.nextInt();
                    int seccion3 = 1;
                    if(seccion2 == 1){
                        while(seccion3 != 0){
                            System.out.println(" ".repeat(30) + "/// ROPA \\\\\\");
                            System.out.println("|| Por favor selecciona una de las siguientes opciones"
                            + " para ir a un tipo de bebida en específico ||");
                            System.out.println(" 1. Chaquetas\n 2. Sombreros\n 0. Volver");
                            System.out.println("Ingrese la opción que desea:");
                            seccion3 = sc.nextInt();
                            int seccion4 =1;
                            if(seccion3 == 1){
                                System.out.println(" ".repeat(30) + "/// CHAQUETAS DISPONIBLES \\\\\\");
                                for (int i=0;i<cervezas.size();i++){
                                    System.out.println(" "+ (i+1) +"."+ chaquetas.get(i).getNombre());
                                }
                                System.out.println(" 0. Volver");
                                System.out.println("Ingrese el producto que desea detallar:");
                                seccion4 = sc.nextInt();
                                while (seccion4 > chaquetas.size()){
                                    System.out.println("Producto no válido, vuelvalo a intentar:");
                                    seccion4 = sc.nextInt();
                                }
                                int seccion5 = 1;
                                while (seccion5 != 0){
                                    System.out.println(" ".repeat(30) + "/// DETALLES PRODUCTO \\\\\\");
                                    System.out.println(chaquetas.get(seccion4-1).toString());
                                    System.out.println(" 1. Comprar\n 0. Volver");
                                    seccion5 = sc.nextInt();
                                    if(seccion5 == 1){
                                        System.out.println("Ingrese la cantidad del producto que quiere comprar:");
                                        int cantidadProducto = sc.nextInt();
                                        transaccion.AniadirCarro(chaquetas.get(seccion4-1),cantidadProducto);
                                        seccion5=0;
                                        seccion4=0;
                                        seccion3=0;
                                        seccion2=0;
                                        System.out.println(" ".repeat(30) + "/// PRODUCTO AGREGADO CON ÉXITO \\\\\\");
                                    }else if (seccion5 != 0){
                                        System.out.println(" ".repeat(7) + "/// OPCIÓN NO DISPONIBLE \\\\\\");
                                    }
                                }   
                            }else if(seccion3 == 2){
                                System.out.println(" ".repeat(30) + "/// SOMBREROS DISPONIBLES \\\\\\");
                                for (int i=0;i<sombreros.size();i++){
                                    System.out.println(" "+ (i+1) +"."+ sombreros.get(i).getNombre());
                                }
                                System.out.println(" 0. Volver");
                                System.out.println("Ingrese el producto que desea detallar:");
                                seccion4 = sc.nextInt();
                                while (seccion4 > chaquetas.size()){
                                    System.out.println("Producto no válido, vuelvalo a intentar:");
                                    seccion4 = sc.nextInt();
                                }
                                int seccion5 = 1;
                                while (seccion5 != 0){
                                    System.out.println(" ".repeat(30) + "/// DETALLES PRODUCTO \\\\\\");
                                    System.out.println(sombreros.get(seccion4-1).toString());
                                    System.out.println(" 1. Comprar\n 0. Volver");
                                    seccion5 = sc.nextInt();
                                    if(seccion5 == 1){
                                        System.out.println("Ingrese la cantidad del producto que quiere comprar:");
                                        int cantidadProducto = sc.nextInt();
                                        transaccion.AniadirCarro(sombreros.get(seccion4-1),cantidadProducto);
                                        seccion5=0;
                                        seccion4=0;
                                        seccion3=0;
                                        seccion2=0;
                                        System.out.println(" ".repeat(30) + "/// PRODUCTO AGREGADO CON ÉXITO \\\\\\");
                                    }else if (seccion5 != 0){
                                        System.out.println(" ".repeat(7) + "/// OPCIÓN NO DISPONIBLE \\\\\\");
                                    }
                                }    
                            }else if(seccion3 != 0){
                                System.out.println(" ".repeat(7) + "/// OPCIÓN NO DISPONIBLE \\\\\\");
                            }
                        }
                    }else if(seccion2 == 2){
                        while(seccion3 != 0){
                            System.out.println(" ".repeat(30) + "/// MALETINES \\\\\\");
                            System.out.println("|| Por favor selecciona una de las siguientes opciones"
                            + " para ir a un tipo de refrigerado en específico ||");
                            System.out.println(" 1. Morrales\n 2. Tulas\n 0. Volver");
                            System.out.println("Ingrese la opción que desea:");
                            seccion3 = sc.nextInt();
                            int seccion4 =1;
                            if(seccion3 == 1){
                                System.out.println(" ".repeat(30) + "/// MORRALES DISPONIBLES \\\\\\");
                                for (int i=0;i<chaquetas.size();i++){
                                    System.out.println(" "+ (i+1) +"."+ morrales.get(i).getNombre());
                                }
                                System.out.println(" 0. Volver");
                                System.out.println("Ingrese el producto que desea detallar:");
                                seccion4 = sc.nextInt();
                                while (seccion4 > morrales.size()){
                                    System.out.println("Producto no válido, vuelvalo a intentar:");
                                    seccion4 = sc.nextInt();
                                }
                                int seccion5 = 1;
                                while (seccion5 != 0){
                                    System.out.println(" ".repeat(30) + "/// DETALLES PRODUCTO \\\\\\");
                                    System.out.println(morrales.get(seccion4-1).toString());
                                    System.out.println(" 1. Comprar\n 0. Volver");
                                    seccion5 = sc.nextInt();
                                    if(seccion5 == 1){
                                        System.out.println("Ingrese la cantidad del producto que quiere comprar:");
                                        int cantidadProducto = sc.nextInt();
                                        transaccion.AniadirCarro(morrales.get(seccion4-1),cantidadProducto);
                                        seccion5=0;
                                        seccion4=0;
                                        seccion3=0;
                                        seccion2=0;
                                        System.out.println(" ".repeat(30) + "/// PRODUCTO AGREGADO CON ÉXITO \\\\\\");
                                    }else if (seccion5 != 0){
                                        System.out.println(" ".repeat(7) + "/// OPCIÓN NO DISPONIBLE \\\\\\");
                                    }
                                }   
                            }else if(seccion3 == 2){
                                System.out.println(" ".repeat(30) + "/// TULAS DISPONIBLES \\\\\\");
                                for (int i=0;i<tulas.size();i++){
                                    System.out.println(" "+ (i+1) +"."+ tulas.get(i).getNombre());
                                }
                                System.out.println(" 0. Volver");
                                System.out.println("Ingrese el producto que desea detallar:");
                                seccion4 = sc.nextInt();
                                while (seccion4 > tulas.size()){
                                    System.out.println("Producto no válido, vuelvalo a intentar:");
                                    seccion4 = sc.nextInt();
                                }
                                int seccion5 = 1;
                                while (seccion5 != 0){
                                    System.out.println(" ".repeat(30) + "/// DETALLES PRODUCTO \\\\\\");
                                    System.out.println(tulas.get(seccion4-1).toString());
                                    System.out.println(" 1. Comprar\n 0. Volver");
                                    seccion5 = sc.nextInt();
                                    if(seccion5 == 1){
                                        System.out.println("Ingrese la cantidad del producto que quiere comprar:");
                                        int cantidadProducto = sc.nextInt();
                                        transaccion.AniadirCarro(tulas.get(seccion4-1),cantidadProducto);
                                        seccion5=0;
                                        seccion4=0;
                                        seccion3=0;
                                        seccion2=0;
                                        System.out.println(" ".repeat(30) + "/// PRODUCTO AGREGADO CON ÉXITO \\\\\\");
                                    }else if (seccion5 != 0){
                                        System.out.println(" ".repeat(7) + "/// OPCIÓN NO DISPONIBLE \\\\\\");
                                    }
                                }   
                            }else if(seccion3 != 0){
                                System.out.println(" ".repeat(7) + "/// OPCIÓN NO DISPONIBLE \\\\\\");
                            }
                        }
                    }else if(seccion2 != 0){
                        System.out.println(" ".repeat(7) + "/// OPCIÓN NO DISPONIBLE \\\\\\");
                    }
                }

            }
            else if(seccion == 3){
                int seccionL=1;
                while(seccionL !=0){
                    
                    System.out.println(" ".repeat(30) + "/// SECCIÓN FARMACIA \\\\\\");
                System.out.println("|| Por favor selecciona una de las siguientes opciones"
                        + "para ir a un tipo de producto en específico ||");
                System.out.println(" 1. Medicamentos y Sinteticos \n 2. Aseo y Personales \n 3. Naturales \n 0. Volver");
                
                int seccionY= sc.nextInt();
                if(seccionY==0) seccionL=0;
                while(seccionY!=0){
                    if(seccionY==1){ //Medicamentos y sinteticos
                        System.out.println(" Lista de Articulos Medicamentos/Sinteticos, selecciona uno a continuacion y 0. para volver ");
                        for(int i=0;i<6;i++){
                            if(i<3){
                                 System.out.println(i+1 +". "+ Instancias.medicamentos.get(i).getNombre());
                            }
                       
                            if(i>=3){
                              System.out.println(i+1 +". "+ Instancias.productosSinteticos.get(i-3).getNombre());  
                            }
                        } 
                       
                         int seccionZ= sc.nextInt();
                        if(seccionZ==0) seccionY=0;
                        while(seccionZ !=0){
                            int escogido = seccionZ-1;
                            System.out.println("1. comprar 0. volver 2.Descripcion");
                             seccionZ= sc.nextInt();
                            if(seccionZ==1){ //comprando
                                
                               if(escogido<3){
                                   //buscar en medicamentos
                                   System.out.println("Cuantos vas a llevar?");
                                   int numero = sc.nextInt();
                                   transaccion.AniadirCarro(Instancias.medicamentos.get(escogido), numero);
                                   seccionZ=0;
                                   
                            }
                               else{
                                   escogido-=3;
                                   //buscar sinteticos
                                   System.out.println("Cuantos vas a llevar?");
                                   int numero = sc.nextInt();
                                   transaccion.AniadirCarro(Instancias.productosSinteticos.get(escogido), numero);
                                   seccionZ=0;
                               }
                                
                            }
                            
                            if(seccionZ==2){ //descripcion del objeto
                                   if(escogido<3){
                                   // medicamentos
                                   System.out.println(Instancias.medicamentos.get(escogido));
                                   System.out.println("0. volver ");
                                   seccionZ= sc.nextInt();
                                   
                                  
                                   
                            }
                               else{
                                   //sinteticos
                                    escogido-=3;
                                   System.out.println(Instancias.productosSinteticos.get(escogido));
                                   System.out.println("0. volver ");
                                   seccionZ= sc.nextInt();
                               }
                            }
                            
                        }
                    }
                    
                    if(seccionY==2){ //Aseo y Personales
                         System.out.println(" Lista de Articulos Aseo/Personales, selecciona uno a continuacion y 0. para volver ");
                        for(int i=0;i<6;i++){
                            if(i<3){
                                 System.out.println(i+1 +". "+ Instancias.productosAseo.get(i).getNombre());
                            }
                       
                            if(i>=3){
                              System.out.println(i+1 +". "+ Instancias.productosPersonales.get(i-3).getNombre());  
                            }
                        } 
                       
                         int seccionZ= sc.nextInt();
                        if(seccionZ==0) seccionY=0;
                        while(seccionZ !=0){
                            int escogido = seccionZ-1;
                            System.out.println("1. comprar 0. volver 2.Descripcion");
                             seccionZ= sc.nextInt();
                            if(seccionZ==1){ //comprando
                                
                               if(escogido<3){
                                   //buscar en medicamentos
                                   System.out.println("Cuantos vas a llevar?");
                                   int numero = sc.nextInt();
                                   transaccion.AniadirCarro(Instancias.productosAseo.get(escogido), numero);
                                   seccionZ=0;
                                   
                            }
                               else{
                                   escogido-=3;
                                   //buscar sinteticos
                                   System.out.println("Cuantos vas a llevar?");
                                   int numero = sc.nextInt();
                                   transaccion.AniadirCarro(Instancias.productosPersonales.get(escogido), numero);
                                   seccionZ=0;
                               }
                                
                            }
                            
                            if(seccionZ==2){ //descripcion del objeto
                                   if(escogido<3){
                                   // medicamentos
                                   System.out.println(Instancias.productosAseo.get(escogido));
                                   System.out.println("0. volver ");
                                   seccionZ= sc.nextInt();
                                   
                                  
                                   
                            }
                               else{
                                   //sinteticos
                                    escogido-=3;
                                   System.out.println(Instancias.productosPersonales.get(escogido));
                                   System.out.println("0. volver ");
                                   seccionZ= sc.nextInt();
                               }
                            }
                            
                        }
                    }
                    
                    if(seccionY==3){ //Naturales
                          System.out.println(" Lista de Articulos Naturales, selecciona uno a continuacion y 0. para volver ");
                        for(int i=0;i<3;i++){
                           
                                 System.out.println(i+1 +". "+ Instancias.productosNaturales.get(i).getNombre());
                          
                        } 
                       
                         int seccionZ= sc.nextInt();
                        if(seccionZ==0) seccionY=0;
                        while(seccionZ !=0){
                            int escogido = seccionZ-1;
                            System.out.println("1. comprar 0. volver 2.Descripcion");
                             seccionZ= sc.nextInt();
                            if(seccionZ==1){ //comprando
                                
                             
                                   //buscar en Naturales
                                   System.out.println("Cuantos vas a llevar?");
                                   int numero = sc.nextInt();
                                   transaccion.AniadirCarro(Instancias.productosNaturales.get(escogido), numero);
                                   seccionZ=0;
                     
                            }
                            
                            if(seccionZ==2){ //descripcion del objeto
                                   
                                   System.out.println(Instancias.productosNaturales.get(escogido));
                                   System.out.println("0. volver ");
                                   seccionZ= sc.nextInt();
                
                            }
                            
                        }
                    }
                
                }
                
                    
                }
                
                
            } else if(seccion == 4){
                
                System.out.println(" ".repeat(7) + "/// BUSQUEDA \\\\\\");
                System.out.print("|| Ingrese el nombre del producto: ||");

                int seleccionado = 1;
                while(seleccionado != 0){
                    System.out.println(" ".repeat(7) + "/// BUSQUEDA \\\\\\");
                    System.out.print("|| Ingrese el nombre del producto: ||\n");
                    String buscador = sx.nextLine();
                    Menu menu = new Menu();
                    ArrayList<String> resultados = menu.Buscar(buscador, productos);
                    System.out.print("Los resultados que coinciden con su busqueda son:\n");
                    for(String cad : resultados){
                        System.out.println(cad);
                    }
                    System.out.println("0. Salir\n");
                    
                    
                    int seccion3 = 1;
                    while(seccion3 != 0 && seleccionado > 0){
                        System.out.print("Por favor escriba el número del producto del cual quiere más información: \n");
                        seleccionado = sc.nextInt();
                        System.out.println(productos.get(seleccionado-1).toString());
                        System.out.println(" 1. Comprar\n 0. Volver");
                        int accion = sc.nextInt();
                        if(accion == 1){
                            System.out.println("Ingrese la cantidad del producto que quiere comprar:");
                            int cantidadProducto = sc.nextInt();
                            transaccion.AniadirCarro(productos.get(seleccionado-1),cantidadProducto);
                            seleccionado = 0;
                            seccion3=0;
                            System.out.println(" ".repeat(30) + "/// PRODUCTO AGREGADO CON ÉXITO \\\\\\");
                        }else if (accion != 0){
                            System.out.println(" ".repeat(7) + "/// OPCIÓN NO DISPONIBLE \\\\\\");
                        }
                    }
                }

            }else if(seccion == 5){
                
                
              int seccionX = 1;
               System.out.println("---------------------------------------");
               System.out.println("BIENVENIDO AL CARRITO DE COMPRA "+ cliente_actual.getNombre());
               System.out.println("Estos son los articulos que has seleccionado: ");
              while(seccionX!=0){
                   
          
                Set<Producto> llaves = carrito_actual.getBolsa().keySet();
                for(Producto p: llaves){
                    System.out.println("Nombre item: " + p.getNombre() + " Cantidad: "+ carrito_actual.getBolsa().get(p));
                }
                System.out.println("(1) Calcular costo compra \n (2) Eliminar item \n (3) Comprar \n  volver (0)");
                
                seccionX = sc.nextInt();
                if(seccionX==2){
                    System.out.println("Escribe el nombre del item a borrar");
                    Scanner sc_ = new Scanner(System.in);
                    String elimina = sc_.nextLine();
                    transaccion.EliminarCarro(elimina);
                    
                }
                
                 if(seccionX==1){
                    System.out.println("En este momento tienes: ");
                     System.out.println(cliente_actual.getDineroDisponible() + " Pesos");
                     System.out.println("Tu compra tiene un valor de: ");
                     System.out.println(carrito_actual.calcularCostoPedido() + " Pesos");
                    
                    
                }
                if( seccionX==3){
                   Compra compra_generada = new Compra();
                   compra_generada = transaccion.Comprar(cliente_actual, carrito_actual);
                   cliente_actual.aniadirHistorial(compra_generada, compra_generada.getCodigo());
                   carrito_actual.setBolsa(new HashMap<Producto,Integer>());
                   seccionX=0;
                }
              }
                
            }
            
            else if(seccion == 6){
                
                
              int seccionX = 1;
               System.out.println("---------------------------------------");
               System.out.println("BIENVENIDO A Informacion del cliente "+ cliente_actual.getNombre());
               System.out.println("Este es su historial de compras: ");
              //while(seccionX!=0){
                  HashMap<Integer,Compra> historial_actual = cliente_actual.getHistorial();
                   
          
                Set<Integer> llaves = historial_actual.keySet();
                for(int p: llaves){
                    System.out.println("Codigo: " + p + " Compra: "+ historial_actual.get(p));
                }
                if(llaves.isEmpty()){
                    System.out.println("Aún no has realizado ninguna compra");
                }
               
                
                //seccionX = sc.nextInt();
                /*
                if(seccionX==2){
                    System.out.println("Escribe el nombre del item a borrar");
                    Scanner sc_ = new Scanner(System.in);
                    String elimina = sc_.nextLine();
                    transaccion.EliminarCarro(elimina);
                    
                }
                
                 if(seccionX==1){
                    System.out.println("En este momento tienes: ");
                     System.out.println(cliente_actual.getDineroDisponible() + " Pesos");
                     System.out.println("Tu compra tiene un valor de: ");
                     System.out.println(carrito_actual.calcularCostoPedido() + " Pesos");
                    
                    
                }
                if( seccionX==3){
                   Compra compra_generada = new Compra();
                   compra_generada = transaccion.Comprar(cliente_actual, carrito_actual);
                   cliente_actual.aniadirHistorial(compra_generada, compra_generada.getCodigo());
                }
                */
              //}
                
                
            }
            else if(seccion != 0){
                System.out.println(" ".repeat(30) + "---------- OPCIÓN NO DISPONIBLE --------------");
            }
            
           
            
               
            
            
           
        }
        System.out.println(" ".repeat(18) + "/// GRACIAS POR USAR NUESTROS SERVICIOS \\\\\\");

       // Menu interfaz = new Menu();    
        //interfaz.MostrarTipo("4");
       // ArrayList array = new ArrayList();
 
        //float num = 5.5f;
        
       // System.out.println(Instancias.yogurt.valorTotalProducto(14));
        //System.out.println(Instancias.cafeParamillo.valorTotalProducto(50));
        /*
        System.out.println(Instancias.laRoja.getPrecio());
        System.out.println("total 100 " + Instancias.laRoja.valorTotalProducto(100)); 
        System.out.println("total 60 " + Instancias.laRoja.valorTotalProducto(60)); 
        System.out.println(Instancias.laRoja.promocion(60)); 
        /*
        //System.out.println(Instancias.yogurt.toString());
        //System.out.println(array.getClass());
        /*String  buscando = "es";
        String recurso = "sapas";
        boolean bol = Menu.BuscarCadena(buscando, recurso);
        System.out.println(bol);
        System.out.println(buscando);
        System.out.println(recurso);*/

    }

    private static void MostrarMain() {
        System.out.println(" ".repeat(18) + "/// BIENVENID@ A LA TIENDA ECOMUN \\\\\\");
        System.out.println("|| Por favor selecciona una de las siguientes opciones"
                + " para ir a una sección en el catálogo ||");
        System.out.println(" 1. Comestibles\n 2. Textiles\n 3. Farmacia\n 4. Buscar\n 5. Carrito de compra \n 6.Historial de compras \n 0. Salir");
    }  
    
}
