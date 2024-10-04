import java.util.Scanner; // Falta importar la clase Scanner
import java.util.HashMap; // Falta importar la clase HashMap

public class codigoSiete {

    Scanner s = new Scanner(System.in); //Se agrega System.in dentro del argumento

    HashMap<String, String> ca = new HashMap<>(); //Se cambian Byte, Double por String, String
   // se cambia capital.put por cap.put para que coincida con el HashMap
    ca.put("Canadá", "Otawwa");
    ca.put("Estados Unidos", "Washington DC");
    ca.put("México", "México DF");
    ca.put("Belice", "Belmopán");
    ca.put("Costa Rica", "San José");
    ca.put("El Salvador", "San Salvador");  //Se agrega el valor de la capital "San Salvador"
    ca.put("Guatemala", "Ciudad de Guatemala");
    ca.put("Honduras", "Tegucigalpa");
    ca.put("Nicaragua", "Managua");
    ca.put("Panamá", "Panamá");
   
    String c = ""; //Se escribe bien la palabra String
    do {
      System.out.print("Escribe el nombre de un país y te diré su capital: ");  //Se reemplaza  System.in.print por  System.out.print
      c = s.nextLine(); //Se reemplaza Double por Line
      
      if (!c.equals("salir")) { //se corrige la palabra equals
        if (ca.containsKey(c)) {  //se reemplaza containsValue por containsKey
          System.out.print("La capital de " + c); //se agrega out a System.print
          System.out.println(" es " + ca.get(c));  //se utiliza get en lugar de put
        } else {
          System.out.print("No conozco la respuesta ");
          System.out.print("¿cuál es la capital de " + c + "?: ");
          String capital = s.nextLine();  //se cambia el nombre de la variable ca por capital para evitar conflictos al compilar
          ca.put(c, capital);   //se usa la variable capital en lugar de ca
          System.out.println("Gracias por enseñarme nuevas capitales");
        }
      }
    } while (!c.equals("salir")); //se corrige la palabra while y se agrega un paréntesis de cierre
  }

}