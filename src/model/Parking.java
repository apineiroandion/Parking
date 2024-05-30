package model;

import java.util.ArrayList;

public class Parking {
    private ArrayList<Vehiculo> vehiculos;
    private int tamañoParking;
    private int espacioOcupado;

    public Parking(int tamañoParking) {
        this.tamañoParking = tamañoParking;
        this.espacioOcupado = 0;
        this.vehiculos = new ArrayList<>();
    }

    public boolean introducirParking(Vehiculo v) {
        if (espacioOcupado + v.getEspacio() <= tamañoParking) {
            vehiculos.add(v);
            espacioOcupado += v.getEspacio();
            return true;
        }
        return false;
    }

    public boolean sacarParking(String ID) {
        for (Vehiculo v : vehiculos) {
            if (v.getID().equals(ID)) {
                vehiculos.remove(v);
                espacioOcupado -= v.getEspacio();
                return true;
            }
        }
        return false;
    }

    public void comprobarParking() {
        System.out.println("Espacio ocupado: " + espacioOcupado);
        System.out.println("Espacio libre: " + (tamañoParking - espacioOcupado));
    }
}