package controller;

import model.Camion;
import model.Coche;
import model.Parking;

import java.util.Scanner;

public class Controller {

    public void runApp(){
        Scanner scanner = new Scanner(System.in);
        Parking parking = new Parking(10);

        while (true) {
            System.out.println("1. Introducir vehículo");
            System.out.println("2. Sacar vehículo");
            System.out.println("3. Comprobar estado");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Introduce el ID del vehículo: ");
                    String ID = scanner.nextLine();
                    System.out.println("1. Coche");
                    System.out.println("2. Camión");
                    System.out.print("Elige el tipo de vehículo: ");
                    int tipo = scanner.nextInt();
                    if (tipo == 1) {
                        parking.introducirParking(new Coche(ID));
                    } else if (tipo == 2) {
                        parking.introducirParking(new Camion(ID));
                    }
                    break;
                case 2:
                    System.out.print("Introduce el ID del vehículo a sacar: ");
                    ID = scanner.nextLine();
                    parking.sacarParking(ID);
                    break;
                case 3:
                    parking.comprobarParking();
                    break;
                case 4:
                    System.exit(0);
            }
        }
    }
}
