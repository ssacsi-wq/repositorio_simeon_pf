
import java.util.Scanner;

public class Registrocompras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ingreso de datos
        System.out.print("Ingrese el nombre del cliente: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese el monto de la compra 1: ");
        double compra1 = sc.nextDouble();

        System.out.print("Ingrese el monto de la compra 2: ");
        double compra2 = sc.nextDouble();

        System.out.print("Ingrese el monto de la compra 3: ");
        double compra3 = sc.nextDouble();

        // Cálculos
        double totalCompras = compra1 + compra2 + compra3;
        double promedioCompras = totalCompras / 3;

        // Resultados
        System.out.println("\n--- Resultados ---");
        System.out.println("Cliente: " + nombre);
        System.out.println("Total de compras     : " + totalCompras);
        System.out.println("Promedio de compras  : " + promedioCompras);
    }
}

