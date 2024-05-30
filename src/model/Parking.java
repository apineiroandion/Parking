package model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Parking {
    private BD conexion;

    public Parking(BD conexion) {
        this.conexion = conexion;
    }

    public boolean introducirParking(Vehiculo v) {
        String sql = "INSERT INTO Vehiculos (tipo, ocupado) VALUES (?, ?)";
        try {
            PreparedStatement ps = conexion.getConn().prepareStatement(sql);
            ps.setString(1, v instanceof Coche ? "Coche" : "Camion");
            ps.setBoolean(2, true);
            int rows = ps.executeUpdate();
            return rows > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean sacarParking(int id) {
        String sql = "DELETE FROM Vehiculos WHERE id = ?";
        try {
            PreparedStatement ps = conexion.getConn().prepareStatement(sql);
            ps.setInt(1, id);
            int rows = ps.executeUpdate();
            return rows > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public void comprobarParking() {
        String sql = "SELECT * FROM Vehiculos";
        try {
            PreparedStatement ps = conexion.getConn().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id"));
                System.out.println("Tipo: " + rs.getString("tipo"));
                System.out.println("Ocupado: " + rs.getBoolean("ocupado"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}