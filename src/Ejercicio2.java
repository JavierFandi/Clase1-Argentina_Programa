import java.util.Scanner;

public class Ejercicio2 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int ingresosMensuales = 0;
        int cantVehiculos = 0;
        int anosVehiculos = 0;
        int inmuebles = 0;
        String capEconomica = " ";
        
        System.out.print("Ingrese sus datos según corresponda");
        System.out.print("\nIngrese el ingreso mensual del hogar: ");
        ingresosMensuales = sc.nextInt();
        System.out.print("\nIngrese la cantidad de Vehiculos que posee: ");
        cantVehiculos = sc.nextInt();
        System.out.print("\nIngrese la cantidad de anos de su vehiculo mas viejo: ");
        anosVehiculos = sc.nextInt();
        System.out.print("\nIngrese la cantidad de inmuebles que posee: ");
        inmuebles = sc.nextInt();
        
        sc = new Scanner(System.in);
        System.out.print("\nPosee una embarcación, una aeronave de lujo o ser titular de activos societarios: ");
        capEconomica = sc.nextLine();
        
        if(ingresosMensuales>=489083||(cantVehiculos>=3 && anosVehiculos<5)||inmuebles>=3||capEconomica.toLowerCase() == "si"){
            System.out.println("Pertenece al segmento de ingresos altos");
        }
        
        else{
            System.out.println("No pertenece al segmento de ingresos altos");
        }
        
    }
}
