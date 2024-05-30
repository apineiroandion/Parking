
import model.BD;
import model.Coche;
import model.Parking;
import model.Vehiculo;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestParking {
    private Parking parking;
    private BD conexion;

    @Before
    public void setUp() {

         conexion = new BD("jdbc:mysql://localhost:3306/parking", "root", "root");
         parking = new Parking(conexion);
    }

    @Test
    public void testIntroducirParking() {

         Vehiculo v = new Coche("123");
         assertTrue(parking.introducirParking(v));
    }

    @Test
    public void testSacarParking() {

         Vehiculo v = new Coche("123");
         parking.introducirParking(v);
         assertTrue(parking.sacarParking(v.getID()));
    }

    @Test
    public void testComprobarParking() {

         try {
             parking.comprobarParking();
         } catch (Exception e) {
             fail("Exception thrown during test: " + e.toString());
         }
    }
}