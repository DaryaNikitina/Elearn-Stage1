package by.nikitina.aircompany.entity.planes;

import by.nikitina.aircompany.entity.planes.types.MilitaryType;
import java.util.Objects;

public class MilitaryPlane extends Plane{

    private final MilitaryType type;

    public MilitaryPlane(String model, int maxSpeed, int maxFlightDistance,
                         int maxLoadCapacity, MilitaryType type) {
        super(model, maxSpeed, maxFlightDistance, maxLoadCapacity);
        this.type = type;
    }

    public MilitaryType getType() {
        return type;
    }

    @Override
    public String toString() {
        return "MilitaryPlane{" +
                "type=" + type +
                ", model='" + model + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MilitaryPlane)) return false;
        if (!super.equals(o)) return false;
        MilitaryPlane that = (MilitaryPlane) o;
        return type == that.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), type);
    }
}
