package narrowOrParallel.replaceType;

public class SqlVehicleMatcher implements VehicleMatcher {
    @Override
    public int countVehicles(OldVehicleQuery query) {
        return new VehicleRepository().find(new NewVehicleQuery(
                query.brandDescription.split(" ")[0],
                query.brandDescription.split(" ")[1]
        )).size();
    }

    public int countVehicles(NewVehicleQuery query) {
        return new VehicleRepository().find(query).size();
    }
}
