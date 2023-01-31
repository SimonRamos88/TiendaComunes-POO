
package Logica;
//import java.util.ArrayList;
import Datos.Producto;
import Datos.comestibles.*;
import Datos.Textil.*;
import Datos.farmacia.*;
import java.util.ArrayList;
import java.util.Arrays;
//import Datos.Producto;

public class Instancias {
    //objetos de farmacia del 500 al 1000
    //Aseo
    static Aseo aseo_1 = new Aseo("12/02/21", "Agua, glicerol, jabon", "No aplicar a los ojos", false, 500, "ninguna", "desinfeccion de superficies",567 , "Desinfetec", "E corp", 23440f, "Producto autoctono usado para limpiar superficies");
    static Aseo aseo_2 = new Aseo("3/05/22", "Agua, NaClO, Blanqueador ", "No usar en ropa", true, 200, "No mezclar con alcohol", "desinfeccion para covid19", 570, "Clor-EP", "Aguas del oriente", 15000f, "Producto usado para limpiar y prevenir el covid en el hogar");
    static Aseo aseo_3 = new Aseo("Ninguna", "Agua, aromatizante, grasa no humana", "No dejar en el agua", false, 250, "ninguna", "aplique sobre manos y superficies", 580, "Jabon NaCl", "Limpio SA", 3000f, "Usese para limpiar y dejar un buen olor");
    //Hogar
     static Hogar hogar_1 = new Hogar("12/02/23",false, true,"Usar en el lavado de ropa", 1000, "menores de 10 anos no usar", "detergente para ropa", 590, "Fabuloso", "Bandamax", 30000f,"jabon limpiador de ropa" );
    static Hogar hogar_2 = new Hogar("3/01/29", true, false, "Dejar en sitios donde haya roedores", 50, "Evite que menores lo usen", "Veneno para roedores", 599, "El-matador", "Limpio SA", 45000f, "Veneno para matar roedores");
    static Hogar hogar_3 = new Hogar("Ninguna", false, true, "Aplicar en zonas donde huela mal", 450, "no aplicar a ojos, inflamable", "Aromatiza el hogar", 600, "Huele-bien", "Olores del cielo SA", 10000f, "Aromatice su casa a un costo accequible");
    
    //Medicamento
    static Medicamento med_1 = new Medicamento("9/03/25", "Hipersensibilidad al paracetamol", true, "cada 8h", 40, "No usar personas con problemas renales", "medicamento paliativo", 620, "Dolex-EP", "Quimicos reinsertados SA", 2500f, "Usese para curar pequenios dolores");
    static Medicamento med_2 = new Medicamento("10/04/23", "Riesgo de  ataques cardiacos", false, "cada 12h", 30, "No usar si ha tenido un ataque cardiaco reciente", "medicamento paliativo", 605, "Ibuprofex", "Quimicos reinsertados SA", 5000f, "Usese para curar pequenios dolores");
    static Medicamento med_3 = new Medicamento("28/12/21", "Riesgo de ulceras", true, "cada 12h", 10, "No usar si es alegico, o hemofilico","medicamento anfiinflamatorio", 610, "Aspirin-LP", "Quimicos reinsertados SA", 9000f, "Usese como antiinflamatorio o anticoagulante");
    
    //Naturales
    static Naturales nat_1 = new Naturales("ninguna", "canabbis, hoja de coca, calendula", "alivia todo tipo de dolores", "selvas del cauca", 300, "ninguna", "aplique sobre el area inflamada", 630, "mariguanol", "aguas del oriente", 35000f, "Pomada caliente para calmar dolores");
    static Naturales nat_2 = new Naturales("ninguna","eucalipto,aromatizantes naturales", "alivia dolores musculares","Cali, Valle del Cauca",1233f,"ninguna","aplique sobre el musculo inflamado", 635, "Pomada alfa", "calen-EP", 12000f, "Pomada altamente olorosa, calma dolores musculares");
    static Naturales nat_3 = new Naturales("un dia despues de su venta","receta secreta del chaman", "relajacion instantanea", "selvas del yari", 450, "menores de 18 anios", "infusion en el agua", 640, "Te magico", "Te SA", 10000f, "Te de hierbas nativas para relajarse");
    
