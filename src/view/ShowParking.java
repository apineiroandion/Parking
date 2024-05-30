package view;

import java.util.Scanner;

public class ShowParking{
    private Scanner scanner;

    public ShowParking() {
        this.scanner = new Scanner(System.in);
    }

    public int showMenuAndGetOption() {
        System.out.println("1. Introducir vehículo");
        System.out.println("2. Sacar vehículo");
        System.out.println("3. Comprobar estado");
        System.out.println("4. Salir");
        System.out.print("Elige una opción: ");
        return scanner.nextInt();
    }

    public String getVehicleId() {
        System.out.print("Introduce el ID del vehículo: ");
        return scanner.next();
    }

    public int getVehicleType() {
        System.out.println("1. Coche");
        System.out.println("2. Camión");
        System.out.print("Elige el tipo de vehículo: ");
        return scanner.nextInt();
    }
}