package controller;

import model.BD;
import model.Camion;
import model.Coche;
import model.Parking;
import view.ShowParking;

public class Controller {
    private ShowParking view;

    public Controller() {
        this.view = new ShowParking();
    }

    public void runApp(){
        Parking parking = new Parking(new BD("jdbc:mysql://localhost:3306/parking", "root", "root"));

        while (true) {
            int opcion = view.showMenuAndGetOption();

            switch (opcion) {
                case 1:
                    String ID = view.getVehicleId();
                    int tipo = view.getVehicleType();
                    if (tipo == 1) {
                        parking.introducirParking(new Coche(ID));
                    } else if (tipo == 2) {
                        parking.introducirParking(new Camion(ID));
                    }
                    break;
                case 2:
                    ID = view.getVehicleId();
                    parking.sacarParking(Integer.parseInt(ID));
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