    //Personal
    
    static  Personal per_1 = new Personal("ninguna", 5, "boca", true, 50, "ninguna", "Limpieza bucal", 650, "Oral-F","Bandamax", 3000f, "Uselo para limpiar su boca");
    static  Personal per_2 = new Personal("ninguna", 15, "todo el cuerpo", true, 80, "ninguna", "limpieza del cuerpo", 655, "EsponjAAB", "Bandamax", 3500f, "Uselo para baniarse y limpiarse");
    static  Personal per_3 = new Personal("2025", 25, "zona intima", false, 110, "hipersensibilidad a las toallas", "toallas intimas", 670,"Klotex", "Bandamax", 4000f, "Toallas intimas");
   
    //Sinteticos
    static Sinteticos sin_1 = new Sinteticos("ninguna", "Jhonson&Jhonson", true,"2 minutos de aplicacion", 200,"sensibilidad al producto", "Aplique sobre cabello remojado y enjuage", 700, "Shampoo anticaida", "Internacional-Importaciones SA", 15000f, "Shampoo anti: caida,caspa,resequedad");
    static Sinteticos sin_2 = new Sinteticos("10/07/29", "Dago Garcia Aceites", false, "de 2 a 3 dias", 250, "ninguna", "Aplique sobre el area a masajear", 705, "Aceite masajeador", "DGA SA", 45000f, "Aceite especial para masajes");
    static Sinteticos sin_3 = new Sinteticos("ninguna", "Aguas del oriente SA", true, "Hasta que desaparezcan las imperfecciones", 300, "ninguna", "Limpieza facial", 710, "Agua micelar", "E corp", 7500f, "Agua micelar para la cara");

    // CERVEZAS
    static Cerveza laRoja = new Cerveza(5.5f, "Lúpulo, malta, agua, levadura", "Ale", 550f, "Vidrio", true, "No determina", 1f, 198, 43f, 1001, "LaRoja-Clasica", "LaRoja", 7000, "Cerveza tipo red ALe con buen balance entre malta y lupulo, sabor intenso");
    
    static Cerveza alternativa = new Cerveza(4.5f, "Malta tostada, lúpulo, agua, levadura",
    "Ale", 350f, "Vidrio", true, "No determina", 0.75f, 150, 40f, 1002, "Alternativa",
    "Cervecería alternativa", 6500, "Cerveza negra tipo ale, suave con un cuerpo fuerte");
    
    static Cerveza laTrocha = new Cerveza(5.5f, "Lúpulo, malta tostada, caramelo, chocolate, agua",
    "Ale", 550f, "Vidrio", true, "No determina", 0.8f, 120, 45f, 1003, "Coromoro Ale Porter", 
    "La Trocha", 10900f, "Coromoro Ale Porter es una cerveza negra de un amargor medio con tintes a chocolate y a acaramelo");

    // BEBIDAS CALIENTES
    
    static Calientes cafeParamillo = new Calientes(true, 0f, false, 2500f, "Bolsa", true, "No determina",
    1f, 90, 5f, 2001, "Cafe Paramillo", "Cooperativa Multiactiva emprendedores del campo Colombiano",
    35000f, "Cafe de grano 100% natural y con la calidad del campo Colombiano");
    
    static Calientes cafeTercerAcuerdo = new Calientes(true, 0f, false, 2000f, "Bolsa", true, "No determina",
    0.8f, 110, 3f, 2002, "Cafe el Tercer Acuerdo", "ASOPEP",
    28000f, "El Tercer Acuerdo es el café de lo colectivo, del pacto local que hacen las antiguas FARC-EP y los indigenas Nasa en el corregimiento de Gaitana-Tolima");

