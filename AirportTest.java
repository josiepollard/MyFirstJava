import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AirportTest {

    @Test
    public void addPlane() {
        Airport testAiport = new Airport();
        Plane testPlane = new Plane();
        testAiport.land(testPlane);
        assertEquals(testAiport.hangar.get(0), testPlane);
    }

    @Test
    public void takeOff() {
        Airport testAirport = new Airport();
        testAirport.takeOff("plane");
        assertEquals(testAirport.hangar.size(), 0);

    }
}
