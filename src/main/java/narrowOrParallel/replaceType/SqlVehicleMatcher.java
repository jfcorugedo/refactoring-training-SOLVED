package narrowOrParallel.replaceType;

public class SqlVehicleMatcher {

    public int countVehicles(NewVehicleQuery query) {
        return new VehicleRepository().find(query).size();
    }
}