    static Calientes chocolateLaPaz = new Calientes(true, 48.5f, false, 1500f, "Bolsa",
    true, "12 meses", 1.5f, 60, 546f, 2003, "Chocolate La paz", "Cooperativa Fronteras del sur",
    45000f, "Café 100% natural proveniente del campo Colombiano, sabor amargo y placentero");
    
    // Carnes
    
    static Carne carneBufalo = new Carne("Chuletón", false, "Carnes rojas", 1.5f, "Búfalo",
    30, "4 a 12 meses", 1.5f, 45, 99, 30001, "Chuletón de Búfalo", "Ecobúfalo", 30500f,
    "Carne de Búfalo proveniente del área de reincorporación San Francisco, ubicada en Yondó, Antioquia");

    static Carne carneCerdo = new Carne("Lomo", false, "Carnes blancas", 2f, "Cerdo", 25,
    "4 a 12 meses", 1f, 34, 242, 3002, "Lomo de Cerdo", "Asopramas", 20800f, "Carne de cerdo proveniente de los Montes de María, Colosó, Sucre");

    static Carne carneChivo = new Carne("Cadera", false, "Carnes rojas", 2f, "Chivo", 35,
    "4 a 12 meses", 1.5f, 45, 127, 3003, "Cadera de Chivo", "Cooperativa Multiactiva para la Paz de Colombia Coompazcol", 20000f,
    "Carne de Chivo proveniente de la Granja San Luis, municipio de Fonseca, La Guajira");
    
    // LACTEOS
    
    static Lacteos lecheBufalo = new Lacteos(false, true, "Ninguno", 2f, "Búfalo", 
    60, "7 a 14 días", 0.25f, 80, 42, 4001, "Leche de Búfalo", "Ecobúfalo", 4500f,
    "Leche de Búfalo proveniente del área de reincorporación San Francisco, ubicada en Yondó, Antioquia");
    
    static Lacteos quesoBufalo = new Lacteos(false, true, "Ninguno", 5f, "Búfalo", 
    90, "6 a 8 meses", 0.25f, 120, 402f, 4002, "Queso de Búfalo", "Ecobúfalo", 5500f,
    "Queso de Búfalo proveniente del área de reincorporación San Francisco, ubicada en Yondó, Antioquia");
    
    static Lacteos yogurt = new Lacteos(true, true, "Ninguno", 4f, "Vaca", 90, "6 a 8 meses",
    0.25f, 78, 59, 4003, "Yogurt Artesanal", "Amasando Sueños", 5000f, "Yogurt creado por un grupo de mujeres luchadoras");

    
    //CHAQUETAS
    
    static Chaqueta chaquetaRoja = new Chaqueta("Ninguno",true,"de invierno","ffbacad",12,"1 año",43242,"Chaqueta Roja de invierno","Kenzo",190000,"Chaqueta de iniverno color rojo importada");
    static Chaqueta chaquetaCuero = new Chaqueta("Capota",false,"de cuero","tgs353",6,"1 mes",43242,"Chaqueta negra de cuero","Colpub",300000,"Chaqueta de cuero color negra nacional");
    static Chaqueta chaquetaLana = new Chaqueta("Bolsillos ocultos",false,"de lana","vsdgfs453",9,"Sin garantía",43242,"Chaqueta blanca de lana","Louvc",150000,"Chaqueta de lana color blanca estampada");
    
    //TULAS
    
    static Tula tulaWayuu = new Tula("Media",false,1,"10X20X20 cm",false,2,42342,"Tula wayuu multicolor","Comunidad wayuu",120000,"Tula wayuu original de varios colores");
    static Tula tulaGigante = new Tula("Baja",true,0,"40X40X40 cm",true,5,84564,"Tula Gigante negra","Totto",150000,"Tula gigante negra sin estampados");
    static Tula tulaMini = new Tula("Alta",true,2,"10X30X10 cm",true,10,625432,"Tula Miniatura roja","Totto",70000,"Tula miniatura roja con cuadros negros");
    
    //SOMBREROS
    
