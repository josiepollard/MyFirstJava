import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class Airport {
    public ArrayList<Plane> hangar = new ArrayList<>();


    public void land(Plane testPlane) {
        hangar.add(testPlane);
    }

    public void takeOff(String Plane) {
        hangar.remove(Plane);
    }
}
