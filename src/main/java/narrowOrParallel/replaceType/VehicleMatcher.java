package narrowOrParallel.replaceType;

public interface VehicleMatcher {
    int countVehicles(OldVehicleQuery query);

    int countVehicles(NewVehicleQuery query);
}