    static Sombrero sombreroVueltiao= new Sombrero(true,"Vueltiao","realizado por campesinos","FKAH430",10,"5 meses",543234,"Sombrero Vueltiao","Colsombreros",50000,"Sombrero vueltiao original");
    static Sombrero sombreroFemenino= new Sombrero(false,"Femenino","tejido a mano","GAFV230",6,"3 meses",645673,"Sombrero Femenino","Hatisd",20000,"Sombrero femenino blanco");
    static Sombrero sombreroLlanero= new Sombrero(true,"Llanero","realizado con 100% cuero","FAGR630",12,"1 mes",432453,"Sombrero Llanero","Llansom",150000,"Sombrero llanero original de cuero");
    
    //MORRALES
    
    static Morral morralInfantil = new Morral(true, true, "cubos de colores", "20X40X40 cm",true,5,763543,"Morral para niños", "Totto",153000,"Morral para niños con diseño infantil");
    static Morral morralAdulto = new Morral(false, true, "lineas", "50X80X80 cm",false,7,62543,"Morral para adultos", "Coonfanor",221000,"Morral para adultos con diseño único");
    static Morral morralViajero = new Morral(false, false, "Ninguno", "90X100X90 cm",false,10,62622,"Morral para viajar", "Cooamacol",135000,"Morral para viajer de color negro sin diseño");
    
    
    //LISTAS
    
    static ArrayList<Aseo> productosAseo = new ArrayList<>(Arrays.asList(aseo_1,aseo_2,aseo_3));
    static ArrayList<Hogar> productosHogar = new ArrayList<>(Arrays.asList(hogar_1,hogar_2,hogar_3));
    static ArrayList<Medicamento> medicamentos = new ArrayList<>(Arrays.asList(med_1,med_2,med_3));
    static ArrayList<Naturales> productosNaturales = new ArrayList<>(Arrays.asList(nat_1,nat_2,nat_3));
    static ArrayList<Personal> productosPersonales = new ArrayList<>(Arrays.asList(per_1,per_2,per_3));
    static ArrayList<Sinteticos> productosSinteticos = new ArrayList<>(Arrays.asList(sin_1,sin_2,sin_3));
    static ArrayList<Cerveza> cervezas = new ArrayList<>(Arrays.asList(laRoja,alternativa,laTrocha));
    static ArrayList<Calientes> bebidasCalientes = new ArrayList<>(Arrays.asList(cafeParamillo,cafeTercerAcuerdo,chocolateLaPaz));
    static ArrayList<Carne> carnes = new ArrayList<>(Arrays.asList(carneBufalo,carneCerdo,carneChivo));
    static ArrayList<Lacteos> bebidasLacteas = new ArrayList<>(Arrays.asList(lecheBufalo,quesoBufalo,yogurt));
    static ArrayList<Chaqueta> chaquetas = new ArrayList<>(Arrays.asList(chaquetaRoja,chaquetaCuero,chaquetaLana));
    static ArrayList<Tula> tulas = new ArrayList<>(Arrays.asList(tulaWayuu,tulaGigante,tulaMini));
    static ArrayList<Sombrero> sombreros = new ArrayList<>(Arrays.asList(sombreroVueltiao,sombreroFemenino,sombreroLlanero));
    static ArrayList<Morral> morrales = new ArrayList<>(Arrays.asList(morralInfantil,morralAdulto,morralViajero));

    
    static  ArrayList<Producto> todosProductos = new ArrayList();
    
    public static ArrayList<Producto> CrearMegaArreglo(ArrayList<Producto> todos){
        
        todos.addAll(productosAseo);
        todos.addAll(productosHogar);
        todos.addAll(productosNaturales);
        todos.addAll(productosPersonales);
        todos.addAll(productosSinteticos);
        todos.addAll(medicamentos);
        todos.addAll(cervezas);
        todos.addAll(bebidasCalientes);
        todos.addAll(carnes);
        todos.addAll(bebidasLacteas);
        todos.addAll(chaquetas);
        todos.addAll(tulas);
        todos.addAll(sombreros);
        todos.addAll(morrales);
        
        return todos;
        
    }
    
}
