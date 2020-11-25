package by.nikitina.aircompany.action;

import by.nikitina.aircompany.entity.planes.Plane;
import java.util.Comparator;

public class DistanceComparator implements Comparator<Plane>{
        public int compare(Plane o1, Plane o2) {
            return o1.getMaxFlightDistance() - o2.getMaxFlightDistance();
        }
}
