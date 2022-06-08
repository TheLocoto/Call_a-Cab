/*◦Crear un call-a-cab app.
◦Esta “app” deberá tener al menos 5 taxis y 3 conductores al empezar.
◦Cuando la app se ejecute deberá mostrar un mensaje de bienvenida y luego pedir tu ubicación, destino y numero de pasajeros.
◦Luego deberá mostrar la información de tu taxi trip (carrera): costo, destino, numero de pasajeros, etc. y preguntar si la info es correcta antes de tratar de asignar al cliente un taxi.
◦Si existe un taxi disponible deberá mostrar la info del taxi, la info del conductor y un mensaje avisando al cliente que el taxi esta en camino y preguntando si necesita otro taxi.
◦Cada taxi deberá tener una lista de sus taxi trips (carreras).
◦Un taxi disponible pero sin conductor no puede ser asignado a un cliente. (duh!)
◦Si no existen taxis disponibles la app deberá decirle al cliente que no existen taxis disponibles en este momento y preguntar si desea intentarlo de nuevo.
◦En caso de ingresar/elegir si un taxi “aparecerá” disponible y será asignado al cliente, caso contrario se cierra la app.
*/
package View;
import Model.Cab;
import Model.Driver;
import java.util.ArrayList;
import java.util.Scanner;

public class CabsCentralView {
    Scanner input;
    public CabsCentralView() {
        this.input = new Scanner(System.in);
    }

    public void showWelcome(){
        System.out.println("---------------------------");
        System.out.println("Welcome to CALL-A-CAB!");
        System.out.println("---------------------------");
    }

    public void assignCabToClient(){

    }

    public void checkTaxiTrips(Cab cab){
        //System.out.println("TaxiTrips: "+cab.getTaxiTrips());
    }

    public void showDriversList(ArrayList<Driver> driversList){
        for (Driver driver:driversList){
            System.out.println(driver.toString());
        }
    }
}
